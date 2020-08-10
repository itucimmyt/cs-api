///////////////////////////////////////////////////////////
//  WorkflowStageResolver.java
//  Macromedia ActionScript Implementation of the Class WorkflowStageResolver
//  Generated by Enterprise Architect
//  Created on:      09-Aug-2020 4:52:07 PM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.graphql.resolvers;

import com.coxautodev.graphql.tools.GraphQLResolver;
import org.ebs.services.to.WorkflowStageTo;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import java.util.Set;
import org.ebs.services.WorkflowStageService;
import org.ebs.services.to.WorkflowPhaseTo;
import org.ebs.services.to.WorkflowEventTo;
import org.ebs.services.to.HtmlTagTo;
import org.ebs.services.to.WorkflowNodeTo;
import org.ebs.services.to.ActionTo;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 09-Aug-2020 4:52:07 PM
 */
@Component @Validated
public class WorkflowStageResolver implements GraphQLResolver<WorkflowStageTo> {

	private WorkflowStageService workflowstageService;

	/**
	 * 
	 * @param workflowstage
	 */
	public Set<ActionTo> getActions(WorkflowStageTo workflowstage){
		return workflowstageService.findActions(workflowstage.getId());
	}

	/**
	 * 
	 * @param workflowstageTo
	 */
	public HtmlTagTo getHtmltag(WorkflowStageTo workflowstageTo){
		return workflowstageService.findHtmlTag(workflowstageTo.getId()).get();
	}

	/**
	 * 
	 * @param workflowstage
	 */
	public Set<WorkflowEventTo> getWorkflowevents(WorkflowStageTo workflowstage){
		return workflowstageService.findWorkflowEvents(workflowstage.getId());
	}

	/**
	 * 
	 * @param workflowstageTo
	 */
	public Set<WorkflowNodeTo> getWorkflownodes(WorkflowStageTo workflowstageTo){
		return workflowstageService.findWorkflowNodes(workflowstageTo.getId());
	}

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