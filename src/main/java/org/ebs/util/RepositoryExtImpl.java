package org.ebs.util;

import static java.util.Optional.ofNullable;

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
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

import ch.qos.logback.core.net.SyslogOutputStream;

class RepositoryExtImpl<T> implements RepositoryExt<T> {

    private final int minPageNumber = 0;
    private final int maxPageSize = 50;
    private Pageable defaultPage = PageRequest.of(minPageNumber, 20);
    private String dotSplit = "\\.";

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public Connection<T> findByCriteria(Class<T> entityClass, List<FilterInput> filters, SortInput sort, PageInput pageInput) {

    	CriteriaBuilder builder = entityManager.getCriteriaBuilder();
        CriteriaQuery<T> query = builder.createQuery(entityClass);
        Root<T> queryRoot = query.from(entityClass);

        List<Predicate> predicates = createPredicates(builder, queryRoot, filters);
        
        query.select(queryRoot);
        query.where(predicates.toArray(new Predicate[predicates.size()]));
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

    private List<Predicate> createPredicates(CriteriaBuilder builder, Root<T> queryRoot, List<FilterInput> filters) {
        List<Predicate> predicates = new ArrayList<>();
      
        ofNullable(filters).ifPresent(fs -> {
        	
            fs.forEach(f -> {
            	  boolean containNestedFields = false;
             	 	String [] fieldsNested=null;
            	if (f.getCol().contains(".")) {
            		fieldsNested =f.getCol().split(dotSplit);
            		containNestedFields= true;
            	}
                switch (f.getMod()) {
                    case LK:
                        predicates.add(
                        		containNestedFields?
                        				builder.like(queryRoot.get(fieldsNested[0]).get(fieldsNested[1]),"%"+f.getVal()+"%")
                        				:builder.like(queryRoot.get(f.getCol()), "%"+f.getVal()+"%"));
                        break;
                    case EQ:
                    default: //default is equals
                    	predicates.add(
                    			containNestedFields?
                    					   builder.equal(queryRoot.get(fieldsNested[0]).get(fieldsNested[1]),  typedValueOf(queryRoot, f,containNestedFields, fieldsNested))
                    					: builder.equal(queryRoot.get(f.getCol()), typedValueOf(queryRoot, f,containNestedFields, fieldsNested))
                    						);
                    break;
            }});
        });
        predicates.add(builder.equal(queryRoot.get("deleted"), false));
        return predicates;

    }
    
    private Object typedValueOf(Root<T> root, FilterInput f, boolean containNestedFields, String [] fieldsNested){
        Class<?> clazz;
        if (containNestedFields)
        	clazz = root.get(fieldsNested[0]).get(fieldsNested[1]).getJavaType();
        else 
        	clazz = root.get(f.getCol()).getJavaType();

        if(clazz == Boolean.class) {
            return Boolean.parseBoolean(f.getVal());
        } else if (clazz == UUID.class) {
            return UUID.fromString(f.getVal());
        }
        return f.getVal();

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

    private long countForQuery(CriteriaBuilder builder, List<Predicate> predicates, Class<T> entityClass){
        CriteriaQuery<Long> queryCount = builder.createQuery(Long.class);
        
        queryCount
            .select(builder.count(queryCount.from(entityClass)))
            .where(predicates.toArray(new Predicate[predicates.size()]));
        
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
}