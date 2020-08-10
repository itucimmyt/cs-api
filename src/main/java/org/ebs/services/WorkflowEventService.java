///////////////////////////////////////////////////////////
//  WorkflowEventService.java
//  Macromedia ActionScript Implementation of the Interface WorkflowEventService
//  Generated by Enterprise Architect
//  Created on:      09-Aug-2020 4:51:55 PM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.services;

import java.util.List;
import java.util.Optional;
import org.ebs.util.FilterInput;
import org.ebs.util.PageInput;
import org.ebs.util.SortInput;
import org.springframework.data.domain.Page;
import org.ebs.services.to.WorkflowEventTo;
import org.ebs.services.to.Input.WorkflowEventInput;
import org.ebs.services.to.WorkflowInstanceTo;
import org.ebs.services.to.WorkflowNodeTo;
import org.ebs.services.to.WorkflowStageTo;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 09-Aug-2020 4:51:55 PM
 */
public interface WorkflowEventService {

	/**
	 * 
	 * @param WorkflowEvent
	 */
	public WorkflowEventTo createWorkflowEvent(WorkflowEventInput WorkflowEvent);

	/**
	 * 
	 * @param workfloweventId
	 */
	public int deleteWorkflowEvent(int workfloweventId);

	/**
	 * 
	 * @param workfloweventId
	 */
	public Optional<WorkflowEventTo> findWorkflowEvent(int workfloweventId);

	/**
	 * 
	 * @param page
	 * @param sort
	 * @param filters
	 */
	public Page<WorkflowEventTo> findWorkflowEvents(PageInput page, SortInput sort, List<FilterInput> filters);

	/**
	 * 
	 * @param workfloweventId
	 */
	public Optional<WorkflowInstanceTo> findWorkflowInstance(int workfloweventId);

	/**
	 * 
	 * @param workfloweventId
	 */
	public Optional<WorkflowNodeTo> findWorkflowNode(int workfloweventId);

	/**
	 * 
	 * @param workfloweventId
	 */
	public Optional<WorkflowStageTo> findWorkflowStage(int workfloweventId);

	/**
	 * 
	 * @param workflowevent
	 */
	public WorkflowEventTo modifyWorkflowEvent(WorkflowEventInput workflowevent);

}