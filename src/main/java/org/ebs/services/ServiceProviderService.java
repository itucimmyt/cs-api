///////////////////////////////////////////////////////////
//  ServiceProviderService.java
//  Macromedia ActionScript Implementation of the Interface ServiceProviderService
//  Generated by Enterprise Architect
//  Created on:      04-Sep-2020 10:06:02 AM
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
import org.ebs.services.to.ServiceProviderTo;
import org.ebs.services.to.Input.ServiceProviderInput;
import org.ebs.services.to.CropTo;
import org.ebs.services.to.ServiceTypeTo;
import org.ebs.services.to.CountryTo;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 04-Sep-2020 10:06:02 AM
 */
public interface ServiceProviderService {

	/**
	 * 
	 * @param ServiceProvider
	 */
	public ServiceProviderTo createserviceprovider(ServiceProviderInput ServiceProvider);

	/**
	 * 
	 * @param serviceproviderId
	 */
	public int deleteserviceprovider(int serviceproviderId);

	/**
	 * 
	 * @param serviceproviderId
	 */
	public Optional<CountryTo> findcountry(int serviceproviderId);

	/**
	 * 
	 * @param serviceproviderId
	 */
	public Set<CropTo> findcrops(int serviceproviderId);

	/**
	 * 
	 * @param serviceproviderId
	 */
	public Optional<ServiceProviderTo> findserviceprovider(int serviceproviderId);

	/**
	 * 
	 * @param page
	 * @param sort
	 * @param filters
	 */
	public Page<ServiceProviderTo> findserviceproviders(PageInput page, SortInput sort, List<FilterInput> filters);

	/**
	 * 
	 * @param serviceproviderId
	 */
	public Set<ServiceTypeTo> findservicetypes(int serviceproviderId);

	/**
	 * 
	 * @param serviceprovider
	 */
	public ServiceProviderTo modifyserviceprovider(ServiceProviderInput serviceprovider);

}