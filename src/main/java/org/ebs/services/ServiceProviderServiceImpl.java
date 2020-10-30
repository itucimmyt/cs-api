///////////////////////////////////////////////////////////
//  ServiceProviderServiceImpl.java
//  Macromedia ActionScript Implementation of the Class ServiceProviderServiceImpl
//  Generated by Enterprise Architect
//  Created on:      10-Sep-2020 10:44:35 PM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.services;

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
import org.ebs.util.FilterInput;
import org.ebs.util.PageInput;
import org.ebs.util.SortInput;
import org.ebs.util.Utils;
import org.springframework.core.convert.ConversionService;
import java.util.stream.Collectors;
import java.util.Set;
import org.ebs.services.to.ServiceProviderTo;
import org.ebs.services.to.Input.ServiceProviderInput;
import org.ebs.model.ServiceProviderModel;
import org.ebs.services.to.ServiceTypeTo;
import org.ebs.services.to.CountryTo;
import org.ebs.services.to.CropTo;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 10-Sep-2020 10:44:35 PM
 */
@Service @Transactional(readOnly = true)
  class ServiceProviderServiceImpl implements ServiceProviderService {

	private ServiceProviderRepository serviceproviderRepository;
	private ConversionService converter;
	private CountryRepository countryRepository;
	private ServiceTypeRepository servicetypeRepository;
	private CropRepository cropRepository;

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

		 model= serviceproviderRepository.save(model);
		 return converter.convert(model, ServiceProviderTo.class);
	}

	/**
	 *
	 * @param serviceProviderId
	 */
	@Override @Transactional(readOnly = false)
	public int deleteServiceProvider(int serviceProviderId){
		ServiceProviderModel serviceprovider = serviceproviderRepository.findById(serviceProviderId).orElseThrow(() -> new RuntimeException("ServiceProvider not found"));
		 serviceprovider.setDeleted(true);
		  serviceproviderRepository.save(serviceprovider);
		 return serviceProviderId;
	}

	/**
	 *
	 * @param serviceproviderId
	 */
	public Optional<CountryTo> findCountry(int serviceproviderId){
		return serviceproviderRepository.findById(serviceproviderId).map(r -> converter.convert(r.getCountry(),CountryTo.class));
	}

	/**
	 *
	 * @param serviceproviderId
	 */
	public Set<CropTo> findCrops(int serviceproviderId){
		return serviceproviderRepository.findById(serviceproviderId).get().getCrops().stream().map(e->converter.convert(e, CropTo.class)).collect(Collectors.toSet());
	}

	/**
	 *
	 * @param serviceProviderId
	 */
	@Override
	public Optional<ServiceProviderTo> findServiceProvider(int serviceProviderId){
		if(serviceProviderId <1)
		 {return Optional.empty();}
		 return serviceproviderRepository.findById(serviceProviderId).filter(r -> !r.getDeleted().booleanValue()).map(r -> converter.convert(r,ServiceProviderTo.class));
	}

	/**
	 *
	 * @param page
	 * @param sort
	 * @param filters
	 */
	@Override
	public Page<ServiceProviderTo> findServiceProviders(PageInput page, SortInput sort, List<FilterInput> filters, boolean disjunctionFilters){
		return serviceproviderRepository.findByCriteria(ServiceProviderModel.class,filters,sort,page,disjunctionFilters).map(r -> converter.convert(r,ServiceProviderTo.class));
	}

	/**
	 *
	 * @param serviceproviderId
	 */
	public Set<ServiceTypeTo> findServiceTypes(int serviceproviderId){
		return serviceproviderRepository.findById(serviceproviderId).get().getServicetypes().stream().map(e->converter.convert(e, ServiceTypeTo.class)).collect(Collectors.toSet());
	}

	/**
	 *
	 * @param serviceProvider
	 */
	@Override @Transactional(readOnly = false)
	public ServiceProviderTo modifyServiceProvider(ServiceProviderInput serviceProvider){
		ServiceProviderModel target= serviceproviderRepository.findById(serviceProvider.getId()).orElseThrow(() -> new RuntimeException("ServiceProvider not found"));
		 ServiceProviderModel source= converter.convert(serviceProvider,ServiceProviderModel.class);
		 Utils.copyNotNulls(source,target);
		 return converter.convert(serviceproviderRepository.save(target), ServiceProviderTo.class);
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
		this.serviceproviderRepository =serviceproviderRepository;
		 this.converter = converter;
		 this.servicetypeRepository = servicetypeRepository;
		 this.countryRepository = countryRepository;
		 this.cropRepository = cropRepository;
	}

}