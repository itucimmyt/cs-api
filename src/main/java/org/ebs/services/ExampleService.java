package org.ebs.services;

import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.ebs.services.to.ExampleChildTO;
import org.ebs.services.to.ExampleParentInput;
import org.ebs.services.to.ExampleParentTO;
import org.ebs.util.Connection;
import org.ebs.util.FilterInput;
import org.ebs.util.PageInput;
import org.ebs.util.SortInput;
import org.ebs.util.brapi.BrPagedResponse;
import org.ebs.util.brapi.BrResponse;
import org.springframework.data.domain.Pageable;

public interface ExampleService {

    Optional<ExampleParentTO> findExample(long exampleId);

    Connection<ExampleParentTO> findExamples(List<FilterInput> filters, SortInput sort, PageInput page);

    Set<ExampleChildTO> findChildren(long exampleParentId);

    ExampleParentTO createExampleParent(ExampleParentInput exampleParentInput);

    BrResponse<ExampleParentTO> findBrExample(long exampleDbId);

    BrPagedResponse<ExampleParentTO> findBrExamples(Pageable pageRequest);
}