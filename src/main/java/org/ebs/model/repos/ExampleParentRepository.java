package org.ebs.model.repos;

import org.ebs.model.ExampleParent;
import org.ebs.util.RepositoryExt;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExampleParentRepository extends JpaRepository<ExampleParent, Long>,
    RepositoryExt<ExampleParent>{
}