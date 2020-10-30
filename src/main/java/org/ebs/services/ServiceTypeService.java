///////////////////////////////////////////////////////////
//  ServiceTypeService.java
//  Macromedia ActionScript Implementation of the Interface ServiceTypeService
//  Generated by Enterprise Architect
//  Created on:      10-Sep-2020 10:44:37 PM
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
import org.ebs.services.to.ServiceTypeTo;
import org.ebs.services.to.Input.ServiceTypeInput;
import org.ebs.services.to.PurposeTo;
import org.ebs.services.to.ServiceProviderTo;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 10-Sep-2020 10:44:37 PM
 */
public interface ServiceTypeService {

	/**
	 *
	 * @param ServiceType
	 */
	public ServiceTypeTo createServiceType(ServiceTypeInput ServiceType);

	/**
	 *
	 * @param serviceTypeId
	 */
	public int deleteServiceType(int serviceTypeId);

	/**
	 *
	 * @param servicetypeId
	 */
	public Set<PurposeTo> findPurposes(int servicetypeId);

	/**
	 *
	 * @param servicetypeId
	 */
	public Set<ServiceProviderTo> findServiceProviders(int servicetypeId);

	/**
	 *
	 * @param serviceTypeId
	 */
	public Optional<ServiceTypeTo> findServiceType(int serviceTypeId);

	/**
	 *
	 * @param page
	 * @param sort
	 * @param filters
	 */
	public Page<ServiceTypeTo> findServiceTypes(PageInput page, SortInput sort, List<FilterInput> filters, boolean disjunctionFilters);

	/**
	 *
	 * @param serviceType
	 */
	public ServiceTypeTo modifyServiceType(ServiceTypeInput serviceType);

}