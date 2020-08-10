///////////////////////////////////////////////////////////
//  WorkflowStatusService.java
//  Macromedia ActionScript Implementation of the Interface WorkflowStatusService
//  Generated by Enterprise Architect
//  Created on:      09-Aug-2020 4:52:09 PM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.services;

import java.util.List;
import java.util.Optional;
import org.ebs.util.FilterInput;
import org.ebs.util.PageInput;
import org.ebs.util.SortInput;
import org.springframework.data.domain.Page;
import org.ebs.services.to.WorkflowStatusTo;
import org.ebs.services.to.Input.WorkflowStatusInput;
import org.ebs.services.to.WorkflowStatusTypeTo;
import org.ebs.services.to.WorkflowInstanceTo;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 09-Aug-2020 4:52:09 PM
 */
public interface WorkflowStatusService {

	/**
	 * 
	 * @param WorkflowStatus
	 */
	public WorkflowStatusTo createWorkflowStatus(WorkflowStatusInput WorkflowStatus);

	/**
	 * 
	 * @param workflowstatusId
	 */
	public int deleteWorkflowStatus(int workflowstatusId);

	/**
	 * 
	 * @param workflowstatusId
	 */
	public Optional<WorkflowInstanceTo> findWorkflowInstance(int workflowstatusId);

	/**
	 * 
	 * @param workflowstatusId
	 */
	public Optional<WorkflowStatusTo> findWorkflowStatus(int workflowstatusId);

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
	 * @param workflowstatus
	 */
	public WorkflowStatusTo modifyWorkflowStatus(WorkflowStatusInput workflowstatus);

}