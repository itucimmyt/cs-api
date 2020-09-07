///////////////////////////////////////////////////////////
//  CustomerService.java
//  Macromedia ActionScript Implementation of the Interface CustomerService
//  Generated by Enterprise Architect
//  Created on:      07-Sep-2020 8:11:07 AM
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
import org.ebs.services.to.CustomerTo;
import org.ebs.services.to.Input.CustomerInput;
import org.ebs.services.to.OrganizationTo;
import org.ebs.services.to.TenantTo;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 07-Sep-2020 8:11:07 AM
 */
public interface CustomerService {

	/**
	 * 
	 * @param Customer
	 */
	public CustomerTo createCustomer(CustomerInput Customer);

	/**
	 * 
	 * @param customerId
	 */
	public int deleteCustomer(int customerId);

	/**
	 * 
	 * @param customerId
	 */
	public Optional<CustomerTo> findCustomer(int customerId);

	/**
	 * 
	 * @param page
	 * @param sort
	 * @param filters
	 */
	public Page<CustomerTo> findCustomers(PageInput page, SortInput sort, List<FilterInput> filters);

	/**
	 * 
	 * @param customerId
	 */
	public Optional<OrganizationTo> findOrganization(int customerId);

	/**
	 * 
	 * @param customerId
	 */
	public Set<OrganizationTo> findOrganizations(int customerId);

	/**
	 * 
	 * @param customerId
	 */
	public Set<TenantTo> findTenants(int customerId);

	/**
	 * 
	 * @param customer
	 */
	public CustomerTo modifyCustomer(CustomerInput customer);

}