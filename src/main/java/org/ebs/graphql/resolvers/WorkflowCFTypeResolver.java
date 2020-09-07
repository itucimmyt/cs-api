///////////////////////////////////////////////////////////
//  WorkflowCFTypeResolver.java
//  Macromedia ActionScript Implementation of the Class WorkflowCFTypeResolver
//  Generated by Enterprise Architect
//  Created on:      07-Sep-2020 8:12:31 AM
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
 * @created 07-Sep-2020 8:12:31 AM
 */
@Component @Validated
public class WorkflowCFTypeResolver implements GraphQLResolver<WorkflowCFTypeTo> {

	private WorkflowCFTypeService workflowCFTypeService;

	/**
	 * 
	 * @param workflowCFType
	 */
	public Set<WorkflowNodeCFTo> getWorkflowNodeCFs(WorkflowCFTypeTo workflowCFType){
		return workflowCFTypeService.findWorkflowNodeCFs(workflowCFType.getId());
	}

	/**
	 * 
	 * @param workflowcftypeService
	 */
	@Autowired
	public WorkflowCFTypeResolver(WorkflowCFTypeService workflowcftypeService){
		this.workflowCFTypeService = workflowcftypeService; 
	
	}

}