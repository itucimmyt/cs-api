///////////////////////////////////////////////////////////
//  WorkflowInstanceService.java
//  Macromedia ActionScript Implementation of the Interface WorkflowInstanceService
//  Generated by Enterprise Architect
//  Created on:      27-Jul-2020 8:43:57 AM
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
import org.ebs.services.to.WorkflowInstanceTo;
import org.ebs.services.to.Input.WorkflowInstanceInput;
import org.ebs.services.to.WorkflowStatusTo;
import org.ebs.services.to.WorkflowEventTo;
import org.ebs.services.to.WorkflowTo;
import org.ebs.services.to.RequestTo;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 27-Jul-2020 8:43:57 AM
 */
public interface WorkflowInstanceService {

	/**
	 * 
	 * @param WorkflowInstance
	 */
	public WorkflowInstanceTo createWorkflowInstance(WorkflowInstanceInput WorkflowInstance);

	/**
	 * 
	 * @param workflowinstanceId
	 */
	public int deleteWorkflowInstance(int workflowinstanceId);

	/**
	 * 
	 * @param workflowinstanceId
	 */
	public Set<RequestTo> findRequests(int workflowinstanceId);

	/**
	 * 
	 * @param workflowinstanceId
	 */
	public Optional<WorkflowTo> findWorkflow(int workflowinstanceId);

	/**
	 * 
	 * @param workflowinstanceId
	 */
	public Set<WorkflowEventTo> findWorkflowEvents(int workflowinstanceId);

	/**
	 * 
	 * @param workflowinstanceId
	 */
	public Optional<WorkflowInstanceTo> findWorkflowInstance(int workflowinstanceId);

	/**
	 * 
	 * @param page
	 * @param sort
	 * @param filters
	 */
	public Page<WorkflowInstanceTo> findWorkflowInstances(PageInput page, SortInput sort, List<FilterInput> filters);

	/**
	 * 
	 * @param workflowinstanceId
	 */
	public Set<WorkflowStatusTo> findWorkflowStatuss(int workflowinstanceId);

	/**
	 * 
	 * @param workflowinstance
	 */
	public WorkflowInstanceTo modifyWorkflowInstance(WorkflowInstanceInput workflowinstance);

}