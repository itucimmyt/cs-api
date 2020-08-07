///////////////////////////////////////////////////////////
//  RequestResolver.java
//  Macromedia ActionScript Implementation of the Class RequestResolver
//  Generated by Enterprise Architect
//  Created on:      07-Aug-2020 3:01:06 PM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.graphql.resolvers;

import com.coxautodev.graphql.tools.GraphQLResolver;
import org.ebs.services.to.RequestTo;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import java.util.Set;
import org.ebs.services.RequestService;
import org.ebs.services.to.PurposeTo;
import org.ebs.services.to.WorkflowCFValueTo;
import org.ebs.services.to.WorkflowInstanceTo;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 07-Aug-2020 3:01:06 PM
 */
@Component @Validated
public class RequestResolver implements GraphQLResolver<RequestTo> {

	private RequestService requestService;

	/**
	 * 
	 * @param requestTo
	 */
	public PurposeTo getPurpose(RequestTo requestTo){
		return requestService.findPurpose(requestTo.getId()).get();
	}

	/**
	 * 
	 * @param request
	 */
	public Set<WorkflowCFValueTo> getWorkflowcfvalues(RequestTo request){
		return requestService.findWorkflowCFValues(request.getId());
	}

	/**
	 * 
	 * @param requestTo
	 */
	public WorkflowInstanceTo getWorkflowinstance(RequestTo requestTo){
		return requestService.findWorkflowInstance(requestTo.getId()).get();
	}

	/**
	 * 
	 * @param requestService
	 */
	@Autowired
	public RequestResolver(RequestService requestService){
		this.requestService = requestService; 
	
	}

}