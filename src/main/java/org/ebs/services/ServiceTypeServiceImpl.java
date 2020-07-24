///////////////////////////////////////////////////////////
//  ServiceTypeServiceImpl.java
//  Macromedia ActionScript Implementation of the Class ServiceTypeServiceImpl
//  Generated by Enterprise Architect
//  Created on:      23-Jul-2020 10:47:13 PM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.services;

import org.ebs.model.repos.ServiceTypeRepository;
import org.ebs.model.repos.PurposeRepository;
import org.ebs.model.repos.ServiceProviderRepository;
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
import org.ebs.services.to.ServiceTypeTo;
import org.ebs.services.to.Input.ServiceTypeInput;
import org.ebs.model.ServiceTypeModel;
import org.ebs.services.to.PurposeTo;
import org.ebs.services.to.ServiceProviderTo;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 23-Jul-2020 10:47:13 PM
 */
@Service @Transactional(readOnly = true)
  class ServiceTypeServiceImpl implements ServiceTypeService {

	private ServiceTypeRepository servicetypeRepository;
	private ConversionService converter;
	public PurposeRepository purposeRepository;
	public ServiceProviderRepository serviceproviderRepository;

	/**
	 * 
	 * @param ServiceType
	 */
	@Override @Transactional(readOnly = false)
	public ServiceTypeTo createServiceType(ServiceTypeInput ServiceType){
		ServiceTypeModel model = converter.convert(ServiceType,ServiceTypeModel.class); 
		 model.setId(0);
		  
		 model= servicetypeRepository.save(model); 
		 return converter.convert(model, ServiceTypeTo.class); 
	}

	/**
	 * 
	 * @param servicetypeId
	 */
	@Override @Transactional(readOnly = false)
	public int deleteServiceType(int servicetypeId){
		ServiceTypeModel servicetype = servicetypeRepository.findById(servicetypeId).orElseThrow(() -> new RuntimeException("ServiceType not found")); 
		 servicetype.setDeleted(true); 
		  servicetypeRepository.save(servicetype); 
		 return servicetypeId;
	}

	/**
	 * 
	 * @param servicetypeId
	 */
	public Set<PurposeTo> findPurposes(int servicetypeId){
		return purposeRepository.findByServicetypeId(servicetypeId).stream().map(e -> converter.convert(e,PurposeTo.class)).collect(Collectors.toSet());
	}

	/**
	 * 
	 * @param servicetypeId
	 */
	@Override
	public Optional<ServiceTypeTo> findServiceType(int servicetypeId){
		if(servicetypeId <1) 
		 {return Optional.empty();} 
		 return servicetypeRepository.findById(servicetypeId).filter(r -> !r.getDeleted().booleanValue()).map(r -> converter.convert(r,ServiceTypeTo.class));
	}

	/**
	 * 
	 * @param page
	 * @param sort
	 * @param filters
	 */
	@Override
	public Page<ServiceTypeTo> findServiceTypes(PageInput page, SortInput sort, List<FilterInput> filters){
		return servicetypeRepository.findByCriteria(ServiceTypeModel.class,filters,sort,page).map(r -> converter.convert(r,ServiceTypeTo.class));
	}

	/**
	 * 
	 * @param servicetype
	 */
	@Override @Transactional(readOnly = false)
	public ServiceTypeTo modifyServiceType(ServiceTypeInput servicetype){
		ServiceTypeModel target= servicetypeRepository.findById(servicetype.getId()).orElseThrow(() -> new RuntimeException("ServiceType not found")); 
		 ServiceTypeModel source= converter.convert(servicetype,ServiceTypeModel.class); 
		 Utils.copyNotNulls(source,target); 
		 return converter.convert(servicetypeRepository.save(target), ServiceTypeTo.class);
	}

	/**
	 * 
	 * @param serviceproviderRepository
	 * @param purposeRepository
	 * @param converter
	 * @param servicetypeRepository
	 */
	@Autowired
	public ServiceTypeServiceImpl(ServiceProviderRepository serviceproviderRepository, PurposeRepository purposeRepository, ConversionService converter, ServiceTypeRepository servicetypeRepository){
		this.servicetypeRepository =servicetypeRepository; 
		 this.converter = converter;
		 this.purposeRepository = purposeRepository;
		 this.serviceproviderRepository = serviceproviderRepository;
	}

}