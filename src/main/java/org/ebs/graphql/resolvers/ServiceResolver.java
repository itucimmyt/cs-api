///////////////////////////////////////////////////////////
//  ServiceResolver.java
//  Macromedia ActionScript Implementation of the Class ServiceResolver
//  Generated by Enterprise Architect
//  Created on:      17-May-2020 3:10:16 PM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.graphql.resolvers;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.ebs.model.ServiceModel;
import org.ebs.model.repos.AssayclassRepository;
import org.ebs.model.repos.PurposeRepository;
import org.ebs.model.repos.ServiceProviderRepository;
import org.ebs.model.repos.ServiceRepository;
import org.ebs.model.repos.ServiceTypeRepository;
import org.ebs.model.repos.VendorRepository;
import org.ebs.services.AssayclassService;
import org.ebs.services.PurposeService;
import org.ebs.services.ServiceProviderService;
import org.ebs.services.ServiceService;
import org.ebs.services.ServiceTypeService;
import org.ebs.services.VendorService;
import org.ebs.services.to.AssayclassTo;
import org.ebs.services.to.PurposeTo;
import org.ebs.services.to.ServiceProviderTo;
import org.ebs.services.to.ServiceTo;
import org.ebs.services.to.ServiceTypeTo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.ConversionService;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import com.coxautodev.graphql.tools.GraphQLResolver;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 17-May-2020 3:10:16 PM
 */
@Component @Validated
public class ServiceResolver implements GraphQLResolver<ServiceTo> {

	private ServiceService serviceService;
	private ServiceRepository serviceRepository;
	@Autowired
	private ConversionService converter;
	private ServiceTypeService servicetypeService;
	private ServiceTypeRepository servicetypeRepository;
	private PurposeService purposeService;
	private PurposeRepository purposeRepository;
	private ServiceProviderService serviceproviderService;
	private ServiceProviderRepository serviceproviderRepository;
	private AssayclassService assayclassService;
	private AssayclassRepository assayclassRepository;
	private VendorService vendorService;
	private VendorRepository vendorRepository;

	/**
	 * 
	 * @param serviceTo
	 */
	public Set<AssayclassTo> getAssayclasss(ServiceTo serviceTo){
		return assayclassRepository.findByServiceId(serviceTo.getId()).stream() 
		 .map(e -> converter.convert(e,AssayclassTo.class)) 
		 .collect(Collectors.toSet());
	}

	/**
	 * 
	 * @param serviceTo
	 */
	public ServiceProviderTo getServiceProvider(ServiceTo serviceTo){
		ServiceModel serviceModel = serviceRepository.findById(serviceTo.getId()).get(); 
		 return serviceproviderService.findServiceProvider(serviceModel.getServiceProvider().getId()).get();
	}

	/**
	 * 
	 * @param serviceTo
	 */
	public ServiceTypeTo getServiceType(ServiceTo serviceTo){
		ServiceModel serviceModel = serviceRepository.findById(serviceTo.getId()).get(); 
		 return servicetypeService.findServiceType(serviceModel.getServiceType().getId()).get();
	}
	
	/**
	 * 
	 * @param serviceTo
	 */
	public List<PurposeTo> getPurpos3es(ServiceTo serviceTo){
		ServiceModel serviceModel = serviceRepository.findById(serviceTo.getId()).get(); 
		 return serviceModel.getPurposes().stream().map(e -> converter.convert(e,PurposeTo.class)) 
		 .collect(Collectors.toList());
	}
	
	/**
	 * 
	 * @param serviceTo
	 */
	public List<PurposeTo> getPurposes(ServiceTo serviceTo){
		 return purposeRepository.findByServiceId(serviceTo.getId()).stream().map(e -> converter.convert(e,PurposeTo.class)) 
		 .collect(Collectors.toList());
	}


	/**
	 * 
	 * @param vendorRepository
	 * @param vendorService
	 * @param assayclassRepository
	 * @param assayclassService
	 * @param serviceproviderRepository
	 * @param serviceproviderService
	 * @param purposeRepository
	 * @param purposeService
	 * @param servicetypeRepository
	 * @param servicetypeService
	 * @param serviceRepository
	 * @param serviceService
	 */
	@Autowired
	public ServiceResolver(VendorRepository vendorRepository, VendorService vendorService, AssayclassRepository assayclassRepository, AssayclassService assayclassService, ServiceProviderRepository serviceproviderRepository, ServiceProviderService serviceproviderService, PurposeRepository purposeRepository, PurposeService purposeService, ServiceTypeRepository servicetypeRepository, ServiceTypeService servicetypeService, ServiceRepository serviceRepository, ServiceService serviceService){
		this.serviceService = serviceService; 
		this.serviceRepository = serviceRepository; 
		this.servicetypeService = servicetypeService; 
		this.servicetypeRepository = servicetypeRepository; 
		this.purposeService = purposeService; 
		this.purposeRepository = purposeRepository; 
		this.serviceproviderService = serviceproviderService; 
		this.serviceproviderRepository = serviceproviderRepository; 
		this.assayclassService = assayclassService; 
		this.assayclassRepository = assayclassRepository; 
		this.vendorService = vendorService; 
		this.vendorRepository = vendorRepository; 
	
	}

}