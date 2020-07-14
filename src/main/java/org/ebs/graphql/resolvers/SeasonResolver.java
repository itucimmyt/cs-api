///////////////////////////////////////////////////////////
//  SeasonResolver.java
//  Macromedia ActionScript Implementation of the Class SeasonResolver
//  Generated by Enterprise Architect
//  Created on:      13-Jul-2020 5:07:17 PM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.graphql.resolvers;

import com.coxautodev.graphql.tools.GraphQLResolver;
import org.ebs.services.to.SeasonTo;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.ebs.services.SeasonService;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 13-Jul-2020 5:07:17 PM
 */
@Component @Validated
public class SeasonResolver implements GraphQLResolver<SeasonTo> {

	private SeasonService seasonService;

	/**
	 * 
	 * @param seasonService
	 */
	@Autowired
	public SeasonResolver(SeasonService seasonService){
		this.seasonService = seasonService; 
	
	}

}