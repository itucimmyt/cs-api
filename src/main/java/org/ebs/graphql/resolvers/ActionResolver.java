///////////////////////////////////////////////////////////
//  ActionResolver.java
//  Macromedia ActionScript Implementation of the Class ActionResolver
//  Generated by Enterprise Architect
//  Created on:      17-May-2020 3:09:10 PM
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
import org.ebs.model.repos.RoleActionRepository;
import org.ebs.services.RoleActionService;
import org.ebs.services.to.RoleActionTo;
import org.ebs.services.ModuleService;
import org.ebs.model.repos.ModuleRepository;
import org.ebs.services.to.ModuleTo;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 17-May-2020 3:09:10 PM
 */
@Component @Validated
public class ActionResolver implements GraphQLResolver<ActionTo> {

	private ActionService actionService;
	private ActionRepository actionRepository;
	@Autowired
	private ConversionService converter;
	private RoleActionService roleactionService;
	private RoleActionRepository roleactionRepository;
	private ModuleService moduleService;
	private ModuleRepository moduleRepository;

	/**
	 * 
	 * @param moduleRepository
	 * @param moduleService
	 * @param roleactionRepository
	 * @param roleactionService
	 * @param actionRepository
	 * @param actionService
	 */
	@Autowired
	public ActionResolver(ModuleRepository moduleRepository, ModuleService moduleService, RoleActionRepository roleactionRepository, RoleActionService roleactionService, ActionRepository actionRepository, ActionService actionService){
		this.actionService = actionService; 
		this.actionRepository = actionRepository; 
		this.roleactionService = roleactionService; 
		this.roleactionRepository = roleactionRepository; 
		this.moduleService = moduleService; 
		this.moduleRepository = moduleRepository; 
	
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
	public Set<RoleActionTo> getRoleActions(ActionTo actionTo){
		return roleactionRepository.findByActionId(actionTo.getId()).stream() 
		 .map(e -> converter.convert(e,RoleActionTo.class)) 
		 .collect(Collectors.toSet());
	}

}