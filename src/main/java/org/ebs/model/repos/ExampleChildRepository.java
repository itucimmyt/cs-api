package org.ebs.model.repos;

import java.util.List;

import org.ebs.model.ExampleChild;
import org.ebs.util.RepositoryExt;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Repositories must extend JpaRepository.
 * If dynamic filtering, paging and sorting are needed, extend also from RepositoryExt.
 * Repositories are the persistence layer, so they are in charge of:
 * - Provide a unique mechanism for accesing a DB
 * - Provide a simple way to create queries
 */
public interface ExampleChildRepository extends JpaRepository<ExampleChild, Long>,
    RepositoryExt<ExampleChild>{

        /**
         * Example of custom query using Spring Data's Query Method
         * @param parentId
         * @return
         */
        List<ExampleChild> findByParentId(long parentId);
}