///////////////////////////////////////////////////////////
//  AddressServiceImpl.java
//  Macromedia ActionScript Implementation of the Class AddressServiceImpl
//  Generated by Enterprise Architect
//  Created on:      10-Sep-2020 10:43:14 PM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.services;

import org.ebs.model.CountryModel;
import org.ebs.model.repos.CountryRepository;
import org.ebs.model.repos.AddressRepository;
import org.ebs.model.repos.PersonRepository;
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
import org.ebs.services.to.AddressTo;
import org.ebs.services.to.Input.AddressInput;
import org.ebs.model.AddressModel;
import org.ebs.services.to.CountryTo;
import org.ebs.services.to.PersonTo;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 10-Sep-2020 10:43:14 PM
 */
@Service @Transactional(readOnly = true)
  class AddressServiceImpl implements AddressService {

	private AddressRepository addressRepository;
	private ConversionService converter;
	private CountryRepository countryRepository;
	private PersonRepository personRepository;

	/**
	 * 
	 * @param personRepository
	 * @param countryRepository
	 * @param converter
	 * @param addressRepository
	 */
	@Autowired
	public AddressServiceImpl(PersonRepository personRepository, CountryRepository countryRepository, ConversionService converter, AddressRepository addressRepository){
		this.addressRepository =addressRepository; 
		 this.converter = converter;
		 this.countryRepository = countryRepository;
		 this.personRepository = personRepository;
	}

	/**
	 * 
	 * @param Address
	 */
	@Override @Transactional(readOnly = false)
	public AddressTo createAddress(AddressInput Address){
		AddressModel model = converter.convert(Address,AddressModel.class); 
		 model.setId(0);
		 CountryModel countryModel = countryRepository.findById(Address.getCountry().getId()).get(); 
		model.setCountry(countryModel); 
		 
		 model= addressRepository.save(model); 
		 return converter.convert(model, AddressTo.class); 
	}

	/**
	 * 
	 * @param addressId
	 */
	@Override @Transactional(readOnly = false)
	public int deleteAddress(int addressId){
		AddressModel address = addressRepository.findById(addressId).orElseThrow(() -> new RuntimeException("Address not found")); 
		 address.setDeleted(true); 
		  addressRepository.save(address); 
		 return addressId;
	}

	/**
	 * 
	 * @param addressId
	 */
	@Override
	public Optional<AddressTo> findAddress(int addressId){
		if(addressId <1) 
		 {return Optional.empty();} 
		 return addressRepository.findById(addressId).filter(r -> !r.getDeleted().booleanValue()).map(r -> converter.convert(r,AddressTo.class));
	}

	/**
	 * 
	 * @param page
	 * @param sort
	 * @param filters
	 */
	@Override
	public Page<AddressTo> findAddresss(PageInput page, SortInput sort, List<FilterInput> filters){
		return addressRepository.findByCriteria(AddressModel.class,filters,sort,page).map(r -> converter.convert(r,AddressTo.class));
	}

	/**
	 * 
	 * @param addressId
	 */
	public Optional<CountryTo> findCountry(int addressId){
		return addressRepository.findById(addressId).map(r -> converter.convert(r.getCountry(),CountryTo.class));
	}

	/**
	 * 
	 * @param addressId
	 */
	public Set<PersonTo> findPersons(int addressId){
		return addressRepository.findById(addressId).get().getPersons().stream().map(e->converter.convert(e, PersonTo.class)).collect(Collectors.toSet());
	}

	/**
	 * 
	 * @param address
	 */
	@Override @Transactional(readOnly = false)
	public AddressTo modifyAddress(AddressInput address){
		AddressModel target= addressRepository.findById(address.getId()).orElseThrow(() -> new RuntimeException("Address not found")); 
		 AddressModel source= converter.convert(address,AddressModel.class); 
		 Utils.copyNotNulls(source,target); 
		 return converter.convert(addressRepository.save(target), AddressTo.class);
	}

}