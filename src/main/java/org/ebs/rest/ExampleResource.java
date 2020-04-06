package org.ebs.rest;

import javax.validation.constraints.Min;

import org.ebs.services.to.ExampleParentTO;
import org.ebs.util.brapi.BrPagedResponse;
import org.ebs.util.brapi.BrResponse;
import org.springframework.data.domain.Pageable;
import org.springframework.validation.annotation.Validated;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;

@Validated
public interface ExampleResource {
    @Operation(description = "Finds a request by ID")
    BrResponse<ExampleParentTO> getRequest(@Parameter(description = "db identifier") @Min(1) int idExample);

    @Operation(description = "Retrieve a bunch of requests")
    BrPagedResponse<ExampleParentTO> getRequest(Pageable page);

}