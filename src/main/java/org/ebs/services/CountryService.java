///////////////////////////////////////////////////////////
//  CountryService.java
//  Macromedia ActionScript Implementation of the Interface CountryService
//  Generated by Enterprise Architect
//  Created on:      04-Sep-2020 10:04:53 AM
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
import org.ebs.services.to.CountryTo;
import org.ebs.services.to.Input.CountryInput;
import org.ebs.services.to.AddressTo;
import org.ebs.services.to.ServiceProviderTo;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 04-Sep-2020 10:04:53 AM
 */
public interface CountryService {

	/**
	 *
	 * @param Country
	 */
	public CountryTo createcountry(CountryInput Country);

	/**
	 *
	 * @param countryId
	 */
	public int deletecountry(int countryId);

	/**
	 *
	 * @param countryId
	 */
	public Set<AddressTo> findaddresss(int countryId);

	/**
	 *
	 * @param countryId
	 */
	public Optional<CountryTo> findcountry(int countryId);

	/**
	 *
	 * @param page
	 * @param sort
	 * @param filters
	 */
	public Page<CountryTo> findcountrys(PageInput page, SortInput sort, List<FilterInput> filters, boolean disjunctionFilters);

	/**
	 *
	 * @param countryId
	 */
	public Set<ServiceProviderTo> findserviceproviders(int countryId);

	/**
	 *
	 * @param country
	 */
	public CountryTo modifycountry(CountryInput country);

}