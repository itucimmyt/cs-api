///////////////////////////////////////////////////////////
//  WorkflowStatusService.java
//  Macromedia ActionScript Implementation of the Interface WorkflowStatusService
//  Generated by Enterprise Architect
//  Created on:      10-Sep-2020 12:21:00 AM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.services;

import java.util.List;
import java.util.Optional;
import org.ebs.util.FilterInput;
import org.ebs.util.PageInput;
import org.ebs.util.SortInput;
import org.springframework.data.domain.Page;
import org.ebs.services.to.WorkflowStatusTypeTo;
import org.ebs.services.to.WorkflowInstanceTo;
import org.ebs.services.to.WorkflowStatusTo;
import org.ebs.services.to.Input.WorkflowStatusInput;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 10-Sep-2020 12:21:00 AM
 */
public interface WorkflowStatusService {

	/**
	 * 
	 * @param WorkflowStatus
	 */
	public WorkflowStatusTo createWorkflowStatus(WorkflowStatusInput WorkflowStatus);

	/**
	 * 
	 * @param workflowStatusId
	 */
	public int deleteWorkflowStatus(int workflowStatusId);

	/**
	 * 
	 * @param workflowstatusId
	 */
	public Optional<WorkflowInstanceTo> findWorkflowInstance(int workflowstatusId);

	/**
	 * 
	 * @param workflowStatusId
	 */
	public Optional<WorkflowStatusTo> findWorkflowStatus(int workflowStatusId);

	/**
	 * 
	 * @param page
	 * @param sort
	 * @param filters
	 */
	public Page<WorkflowStatusTo> findWorkflowStatuss(PageInput page, SortInput sort, List<FilterInput> filters);

	/**
	 * 
	 * @param workflowstatusId
	 */
	public Optional<WorkflowStatusTypeTo> findWorkflowStatusType(int workflowstatusId);

	/**
	 * 
	 * @param workflowStatus
	 */
	public WorkflowStatusTo modifyWorkflowStatus(WorkflowStatusInput workflowStatus);

}