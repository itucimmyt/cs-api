package org.ebs.util;

import java.util.List;

public interface RepositoryExt<T> {
    Connection<T> findByCriteria(Class<T> entityClass, List<FilterInput> filters, SortInput sort, PageInput page);
    Connection<T> findByCriteria(Class<T> entityClass, List<FilterInput> filters, SortInput sort, PageInput page, boolean disjuntionFilters);

    <E> int removeById(Class<E> entityClass, Integer id);
}