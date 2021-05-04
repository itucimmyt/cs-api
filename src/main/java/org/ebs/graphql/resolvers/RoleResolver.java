///////////////////////////////////////////////////////////
//  RoleResolver.java
//  Macromedia ActionScript Implementation of the Class RoleResolver
//  Generated by Enterprise Architect
//  Created on:      02-May-2021 6:20:01 AM
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
import org.ebs.services.to.ProductFunctionTo;
import org.ebs.services.to.UserTo;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 02-May-2021 6:20:01 AM
 */
@Component @Validated
public class RoleResolver implements GraphQLResolver<RoleTo> {

	private RoleService roleService;

	/**
	 * 
	 * @param roleTo
	 */
	public Set<ProductFunctionTo> getProductfunctions(RoleTo roleTo){
		return roleService.findProductFunctions(roleTo.getId());
	}

	/**
	 * 
	 * @param roleTo
	 */
	public Set<UserTo> getUsers(RoleTo roleTo){
		return roleService.findUsers(roleTo.getId());
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