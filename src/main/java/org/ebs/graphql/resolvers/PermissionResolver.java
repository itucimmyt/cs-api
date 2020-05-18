///////////////////////////////////////////////////////////
//  PermissionResolver.java
//  Macromedia ActionScript Implementation of the Class PermissionResolver
//  Generated by Enterprise Architect
//  Created on:      17-May-2020 3:09:51 PM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.graphql.resolvers;

import com.coxautodev.graphql.tools.GraphQLResolver;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import java.util.stream.Collectors;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import org.springframework.core.convert.ConversionService;
import org.ebs.model.PermissionModel;
import org.ebs.services.to.PermissionTo;
import org.ebs.model.repos.PermissionRepository;
import org.ebs.services.PermissionService;
import org.ebs.services.RoleActionService;
import org.ebs.model.repos.RoleActionRepository;
import org.ebs.services.to.RoleActionTo;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 17-May-2020 3:09:51 PM
 */
@Component @Validated
public class PermissionResolver implements GraphQLResolver<PermissionTo> {

	private PermissionService permissionService;
	private PermissionRepository permissionRepository;
	@Autowired
	private ConversionService converter;
	private RoleActionService roleactionService;
	private RoleActionRepository roleactionRepository;

	/**
	 * 
	 * @param permissionTo
	 */
	public RoleActionTo getRoleAction(PermissionTo permissionTo){
		PermissionModel permissionModel = permissionRepository.findById(permissionTo.getId()).get(); 
		 return roleactionService.findRoleAction(permissionModel.getRoleAction().getId()).get();
	}

	/**
	 * 
	 * @param roleactionRepository
	 * @param roleactionService
	 * @param permissionRepository
	 * @param permissionService
	 */
	@Autowired
	public PermissionResolver(RoleActionRepository roleactionRepository, RoleActionService roleactionService, PermissionRepository permissionRepository, PermissionService permissionService){
		this.permissionService = permissionService; 
		this.permissionRepository = permissionRepository; 
		this.roleactionService = roleactionService; 
		this.roleactionRepository = roleactionRepository; 
	
	}

}