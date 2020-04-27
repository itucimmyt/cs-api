///////////////////////////////////////////////////////////
//  ActionResolver.java
//  Macromedia ActionScript Implementation of the Class ActionResolver
//  Generated by Enterprise Architect
//  Created on:      27-Apr-2020 9:47:30 AM
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
import org.ebs.model.ActionModel;
import org.ebs.services.to.ActionTo;
import org.ebs.model.repos.ActionRepository;
import org.ebs.services.ActionService;
import org.ebs.services.ModuleService;
import org.ebs.model.repos.ModuleRepository;
import org.ebs.services.to.ModuleTo;
import org.ebs.services.RoleService;
import org.ebs.model.repos.RoleRepository;
import org.ebs.services.to.RoleTo;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 27-Apr-2020 9:47:30 AM
 */
@Component @Validated
public class ActionResolver implements GraphQLResolver<ActionTo> {

	private ActionRepository actionRepository;
	private ActionService actionService;
	@Autowired
	private ConversionService converter;
	private ModuleRepository moduleRepository;
	private ModuleService moduleService;
	private RoleRepository roleRepository;
	private RoleService roleService;

	/**
	 * 
	 * @param roleRepository
	 * @param roleService
	 * @param moduleRepository
	 * @param moduleService
	 * @param actionRepository
	 * @param actionService
	 */
	@Autowired
	public ActionResolver(RoleRepository roleRepository, RoleService roleService, ModuleRepository moduleRepository, ModuleService moduleService, ActionRepository actionRepository, ActionService actionService){
		this.actionService = actionService; 
		this.actionRepository = actionRepository; 
		this.moduleService = moduleService; 
		this.moduleRepository = moduleRepository; 
		this.roleService = roleService; 
		this.roleRepository = roleRepository; 
	
	}

	/**
	 * 
	 * @param actionTo
	 */
	public ModuleTo getModule(ActionTo actionTo){
		ActionModel actionModel = actionRepository.findById(actionTo.getId()).get(); 
		 return moduleService.findModule(actionModel.getModule().getId()).get();
	}

	/**
	 * 
	 * @param actionTo
	 */
	public RoleTo getRole(ActionTo actionTo){
		ActionModel actionModel = actionRepository.findById(actionTo.getId()).get(); 
		 return roleService.findRole(actionModel.getRole().getId()).get();
	}

}