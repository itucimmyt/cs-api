///////////////////////////////////////////////////////////
//  CropResolver.java
//  Macromedia ActionScript Implementation of the Class CropResolver
//  Generated by Enterprise Architect
//  Created on:      17-May-2020 3:09:28 PM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.graphql.resolvers;

import java.util.Set;
import java.util.stream.Collectors;

import org.ebs.model.repos.CropRepository;
import org.ebs.model.repos.ProgramRepository;
import org.ebs.model.repos.SeasonRepository;
import org.ebs.model.repos.ServiceProviderRepository;
import org.ebs.services.CropService;
import org.ebs.services.ProgramService;
import org.ebs.services.SeasonService;
import org.ebs.services.ServiceTypeService;
import org.ebs.services.to.CropTo;
import org.ebs.services.to.ProgramTo;
import org.ebs.services.to.ServiceProviderTo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.ConversionService;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import com.coxautodev.graphql.tools.GraphQLResolver;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 17-May-2020 3:09:28 PM
 */
@Component @Validated
public class CropResolver implements GraphQLResolver<CropTo> {

	private CropService cropService;
	private CropRepository cropRepository;
	@Autowired
	private ConversionService converter;
	
	private ServiceProviderRepository serviceProviderRepository;
	private ProgramService programService;
	private ProgramRepository programRepository;
	private SeasonService seasonService;
	private SeasonRepository seasonRepository;

	/**
	 * 
	 * @param seasonRepository
	 * @param seasonService
	 * @param programRepository
	 * @param programService
	 * @param servicetypeService
	 * @param cropRepository
	 * @param cropService
	 */
	@Autowired
	public CropResolver(SeasonRepository seasonRepository, SeasonService seasonService, ProgramRepository programRepository, 
			ProgramService programService, ServiceProviderRepository _serviceProviderRepository, 
			CropRepository cropRepository, CropService cropService){
		this.cropService = cropService; 
		this.cropRepository = cropRepository; 
		this.serviceProviderRepository = _serviceProviderRepository; 
		this.programService = programService; 
		this.programRepository = programRepository; 
		this.seasonService = seasonService; 
		this.seasonRepository = seasonRepository; 
	
	}


		/**
	 * 
	 * @param tenantTo
	 */
	public Set<ProgramTo> getPrograms(CropTo cropTo){
		return programRepository.findByCropId(cropTo.getId()).stream() 
		 .map(e -> converter.convert(e,ProgramTo.class)) 
		 .collect(Collectors.toSet());
	}
	/**
	 * 
	 * @param cropTo
	 */
	public Set<ServiceProviderTo> getServiceProvider(CropTo cropTo){
		return serviceProviderRepository.findByCropId(cropTo.getId()).stream() 
		 .map(e -> converter.convert(e,ServiceProviderTo.class)) 
		 .collect(Collectors.toSet());
	}

}