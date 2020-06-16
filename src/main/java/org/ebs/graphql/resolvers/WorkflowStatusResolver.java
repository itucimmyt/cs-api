///////////////////////////////////////////////////////////
//  WorkflowStatusResolver.java
//  Macromedia ActionScript Implementation of the Class WorkflowStatusResolver
//  Generated by Enterprise Architect
//  Created on:      15-Jun-2020 5:15:08 PM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.graphql.resolvers;

import com.coxautodev.graphql.tools.GraphQLResolver;
import org.ebs.services.to.WorkflowStatusTo;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.ebs.services.WorkflowStatusService;
import org.ebs.services.to.WorkflowStatusTypeTo;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 15-Jun-2020 5:15:08 PM
 */
@Component @Validated
public class WorkflowStatusResolver implements GraphQLResolver<WorkflowStatusTo> {

	private WorkflowStatusService workflowstatusService;

	/**
	 * 
	 * @param workflowstatusTo
	 */
	public WorkflowStatusTypeTo getWorkflowstatustype(WorkflowStatusTo workflowstatusTo){
		return workflowstatusService.findWorkflowStatusType(workflowstatusTo.getId()).get();
	}

	/**
	 * 
	 * @param workflowstatusService
	 */
	@Autowired
	public WorkflowStatusResolver(WorkflowStatusService workflowstatusService){
		this.workflowstatusService = workflowstatusService; 
	
	}

}