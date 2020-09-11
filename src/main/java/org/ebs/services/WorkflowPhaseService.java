///////////////////////////////////////////////////////////
//  WorkflowPhaseService.java
//  Macromedia ActionScript Implementation of the Interface WorkflowPhaseService
//  Generated by Enterprise Architect
//  Created on:      10-Sep-2020 10:45:13 PM
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
import org.ebs.services.to.WorkflowPhaseTo;
import org.ebs.services.to.Input.WorkflowPhaseInput;
import org.ebs.services.to.WorkflowStageTo;
import org.ebs.services.to.WorkflowTo;
import org.ebs.services.to.HtmlTagTo;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 10-Sep-2020 10:45:13 PM
 */
public interface WorkflowPhaseService {

	/**
	 * 
	 * @param WorkflowPhase
	 */
	public WorkflowPhaseTo createWorkflowPhase(WorkflowPhaseInput WorkflowPhase);

	/**
	 * 
	 * @param workflowPhaseId
	 */
	public int deleteWorkflowPhase(int workflowPhaseId);

	/**
	 * 
	 * @param workflowphaseId
	 */
	public Optional<HtmlTagTo> findHtmlTag(int workflowphaseId);

	/**
	 * 
	 * @param workflowphaseId
	 */
	public Optional<WorkflowTo> findWorkflow(int workflowphaseId);

	/**
	 * 
	 * @param workflowPhaseId
	 */
	public Optional<WorkflowPhaseTo> findWorkflowPhase(int workflowPhaseId);

	/**
	 * 
	 * @param page
	 * @param sort
	 * @param filters
	 */
	public Page<WorkflowPhaseTo> findWorkflowPhases(PageInput page, SortInput sort, List<FilterInput> filters);

	/**
	 * 
	 * @param workflowphaseId
	 */
	public Set<WorkflowStageTo> findWorkflowStages(int workflowphaseId);

	/**
	 * 
	 * @param workflowPhase
	 */
	public WorkflowPhaseTo modifyWorkflowPhase(WorkflowPhaseInput workflowPhase);

}