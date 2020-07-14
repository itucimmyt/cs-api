///////////////////////////////////////////////////////////
//  OrganizationResolver.java
//  Macromedia ActionScript Implementation of the Class OrganizationResolver
//  Generated by Enterprise Architect
//  Created on:      13-Jul-2020 5:06:53 PM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.graphql.resolvers;

import com.coxautodev.graphql.tools.GraphQLResolver;
import org.ebs.services.to.OrganizationTo;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import java.util.Set;
import org.ebs.services.OrganizationService;
import org.ebs.services.to.TenantTo;
import org.ebs.services.to.CustomerTo;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 13-Jul-2020 5:06:53 PM
 */
@Component @Validated
public class OrganizationResolver implements GraphQLResolver<OrganizationTo> {

	private OrganizationService organizationService;

	/**
	 * 
	 * @param organizationTo
	 */
	public CustomerTo getCustomer(OrganizationTo organizationTo){
		return organizationService.findCustomer(organizationTo.getId()).get();
	}

	/**
	 * 
	 * @param organization
	 */
	public Set<CustomerTo> getCustomers(OrganizationTo organization){
		return organizationService.findCustomers(organization.getId());
	}

	/**
	 * 
	 * @param organization
	 */
	public Set<TenantTo> getTenants(OrganizationTo organization){
		return organizationService.findTenants(organization.getId());
	}

	/**
	 * 
	 * @param organizationService
	 */
	@Autowired
	public OrganizationResolver(OrganizationService organizationService){
		this.organizationService = organizationService; 
	
	}

}