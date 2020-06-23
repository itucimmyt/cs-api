///////////////////////////////////////////////////////////
//  WorkflowNodeCFService.java
//  Macromedia ActionScript Implementation of the Interface WorkflowNodeCFService
//  Generated by Enterprise Architect
//  Created on:      15-Jun-2020 5:14:58 PM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.services;

import java.util.List;
import java.util.Optional;
import org.ebs.util.FilterInput;
import org.ebs.util.PageInput;
import org.ebs.util.SortInput;
import org.springframework.data.domain.Page;
import org.ebs.services.to.WorkflowNodeCFTo;
import org.ebs.services.to.Input.WorkflowNodeCFInput;
import org.ebs.services.to.RequestCFValueTo;
import org.ebs.services.to.WorkflowCFTypeTo;
import org.ebs.services.to.WorkflowNodeTo;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 15-Jun-2020 5:14:58 PM
 */
public interface WorkflowNodeCFService {

	/**
	 * 
	 * @param WorkflowNodeCF
	 */
	public WorkflowNodeCFTo createWorkflowNodeCF(WorkflowNodeCFInput WorkflowNodeCF);

	/**
	 * 
	 * @param workflownodecfId
	 */
	public int deleteWorkflowNodeCF(int workflownodecfId);

	/**
	 * 
	 * @param workflownodecfId
	 */
	public Optional<WorkflowNodeCFTo> findWorkflowNodeCF(int workflownodecfId);

	/**
	 * 
	 * @param page
	 * @param sort
	 * @param filters
	 */
	public Page<WorkflowNodeCFTo> findWorkflowNodeCFs(PageInput page, SortInput sort, List<FilterInput> filters);

	/**
	 * 
	 * @param workflownodecf
	 */
	public WorkflowNodeCFTo modifyWorkflowNodeCF(WorkflowNodeCFInput workflownodecf);

}