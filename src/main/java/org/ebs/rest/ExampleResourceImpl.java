package org.ebs.rest;

import org.ebs.services.ExampleService;
import org.ebs.services.to.ExampleParentTO;
import org.ebs.util.brapi.BrPagedResponse;
import org.ebs.util.brapi.BrResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Implementations of a Rest Resource interface must use {@code @RestController}.
 * Use @GetMapping, @PostMapping, @PutMapping or @DeleteMapping accordingly
 
 * This layer is in charge of:
 * - Define Rest endpoints, parameters and return types
 * - Validating inputs
 * - Invoking Service components to perform actions
 */
@RestController
@RequestMapping("rest")
class ExampleResourceImpl implements ExampleResource {

    private ExampleService exampleService;

    @Autowired
    public ExampleResourceImpl(ExampleService exampleService) {
        this.exampleService = exampleService;
    }

    @Override
    @GetMapping("example")
    public BrPagedResponse<ExampleParentTO> getRequest(Pageable pageRequest) {
        return exampleService.findBrExamples(pageRequest);
    }

    @Override
    @GetMapping("example/{exampleDbId}")
    public BrResponse<ExampleParentTO> getRequest(@PathVariable int exampleDbId) {
        return exampleService.findBrExample(exampleDbId);
    }

}