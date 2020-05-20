///////////////////////////////////////////////////////////
//  ServiceProviderResolver.java
//  Macromedia ActionScript Implementation of the Class ServiceProviderResolver
//  Generated by Enterprise Architect
//  Created on:      17-May-2020 3:10:16 PM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.graphql.resolvers;

import java.util.Set;
import java.util.stream.Collectors;

import org.ebs.model.repos.ServiceProviderRepository;
import org.ebs.model.repos.ServiceRepository;
import org.ebs.model.repos.ServiceTypeRepository;
import org.ebs.services.ServiceProviderService;
import org.ebs.services.ServiceService;
import org.ebs.services.ServiceTypeService;
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
public class ServiceProviderResolver implements GraphQLResolver<ServiceProviderTo> {

	private ServiceProviderService serviceproviderService;
	private ServiceProviderRepository serviceproviderRepository;
	@Autowired
	private ConversionService converter;
	private ServiceTypeService servicetypeService;
	private ServiceTypeRepository servicetypeRepository;
	private ServiceService serviceService;
	private ServiceRepository serviceRepository;

	/**
	 * 
	 * @param serviceproviderTo
	 */
	public Set<ServiceTo> getServices(ServiceProviderTo serviceproviderTo){
		return serviceRepository.findByServiceproviderId(serviceproviderTo.getId()).stream() 
		 .map(e -> converter.convert(e,ServiceTo.class)) 
		 .collect(Collectors.toSet());
	}

	/**
	 * 
	 * @param serviceproviderTo
	 */
	public Set<ServiceTypeTo> getServiceTypes(ServiceProviderTo serviceproviderTo){
		return servicetypeRepository.findByServiceproviderId(serviceproviderTo.getId()).stream() 
		 .map(e -> converter.convert(e,ServiceTypeTo.class)) 
		 .collect(Collectors.toSet());
	}

	/**
	 * 
	 * @param serviceRepository
	 * @param serviceService
	 * @param servicetypeRepository
	 * @param servicetypeService
	 * @param serviceproviderRepository
	 * @param serviceproviderService
	 */
	@Autowired
	public ServiceProviderResolver(ServiceRepository serviceRepository, ServiceService serviceService, ServiceTypeRepository servicetypeRepository, ServiceTypeService servicetypeService, ServiceProviderRepository serviceproviderRepository, ServiceProviderService serviceproviderService){
		this.serviceproviderService = serviceproviderService; 
		this.serviceproviderRepository = serviceproviderRepository; 
		this.servicetypeService = servicetypeService; 
		this.servicetypeRepository = servicetypeRepository; 
		this.serviceService = serviceService; 
		this.serviceRepository = serviceRepository; 
	
	}

}