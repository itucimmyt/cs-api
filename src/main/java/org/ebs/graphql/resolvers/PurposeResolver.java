///////////////////////////////////////////////////////////
//  PurposeResolver.java
//  Macromedia ActionScript Implementation of the Class PurposeResolver
//  Generated by Enterprise Architect
//  Created on:      09-Aug-2020 4:51:15 PM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.graphql.resolvers;

import com.coxautodev.graphql.tools.GraphQLResolver;
import org.ebs.services.to.PurposeTo;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import java.util.Set;
import org.ebs.services.PurposeService;
import org.ebs.services.to.RequestTo;
import org.ebs.services.to.ServiceTypeTo;
import org.ebs.services.to.ServiceTo;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 09-Aug-2020 4:51:15 PM
 */
@Component @Validated
public class PurposeResolver implements GraphQLResolver<PurposeTo> {

	private PurposeService purposeService;

	/**
	 * 
	 * @param purpose
	 */
	

	/**
	 * 
	 * @param purpose
	 */
	public Set<ServiceTo> getServices(PurposeTo purpose){
		return purposeService.findServices(purpose.getId());
	}

	/**
	 * 
	 * @param purposeTo
	 */
	public ServiceTypeTo getServicetype(PurposeTo purposeTo){
		return purposeService.findServiceType(purposeTo.getId()).get();
	}

	/**
	 * 
	 * @param purposeService
	 */
	@Autowired
	public PurposeResolver(PurposeService purposeService){
		this.purposeService = purposeService; 
	
	}

}