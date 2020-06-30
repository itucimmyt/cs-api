package org.ebs.rest;

import javax.validation.constraints.Min;

import org.ebs.services.to.ProjectTo;
import org.ebs.util.brapi.BrResponse;
import org.springframework.validation.annotation.Validated;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;

/**
 * For rest resources, Validation is enabled in *Resource interfaces with @Validated.
 * This way annotations like @Min(1) or any custom annotation for validation are honored
 */
@Validated
public interface SampleCodeResource {

	/**
     * Swagger documentation can be created here. If no document annotations are used, default Swagger file will be created
     * @param idExample
     * @return
     */
    @Operation(description = "Finds the last study ID by service provider and filter project")
    BrResponse<ProjectTo> getLastStudyCodeByServiceProviderAndProject(@Parameter(description = "Service Provider Id") @Min(1) int idServiceProvider);
    
    @Operation(description = "Finds a request by ID")
    BrResponse<ProjectTo> getLastSampleCodeByServiceProviderAndProject(@Parameter(description = "Service Provider Id") @Min(1) int idServiceProvider);
	
}
