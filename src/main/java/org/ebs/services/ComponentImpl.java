///////////////////////////////////////////////////////////
//  ComponentImpl.java
//  Macromedia ActionScript Implementation of the Class ComponentImpl
//  Generated by Enterprise Architect
//  Created on:      28-Apr-2020 12:06:55 AM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.services;

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
import org.ebs.services.to.ComponentTo;
import org.ebs.services.to.Input.ComponentInput;
import org.ebs.model.ComponentModel;
import org.ebs.model.repos.ComponentRepository;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 28-Apr-2020 12:06:55 AM
 */
@Service @Transactional(readOnly = true)
public class ComponentImpl implements ComponentService {

	private ComponentRepository componentRepository;
	@Autowired
	private ConversionService converter;

	/**
	 * 
	 * @param componentRepository
	 */
	@Autowired
	public ComponentImpl(ComponentRepository componentRepository){
		this.componentRepository =componentRepository;
	}

	/**
	 * 
	 * @param Component
	 */
	@Override @Transactional(readOnly = false)
	public ComponentTo createComponent(ComponentInput Component){
		ComponentModel model = converter.convert(Component,ComponentModel.class); 
		 model.setId(0); 
		 model= componentRepository.save(model); 
		 return converter.convert(model, ComponentTo.class); 
	}

	/**
	 * 
	 * @param idcomponent
	 */
	@Override @Transactional(readOnly = false)
	public int deleteComponent(int idcomponent){
		ComponentModel component = componentRepository.findById(idcomponent).orElseThrow(() -> new RuntimeException("Request not found")); 
		 component.setDeleted(true); 
		  componentRepository.save(component); 
		 return idcomponent;
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
	 * @param component
	 */
	@Override @Transactional(readOnly = false)
	public ComponentTo modifyComponent(ComponentInput component){
		ComponentModel target= componentRepository.findById(component.getId()).orElseThrow(() -> new RuntimeException("Request not found")); 
		 ComponentModel source= converter.convert(component,ComponentModel.class); 
		 Utils.copyNotNulls(source,target); 
		 return converter.convert(componentRepository.save(target), ComponentTo.class);
	}

}