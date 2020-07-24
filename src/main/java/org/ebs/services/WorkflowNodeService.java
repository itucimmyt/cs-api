///////////////////////////////////////////////////////////
//  WorkflowNodeService.java
//  Macromedia ActionScript Implementation of the Interface WorkflowNodeService
//  Generated by Enterprise Architect
//  Created on:      23-Jul-2020 10:47:38 PM
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
import org.ebs.services.to.WorkflowNodeTo;
import org.ebs.services.to.Input.WorkflowNodeInput;
import org.ebs.services.to.WorkflowEventTo;
import org.ebs.services.to.WorkflowStageTo;
import org.ebs.services.to.ProcessTo;
import org.ebs.services.to.WorkflowNodeCFTo;
import org.ebs.services.to.ModuleTo;
import org.ebs.services.to.WorkflowTo;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 23-Jul-2020 10:47:38 PM
 */
public interface WorkflowNodeService {

	/**
	 * 
	 * @param WorkflowNode
	 */
	public WorkflowNodeTo createWorkflowNode(WorkflowNodeInput WorkflowNode);

	/**
	 * 
	 * @param workflownodeId
	 */
	public int deleteWorkflowNode(int workflownodeId);

	/**
	 * 
	 * @param workflownodeId
	 */
	public Optional<ModuleTo> findModule(int workflownodeId);

	/**
	 * 
	 * @param workflownodeId
	 */
	public Optional<WorkflowTo> findWorkflow(int workflownodeId);

	/**
	 * 
	 * @param workflownodeId
	 */
	public Set<WorkflowEventTo> findWorkflowEvents(int workflownodeId);

	/**
	 * 
	 * @param workflownodeId
	 */
	public Optional<WorkflowNodeTo> findWorkflowNode(int workflownodeId);

	/**
	 * 
	 * @param workflownodeId
	 */
	public Set<WorkflowNodeCFTo> findWorkflowNodeCFs(int workflownodeId);

	/**
	 * 
	 * @param page
	 * @param sort
	 * @param filters
	 */
	public Page<WorkflowNodeTo> findWorkflowNodes(PageInput page, SortInput sort, List<FilterInput> filters);

	/**
	 * 
	 * @param workflownodeId
	 */
	public Set<WorkflowTo> findWorkflows(int workflownodeId);

	/**
	 * 
	 * @param workflownode
	 */
	public WorkflowNodeTo modifyWorkflowNode(WorkflowNodeInput workflownode);

}