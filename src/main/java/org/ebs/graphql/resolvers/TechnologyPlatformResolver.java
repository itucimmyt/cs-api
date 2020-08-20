///////////////////////////////////////////////////////////
//  TechnologyPlatformResolver.java
//  Macromedia ActionScript Implementation of the Class TechnologyPlatformResolver
//  Generated by Enterprise Architect
//  Created on:      20-Aug-2020 1:06:40 PM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.graphql.resolvers;

import com.coxautodev.graphql.tools.GraphQLResolver;
import org.ebs.services.to.TechnologyPlatformTo;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import java.util.Set;
import org.ebs.services.TechnologyPlatformService;
import org.ebs.services.to.AssayclassTo;
import org.ebs.services.to.VendorTo;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 20-Aug-2020 1:06:40 PM
 */
@Component @Validated
public class TechnologyPlatformResolver implements GraphQLResolver<TechnologyPlatformTo> {

	private TechnologyPlatformService technologyplatformService;

	/**
	 * 
	 * @param technologyplatformTo
	 */
	public Set<AssayclassTo> getAssayclasss(TechnologyPlatformTo technologyplatformTo){
		return technologyplatformService.findAssayclasss(technologyplatformTo.getId());
	}

	/**
	 * 
	 * @param technologyplatform
	 */
	public Set<VendorTo> getVendors(TechnologyPlatformTo technologyplatform){
		return technologyplatformService.findVendors(technologyplatform.getId());
	}

	/**
	 * 
	 * @param technologyplatformService
	 */
	@Autowired
	public TechnologyPlatformResolver(TechnologyPlatformService technologyplatformService){
		this.technologyplatformService = technologyplatformService; 
	
	}

}