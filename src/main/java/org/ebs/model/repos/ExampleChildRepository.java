package org.ebs.model.repos;

import java.util.List;

import org.ebs.model.ExampleChild;
import org.ebs.util.RepositoryExt;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExampleChildRepository extends JpaRepository<ExampleChild, Long>,
    RepositoryExt<ExampleChild>{
        List<ExampleChild> findByParentId(long parentId);
}