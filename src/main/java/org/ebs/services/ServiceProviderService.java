///////////////////////////////////////////////////////////
//  ServiceProviderService.java
//  Macromedia ActionScript Implementation of the Interface ServiceProviderService
//  Generated by Enterprise Architect
//  Created on:      20-Aug-2020 1:06:30 PM
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
import org.ebs.services.to.ServiceTypeTo;
import org.ebs.services.to.CountryTo;
import org.ebs.services.to.CropTo;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 20-Aug-2020 1:06:30 PM
 */
public interface ServiceProviderService {

	/**
	 * 
	 * @param ServiceProvider
	 */
	public ServiceProviderTo createServiceProvider(ServiceProviderInput ServiceProvider);

	/**
	 * 
	 * @param serviceproviderId
	 */
	public int deleteServiceProvider(int serviceproviderId);

	/**
	 * 
	 * @param serviceproviderId
	 */
	public Optional<CountryTo> findCountry(int serviceproviderId);

	/**
	 * 
	 * @param serviceproviderId
	 */
	public Set<CropTo> findCrops(int serviceproviderId);

	/**
	 * 
	 * @param serviceproviderId
	 */
	public Optional<ServiceProviderTo> findServiceProvider(int serviceproviderId);

	/**
	 * 
	 * @param page
	 * @param sort
	 * @param filters
	 */
	public Page<ServiceProviderTo> findServiceProviders(PageInput page, SortInput sort, List<FilterInput> filters);

	/**
	 * 
	 * @param serviceproviderId
	 */
	public Set<ServiceTypeTo> findServiceTypes(int serviceproviderId);

	/**
	 * 
	 * @param serviceprovider
	 */
	public ServiceProviderTo modifyServiceProvider(ServiceProviderInput serviceprovider);

}