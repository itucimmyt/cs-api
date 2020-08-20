///////////////////////////////////////////////////////////
//  WorkflowNodeResolver.java
//  Macromedia ActionScript Implementation of the Class WorkflowNodeResolver
//  Generated by Enterprise Architect
//  Created on:      20-Aug-2020 1:07:02 PM
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
import org.ebs.services.to.WorkflowStageTo;
import org.ebs.services.to.WorkflowTo;
import org.ebs.services.to.ActionTo;
import org.ebs.services.to.EntityReferenceTo;
import org.ebs.services.to.WorkflowEventTo;
import org.ebs.services.to.HtmlTagTo;
import org.ebs.services.to.ProcessTo;
import org.ebs.services.to.ModuleTo;
import org.ebs.services.to.WorkflowNodeCFTo;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 20-Aug-2020 1:07:02 PM
 */
@Component @Validated
public class WorkflowNodeResolver implements GraphQLResolver<WorkflowNodeTo> {

	private WorkflowNodeService workflownodeService;

	/**
	 * 
	 * @param workflownode
	 */
	public Set<ActionTo> getActions(WorkflowNodeTo workflownode){
		return workflownodeService.findActions(workflownode.getId());
	}

	/**
	 * 
	 * @param workflownodeTo
	 */
	public EntityReferenceTo getEntityreference(WorkflowNodeTo workflownodeTo){
		return workflownodeService.findEntityReference(workflownodeTo.getId()).get();
	}

	/**
	 * 
	 * @param workflownodeTo
	 */
	public HtmlTagTo getHtmltag(WorkflowNodeTo workflownodeTo){
		return workflownodeService.findHtmlTag(workflownodeTo.getId()).get();
	}

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
	public ProcessTo getProcess(WorkflowNodeTo workflownodeTo){
		return workflownodeService.findProcess(workflownodeTo.getId()).get();
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
	public Set<WorkflowNodeCFTo> getWorkflownodecfs(WorkflowNodeTo workflownode){
		return workflownodeService.findWorkflowNodeCFs(workflownode.getId());
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
	 * @param workflownodeTo
	 */
	public Set<WorkflowStageTo> getWorkflowstages(WorkflowNodeTo workflownodeTo){
		return workflownodeService.findWorkflowStages(workflownodeTo.getId());
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