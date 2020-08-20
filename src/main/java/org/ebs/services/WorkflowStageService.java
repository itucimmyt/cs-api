///////////////////////////////////////////////////////////
//  WorkflowStageService.java
//  Macromedia ActionScript Implementation of the Interface WorkflowStageService
//  Generated by Enterprise Architect
//  Created on:      20-Aug-2020 1:07:08 PM
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
import org.ebs.services.to.WorkflowStageTo;
import org.ebs.services.to.Input.WorkflowStageInput;
import org.ebs.services.to.ActionTo;
import org.ebs.services.to.WorkflowPhaseTo;
import org.ebs.services.to.WorkflowEventTo;
import org.ebs.services.to.HtmlTagTo;
import org.ebs.services.to.WorkflowNodeTo;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 20-Aug-2020 1:07:08 PM
 */
public interface WorkflowStageService {

	/**
	 * 
	 * @param WorkflowStage
	 */
	public WorkflowStageTo createWorkflowStage(WorkflowStageInput WorkflowStage);

	/**
	 * 
	 * @param workflowstageId
	 */
	public int deleteWorkflowStage(int workflowstageId);

	/**
	 * 
	 * @param workflowstageId
	 */
	public Set<ActionTo> findActions(int workflowstageId);

	/**
	 * 
	 * @param workflowstageId
	 */
	public Optional<HtmlTagTo> findHtmlTag(int workflowstageId);

	/**
	 * 
	 * @param workflowstageId
	 */
	public Set<WorkflowEventTo> findWorkflowEvents(int workflowstageId);

	/**
	 * 
	 * @param workflowstageId
	 */
	public Set<WorkflowNodeTo> findWorkflowNodes(int workflowstageId);

	/**
	 * 
	 * @param workflowstageId
	 */
	public Optional<WorkflowPhaseTo> findWorkflowPhase(int workflowstageId);

	/**
	 * 
	 * @param workflowstageId
	 */
	public Optional<WorkflowStageTo> findWorkflowStage(int workflowstageId);

	/**
	 * 
	 * @param page
	 * @param sort
	 * @param filters
	 */
	public Page<WorkflowStageTo> findWorkflowStages(PageInput page, SortInput sort, List<FilterInput> filters);

	/**
	 * 
	 * @param workflowstage
	 */
	public WorkflowStageTo modifyWorkflowStage(WorkflowStageInput workflowstage);

}