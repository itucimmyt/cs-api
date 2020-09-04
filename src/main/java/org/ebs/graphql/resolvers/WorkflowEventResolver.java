///////////////////////////////////////////////////////////
//  WorkflowEventResolver.java
//  Macromedia ActionScript Implementation of the Class WorkflowEventResolver
//  Generated by Enterprise Architect
//  Created on:      04-Sep-2020 10:06:33 AM
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
 * @created 04-Sep-2020 10:06:33 AM
 */
@Component @Validated
public class WorkflowEventResolver implements GraphQLResolver<WorkflowEventTo> {

	private WorkflowEventService workfloweventService;

	/**
	 * 
	 * @param workfloweventTo
	 */
	public WorkflowInstanceTo getWorkflowinstance(WorkflowEventTo workfloweventTo){
		return workfloweventService.findworkflowinstance(workfloweventTo.getId()).get();
	}

	/**
	 * 
	 * @param workfloweventTo
	 */
	public WorkflowNodeTo getWorkflownode(WorkflowEventTo workfloweventTo){
		return workfloweventService.findworkflownode(workfloweventTo.getId()).get();
	}

	/**
	 * 
	 * @param workfloweventTo
	 */
	public WorkflowStageTo getWorkflowstage(WorkflowEventTo workfloweventTo){
		return workfloweventService.findworkflowstage(workfloweventTo.getId()).get();
	}

	/**
	 * 
	 * @param workfloweventService
	 */
	@Autowired
	public WorkflowEventResolver(WorkflowEventService workfloweventService){
		this.workfloweventService = workfloweventService; 
	
	}

}