///////////////////////////////////////////////////////////
//  WorkflowNodeResolver.java
//  Macromedia ActionScript Implementation of the Class WorkflowNodeResolver
//  Generated by Enterprise Architect
//  Created on:      13-Jul-2020 5:07:47 PM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.graphql.resolvers;

import com.coxautodev.graphql.tools.GraphQLResolver;
import org.ebs.services.to.WorkflowNodeTo;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import java.util.Set;
import org.ebs.services.WorkflowNodeService;
import org.ebs.services.to.WorkflowTo;
import org.ebs.services.to.WorkflowEventTo;
import org.ebs.services.to.ModuleTo;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 13-Jul-2020 5:07:47 PM
 */
@Component @Validated
public class WorkflowNodeResolver implements GraphQLResolver<WorkflowNodeTo> {

	private WorkflowNodeService workflownodeService;

	/**
	 * 
	 * @param workflownodeTo
	 */
	public ModuleTo getModule(WorkflowNodeTo workflownodeTo){
		return workflownodeService.findModule(workflownodeTo.getId()).get();
	}

	/**
	 * 
	 * @param workflownodeTo
	 */
	public WorkflowTo getWorkflow(WorkflowNodeTo workflownodeTo){
		return workflownodeService.findWorkflow(workflownodeTo.getId()).get();
	}

	/**
	 * 
	 * @param workflownode
	 */
	public Set<WorkflowEventTo> getWorkflowevents(WorkflowNodeTo workflownode){
		return workflownodeService.findWorkflowEvents(workflownode.getId());
	}

	/**
	 * 
	 * @param workflownode
	 */
	public Set<WorkflowTo> getWorkflows(WorkflowNodeTo workflownode){
		return workflownodeService.findWorkflows(workflownode.getId());
	}

	/**
	 * 
	 * @param workflownodeService
	 */
	@Autowired
	public WorkflowNodeResolver(WorkflowNodeService workflownodeService){
		this.workflownodeService = workflownodeService; 
	
	}

}