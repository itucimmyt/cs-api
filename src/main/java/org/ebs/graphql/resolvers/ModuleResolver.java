///////////////////////////////////////////////////////////
//  ModuleResolver.java
//  Macromedia ActionScript Implementation of the Class ModuleResolver
//  Generated by Enterprise Architect
//  Created on:      17-May-2020 3:09:44 PM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.graphql.resolvers;

import java.util.Set;
import java.util.stream.Collectors;

import org.ebs.model.ModuleModel;
import org.ebs.model.repos.ActionRepository;
import org.ebs.model.repos.ComponentRepository;
import org.ebs.model.repos.ModuleRepository;
import org.ebs.model.repos.TranslationRepository;
import org.ebs.model.repos.WorkflowNodeRepository;
import org.ebs.services.ActionService;
import org.ebs.services.ComponentService;
import org.ebs.services.ModuleService;
import org.ebs.services.TranslationService;
import org.ebs.services.WorkflowNodeService;
import org.ebs.services.to.ActionTo;
import org.ebs.services.to.ComponentTo;
import org.ebs.services.to.ModuleTo;
import org.ebs.services.to.TranslationTo;
import org.ebs.services.to.WorkflowNodeTo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.ConversionService;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import com.coxautodev.graphql.tools.GraphQLResolver;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 17-May-2020 3:09:44 PM
 */
@Component @Validated
public class ModuleResolver implements GraphQLResolver<ModuleTo> {

	private ModuleService moduleService;
	private ModuleRepository moduleRepository;
	@Autowired
	private ConversionService converter;
	private WorkflowNodeService workflownodeService;
	private WorkflowNodeRepository workflownodeRepository;
	private ActionService actionService;
	private ActionRepository actionRepository;
	private ComponentService componentService;
	private ComponentRepository componentRepository;
	private TranslationService translationService;
	private TranslationRepository translationRepository;

	/**
	 * 
	 * @param moduleTo
	 */
	public Set<ActionTo> getActions(ModuleTo moduleTo){
		return actionRepository.findByModuleId(moduleTo.getId()).stream() 
		 .map(e -> converter.convert(e,ActionTo.class)) 
		 .collect(Collectors.toSet());
	}

	/**
	 * 
	 * @param moduleTo
	 */
	public ComponentTo getComponent(ModuleTo moduleTo){
		ModuleModel moduleModel = moduleRepository.findById(moduleTo.getId()).get(); 
		 return componentService.findComponent(moduleModel.getComponent().getId()).get();
	}

	/**
	 * 
	 * @param moduleTo
	 */
	public Set<TranslationTo> getTranslations(ModuleTo moduleTo){
		return translationRepository.findByModuleId(moduleTo.getId()).stream() 
		 .map(e -> converter.convert(e,TranslationTo.class)) 
		 .collect(Collectors.toSet());
	}

	/**
	 * 
	 * @param moduleTo
	 */
	public WorkflowNodeTo getWorkflowNode(ModuleTo moduleTo){
		ModuleModel moduleModel = moduleRepository.findById(moduleTo.getId()).get(); 
		 return workflownodeService.findWorkflowNode(moduleModel.getWorkflowNode().getId()).get();
	}

	/**
	 * 
	 * @param translationRepository
	 * @param translationService
	 * @param componentRepository
	 * @param componentService
	 * @param actionRepository
	 * @param actionService
	 * @param workflownodeRepository
	 * @param workflownodeService
	 * @param moduleRepository
	 * @param moduleService
	 */
	@Autowired
	public ModuleResolver(TranslationRepository translationRepository, TranslationService translationService, ComponentRepository componentRepository, ComponentService componentService, ActionRepository actionRepository, ActionService actionService, WorkflowNodeRepository workflownodeRepository, WorkflowNodeService workflownodeService, ModuleRepository moduleRepository, ModuleService moduleService){
		this.moduleService = moduleService; 
		this.moduleRepository = moduleRepository; 
		this.workflownodeService = workflownodeService; 
		this.workflownodeRepository = workflownodeRepository; 
		this.actionService = actionService; 
		this.actionRepository = actionRepository; 
		this.componentService = componentService; 
		this.componentRepository = componentRepository; 
		this.translationService = translationService; 
		this.translationRepository = translationRepository; 
	
	}

}