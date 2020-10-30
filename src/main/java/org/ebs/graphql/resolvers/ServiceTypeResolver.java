///////////////////////////////////////////////////////////
//  ServiceTypeResolver.java
//  Macromedia ActionScript Implementation of the Class ServiceTypeResolver
//  Generated by Enterprise Architect
//  Created on:      10-Sep-2020 10:44:37 PM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.graphql.resolvers;

import com.coxautodev.graphql.tools.GraphQLResolver;
import org.ebs.services.to.ServiceTypeTo;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import java.util.Set;
import org.ebs.services.ServiceTypeService;
import org.ebs.services.to.PurposeTo;
import org.ebs.services.to.ServiceProviderTo;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 10-Sep-2020 10:44:37 PM
 */
@Component @Validated
public class ServiceTypeResolver implements GraphQLResolver<ServiceTypeTo> {

	private ServiceTypeService servicetypeService;

	/**
	 * 
	 * @param servicetype
	 */
	public Set<PurposeTo> getPurposes(ServiceTypeTo servicetype){
		return servicetypeService.findPurposes(servicetype.getId());
	}

	/**
	 * 
	 * @param servicetypeTo
	 */
	public Set<ServiceProviderTo> getServiceproviders(ServiceTypeTo servicetypeTo){
		return servicetypeService.findServiceProviders(servicetypeTo.getId());
	}

	/**
	 * 
	 * @param servicetypeService
	 */
	@Autowired
	public ServiceTypeResolver(ServiceTypeService servicetypeService){
		this.servicetypeService = servicetypeService; 
	
	}

}