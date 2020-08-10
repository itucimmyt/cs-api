///////////////////////////////////////////////////////////
//  ActionServiceImpl.java
//  Macromedia ActionScript Implementation of the Class ActionServiceImpl
//  Generated by Enterprise Architect
//  Created on:      09-Aug-2020 4:50:05 PM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.services;

import org.ebs.model.WorkflowNodeModel;
import org.ebs.model.repos.WorkflowNodeRepository;
import org.ebs.model.ModuleModel;
import org.ebs.model.repos.ModuleRepository;
import org.ebs.model.WorkflowStageModel;
import org.ebs.model.repos.WorkflowStageRepository;
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
import org.ebs.services.to.ActionTo;
import org.ebs.services.to.Input.ActionInput;
import org.ebs.model.ActionModel;
import org.ebs.services.to.RoleActionTo;
import org.ebs.services.to.WorkflowNodeTo;
import org.ebs.services.to.ModuleTo;
import org.ebs.services.to.RoleTo;
import org.ebs.services.to.WorkflowStageTo;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 09-Aug-2020 4:50:05 PM
 */
@Service @Transactional(readOnly = true)
  class ActionServiceImpl implements ActionService {

	private ActionRepository actionRepository;
	private ConversionService converter;
	private WorkflowNodeRepository workflownodeRepository;
	private ModuleRepository moduleRepository;
	private WorkflowStageRepository workflowstageRepository;
	public RoleActionRepository roleactionRepository;
	public RoleRepository roleRepository;

	/**
	 * 
	 * @param actionRepository
	 * @param converter
	 * @param roleactionRepository
	 * @param workflownodeRepository
	 * @param moduleRepository
	 * @param roleRepository
	 * @param workflowstageRepository
	 */
	@Autowired
	public ActionServiceImpl(ActionRepository actionRepository, ConversionService converter, RoleActionRepository roleactionRepository, WorkflowNodeRepository workflownodeRepository, ModuleRepository moduleRepository, RoleRepository roleRepository, WorkflowStageRepository workflowstageRepository){
		this.actionRepository =actionRepository; 
		 this.converter = converter;
		 this.roleactionRepository = roleactionRepository;
		 this.workflownodeRepository = workflownodeRepository;
		 this.moduleRepository = moduleRepository;
		 this.roleRepository = roleRepository;
		 this.workflowstageRepository = workflowstageRepository;
	}

	/**
	 * 
	 * @param Action
	 */
	@Override @Transactional(readOnly = false)
	public ActionTo createAction(ActionInput Action){
		ActionModel model = converter.convert(Action,ActionModel.class); 
		 model.setId(0);
		 WorkflowNodeModel workflownodeModel = workflownodeRepository.findById(Action.getworkflownode().getId()).get(); 
		model.setworkflownode(workflownodeModel); 
		ModuleModel moduleModel = moduleRepository.findById(Action.getmodule().getId()).get(); 
		model.setmodule(moduleModel); 
		WorkflowStageModel workflowstageModel = workflowstageRepository.findById(Action.getworkflowstage().getId()).get(); 
		model.setworkflowstage(workflowstageModel); 
		 
		 model= actionRepository.save(model); 
		 return converter.convert(model, ActionTo.class); 
	}

	/**
	 * 
	 * @param actionId
	 */
	@Override @Transactional(readOnly = false)
	public int deleteAction(int actionId){
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
	public Optional<ActionTo> findAction(int actionId){
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
	public Page<ActionTo> findActions(PageInput page, SortInput sort, List<FilterInput> filters){
		return actionRepository.findByCriteria(ActionModel.class,filters,sort,page).map(r -> converter.convert(r,ActionTo.class));
	}

	/**
	 * 
	 * @param actionId
	 */
	public Optional<ModuleTo> findModule(int actionId){
		return actionRepository.findById(actionId).map(r -> converter.convert(r.getmodule(),ModuleTo.class));
	}

	/**
	 * 
	 * @param actionId
	 */
	public Set<RoleActionTo> findRoleActions(int actionId){
		return roleactionRepository.findByActionId(actionId).stream().map(e -> converter.convert(e,RoleActionTo.class)).collect(Collectors.toSet());
	}

	/**
	 * 
	 * @param actionId
	 */
	public Set<RoleTo> findRoles(int actionId){
		return actionRepository.findById(actionId).get().getroles().stream().map(e->converter.convert(e, RoleTo.class)).collect(Collectors.toSet());
	}

	/**
	 * 
	 * @param actionId
	 */
	public Optional<WorkflowNodeTo> findWorkflowNode(int actionId){
		return actionRepository.findById(actionId).map(r -> converter.convert(r.getworkflownode(),WorkflowNodeTo.class));
	}

	/**
	 * 
	 * @param actionId
	 */
	public Optional<WorkflowStageTo> findWorkflowStage(int actionId){
		return actionRepository.findById(actionId).map(r -> converter.convert(r.getworkflowstage(),WorkflowStageTo.class));
	}

	/**
	 * 
	 * @param action
	 */
	@Override @Transactional(readOnly = false)
	public ActionTo modifyAction(ActionInput action){
		ActionModel target= actionRepository.findById(action.getId()).orElseThrow(() -> new RuntimeException("Action not found")); 
		 ActionModel source= converter.convert(action,ActionModel.class); 
		 Utils.copyNotNulls(source,target); 
		 return converter.convert(actionRepository.save(target), ActionTo.class);
	}

}