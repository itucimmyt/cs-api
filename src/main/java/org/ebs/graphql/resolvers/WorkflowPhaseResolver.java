///////////////////////////////////////////////////////////
//  WorkflowPhaseResolver.java
//  Macromedia ActionScript Implementation of the Class WorkflowPhaseResolver
//  Generated by Enterprise Architect
//  Created on:      10-Sep-2020 12:20:54 AM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.graphql.resolvers;

import com.coxautodev.graphql.tools.GraphQLResolver;
import org.ebs.services.to.WorkflowPhaseTo;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import java.util.Set;
import org.ebs.services.WorkflowPhaseService;
import org.ebs.services.to.WorkflowStageTo;
import org.ebs.services.to.WorkflowTo;
import org.ebs.services.to.HtmlTagTo;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 10-Sep-2020 12:20:54 AM
 */
@Component @Validated
public class WorkflowPhaseResolver implements GraphQLResolver<WorkflowPhaseTo> {

	private WorkflowPhaseService workflowphaseService;

	/**
	 * 
	 * @param workflowphaseTo
	 */
	public HtmlTagTo getHtmltag(WorkflowPhaseTo workflowphaseTo){
		return workflowphaseService.findHtmlTag(workflowphaseTo.getId()).get();
	}

	/**
	 * 
	 * @param workflowphaseTo
	 */
	public WorkflowTo getWorkflow(WorkflowPhaseTo workflowphaseTo){
		return workflowphaseService.findWorkflow(workflowphaseTo.getId()).get();
	}

	/**
	 * 
	 * @param workflowphase
	 */
	public Set<WorkflowStageTo> getWorkflowstages(WorkflowPhaseTo workflowphase){
		return workflowphaseService.findWorkflowStages(workflowphase.getId());
	}

	/**
	 * 
	 * @param workflowphaseService
	 */
	@Autowired
	public WorkflowPhaseResolver(WorkflowPhaseService workflowphaseService){
		this.workflowphaseService = workflowphaseService; 
	
	}

}