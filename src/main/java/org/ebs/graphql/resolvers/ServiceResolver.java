///////////////////////////////////////////////////////////
//  ServiceResolver.java
//  Macromedia ActionScript Implementation of the Class ServiceResolver
//  Generated by Enterprise Architect
//  Created on:      07-Aug-2020 3:01:29 PM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.graphql.resolvers;

import com.coxautodev.graphql.tools.GraphQLResolver;
import org.ebs.services.to.ServiceTo;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import java.util.Set;
import org.ebs.services.ServiceService;
import org.ebs.services.to.PurposeTo;
import org.ebs.services.to.AssayclassTo;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 07-Aug-2020 3:01:29 PM
 */
@Component @Validated
public class ServiceResolver implements GraphQLResolver<ServiceTo> {

	private ServiceService serviceService;

	/**
	 * 
	 * @param service
	 */
	public Set<AssayclassTo> getAssayclasss(ServiceTo service){
		return serviceService.findAssayclasss(service.getId());
	}

	/**
	 * 
	 * @param serviceTo
	 */
	public PurposeTo getPurpose(ServiceTo serviceTo){
		return serviceService.findPurpose(serviceTo.getId()).get();
	}

	/**
	 * 
	 * @param serviceService
	 */
	@Autowired
	public ServiceResolver(ServiceService serviceService){
		this.serviceService = serviceService; 
	
	}

}