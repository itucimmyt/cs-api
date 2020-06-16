///////////////////////////////////////////////////////////
//  RequestCFValueResolver.java
//  Macromedia ActionScript Implementation of the Class RequestCFValueResolver
//  Generated by Enterprise Architect
//  Created on:      15-Jun-2020 5:14:12 PM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.graphql.resolvers;

import com.coxautodev.graphql.tools.GraphQLResolver;
import org.ebs.services.to.RequestCFValueTo;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.ebs.services.RequestCFValueService;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 15-Jun-2020 5:14:12 PM
 */
@Component @Validated
public class RequestCFValueResolver implements GraphQLResolver<RequestCFValueTo> {

	private RequestCFValueService requestcfvalueService;

	/**
	 * 
	 * @param requestcfvalueService
	 */
	@Autowired
	public RequestCFValueResolver(RequestCFValueService requestcfvalueService){
		this.requestcfvalueService = requestcfvalueService; 
	
	}

}