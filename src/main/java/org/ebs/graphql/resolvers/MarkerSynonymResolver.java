///////////////////////////////////////////////////////////
//  MarkerSynonymResolver.java
//  Macromedia ActionScript Implementation of the Class MarkerSynonymResolver
//  Generated by Enterprise Architect
//  Created on:      10-Sep-2020 12:19:27 AM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.graphql.resolvers;

import com.coxautodev.graphql.tools.GraphQLResolver;
import org.ebs.services.to.MarkerSynonymTo;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.ebs.services.MarkerSynonymService;
import org.ebs.services.to.MarkerTo;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 10-Sep-2020 12:19:27 AM
 */
@Component @Validated
public class MarkerSynonymResolver implements GraphQLResolver<MarkerSynonymTo> {

	private MarkerSynonymService markersynonymService;

	/**
	 * 
	 * @param markersynonymTo
	 */
	public MarkerTo getMarker(MarkerSynonymTo markersynonymTo){
		return markersynonymService.findMarker(markersynonymTo.getId()).get();
	}

	/**
	 * 
	 * @param markersynonymService
	 */
	@Autowired
	public MarkerSynonymResolver(MarkerSynonymService markersynonymService){
		this.markersynonymService = markersynonymService; 
	
	}

}