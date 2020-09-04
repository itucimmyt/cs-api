///////////////////////////////////////////////////////////
//  DonorResolver.java
//  Macromedia ActionScript Implementation of the Class DonorResolver
//  Generated by Enterprise Architect
//  Created on:      04-Sep-2020 10:05:02 AM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.graphql.resolvers;

import com.coxautodev.graphql.tools.GraphQLResolver;
import org.ebs.services.to.DonorTo;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.ebs.services.DonorService;
import org.ebs.services.to.PersonTo;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 04-Sep-2020 10:05:02 AM
 */
@Component @Validated
public class DonorResolver implements GraphQLResolver<DonorTo> {

	private DonorService donorService;

	/**
	 * 
	 * @param donorService
	 */
	@Autowired
	public DonorResolver(DonorService donorService){
		this.donorService = donorService; 
	
	}

	/**
	 * 
	 * @param donorTo
	 */
	public PersonTo getPerson(DonorTo donorTo){
		return donorService.findperson(donorTo.getId()).get();
	}

}