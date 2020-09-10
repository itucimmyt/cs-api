///////////////////////////////////////////////////////////
//  WorkflowNodeCFResolver.java
//  Macromedia ActionScript Implementation of the Class WorkflowNodeCFResolver
//  Generated by Enterprise Architect
//  Created on:      10-Sep-2020 12:20:49 AM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.graphql.resolvers;

import com.coxautodev.graphql.tools.GraphQLResolver;
import org.ebs.services.to.WorkflowNodeCFTo;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import java.util.Set;
import org.ebs.services.WorkflowNodeCFService;
import org.ebs.services.to.WorkflowCFValueTo;
import org.ebs.services.to.WorkflowCFTypeTo;
import org.ebs.services.to.HtmlTagTo;
import org.ebs.services.to.EntityReferenceTo;
import org.ebs.services.to.WorkflowNodeTo;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 10-Sep-2020 12:20:49 AM
 */
@Component @Validated
public class WorkflowNodeCFResolver implements GraphQLResolver<WorkflowNodeCFTo> {

	private WorkflowNodeCFService workflownodecfService;

	/**
	 * 
	 * @param workflownodecfTo
	 */
	public EntityReferenceTo getEntityreference(WorkflowNodeCFTo workflownodecfTo){
		return workflownodecfService.findEntityReference(workflownodecfTo.getId()).get();
	}

	/**
	 * 
	 * @param workflownodecfTo
	 */
	public HtmlTagTo getHtmltag(WorkflowNodeCFTo workflownodecfTo){
		return workflownodecfService.findHtmlTag(workflownodecfTo.getId()).get();
	}

	/**
	 * 
	 * @param workflownodecfTo
	 */
	public WorkflowCFTypeTo getWorkflowcftype(WorkflowNodeCFTo workflownodecfTo){
		return workflownodecfService.findWorkflowCFType(workflownodecfTo.getId()).get();
	}

	/**
	 * 
	 * @param workflownodecf
	 */
	public Set<WorkflowCFValueTo> getWorkflowcfvalues(WorkflowNodeCFTo workflownodecf){
		return workflownodecfService.findWorkflowCFValues(workflownodecf.getId());
	}

	/**
	 * 
	 * @param workflownodecfTo
	 */
	public WorkflowNodeTo getWorkflownode(WorkflowNodeCFTo workflownodecfTo){
		return workflownodecfService.findWorkflowNode(workflownodecfTo.getId()).get();
	}

	/**
	 * 
	 * @param workflownodecfService
	 */
	@Autowired
	public WorkflowNodeCFResolver(WorkflowNodeCFService workflownodecfService){
		this.workflownodecfService = workflownodecfService; 
	
	}

}