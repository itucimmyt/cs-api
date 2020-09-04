///////////////////////////////////////////////////////////
//  ActionServiceImpl.java
//  Macromedia ActionScript Implementation of the Class ActionServiceImpl
//  Generated by Enterprise Architect
//  Created on:      04-Sep-2020 10:04:31 AM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.services;

import org.ebs.services.to.ActionTo;
import org.ebs.services.to.Input.ActionInput;
import org.ebs.model.ActionModel;
import org.ebs.model.WorkflowStageModel;
import org.ebs.model.repos.WorkflowStageRepository;
import org.ebs.model.WorkflowNodeModel;
import org.ebs.model.repos.WorkflowNodeRepository;
import org.ebs.model.ModuleModel;
import org.ebs.model.repos.ModuleRepository;
import org.ebs.model.repos.ActionRepository;
import org.ebs.model.repos.RoleActionRepository;
import org.ebs.model.repos.RoleRepository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import java.util.Optional;
import org.ebs.util.FilterInput;
import org.ebs.util.PageInput;
import org.ebs.util.SortInput;
import org.ebs.util.Utils;
import org.springframework.core.convert.ConversionService;
import java.util.stream.Collectors;
import java.util.Set;
import org.ebs.services.to.WorkflowStageTo;
import org.ebs.services.to.RoleActionTo;
import org.ebs.services.to.WorkflowNodeTo;
import org.ebs.services.to.RoleTo;
import org.ebs.services.to.ModuleTo;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 04-Sep-2020 10:04:31 AM
 */
@Service @Transactional(readOnly = true)
  class ActionServiceImpl implements ActionService {

	private ActionRepository actionRepository;
	private ConversionService converter;
	private WorkflowStageRepository workflowstageRepository;
	private WorkflowNodeRepository workflownodeRepository;
	private ModuleRepository moduleRepository;
	public RoleActionRepository roleactionRepository;
	public RoleRepository roleRepository;

	/**
	 * 
	 * @param moduleRepository
	 * @param actionRepository
	 * @param converter
	 * @param workflowstageRepository
	 * @param roleactionRepository
	 * @param workflownodeRepository
	 * @param roleRepository
	 */
	@Autowired
	public ActionServiceImpl(ModuleRepository moduleRepository, ActionRepository actionRepository, ConversionService converter, WorkflowStageRepository workflowstageRepository, RoleActionRepository roleactionRepository, WorkflowNodeRepository workflownodeRepository, RoleRepository roleRepository){
		this.actionRepository =actionRepository; 
		 this.converter = converter;
		 this.workflowstageRepository = workflowstageRepository;
		 this.roleactionRepository = roleactionRepository;
		 this.workflownodeRepository = workflownodeRepository;
		 this.roleRepository = roleRepository;
		 this.moduleRepository = moduleRepository;
	}

	/**
	 * 
	 * @param Action
	 */
	@Override @Transactional(readOnly = false)
	public ActionTo createaction(ActionInput Action){
		ActionModel model = converter.convert(Action,ActionModel.class); 
		 model.setId(0);
		 WorkflowStageModel workflowstageModel = workflowstageRepository.findById(Action.getWorkflowstage().getId()).get(); 
		model.setWorkflowstage(workflowstageModel); 
		WorkflowNodeModel workflownodeModel = workflownodeRepository.findById(Action.getWorkflownode().getId()).get(); 
		model.setWorkflownode(workflownodeModel); 
		ModuleModel moduleModel = moduleRepository.findById(Action.getModule().getId()).get(); 
		model.setModule(moduleModel); 
		 
		 model= actionRepository.save(model); 
		 return converter.convert(model, ActionTo.class); 
	}

	/**
	 * 
	 * @param actionId
	 */
	@Override @Transactional(readOnly = false)
	public int deleteaction(int actionId){
		ActionModel action = actionRepository.findById(actionId).orElseThrow(() -> new RuntimeException("Action not found")); 
		 action.setDeleted(true); 
		  actionRepository.save(action); 
		 return actionId;
	}

	/**
	 * 
	 * @param actionId
	 */
	@Override
	public Optional<ActionTo> findaction(int actionId){
		if(actionId <1) 
		 {return Optional.empty();} 
		 return actionRepository.findById(actionId).filter(r -> !r.getDeleted().booleanValue()).map(r -> converter.convert(r,ActionTo.class));
	}

	/**
	 * 
	 * @param page
	 * @param sort
	 * @param filters
	 */
	@Override
	public Page<ActionTo> findactions(PageInput page, SortInput sort, List<FilterInput> filters){
		return actionRepository.findByCriteria(ActionModel.class,filters,sort,page).map(r -> converter.convert(r,ActionTo.class));
	}

	/**
	 * 
	 * @param actionId
	 */
	public Optional<ModuleTo> findmodule(int actionId){
		return actionRepository.findById(actionId).map(r -> converter.convert(r.getModule(),ModuleTo.class));
	}

	/**
	 * 
	 * @param actionId
	 */
	public Set<RoleActionTo> findroleactions(int actionId){
		return roleactionRepository.findByActionId(actionId).stream().map(e -> converter.convert(e,RoleActionTo.class)).collect(Collectors.toSet());
	}

	/**
	 * 
	 * @param actionId
	 */
	public Set<RoleTo> findroles(int actionId){
		return actionRepository.findById(actionId).get().getRoles().stream().map(e->converter.convert(e, RoleTo.class)).collect(Collectors.toSet());
	}

	/**
	 * 
	 * @param actionId
	 */
	public Optional<WorkflowNodeTo> findworkflownode(int actionId){
		return actionRepository.findById(actionId).map(r -> converter.convert(r.getWorkflownode(),WorkflowNodeTo.class));
	}

	/**
	 * 
	 * @param actionId
	 */
	public Optional<WorkflowStageTo> findworkflowstage(int actionId){
		return actionRepository.findById(actionId).map(r -> converter.convert(r.getWorkflowstage(),WorkflowStageTo.class));
	}

	/**
	 * 
	 * @param action
	 */
	@Override @Transactional(readOnly = false)
	public ActionTo modifyaction(ActionInput action){
		ActionModel target= actionRepository.findById(action.getId()).orElseThrow(() -> new RuntimeException("Action not found")); 
		 ActionModel source= converter.convert(action,ActionModel.class); 
		 Utils.copyNotNulls(source,target); 
		 return converter.convert(actionRepository.save(target), ActionTo.class);
	}

}