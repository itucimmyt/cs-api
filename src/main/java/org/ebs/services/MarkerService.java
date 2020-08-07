///////////////////////////////////////////////////////////
//  MarkerService.java
//  Macromedia ActionScript Implementation of the Interface MarkerService
//  Generated by Enterprise Architect
//  Created on:      07-Aug-2020 2:59:55 PM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.services;

import java.util.List;
import java.util.Optional;
import org.ebs.util.FilterInput;
import org.ebs.util.PageInput;
import org.ebs.util.SortInput;
import org.springframework.data.domain.Page;
import java.util.Set;
import org.ebs.services.to.MarkerTo;
import org.ebs.services.to.Input.MarkerInput;
import org.ebs.services.to.MarkerSynonymTo;
import org.ebs.services.to.AssayGeneTo;
import org.ebs.services.to.VendorTo;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 07-Aug-2020 2:59:55 PM
 */
public interface MarkerService {

	/**
	 * 
	 * @param Marker
	 */
	public MarkerTo createMarker(MarkerInput Marker);

	/**
	 * 
	 * @param markerId
	 */
	public int deleteMarker(int markerId);

	/**
	 * 
	 * @param markerId
	 */
	public Optional<AssayGeneTo> findAssayGene(int markerId);

	/**
	 * 
	 * @param markerId
	 */
	public Optional<MarkerTo> findMarker(int markerId);

	/**
	 * 
	 * @param page
	 * @param sort
	 * @param filters
	 */
	public Page<MarkerTo> findMarkers(PageInput page, SortInput sort, List<FilterInput> filters);

	/**
	 * 
	 * @param markerId
	 */
	public Set<MarkerSynonymTo> findMarkerSynonyms(int markerId);

	/**
	 * 
	 * @param marker
	 */
	public MarkerTo modifyMarker(MarkerInput marker);

}