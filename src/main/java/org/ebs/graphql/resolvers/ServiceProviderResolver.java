///////////////////////////////////////////////////////////
//  ServiceProviderResolver.java
//  Macromedia ActionScript Implementation of the Class ServiceProviderResolver
//  Generated by Enterprise Architect
//  Created on:      10-Sep-2020 12:20:12 AM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.graphql.resolvers;

import com.coxautodev.graphql.tools.GraphQLResolver;
import org.ebs.services.to.ServiceProviderTo;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import java.util.Set;
import org.ebs.services.ServiceProviderService;
import org.ebs.services.to.ServiceTypeTo;
import org.ebs.services.to.CountryTo;
import org.ebs.services.to.CropTo;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 10-Sep-2020 12:20:12 AM
 */
@Component @Validated
public class ServiceProviderResolver implements GraphQLResolver<ServiceProviderTo> {

	private ServiceProviderService serviceproviderService;

	/**
	 * 
	 * @param serviceproviderTo
	 */
	public CountryTo getCountry(ServiceProviderTo serviceproviderTo){
		return serviceproviderService.findCountry(serviceproviderTo.getId()).get();
	}

	/**
	 * 
	 * @param serviceproviderTo
	 */
	public Set<CropTo> getCrops(ServiceProviderTo serviceproviderTo){
		return serviceproviderService.findCrops(serviceproviderTo.getId());
	}

	/**
	 * 
	 * @param serviceproviderTo
	 */
	public Set<ServiceTypeTo> getServicetypes(ServiceProviderTo serviceproviderTo){
		return serviceproviderService.findServiceTypes(serviceproviderTo.getId());
	}

	/**
	 * 
	 * @param serviceproviderService
	 */
	@Autowired
	public ServiceProviderResolver(ServiceProviderService serviceproviderService){
		this.serviceproviderService = serviceproviderService; 
	
	}

}