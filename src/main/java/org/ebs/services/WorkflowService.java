///////////////////////////////////////////////////////////
//  WorkflowService.java
//  Macromedia ActionScript Implementation of the Interface WorkflowService
//  Generated by Enterprise Architect
//  Created on:      13-Jul-2020 5:07:51 PM
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
import org.ebs.services.to.WorkflowTo;
import org.ebs.services.to.Input.WorkflowInput;
import org.ebs.services.to.WorkflowPhaseTo;
import org.ebs.services.to.TenantTo;
import org.ebs.services.to.WorkflowInstanceTo;
import org.ebs.services.to.WorkflowNodeTo;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 13-Jul-2020 5:07:51 PM
 */
public interface WorkflowService {

	/**
	 * 
	 * @param Workflow
	 */
	public WorkflowTo createWorkflow(WorkflowInput Workflow);

	/**
	 * 
	 * @param workflowId
	 */
	public int deleteWorkflow(int workflowId);

	/**
	 * 
	 * @param workflowId
	 */
	public Optional<TenantTo> findTenant(int workflowId);

	/**
	 * 
	 * @param workflowId
	 */
	public Optional<WorkflowTo> findWorkflow(int workflowId);

	/**
	 * 
	 * @param workflowId
	 */
	public Set<WorkflowInstanceTo> findWorkflowInstances(int workflowId);

	/**
	 * 
	 * @param workflowId
	 */
	public Optional<WorkflowNodeTo> findWorkflowNode(int workflowId);

	/**
	 * 
	 * @param workflowId
	 */
	public Set<WorkflowNodeTo> findWorkflowNodes(int workflowId);

	/**
	 * 
	 * @param workflowId
	 */
	public Set<WorkflowPhaseTo> findWorkflowPhases(int workflowId);

	/**
	 * 
	 * @param page
	 * @param sort
	 * @param filters
	 */
	public Page<WorkflowTo> findWorkflows(PageInput page, SortInput sort, List<FilterInput> filters);

	/**
	 * 
	 * @param workflow
	 */
	public WorkflowTo modifyWorkflow(WorkflowInput workflow);

}