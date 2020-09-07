///////////////////////////////////////////////////////////
//  WorkflowEventResolver.java
//  Macromedia ActionScript Implementation of the Class WorkflowEventResolver
//  Generated by Enterprise Architect
//  Created on:      07-Sep-2020 8:12:35 AM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.graphql.resolvers;

import com.coxautodev.graphql.tools.GraphQLResolver;
import org.ebs.services.to.WorkflowEventTo;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.ebs.services.WorkflowEventService;
import org.ebs.services.to.WorkflowStageTo;
import org.ebs.services.to.WorkflowInstanceTo;
import org.ebs.services.to.WorkflowNodeTo;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 07-Sep-2020 8:12:35 AM
 */
@Component @Validated
public class WorkflowEventResolver implements GraphQLResolver<WorkflowEventTo> {

	private WorkflowEventService workflowEventService;

	/**
	 * 
	 * @param workflowEventTo
	 */
	public WorkflowInstanceTo getWorkflowInstance(WorkflowEventTo workflowEventTo){
		return workflowEventService.findWorkflowInstance(workflowEventTo.getId()).get();
	}

	/**
	 * 
	 * @param workflowEventTo
	 */
	public WorkflowNodeTo getWorkflowNode(WorkflowEventTo workflowEventTo){
		return workflowEventService.findWorkflowNode(workflowEventTo.getId()).get();
	}

	/**
	 * 
	 * @param workflowEventTo
	 */
	public WorkflowStageTo getWorkflowStage(WorkflowEventTo workflowEventTo){
		return workflowEventService.findWorkflowStage(workflowEventTo.getId()).get();
	}

	/**
	 * 
	 * @param workfloweventService
	 */
	@Autowired
	public WorkflowEventResolver(WorkflowEventService workfloweventService){
		this.workflowEventService = workfloweventService; 
	
	}

}