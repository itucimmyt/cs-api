///////////////////////////////////////////////////////////
//  OrganizationService.java
//  Macromedia ActionScript Implementation of the Interface OrganizationService
//  Generated by Enterprise Architect
//  Created on:      13-Mar-2021 12:02:43 AM
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
import org.ebs.services.to.OrganizationTo;
import org.ebs.services.to.Input.OrganizationInput;
import org.ebs.services.to.TenantTo;
import org.ebs.services.to.CustomerTo;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 13-Mar-2021 12:02:43 AM
 */
public interface OrganizationService {

	/**
	 * 
	 * @param Organization
	 */
	public OrganizationTo createOrganization(OrganizationInput Organization);

	/**
	 * 
	 * @param organizationId
	 */
	public int deleteOrganization(int organizationId);

	/**
	 * 
	 * @param organizationId
	 */
	public Optional<CustomerTo> findCustomer(int organizationId);

	/**
	 * 
	 * @param organizationId
	 */
	public Set<CustomerTo> findCustomers(int organizationId);

	/**
	 * 
	 * @param organizationId
	 */
	public Optional<OrganizationTo> findOrganization(int organizationId);

	/**
	 * 
	 * @param page
	 * @param sort
	 * @param filters
	 */
	public Page<OrganizationTo> findOrganizations(PageInput page, SortInput sort, List<FilterInput> filters);

	/**
	 * 
	 * @param organizationId
	 */
	public Set<TenantTo> findTenants(int organizationId);

	/**
	 * 
	 * @param organization
	 */
	public OrganizationTo modifyOrganization(OrganizationInput organization);

}