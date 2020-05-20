///////////////////////////////////////////////////////////
//  AddressService.java
//  Macromedia ActionScript Implementation of the Interface AddressService
//  Generated by Enterprise Architect
//  Created on:      17-May-2020 3:09:12 PM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.services;

import java.util.List;
import java.util.Optional;

import org.ebs.services.to.AddressTo;
import org.ebs.services.to.Input.AddressInput;
import org.ebs.util.FilterInput;
import org.ebs.util.PageInput;
import org.ebs.util.SortInput;
import org.springframework.data.domain.Page;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 17-May-2020 3:09:12 PM
 */
public interface AddressService {

	/**
	 * 
	 * @param Address
	 */
	public AddressTo createAddress(AddressInput Address);

	/**
	 * 
	 * @param idaddress
	 */
	public int deleteAddress(int idaddress);

	/**
	 * 
	 * @param addressId
	 */
	public Optional<AddressTo> findAddress(int addressId);

	/**
	 * 
	 * @param page
	 * @param sort
	 * @param filters
	 */
	public Page<AddressTo> findAddresss(PageInput page, SortInput sort, List<FilterInput> filters);

	/**
	 * 
	 * @param address
	 */
	public AddressTo modifyAddress(AddressInput address);

}