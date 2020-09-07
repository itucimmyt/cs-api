///////////////////////////////////////////////////////////
//  CountryServiceImpl.java
//  Macromedia ActionScript Implementation of the Class CountryServiceImpl
//  Generated by Enterprise Architect
//  Created on:      07-Sep-2020 8:11:04 AM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.services;

import java.util.List;
import java.util.Optional;
import org.ebs.util.FilterInput;
import org.ebs.util.PageInput;
import org.ebs.util.SortInput;
import org.ebs.util.Utils;
import org.springframework.core.convert.ConversionService;
import java.util.stream.Collectors;
import java.util.Set;
import org.ebs.model.repos.CountryRepository;
import org.ebs.model.repos.ServiceProviderRepository;
import org.ebs.model.repos.AddressRepository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.ebs.services.to.CountryTo;
import org.ebs.services.to.Input.CountryInput;
import org.ebs.model.CountryModel;
import org.ebs.services.to.ServiceProviderTo;
import org.ebs.services.to.AddressTo;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 07-Sep-2020 8:11:04 AM
 */
@Service @Transactional(readOnly = true)
  class CountryServiceImpl implements CountryService {

	private CountryRepository countryRepository;
	private ConversionService converter;
	public ServiceProviderRepository serviceProviderRepository;
	public AddressRepository addressRepository;

	/**
	 * 
	 * @param addressRepository
	 * @param serviceproviderRepository
	 * @param converter
	 * @param countryRepository
	 */
	@Autowired
	public CountryServiceImpl(AddressRepository addressRepository, ServiceProviderRepository serviceproviderRepository, ConversionService converter, CountryRepository countryRepository){
		this.countryRepository =countryRepository; 
		 this.converter = converter;
		 this.serviceProviderRepository = serviceproviderRepository;
		 this.addressRepository = addressRepository;
	}

	/**
	 * 
	 * @param Country
	 */
	@Override @Transactional(readOnly = false)
	public CountryTo createCountry(CountryInput Country){
		CountryModel model = converter.convert(Country,CountryModel.class); 
		 model.setId(0);
		  
		 model= countryRepository.save(model); 
		 return converter.convert(model, CountryTo.class); 
	}

	/**
	 * 
	 * @param countryId
	 */
	@Override @Transactional(readOnly = false)
	public int deleteCountry(int countryId){
		CountryModel country = countryRepository.findById(countryId).orElseThrow(() -> new RuntimeException("Country not found")); 
		 country.setDeleted(true); 
		  countryRepository.save(country); 
		 return countryId;
	}

	/**
	 * 
	 * @param countryId
	 */
	public Set<AddressTo> findAddresss(int countryId){
		return addressRepository.findByCountryId(countryId).stream().map(e -> converter.convert(e,AddressTo.class)).collect(Collectors.toSet());
	}

	/**
	 * 
	 * @param countryId
	 */
	@Override
	public Optional<CountryTo> findCountry(int countryId){
		if(countryId <1) 
		 {return Optional.empty();} 
		 return countryRepository.findById(countryId).filter(r -> !r.getDeleted().booleanValue()).map(r -> converter.convert(r,CountryTo.class));
	}

	/**
	 * 
	 * @param page
	 * @param sort
	 * @param filters
	 */
	@Override
	public Page<CountryTo> findCountrys(PageInput page, SortInput sort, List<FilterInput> filters){
		return countryRepository.findByCriteria(CountryModel.class,filters,sort,page).map(r -> converter.convert(r,CountryTo.class));
	}

	/**
	 * 
	 * @param countryId
	 */
	public Set<ServiceProviderTo> findServiceProviders(int countryId){
		return serviceProviderRepository.findByCountryId(countryId).stream().map(e -> converter.convert(e,ServiceProviderTo.class)).collect(Collectors.toSet());
	}

	/**
	 * 
	 * @param country
	 */
	@Override @Transactional(readOnly = false)
	public CountryTo modifyCountry(CountryInput country){
		CountryModel target= countryRepository.findById(country.getId()).orElseThrow(() -> new RuntimeException("Country not found")); 
		 CountryModel source= converter.convert(country,CountryModel.class); 
		 Utils.copyNotNulls(source,target); 
		 return converter.convert(countryRepository.save(target), CountryTo.class);
	}

}