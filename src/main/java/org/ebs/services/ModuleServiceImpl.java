///////////////////////////////////////////////////////////
//  ModuleServiceImpl.java
//  Macromedia ActionScript Implementation of the Class ModuleServiceImpl
//  Generated by Enterprise Architect
//  Created on:      09-Aug-2020 4:50:55 PM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.services;

import org.ebs.model.repos.ActionRepository;
import org.ebs.model.ComponentModel;
import org.ebs.model.repos.ComponentRepository;
import org.ebs.model.HtmlTagModel;
import org.ebs.model.repos.HtmlTagRepository;
import org.ebs.model.repos.ModuleRepository;
import org.ebs.model.repos.WorkflowNodeRepository;
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
import org.ebs.services.to.ModuleTo;
import org.ebs.services.to.Input.ModuleInput;
import org.ebs.model.ModuleModel;
import org.ebs.services.to.ActionTo;
import org.ebs.services.to.ComponentTo;
import org.ebs.services.to.HtmlTagTo;
import org.ebs.services.to.WorkflowNodeTo;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 09-Aug-2020 4:50:55 PM
 */
@Service @Transactional(readOnly = true)
  class ModuleServiceImpl implements ModuleService {

	private ModuleRepository moduleRepository;
	private ConversionService converter;
	private ActionRepository actionRepository;
	private ComponentRepository componentRepository;
	private HtmlTagRepository htmltagRepository;
	public WorkflowNodeRepository workflownodeRepository;

	/**
	 * 
	 * @param Module
	 */
	@Override @Transactional(readOnly = false)
	public ModuleTo createModule(ModuleInput Module){
		ModuleModel model = converter.convert(Module,ModuleModel.class); 
		 model.setId(0);
		 ComponentModel componentModel = componentRepository.findById(Module.getcomponent().getId()).get(); 
		model.setcomponent(componentModel); 
		HtmlTagModel htmltagModel = htmltagRepository.findById(Module.gethtmltag().getId()).get(); 
		model.sethtmltag(htmltagModel); 
		 
		 model= moduleRepository.save(model); 
		 return converter.convert(model, ModuleTo.class); 
	}

	/**
	 * 
	 * @param moduleId
	 */
	@Override @Transactional(readOnly = false)
	public int deleteModule(int moduleId){
		ModuleModel module = moduleRepository.findById(moduleId).orElseThrow(() -> new RuntimeException("Module not found")); 
		 module.setDeleted(true); 
		  moduleRepository.save(module); 
		 return moduleId;
	}

	/**
	 * 
	 * @param moduleId
	 */
	public Set<ActionTo> findActions(int moduleId){
		return actionRepository.findByModuleId(moduleId).stream().map(e -> converter.convert(e,ActionTo.class)).collect(Collectors.toSet());
	}

	/**
	 * 
	 * @param moduleId
	 */
	public Optional<ComponentTo> findComponent(int moduleId){
		return moduleRepository.findById(moduleId).map(r -> converter.convert(r.getcomponent(),ComponentTo.class));
	}

	/**
	 * 
	 * @param moduleId
	 */
	public Optional<HtmlTagTo> findHtmlTag(int moduleId){
		return moduleRepository.findById(moduleId).map(r -> converter.convert(r.gethtmltag(),HtmlTagTo.class));
	}

	/**
	 * 
	 * @param moduleId
	 */
	@Override
	public Optional<ModuleTo> findModule(int moduleId){
		if(moduleId <1) 
		 {return Optional.empty();} 
		 return moduleRepository.findById(moduleId).filter(r -> !r.getDeleted().booleanValue()).map(r -> converter.convert(r,ModuleTo.class));
	}

	/**
	 * 
	 * @param page
	 * @param sort
	 * @param filters
	 */
	@Override
	public Page<ModuleTo> findModules(PageInput page, SortInput sort, List<FilterInput> filters){
		return moduleRepository.findByCriteria(ModuleModel.class,filters,sort,page).map(r -> converter.convert(r,ModuleTo.class));
	}

	/**
	 * 
	 * @param moduleId
	 */
	public Set<WorkflowNodeTo> findWorkflowNodes(int moduleId){
		return workflownodeRepository.findByModuleId(moduleId).stream().map(e -> converter.convert(e,WorkflowNodeTo.class)).collect(Collectors.toSet());
	}

	/**
	 * 
	 * @param module
	 */
	@Override @Transactional(readOnly = false)
	public ModuleTo modifyModule(ModuleInput module){
		ModuleModel target= moduleRepository.findById(module.getId()).orElseThrow(() -> new RuntimeException("Module not found")); 
		 ModuleModel source= converter.convert(module,ModuleModel.class); 
		 Utils.copyNotNulls(source,target); 
		 return converter.convert(moduleRepository.save(target), ModuleTo.class);
	}

	/**
	 * 
	 * @param workflownodeRepository
	 * @param moduleRepository
	 * @param converter
	 * @param actionRepository
	 * @param componentRepository
	 * @param htmltagRepository
	 */
	@Autowired
	public ModuleServiceImpl(WorkflowNodeRepository workflownodeRepository, ModuleRepository moduleRepository, ConversionService converter, ActionRepository actionRepository, ComponentRepository componentRepository, HtmlTagRepository htmltagRepository){
		this.moduleRepository =moduleRepository; 
		 this.converter = converter;
		 this.actionRepository = actionRepository;
		 this.componentRepository = componentRepository;
		 this.htmltagRepository = htmltagRepository;
		 this.workflownodeRepository = workflownodeRepository;
	}

}