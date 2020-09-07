///////////////////////////////////////////////////////////
//  ServiceProviderServiceImpl.java
//  Macromedia ActionScript Implementation of the Class ServiceProviderServiceImpl
//  Generated by Enterprise Architect
//  Created on:      07-Sep-2020 8:12:08 AM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.services;

import org.ebs.util.FilterInput;
import org.ebs.util.PageInput;
import org.ebs.util.SortInput;
import org.ebs.util.Utils;
import org.springframework.core.convert.ConversionService;
import java.util.stream.Collectors;
import java.util.Set;
import org.ebs.model.CountryModel;
import org.ebs.model.repos.CountryRepository;
import org.ebs.model.repos.ServiceProviderRepository;
import org.ebs.model.repos.ServiceTypeRepository;
import org.ebs.model.repos.CropRepository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import java.util.Optional;
import org.ebs.services.to.ServiceProviderTo;
import org.ebs.services.to.Input.ServiceProviderInput;
import org.ebs.model.ServiceProviderModel;
import org.ebs.services.to.ServiceTypeTo;
import org.ebs.services.to.CountryTo;
import org.ebs.services.to.CropTo;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 07-Sep-2020 8:12:08 AM
 */
@Service @Transactional(readOnly = true)
  class ServiceProviderServiceImpl implements ServiceProviderService {

	private ServiceProviderRepository serviceProviderRepository;
	private ConversionService converter;
	private CountryRepository countryRepository;
	public ServiceTypeRepository serviceTypeRepository;
	public CropRepository cropRepository;

	/**
	 * 
	 * @param ServiceProvider
	 */
	@Override @Transactional(readOnly = false)
	public ServiceProviderTo createServiceProvider(ServiceProviderInput ServiceProvider){
		ServiceProviderModel model = converter.convert(ServiceProvider,ServiceProviderModel.class); 
		 model.setId(0);
		 CountryModel countryModel = countryRepository.findById(ServiceProvider.getCountry().getId()).get(); 
		model.setCountry(countryModel); 
		 
		 model= serviceProviderRepository.save(model); 
		 return converter.convert(model, ServiceProviderTo.class); 
	}

	/**
	 * 
	 * @param serviceProviderId
	 */
	@Override @Transactional(readOnly = false)
	public int deleteServiceProvider(int serviceProviderId){
		ServiceProviderModel serviceProvider = serviceProviderRepository.findById(serviceProviderId).orElseThrow(() -> new RuntimeException("ServiceProvider not found")); 
		 serviceProvider.setDeleted(true); 
		  serviceProviderRepository.save(serviceProvider); 
		 return serviceProviderId;
	}

	/**
	 * 
	 * @param serviceProviderId
	 */
	public Optional<CountryTo> findCountry(int serviceProviderId){
		return serviceProviderRepository.findById(serviceProviderId).map(r -> converter.convert(r.getCountry(),CountryTo.class));
	}

	/**
	 * 
	 * @param serviceProviderId
	 */
	public Set<CropTo> findCrops(int serviceProviderId){
		return serviceProviderRepository.findById(serviceProviderId).get().getCrops().stream().map(e->converter.convert(e, CropTo.class)).collect(Collectors.toSet());
	}

	/**
	 * 
	 * @param serviceProviderId
	 */
	@Override
	public Optional<ServiceProviderTo> findServiceProvider(int serviceProviderId){
		if(serviceProviderId <1) 
		 {return Optional.empty();} 
		 return serviceProviderRepository.findById(serviceProviderId).filter(r -> !r.getDeleted().booleanValue()).map(r -> converter.convert(r,ServiceProviderTo.class));
	}

	/**
	 * 
	 * @param page
	 * @param sort
	 * @param filters
	 */
	@Override
	public Page<ServiceProviderTo> findServiceProviders(PageInput page, SortInput sort, List<FilterInput> filters){
		return serviceProviderRepository.findByCriteria(ServiceProviderModel.class,filters,sort,page).map(r -> converter.convert(r,ServiceProviderTo.class));
	}

	/**
	 * 
	 * @param serviceProviderId
	 */
	public Set<ServiceTypeTo> findServiceTypes(int serviceProviderId){
		return serviceProviderRepository.findById(serviceProviderId).get().getServiceTypes().stream().map(e->converter.convert(e, ServiceTypeTo.class)).collect(Collectors.toSet());
	}

	/**
	 * 
	 * @param serviceProvider
	 */
	@Override @Transactional(readOnly = false)
	public ServiceProviderTo modifyServiceProvider(ServiceProviderInput serviceProvider){
		ServiceProviderModel target= serviceProviderRepository.findById(serviceProvider.getId()).orElseThrow(() -> new RuntimeException("ServiceProvider not found")); 
		 ServiceProviderModel source= converter.convert(serviceProvider,ServiceProviderModel.class); 
		 Utils.copyNotNulls(source,target); 
		 return converter.convert(serviceProviderRepository.save(target), ServiceProviderTo.class);
	}

	/**
	 * 
	 * @param cropRepository
	 * @param countryRepository
	 * @param servicetypeRepository
	 * @param converter
	 * @param serviceproviderRepository
	 */
	@Autowired
	public ServiceProviderServiceImpl(CropRepository cropRepository, CountryRepository countryRepository, ServiceTypeRepository servicetypeRepository, ConversionService converter, ServiceProviderRepository serviceproviderRepository){
		this.serviceProviderRepository =serviceproviderRepository; 
		 this.converter = converter;
		 this.serviceTypeRepository = servicetypeRepository;
		 this.countryRepository = countryRepository;
		 this.cropRepository = cropRepository;
	}

}