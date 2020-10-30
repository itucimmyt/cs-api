///////////////////////////////////////////////////////////
//  AddressService.java
//  Macromedia ActionScript Implementation of the Interface AddressService
//  Generated by Enterprise Architect
//  Created on:      10-Sep-2020 10:43:14 PM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.services;

import java.util.List;
import java.util.Optional;
import org.ebs.util.FilterInput;
import org.ebs.util.PageInput;
import org.ebs.util.SortInput;
import org.springframework.data.domain.Page;
import java.util.Set;
import org.ebs.services.to.AddressTo;
import org.ebs.services.to.Input.AddressInput;
import org.ebs.services.to.CountryTo;
import org.ebs.services.to.PersonTo;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 10-Sep-2020 10:43:14 PM
 */
public interface AddressService {

	/**
	 *
	 * @param Address
	 */
	public AddressTo createAddress(AddressInput Address);

	/**
	 *
	 * @param addressId
	 */
	public int deleteAddress(int addressId);

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
	public Page<AddressTo> findAddresss(PageInput page, SortInput sort, List<FilterInput> filters, boolean disjunctionFilters);

	/**
	 *
	 * @param addressId
	 */
	public Optional<CountryTo> findCountry(int addressId);

	/**
	 *
	 * @param addressId
	 */
	public Set<PersonTo> findPersons(int addressId);

	/**
	 *
	 * @param address
	 */
	public AddressTo modifyAddress(AddressInput address);

}