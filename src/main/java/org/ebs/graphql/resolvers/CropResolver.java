///////////////////////////////////////////////////////////
//  CropResolver.java
//  Macromedia ActionScript Implementation of the Class CropResolver
//  Generated by Enterprise Architect
//  Created on:      02-May-2021 6:19:44 AM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.graphql.resolvers;

import com.coxautodev.graphql.tools.GraphQLResolver;
import org.ebs.services.to.CropTo;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import java.util.Set;
import org.ebs.services.CropService;
import org.ebs.services.to.ProgramTo;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 02-May-2021 6:19:44 AM
 */
@Component @Validated
public class CropResolver implements GraphQLResolver<CropTo> {

	private CropService cropService;

	/**
	 * 
	 * @param cropService
	 */
	@Autowired
	public CropResolver(CropService cropService){
		this.cropService = cropService; 
	
	}

	/**
	 * 
	 * @param crop
	 */
	public Set<ProgramTo> getPrograms(CropTo crop){
		return cropService.findPrograms(crop.getId());
	}

}