///////////////////////////////////////////////////////////
//  AddressImpl.java
//  Macromedia ActionScript Implementation of the Class AddressImpl
//  Generated by Enterprise Architect
//  Created on:      17-May-2020 3:09:11 PM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.services;

import java.util.List;
import java.util.Optional;

import org.ebs.model.AddressModel;
import org.ebs.model.repos.AddressRepository;
import org.ebs.services.to.AddressTo;
import org.ebs.services.to.Input.AddressInput;
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
 * @created 17-May-2020 3:09:11 PM
 */
@Service @Transactional(readOnly = true)
public class AddressImpl implements AddressService {

	private AddressRepository addressRepository;
	@Autowired
	private ConversionService converter;

	/**
	 * 
	 * @param addressRepository
	 */
	@Autowired
	public AddressImpl(AddressRepository addressRepository){
		this.addressRepository =addressRepository;
	}

	/**
	 * 
	 * @param Address
	 */
	@Override @Transactional(readOnly = false)
	public AddressTo createAddress(AddressInput Address){
		AddressModel model = converter.convert(Address,AddressModel.class); 
		 model.setId(0);
		  
		 model= addressRepository.save(model); 
		 return converter.convert(model, AddressTo.class); 
	}

	/**
	 * 
	 * @param idaddress
	 */
	@Override @Transactional(readOnly = false)
	public int deleteAddress(int idaddress){
		AddressModel address = addressRepository.findById(idaddress).orElseThrow(() -> new RuntimeException("Request not found")); 
		 address.setDeleted(true); 
		  addressRepository.save(address); 
		 return idaddress;
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
	 * @param address
	 */
	@Override @Transactional(readOnly = false)
	public AddressTo modifyAddress(AddressInput address){
		AddressModel target= addressRepository.findById(address.getId()).orElseThrow(() -> new RuntimeException("Request not found")); 
		 AddressModel source= converter.convert(address,AddressModel.class); 
		 Utils.copyNotNulls(source,target); 
		 return converter.convert(addressRepository.save(target), AddressTo.class);
	}

}