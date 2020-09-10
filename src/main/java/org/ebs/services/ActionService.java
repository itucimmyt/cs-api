///////////////////////////////////////////////////////////
//  ActionService.java
//  Macromedia ActionScript Implementation of the Interface ActionService
//  Generated by Enterprise Architect
//  Created on:      10-Sep-2020 12:18:44 AM
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
import org.ebs.services.to.ActionTo;
import org.ebs.services.to.Input.ActionInput;
import org.ebs.services.to.WorkflowStageTo;
import org.ebs.services.to.RoleActionTo;
import org.ebs.services.to.WorkflowNodeTo;
import org.ebs.services.to.RoleTo;
import org.ebs.services.to.ModuleTo;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 10-Sep-2020 12:18:44 AM
 */
public interface ActionService {

	/**
	 * 
	 * @param Action
	 */
	public ActionTo createAction(ActionInput Action);

	/**
	 * 
	 * @param actionId
	 */
	public int deleteAction(int actionId);

	/**
	 * 
	 * @param actionId
	 */
	public Optional<ActionTo> findAction(int actionId);

	/**
	 * 
	 * @param page
	 * @param sort
	 * @param filters
	 */
	public Page<ActionTo> findActions(PageInput page, SortInput sort, List<FilterInput> filters);

	/**
	 * 
	 * @param actionId
	 */
	public Optional<ModuleTo> findModule(int actionId);

	/**
	 * 
	 * @param actionId
	 */
	public Set<RoleActionTo> findRoleActions(int actionId);

	/**
	 * 
	 * @param actionId
	 */
	public Set<RoleTo> findRoles(int actionId);

	/**
	 * 
	 * @param actionId
	 */
	public Optional<WorkflowNodeTo> findWorkflowNode(int actionId);

	/**
	 * 
	 * @param actionId
	 */
	public Optional<WorkflowStageTo> findWorkflowStage(int actionId);

	/**
	 * 
	 * @param action
	 */
	public ActionTo modifyAction(ActionInput action);

}