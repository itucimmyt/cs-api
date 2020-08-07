///////////////////////////////////////////////////////////
//  TechnologyPlatformResolver.java
//  Macromedia ActionScript Implementation of the Class TechnologyPlatformResolver
//  Generated by Enterprise Architect
//  Created on:      07-Aug-2020 3:01:47 PM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.graphql.resolvers;

import com.coxautodev.graphql.tools.GraphQLResolver;
import org.ebs.services.to.TechnologyPlatformTo;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.ebs.services.TechnologyPlatformService;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 07-Aug-2020 3:01:47 PM
 */
@Component @Validated
public class TechnologyPlatformResolver implements GraphQLResolver<TechnologyPlatformTo> {

	private TechnologyPlatformService technologyplatformService;

	/**
	 * 
	 * @param technologyplatformService
	 */
	@Autowired
	public TechnologyPlatformResolver(TechnologyPlatformService technologyplatformService){
		this.technologyplatformService = technologyplatformService; 
	
	}

}