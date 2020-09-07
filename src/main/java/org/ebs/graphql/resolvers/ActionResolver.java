///////////////////////////////////////////////////////////
//  ActionResolver.java
//  Macromedia ActionScript Implementation of the Class ActionResolver
//  Generated by Enterprise Architect
//  Created on:      07-Sep-2020 8:10:45 AM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.graphql.resolvers;

import com.coxautodev.graphql.tools.GraphQLResolver;
import org.ebs.services.to.ActionTo;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import java.util.Set;
import org.ebs.services.ActionService;
import org.ebs.services.to.WorkflowStageTo;
import org.ebs.services.to.RoleActionTo;
import org.ebs.services.to.WorkflowNodeTo;
import org.ebs.services.to.RoleTo;
import org.ebs.services.to.ModuleTo;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 07-Sep-2020 8:10:45 AM
 */
@Component @Validated
public class ActionResolver implements GraphQLResolver<ActionTo> {

	private ActionService actionService;

	/**
	 * 
	 * @param actionService
	 */
	@Autowired
	public ActionResolver(ActionService actionService){
		this.actionService = actionService; 
	
	}

	/**
	 * 
	 * @param actionTo
	 */
	public ModuleTo getModule(ActionTo actionTo){
		return actionService.findModule(actionTo.getId()).get();
	}

	/**
	 * 
	 * @param action
	 */
	public Set<RoleActionTo> getRoleActions(ActionTo action){
		return actionService.findRoleActions(action.getId());
	}

	/**
	 * 
	 * @param actionTo
	 */
	public Set<RoleTo> getRoles(ActionTo actionTo){
		return actionService.findRoles(actionTo.getId());
	}

	/**
	 * 
	 * @param actionTo
	 */
	public WorkflowNodeTo getWorkflowNode(ActionTo actionTo){
		return actionService.findWorkflowNode(actionTo.getId()).get();
	}

	/**
	 * 
	 * @param actionTo
	 */
	public WorkflowStageTo getWorkflowStage(ActionTo actionTo){
		return actionService.findWorkflowStage(actionTo.getId()).get();
	}

}