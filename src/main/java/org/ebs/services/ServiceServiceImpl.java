///////////////////////////////////////////////////////////
//  ServiceServiceImpl.java
//  Macromedia ActionScript Implementation of the Class ServiceServiceImpl
//  Generated by Enterprise Architect
//  Created on:      07-Aug-2020 3:01:31 PM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.services;

import org.ebs.model.PurposeModel;
import org.ebs.model.repos.PurposeRepository;
import org.ebs.model.repos.AssayclassRepository;
import org.ebs.model.repos.ServiceRepository;
import org.ebs.model.repos.VendorRepository;
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
import org.ebs.services.to.ServiceTo;
import org.ebs.services.to.Input.ServiceInput;
import org.ebs.model.ServiceModel;
import org.ebs.services.to.PurposeTo;
import org.ebs.services.to.AssayclassTo;
import org.ebs.services.to.VendorTo;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 07-Aug-2020 3:01:31 PM
 */
@Service @Transactional(readOnly = true)
  class ServiceServiceImpl implements ServiceService {

	private ServiceRepository serviceRepository;
	private ConversionService converter;
	private PurposeRepository purposeRepository;
	private AssayclassRepository assayclassRepository;
	public VendorRepository vendorRepository;

	/**
	 * 
	 * @param Service
	 */
	@Override @Transactional(readOnly = false)
	public ServiceTo createService(ServiceInput Service){
		ServiceModel model = converter.convert(Service,ServiceModel.class); 
		 model.setId(0);
		 PurposeModel purposeModel = purposeRepository.findById(Service.getpurpose().getId()).get(); 
		model.setpurpose(purposeModel); 
		 
		 model= serviceRepository.save(model); 
		 return converter.convert(model, ServiceTo.class); 
	}

	/**
	 * 
	 * @param serviceId
	 */
	@Override @Transactional(readOnly = false)
	public int deleteService(int serviceId){
		ServiceModel service = serviceRepository.findById(serviceId).orElseThrow(() -> new RuntimeException("Service not found")); 
		 service.setDeleted(true); 
		  serviceRepository.save(service); 
		 return serviceId;
	}

	/**
	 * 
	 * @param serviceId
	 */
	public Set<AssayclassTo> findAssayclasss(int serviceId){
		return assayclassRepository.findByServiceId(serviceId).stream().map(e -> converter.convert(e,AssayclassTo.class)).collect(Collectors.toSet());
	}

	/**
	 * 
	 * @param serviceId
	 */
	public Optional<PurposeTo> findPurpose(int serviceId){
		return serviceRepository.findById(serviceId).map(r -> converter.convert(r.getpurpose(),PurposeTo.class));
	}

	/**
	 * 
	 * @param serviceId
	 */
	@Override
	public Optional<ServiceTo> findService(int serviceId){
		if(serviceId <1) 
		 {return Optional.empty();} 
		 return serviceRepository.findById(serviceId).filter(r -> !r.getDeleted().booleanValue()).map(r -> converter.convert(r,ServiceTo.class));
	}

	/**
	 * 
	 * @param page
	 * @param sort
	 * @param filters
	 */
	@Override
	public Page<ServiceTo> findServices(PageInput page, SortInput sort, List<FilterInput> filters){
		return serviceRepository.findByCriteria(ServiceModel.class,filters,sort,page).map(r -> converter.convert(r,ServiceTo.class));
	}

	/**
	 * 
	 * @param service
	 */
	@Override @Transactional(readOnly = false)
	public ServiceTo modifyService(ServiceInput service){
		ServiceModel target= serviceRepository.findById(service.getId()).orElseThrow(() -> new RuntimeException("Service not found")); 
		 ServiceModel source= converter.convert(service,ServiceModel.class); 
		 Utils.copyNotNulls(source,target); 
		 return converter.convert(serviceRepository.save(target), ServiceTo.class);
	}

	/**
	 * 
	 * @param vendorRepository
	 * @param assayclassRepository
	 * @param purposeRepository
	 * @param converter
	 * @param serviceRepository
	 */
	@Autowired
	public ServiceServiceImpl(VendorRepository vendorRepository, AssayclassRepository assayclassRepository, PurposeRepository purposeRepository, ConversionService converter, ServiceRepository serviceRepository){
		this.serviceRepository =serviceRepository; 
		 this.converter = converter;
		 this.purposeRepository = purposeRepository;
		 this.assayclassRepository = assayclassRepository;
		 this.vendorRepository = vendorRepository;
	}

}