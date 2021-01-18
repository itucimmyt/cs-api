package org.ebs.util;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface RepositoryExt<T> {
    Connection<T> findByCriteria(Class<T> entityClass, List<FilterInput> filters, SortInput sort, PageInput page);
    Connection<T> findByCriteria(Class<T> entityClass, List<FilterInput> filters, SortInput sort, PageInput page, boolean disjuntionFilters);
    Page<T> findByCriteria(Class<T> entityClass, List<FilterInput> filters, SortInput sort, Pageable page);
    Page<T> findByCriteria(Class<T> entityClass, List<FilterInput> filters, SortInput sort, Pageable page, boolean disjuntionFilters);

    <E> int removeById(Class<E> entityClass, Integer id);
}