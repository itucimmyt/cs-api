///////////////////////////////////////////////////////////
//  AddressResolver.java
//  Macromedia ActionScript Implementation of the Class AddressResolver
//  Generated by Enterprise Architect
//  Created on:      07-Aug-2020 2:58:58 PM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.graphql.resolvers;

import org.springframework.validation.annotation.Validated;
import org.ebs.services.AddressService;
import org.ebs.services.to.CountryTo;
import com.coxautodev.graphql.tools.GraphQLResolver;
import org.ebs.services.to.AddressTo;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 07-Aug-2020 2:58:58 PM
 */
@Component @Validated
public class AddressResolver implements GraphQLResolver<AddressTo> {

	private AddressService addressService;

	/**
	 * 
	 * @param addressService
	 */
	@Autowired
	public AddressResolver(AddressService addressService){
		this.addressService = addressService; 
	
	}

	/**
	 * 
	 * @param addressTo
	 */
	public CountryTo getCountry(AddressTo addressTo){
		return addressService.findCountry(addressTo.getId()).get();
	}

}