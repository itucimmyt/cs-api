///////////////////////////////////////////////////////////
//  RoleActionResolver.java
//  Macromedia ActionScript Implementation of the Class RoleActionResolver
//  Generated by Enterprise Architect
//  Created on:      07-Sep-2020 8:11:59 AM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.graphql.resolvers;

import com.coxautodev.graphql.tools.GraphQLResolver;
import org.ebs.services.to.RoleActionTo;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.ebs.services.RoleActionService;
import org.ebs.services.to.ActionTo;
import org.ebs.services.to.RoleTo;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 07-Sep-2020 8:11:59 AM
 */
@Component @Validated
public class RoleActionResolver implements GraphQLResolver<RoleActionTo> {

	private RoleActionService roleActionService;

	/**
	 * 
	 * @param roleActionTo
	 */
	public ActionTo getAction(RoleActionTo roleActionTo){
		return roleActionService.findAction(roleActionTo.getId()).get();
	}

	/**
	 * 
	 * @param roleActionTo
	 */
	public RoleTo getRole(RoleActionTo roleActionTo){
		return roleActionService.findRole(roleActionTo.getId()).get();
	}

	/**
	 * 
	 * @param roleactionService
	 */
	@Autowired
	public RoleActionResolver(RoleActionService roleactionService){
		this.roleActionService = roleactionService; 
	
	}

}