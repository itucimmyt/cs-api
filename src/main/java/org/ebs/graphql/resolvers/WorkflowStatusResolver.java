///////////////////////////////////////////////////////////
//  WorkflowStatusResolver.java
//  Macromedia ActionScript Implementation of the Class WorkflowStatusResolver
//  Generated by Enterprise Architect
//  Created on:      09-Aug-2020 4:52:09 PM
//  Original author: EBRIONES
//  Modified by: JAROJAS 03-09-2020
///////////////////////////////////////////////////////////

package org.ebs.graphql.resolvers;

import com.coxautodev.graphql.tools.GraphQLResolver;
import org.ebs.services.to.WorkflowStatusTo;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.ebs.services.WorkflowStatusService;
import org.ebs.services.to.WorkflowStatusTypeTo;
import org.ebs.services.to.WorkflowInstanceTo;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 09-Aug-2020 4:52:09 PM
 * Modified by: 03-09-2020
 */
@Component @Validated
public class WorkflowStatusResolver implements GraphQLResolver<WorkflowStatusTo> {

	private WorkflowStatusService workflowstatusService;

	/**
	 * 
	 * @param workflowstatusTo
	 */
	public WorkflowInstanceTo getWorkflowinstance(WorkflowStatusTo workflowstatusTo){
		return workflowstatusService.findWorkflowInstance(workflowstatusTo.getId()).orElse(null);
	}

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