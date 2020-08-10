///////////////////////////////////////////////////////////
//  RoleActionService.java
//  Macromedia ActionScript Implementation of the Interface RoleActionService
//  Generated by Enterprise Architect
//  Created on:      09-Aug-2020 4:51:21 PM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.services;

import org.ebs.util.SortInput;
import org.springframework.data.domain.Page;
import java.util.List;
import java.util.Optional;
import org.ebs.util.FilterInput;
import org.ebs.util.PageInput;
import org.ebs.services.to.RoleActionTo;
import org.ebs.services.to.Input.RoleActionInput;
import org.ebs.services.to.ActionTo;
import org.ebs.services.to.RoleTo;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 09-Aug-2020 4:51:21 PM
 */
public interface RoleActionService {

	/**
	 * 
	 * @param RoleAction
	 */
	public RoleActionTo createRoleAction(RoleActionInput RoleAction);

	/**
	 * 
	 * @param roleactionId
	 */
	public int deleteRoleAction(int roleactionId);

	/**
	 * 
	 * @param roleactionId
	 */
	public Optional<ActionTo> findAction(int roleactionId);

	/**
	 * 
	 * @param roleactionId
	 */
	public Optional<RoleTo> findRole(int roleactionId);

	/**
	 * 
	 * @param roleactionId
	 */
	public Optional<RoleActionTo> findRoleAction(int roleactionId);

	/**
	 * 
	 * @param page
	 * @param sort
	 * @param filters
	 */
	public Page<RoleActionTo> findRoleActions(PageInput page, SortInput sort, List<FilterInput> filters);

	/**
	 * 
	 * @param roleaction
	 */
	public RoleActionTo modifyRoleAction(RoleActionInput roleaction);

}