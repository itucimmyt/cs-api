///////////////////////////////////////////////////////////
//  ComponentServiceImpl.java
//  Macromedia ActionScript Implementation of the Class ComponentServiceImpl
//  Generated by Enterprise Architect
//  Created on:      10-Sep-2020 10:43:30 PM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.services;

import org.ebs.model.HtmlTagModel;
import org.ebs.model.repos.HtmlTagRepository;
import org.ebs.model.repos.ComponentRepository;
import org.ebs.model.repos.InstanceRepository;
import org.ebs.model.repos.ModuleRepository;
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
import org.ebs.services.to.ComponentTo;
import org.ebs.services.to.Input.ComponentInput;
import org.ebs.model.ComponentModel;
import org.ebs.services.to.InstanceTo;
import org.ebs.services.to.HtmlTagTo;
import org.ebs.services.to.ModuleTo;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 10-Sep-2020 10:43:30 PM
 */
@Service @Transactional(readOnly = true)
  class ComponentServiceImpl implements ComponentService {

	private ComponentRepository componentRepository;
	private ConversionService converter;
	private HtmlTagRepository htmltagRepository;
	private InstanceRepository instanceRepository;
	private ModuleRepository moduleRepository;

	/**
	 * 
	 * @param moduleRepository
	 * @param htmltagRepository
	 * @param instanceRepository
	 * @param converter
	 * @param componentRepository
	 */
	@Autowired
	public ComponentServiceImpl(ModuleRepository moduleRepository, HtmlTagRepository htmltagRepository, InstanceRepository instanceRepository, ConversionService converter, ComponentRepository componentRepository){
		this.componentRepository =componentRepository; 
		 this.converter = converter;
		 this.instanceRepository = instanceRepository;
		 this.htmltagRepository = htmltagRepository;
		 this.moduleRepository = moduleRepository;
	}

	/**
	 * 
	 * @param Component
	 */
	@Override @Transactional(readOnly = false)
	public ComponentTo createComponent(ComponentInput Component){
		ComponentModel model = converter.convert(Component,ComponentModel.class); 
		 model.setId(0);
		 HtmlTagModel htmltagModel = htmltagRepository.findById(Component.getHtmltag().getId()).get(); 
		model.setHtmltag(htmltagModel); 
		 
		 model= componentRepository.save(model); 
		 return converter.convert(model, ComponentTo.class); 
	}

	/**
	 * 
	 * @param componentId
	 */
	@Override @Transactional(readOnly = false)
	public int deleteComponent(int componentId){
		ComponentModel component = componentRepository.findById(componentId).orElseThrow(() -> new RuntimeException("Component not found")); 
		 component.setDeleted(true); 
		  componentRepository.save(component); 
		 return componentId;
	}

	/**
	 * 
	 * @param componentId
	 */
	@Override
	public Optional<ComponentTo> findComponent(int componentId){
		if(componentId <1) 
		 {return Optional.empty();} 
		 return componentRepository.findById(componentId).filter(r -> !r.getDeleted().booleanValue()).map(r -> converter.convert(r,ComponentTo.class));
	}

	/**
	 * 
	 * @param page
	 * @param sort
	 * @param filters
	 */
	@Override
	public Page<ComponentTo> findComponents(PageInput page, SortInput sort, List<FilterInput> filters){
		return componentRepository.findByCriteria(ComponentModel.class,filters,sort,page).map(r -> converter.convert(r,ComponentTo.class));
	}

	/**
	 * 
	 * @param componentId
	 */
	public Optional<HtmlTagTo> findHtmlTag(int componentId){
		return componentRepository.findById(componentId).map(r -> converter.convert(r.getHtmltag(),HtmlTagTo.class));
	}

	/**
	 * 
	 * @param componentId
	 */
	public Set<InstanceTo> findInstances(int componentId){
		return componentRepository.findById(componentId).get().getInstances().stream().map(e->converter.convert(e, InstanceTo.class)).collect(Collectors.toSet());
	}

	/**
	 * 
	 * @param componentId
	 */
	public Set<ModuleTo> findModules(int componentId){
		return moduleRepository.findByComponentId(componentId).stream().map(e -> converter.convert(e,ModuleTo.class)).collect(Collectors.toSet());
	}

	/**
	 * 
	 * @param component
	 */
	@Override @Transactional(readOnly = false)
	public ComponentTo modifyComponent(ComponentInput component){
		ComponentModel target= componentRepository.findById(component.getId()).orElseThrow(() -> new RuntimeException("Component not found")); 
		 ComponentModel source= converter.convert(component,ComponentModel.class); 
		 Utils.copyNotNulls(source,target); 
		 return converter.convert(componentRepository.save(target), ComponentTo.class);
	}

}