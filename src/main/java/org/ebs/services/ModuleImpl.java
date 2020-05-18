///////////////////////////////////////////////////////////
//  ModuleImpl.java
//  Macromedia ActionScript Implementation of the Class ModuleImpl
//  Generated by Enterprise Architect
//  Created on:      17-May-2020 3:09:43 PM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.services;

import org.ebs.model.WorkflowNodeModel;
import org.ebs.model.repos.WorkflowNodeRepository;
import org.ebs.model.ComponentModel;
import org.ebs.model.repos.ComponentRepository;
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
import org.ebs.services.to.ModuleTo;
import org.ebs.services.to.Input.ModuleInput;
import org.ebs.model.ModuleModel;
import org.ebs.model.repos.ModuleRepository;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 17-May-2020 3:09:43 PM
 */
@Service @Transactional(readOnly = true)
public class ModuleImpl implements ModuleService {

	private ModuleRepository moduleRepository;
	@Autowired
	private ConversionService converter;
	@Autowired
	private WorkflowNodeRepository workflownodeRepository;
	@Autowired
	private ComponentRepository componentRepository;

	/**
	 * 
	 * @param Module
	 */
	@Override @Transactional(readOnly = false)
	public ModuleTo createModule(ModuleInput Module){
		ModuleModel model = converter.convert(Module,ModuleModel.class); 
		 model.setId(0);
		 WorkflowNodeModel workflownodeModel = workflownodeRepository.findById(Module.getWorkflowNode().getId()).get(); 
		model.setWorkflowNode(workflownodeModel); 
		ComponentModel componentModel = componentRepository.findById(Module.getComponent().getId()).get(); 
		model.setComponent(componentModel); 
		 
		 model= moduleRepository.save(model); 
		 return converter.convert(model, ModuleTo.class); 
	}

	/**
	 * 
	 * @param idmodule
	 */
	@Override @Transactional(readOnly = false)
	public int deleteModule(int idmodule){
		ModuleModel module = moduleRepository.findById(idmodule).orElseThrow(() -> new RuntimeException("Request not found")); 
		 module.setDeleted(true); 
		  moduleRepository.save(module); 
		 return idmodule;
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
	 * @param module
	 */
	@Override @Transactional(readOnly = false)
	public ModuleTo modifyModule(ModuleInput module){
		ModuleModel target= moduleRepository.findById(module.getId()).orElseThrow(() -> new RuntimeException("Request not found")); 
		 ModuleModel source= converter.convert(module,ModuleModel.class); 
		 Utils.copyNotNulls(source,target); 
		 return converter.convert(moduleRepository.save(target), ModuleTo.class);
	}

	/**
	 * 
	 * @param moduleRepository
	 */
	@Autowired
	public ModuleImpl(ModuleRepository moduleRepository){
		this.moduleRepository =moduleRepository;
	}

}