///////////////////////////////////////////////////////////
//  PurposeServiceImpl.java
//  Macromedia ActionScript Implementation of the Class PurposeServiceImpl
//  Generated by Enterprise Architect
//  Created on:      04-Sep-2020 10:05:47 AM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.services;

import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

import org.ebs.model.PurposeModel;
import org.ebs.model.ServiceTypeModel;
import org.ebs.model.repos.PurposeRepository;
import org.ebs.model.repos.ServiceRepository;
import org.ebs.model.repos.ServiceTypeRepository;
import org.ebs.services.to.PurposeTo;
import org.ebs.services.to.ServiceTo;
import org.ebs.services.to.ServiceTypeTo;
import org.ebs.services.to.Input.PurposeInput;
import org.ebs.util.FilterInput;
import org.ebs.util.PageInput;
import org.ebs.util.SortInput;
import org.ebs.util.Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.ConversionService;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 04-Sep-2020 10:05:47 AM
 */
@Service @Transactional(readOnly = true)
  class PurposeServiceImpl implements PurposeService {

	private PurposeRepository purposeRepository;
	private ConversionService converter;
	private ServiceTypeRepository servicetypeRepository;
	public ServiceRepository serviceRepository;

	/**
	 * 
	 * @param Purpose
	 */
	@Override @Transactional(readOnly = false)
	public PurposeTo createpurpose(PurposeInput Purpose){
		PurposeModel model = converter.convert(Purpose,PurposeModel.class); 
		 model.setId(0);
		 ServiceTypeModel servicetypeModel = servicetypeRepository.findById(Purpose.getServicetype().getId()).get(); 
		model.setServicetype(servicetypeModel); 
		 
		 model= purposeRepository.save(model); 
		 return converter.convert(model, PurposeTo.class); 
	}

	/**
	 * 
	 * @param purposeId
	 */
	@Override @Transactional(readOnly = false)
	public int deletepurpose(int purposeId){
		PurposeModel purpose = purposeRepository.findById(purposeId).orElseThrow(() -> new RuntimeException("Purpose not found")); 
		 purpose.setDeleted(true); 
		  purposeRepository.save(purpose); 
		 return purposeId;
	}

	/**
	 * 
	 * @param purposeId
	 */
	@Override
	public Optional<PurposeTo> findpurpose(int purposeId){
		if(purposeId <1) 
		 {return Optional.empty();} 
		 return purposeRepository.findById(purposeId).filter(r -> !r.getDeleted().booleanValue()).map(r -> converter.convert(r,PurposeTo.class));
	}

	/**
	 * 
	 * @param page
	 * @param sort
	 * @param filters
	 */
	@Override
	public Page<PurposeTo> findpurposes(PageInput page, SortInput sort, List<FilterInput> filters){
		return purposeRepository.findByCriteria(PurposeModel.class,filters,sort,page).map(r -> converter.convert(r,PurposeTo.class));
	}


	/**
	 * 
	 * @param purposeId
	 */
	public Set<ServiceTo> findservices(int purposeId){
		return serviceRepository.findByPurposeId(purposeId).stream().map(e -> converter.convert(e,ServiceTo.class)).collect(Collectors.toSet());
	}

	/**
	 * 
	 * @param purposeId
	 */
	public Optional<ServiceTypeTo> findservicetype(int purposeId){
		return purposeRepository.findById(purposeId).map(r -> converter.convert(r.getServicetype(),ServiceTypeTo.class));
	}

	/**
	 * 
	 * @param purpose
	 */
	@Override @Transactional(readOnly = false)
	public PurposeTo modifypurpose(PurposeInput purpose){
		PurposeModel target= purposeRepository.findById(purpose.getId()).orElseThrow(() -> new RuntimeException("Purpose not found")); 
		 PurposeModel source= converter.convert(purpose,PurposeModel.class); 
		 Utils.copyNotNulls(source,target); 
		 return converter.convert(purposeRepository.save(target), PurposeTo.class);
	}

	/**
	 * 
	 * @param serviceRepository
	 * @param servicetypeRepository
	 * @param converter
	 * @param purposeRepository
	 */
	@Autowired
	public PurposeServiceImpl(ServiceRepository serviceRepository, ServiceTypeRepository servicetypeRepository, ConversionService converter, PurposeRepository purposeRepository){
		this.purposeRepository =purposeRepository; 
		 this.converter = converter;
		 this.servicetypeRepository = servicetypeRepository;
		 this.serviceRepository = serviceRepository;
	}

}