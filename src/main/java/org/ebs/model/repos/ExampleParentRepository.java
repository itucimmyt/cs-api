package org.ebs.model.repos;

import org.ebs.model.ExampleParent;
import org.ebs.util.RepositoryExt;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Repositories must extend JpaRepository.
 * If dynamic filtering, paging and sorting are needed, extend also from RepositoryExt.
 */
public interface ExampleParentRepository extends JpaRepository<ExampleParent, Long>,
    RepositoryExt<ExampleParent>{
}