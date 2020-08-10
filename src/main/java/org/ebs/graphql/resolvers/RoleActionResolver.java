///////////////////////////////////////////////////////////
//  RoleActionResolver.java
//  Macromedia ActionScript Implementation of the Class RoleActionResolver
//  Generated by Enterprise Architect
//  Created on:      09-Aug-2020 4:51:21 PM
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
 * @created 09-Aug-2020 4:51:21 PM
 */
@Component @Validated
public class RoleActionResolver implements GraphQLResolver<RoleActionTo> {

	private RoleActionService roleactionService;

	/**
	 * 
	 * @param roleactionTo
	 */
	public ActionTo getAction(RoleActionTo roleactionTo){
		return roleactionService.findAction(roleactionTo.getId()).get();
	}

	/**
	 * 
	 * @param roleactionTo
	 */
	public RoleTo getRole(RoleActionTo roleactionTo){
		return roleactionService.findRole(roleactionTo.getId()).get();
	}

	/**
	 * 
	 * @param roleactionService
	 */
	@Autowired
	public RoleActionResolver(RoleActionService roleactionService){
		this.roleactionService = roleactionService; 
	
	}

}