package org.ebs.util;

import static java.util.Optional.ofNullable;
import static javax.persistence.criteria.JoinType.LEFT;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaDelete;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Expression;
import javax.persistence.criteria.Path;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

class RepositoryExtImpl<T> implements RepositoryExt<T> {

    private final int minPageNumber = 0;
    private final int maxPageSize = 50;
    private Pageable defaultPage = PageRequest.of(minPageNumber, 20);
    private final String dotExpr = "\\.";

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public Connection<T> findByCriteria(Class<T> entityClass, List<FilterInput> filters, SortInput sort, PageInput pageInput) {
        return doFindByCriteria(entityClass, filters, sort, pageInput, false);
    }
    @Override
    public Connection<T> findByCriteria(Class<T> entityClass, List<FilterInput> filters, SortInput sort, PageInput pageInput, boolean disjuntionFilters) {
        return doFindByCriteria(entityClass, filters, sort, pageInput, disjuntionFilters);
    }

    Connection<T> doFindByCriteria(Class<T> entityClass, List<FilterInput> filters, SortInput sort, PageInput pageInput, boolean disjuntionFilters) {

    	CriteriaBuilder builder = entityManager.getCriteriaBuilder();
        CriteriaQuery<T> query = builder.createQuery(entityClass);
        Root<T> queryRoot = query.from(entityClass);

        Predicate predicates = createWherePredicate(builder, queryRoot, filters, disjuntionFilters);

        query.select(queryRoot);
        query.where(predicates);
        createSort(builder, query, queryRoot, sort);

        Pageable page = createPage(pageInput);

        List<T> resultList = createPagedQuery(entityManager, query, page).getResultList();

        long totalCount = countForQuery(builder, predicates, entityClass);

        return new Connection<T>(resultList, page, totalCount);

    }

    private TypedQuery<T> createPagedQuery(EntityManager em, CriteriaQuery<T> criteria, Pageable page) {
        return entityManager.createQuery(criteria)
            .setFirstResult((int)(page.getOffset()))
            .setMaxResults(page.getPageSize());
    }

    private Pageable createPage(PageInput pageInput) {
        return pageInput == null ? defaultPage :
            PageRequest.of(Math.max( minPageNumber, pageInput.getNumber()-1),
                            Math.min(maxPageSize, pageInput.getSize()));
    }

    private Predicate createWherePredicate(CriteriaBuilder builder, Root<T> queryRoot, List<FilterInput> filters, boolean disjuntionFilters) {
        List<Predicate> predicateList = new ArrayList<>();

        ofNullable(filters).ifPresent(fs -> {

            fs.forEach(f -> {
                Path<String> filterPath = createFilterPath(f, queryRoot);
                switch (f.getMod()) {
                    case LK:
                        predicateList.add(
                            builder.like( filterPath, "%"+f.getVal()+"%"));
                        break;
                    case NULL:
                        predicateList.add(
                            builder.isNull(filterPath));
                        break;
                    case NOTNULL:
                        predicateList.add(
                            builder.isNotNull(filterPath));
                        break;
                    case EQ:
                    default: //default is equals
                    	predicateList.add(
                            builder.equal(filterPath, typedValueOf(f, filterPath)));
                    break;
            }});
        });

        Predicate[] predicates = predicateList.toArray(new Predicate[0]);
        Predicate allFiltersPredicate = disjuntionFilters ? builder.or(predicates) : builder.and(predicates)
            ,notDeletedPredicate = builder.equal(queryRoot.get("deleted"), false);

        return builder.and(allFiltersPredicate, notDeletedPredicate);
    }

    private Path<String> createFilterPath(FilterInput f, Root<T> root) {
        String[] filterPaths = f.getCol().split(dotExpr);
        Path<String> path = root.get(filterPaths[0]);
        if(filterPaths.length > 1) {
            root.join(filterPaths[0], LEFT);
            path = path.get(filterPaths[1]);
        }
        return path;
    }

    private Object typedValueOf(FilterInput filter, Path<String> filterPath){
        Class<?> clazz = filterPath.getJavaType();

        if(clazz == Boolean.class) {
            return Boolean.parseBoolean(filter.getVal());
        } else if (clazz == UUID.class) {
            return UUID.fromString(filter.getVal());
        }
        return filter.getVal();

    }

    private void createSort(CriteriaBuilder builder,  CriteriaQuery<T> criteria, Root<T> queryRoot, SortInput sort) {
        ofNullable(sort).ifPresent(s -> {
            Expression<T> sortExpr = queryRoot.get(sort.getCol());
            switch (sort.getMod()) {
                case DES:
                    criteria.orderBy(builder.desc(sortExpr));
                    break;
                case ASC:
                default:
                    criteria.orderBy(builder.asc(sortExpr));
                break;
            }
        });
    }

    private long countForQuery(CriteriaBuilder builder, Predicate predicates, Class<T> entityClass){
        CriteriaQuery<Long> queryCount = builder.createQuery(Long.class);

        queryCount
            .select(builder.count(queryCount.from(entityClass)))
            .where(predicates);

        long totalCount = entityManager.createQuery(queryCount)
            .getSingleResult();

        return totalCount;

    }

    @Override
    public <E>int removeById(Class<E> entityClass, Integer id) {
        CriteriaBuilder builder = entityManager.getCriteriaBuilder();
        CriteriaDelete<E> delete = builder.createCriteriaDelete(entityClass);
        Root<E> queryRoot = delete.from(entityClass);
        delete.where(builder.equal(queryRoot.get("id"), id));

        return entityManager.createQuery(delete).executeUpdate();
    }

    @Override
    public Connection<T> findByCriteria(Class<T> entityClass, List<FilterInput> filters, SortInput sort,
            Pageable page) {
        return findByCriteria(entityClass, filters, sort, new PageInput(page.getPageNumber(), page.getPageSize()));
    }

    @Override
    public Connection<T> findByCriteria(Class<T> entityClass, List<FilterInput> filters, SortInput sort, Pageable page,
            boolean disjuntionFilters) {
        return findByCriteria(entityClass, filters, sort, new PageInput(page.getPageNumber(), page.getPageSize()), disjuntionFilters);
    }
}