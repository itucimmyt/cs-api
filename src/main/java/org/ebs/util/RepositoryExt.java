package org.ebs.util;

import java.util.List;

public interface RepositoryExt<T> {
    Connection<T> findByCriteria(Class<T> entityClass, List<FilterInput> filters, SortInput sort, PageInput page);

    <E> int removeById(Class<E> entityClass, Integer id);
}