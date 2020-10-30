///////////////////////////////////////////////////////////
//  WorkflowCFTypeResolver.java
//  Macromedia ActionScript Implementation of the Class WorkflowCFTypeResolver
//  Generated by Enterprise Architect
//  Created on:      10-Sep-2020 10:44:59 PM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.graphql.resolvers;

import com.coxautodev.graphql.tools.GraphQLResolver;
import org.ebs.services.to.WorkflowCFTypeTo;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import java.util.Set;
import org.ebs.services.WorkflowCFTypeService;
import org.ebs.services.to.WorkflowNodeCFTo;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 10-Sep-2020 10:44:59 PM
 */
@Component @Validated
public class WorkflowCFTypeResolver implements GraphQLResolver<WorkflowCFTypeTo> {

	private WorkflowCFTypeService workflowcftypeService;

	/**
	 * 
	 * @param workflowcftype
	 */
	public Set<WorkflowNodeCFTo> getWorkflownodecfs(WorkflowCFTypeTo workflowcftype){
		return workflowcftypeService.findWorkflowNodeCFs(workflowcftype.getId());
	}

	/**
	 * 
	 * @param workflowcftypeService
	 */
	@Autowired
	public WorkflowCFTypeResolver(WorkflowCFTypeService workflowcftypeService){
		this.workflowcftypeService = workflowcftypeService; 
	
	}

}