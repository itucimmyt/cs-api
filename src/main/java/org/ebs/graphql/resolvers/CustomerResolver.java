///////////////////////////////////////////////////////////
//  CustomerResolver.java
//  Macromedia ActionScript Implementation of the Class CustomerResolver
//  Generated by Enterprise Architect
//  Created on:      07-Aug-2020 2:59:22 PM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.graphql.resolvers;

import org.ebs.services.to.CustomerTo;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import java.util.Set;
import org.ebs.services.CustomerService;
import org.ebs.services.to.OrganizationTo;
import org.ebs.services.to.TenantTo;
import com.coxautodev.graphql.tools.GraphQLResolver;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 07-Aug-2020 2:59:22 PM
 */
@Component @Validated
public class CustomerResolver implements GraphQLResolver<CustomerTo> {

	private CustomerService customerService;

	/**
	 * 
	 * @param customerService
	 */
	@Autowired
	public CustomerResolver(CustomerService customerService){
		this.customerService = customerService; 
	
	}

	/**
	 * 
	 * @param customerTo
	 */
	public OrganizationTo getOrganization(CustomerTo customerTo){
		return customerService.findOrganization(customerTo.getId()).get();
	}

	/**
	 * 
	 * @param customer
	 */
	public Set<OrganizationTo> getOrganizations(CustomerTo customer){
		return customerService.findOrganizations(customer.getId());
	}

	/**
	 * 
	 * @param customer
	 */
	public Set<TenantTo> getTenants(CustomerTo customer){
		return customerService.findTenants(customer.getId());
	}

}