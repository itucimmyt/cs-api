///////////////////////////////////////////////////////////
//  MarkerResolver.java
//  Macromedia ActionScript Implementation of the Class MarkerResolver
//  Generated by Enterprise Architect
//  Created on:      07-Sep-2020 8:11:25 AM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.graphql.resolvers;

import com.coxautodev.graphql.tools.GraphQLResolver;
import org.ebs.services.to.MarkerTo;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import java.util.Set;
import org.ebs.services.MarkerService;
import org.ebs.services.to.MarkerSynonymTo;
import org.ebs.services.to.AssayGeneTo;
import org.ebs.services.to.VendorTo;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 07-Sep-2020 8:11:25 AM
 */
@Component @Validated
public class MarkerResolver implements GraphQLResolver<MarkerTo> {

	private MarkerService markerService;

	/**
	 * 
	 * @param markerTo
	 */
	public AssayGeneTo getAssayGene(MarkerTo markerTo){
		return markerService.findAssayGene(markerTo.getId()).get();
	}

	/**
	 * 
	 * @param marker
	 */
	public Set<MarkerSynonymTo> getMarkerSynonyms(MarkerTo marker){
		return markerService.findMarkerSynonyms(marker.getId());
	}

	/**
	 * 
	 * @param markerTo
	 */
	public Set<VendorTo> getVendors(MarkerTo markerTo){
		return markerService.findVendors(markerTo.getId());
	}

	/**
	 * 
	 * @param markerService
	 */
	@Autowired
	public MarkerResolver(MarkerService markerService){
		this.markerService = markerService; 
	
	}

}