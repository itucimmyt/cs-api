///////////////////////////////////////////////////////////
//  InstanceImpl.java
//  Macromedia ActionScript Implementation of the Class InstanceImpl
//  Generated by Enterprise Architect
//  Created on:      27-Apr-2020 9:47:40 AM
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
import org.ebs.services.to.InstanceTo;
import org.ebs.services.to.Input.InstanceInput;
import org.ebs.model.InstanceModel;
import org.ebs.model.repos.InstanceRepository;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 27-Apr-2020 9:47:40 AM
 */
@Service @Transactional(readOnly = true)
public class InstanceImpl implements InstanceService {

	@Autowired
	private ConversionService converter;
	private InstanceRepository instanceRepository;

	/**
	 * 
	 * @param Instance
	 */
	@Override @Transactional(readOnly = false)
	public InstanceTo createInstance(InstanceInput Instance){
		InstanceModel model = converter.convert(Instance,InstanceModel.class); 
		 model.setId(0); 
		 model= instanceRepository.save(model); 
		 return converter.convert(model, InstanceTo.class); 
	}

	/**
	 * 
	 * @param idinstance
	 */
	@Override @Transactional(readOnly = false)
	public int deleteInstance(int idinstance){
		InstanceModel instance = instanceRepository.findById(idinstance).orElseThrow(() -> new RuntimeException("Request not found")); 
		 instance.setDeleted(true); 
		  instanceRepository.save(instance); 
		 return idinstance;
	}

	/**
	 * 
	 * @param instanceId
	 */
	@Override
	public Optional<InstanceTo> findInstance(int instanceId){
		if(instanceId <1) 
		 {return Optional.empty();} 
		 return instanceRepository.findById(instanceId).filter(r -> !r.getDeleted().booleanValue()).map(r -> converter.convert(r,InstanceTo.class));
	}

	/**
	 * 
	 * @param page
	 * @param sort
	 * @param filters
	 */
	@Override
	public Page<InstanceTo> findInstances(PageInput page, SortInput sort, List<FilterInput> filters){
		return instanceRepository.findByCriteria(InstanceModel.class,filters,sort,page).map(r -> converter.convert(r,InstanceTo.class));
	}

	/**
	 * 
	 * @param instanceRepository
	 */
	@Autowired
	public InstanceImpl(InstanceRepository instanceRepository){
		this.instanceRepository =instanceRepository;
	}

	/**
	 * 
	 * @param instance
	 */
	@Override @Transactional(readOnly = false)
	public InstanceTo modifyInstance(InstanceInput instance){
		InstanceModel target= instanceRepository.findById(instance.getId()).orElseThrow(() -> new RuntimeException("Request not found")); 
		 InstanceModel source= converter.convert(instance,InstanceModel.class); 
		 Utils.copyNotNulls(source,target); 
		 return converter.convert(instanceRepository.save(target), InstanceTo.class);
	}

}