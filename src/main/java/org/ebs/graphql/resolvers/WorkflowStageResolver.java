///////////////////////////////////////////////////////////
//  WorkflowStageResolver.java
//  Macromedia ActionScript Implementation of the Class WorkflowStageResolver
//  Generated by Enterprise Architect
//  Created on:      15-Jun-2020 5:15:06 PM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.graphql.resolvers;

import com.coxautodev.graphql.tools.GraphQLResolver;
import org.ebs.services.to.WorkflowStageTo;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.ebs.services.WorkflowStageService;
import org.ebs.services.to.WorkflowPhaseTo;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 15-Jun-2020 5:15:06 PM
 */
@Component @Validated
public class WorkflowStageResolver implements GraphQLResolver<WorkflowStageTo> {

	private WorkflowStageService workflowstageService;

	/**
	 * 
	 * @param workflowstageTo
	 */
	public WorkflowPhaseTo getWorkflowphase(WorkflowStageTo workflowstageTo){
		return workflowstageService.findWorkflowPhase(workflowstageTo.getId()).get();
	}

	/**
	 * 
	 * @param workflowstageService
	 */
	@Autowired
	public WorkflowStageResolver(WorkflowStageService workflowstageService){
		this.workflowstageService = workflowstageService; 
	
	}

}