///////////////////////////////////////////////////////////
//  WorkflowStatusTypeService.java
//  Macromedia ActionScript Implementation of the Interface WorkflowStatusTypeService
//  Generated by Enterprise Architect
//  Created on:      15-Jun-2020 5:15:10 PM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.services;

import java.util.List;
import java.util.Optional;
import org.ebs.util.FilterInput;
import org.ebs.util.PageInput;
import org.ebs.util.SortInput;
import org.springframework.data.domain.Page;
import java.util.Set;
import org.ebs.services.to.WorkflowStatusTypeTo;
import org.ebs.services.to.Input.WorkflowStatusTypeInput;
import org.ebs.services.to.WorkflowStatusTo;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 15-Jun-2020 5:15:10 PM
 */
public interface WorkflowStatusTypeService {

	/**
	 * 
	 * @param WorkflowStatusType
	 */
	public WorkflowStatusTypeTo createWorkflowStatusType(WorkflowStatusTypeInput WorkflowStatusType);

	/**
	 * 
	 * @param workflowstatustypeId
	 */
	public int deleteWorkflowStatusType(int workflowstatustypeId);

	/**
	 * 
	 * @param workflowstatustypeId
	 */
	public Set<WorkflowStatusTo> findWorkflowStatuss(int workflowstatustypeId);

	/**
	 * 
	 * @param workflowstatustypeId
	 */
	public Optional<WorkflowStatusTypeTo> findWorkflowStatusType(int workflowstatustypeId);

	/**
	 * 
	 * @param page
	 * @param sort
	 * @param filters
	 */
	public Page<WorkflowStatusTypeTo> findWorkflowStatusTypes(PageInput page, SortInput sort, List<FilterInput> filters);

	/**
	 * 
	 * @param workflowstatustype
	 */
	public WorkflowStatusTypeTo modifyWorkflowStatusType(WorkflowStatusTypeInput workflowstatustype);

}