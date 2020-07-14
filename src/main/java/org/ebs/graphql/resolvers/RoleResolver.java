///////////////////////////////////////////////////////////
//  RoleResolver.java
//  Macromedia ActionScript Implementation of the Class RoleResolver
//  Generated by Enterprise Architect
//  Created on:      13-Jul-2020 5:07:14 PM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.graphql.resolvers;

import com.coxautodev.graphql.tools.GraphQLResolver;
import org.ebs.services.to.RoleTo;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import java.util.Set;
import org.ebs.services.RoleService;
import org.ebs.services.to.RoleActionTo;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 13-Jul-2020 5:07:14 PM
 */
@Component @Validated
public class RoleResolver implements GraphQLResolver<RoleTo> {

	private RoleService roleService;

	/**
	 * 
	 * @param role
	 */
	public Set<RoleActionTo> getRoleactions(RoleTo role){
		return roleService.findRoleActions(role.getId());
	}

	/**
	 * 
	 * @param roleService
	 */
	@Autowired
	public RoleResolver(RoleService roleService){
		this.roleService = roleService; 
	
	}

}