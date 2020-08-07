///////////////////////////////////////////////////////////
//  WorkflowCFValueService.java
//  Macromedia ActionScript Implementation of the Interface WorkflowCFValueService
//  Generated by Enterprise Architect
//  Created on:      07-Aug-2020 3:02:23 PM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.services;

import java.util.List;
import java.util.Optional;
import org.ebs.util.FilterInput;
import org.ebs.util.PageInput;
import org.ebs.util.SortInput;
import org.springframework.data.domain.Page;
import org.ebs.services.to.WorkflowCFValueTo;
import org.ebs.services.to.Input.WorkflowCFValueInput;
import org.ebs.services.to.RequestTo;
import org.ebs.services.to.WorkflowNodeCFTo;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 07-Aug-2020 3:02:23 PM
 */
public interface WorkflowCFValueService {

	/**
	 * 
	 * @param WorkflowCFValue
	 */
	public WorkflowCFValueTo createWorkflowCFValue(WorkflowCFValueInput WorkflowCFValue);

	/**
	 * 
	 * @param workflowcfvalueId
	 */
	public int deleteWorkflowCFValue(int workflowcfvalueId);

	/**
	 * 
	 * @param workflowcfvalueId
	 */
	public Optional<RequestTo> findRequest(int workflowcfvalueId);

	/**
	 * 
	 * @param workflowcfvalueId
	 */
	public Optional<WorkflowCFValueTo> findWorkflowCFValue(int workflowcfvalueId);

	/**
	 * 
	 * @param page
	 * @param sort
	 * @param filters
	 */
	public Page<WorkflowCFValueTo> findWorkflowCFValues(PageInput page, SortInput sort, List<FilterInput> filters);

	/**
	 * 
	 * @param workflowcfvalueId
	 */
	public Optional<WorkflowNodeCFTo> findWorkflowNodeCF(int workflowcfvalueId);

	/**
	 * 
	 * @param workflowcfvalue
	 */
	public WorkflowCFValueTo modifyWorkflowCFValue(WorkflowCFValueInput workflowcfvalue);

}