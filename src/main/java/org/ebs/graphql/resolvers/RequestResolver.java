///////////////////////////////////////////////////////////
//  RequestResolver.java
//  Macromedia ActionScript Implementation of the Class RequestResolver
//  Generated by Enterprise Architect
//  Created on:      10-Sep-2020 10:44:24 PM
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
import org.ebs.services.to.WorkflowCFValueTo;
import org.ebs.services.to.WorkflowInstanceTo;
import org.ebs.services.to.PersonTo;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 10-Sep-2020 10:44:24 PM
 */
@Component @Validated
public class RequestResolver implements GraphQLResolver<RequestTo> {

	private RequestService requestService;

	/**
	 * 
	 * @param requestTo
	 */
	public PersonTo getPerson(RequestTo requestTo){
		return requestService.findPerson(requestTo.getId()).get();
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