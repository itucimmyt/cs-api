///////////////////////////////////////////////////////////
//  MarkerSynonymService.java
//  Macromedia ActionScript Implementation of the Interface MarkerSynonymService
//  Generated by Enterprise Architect
//  Created on:      17-May-2020 3:09:41 PM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.services;

import java.util.List;
import java.util.Optional;
import org.ebs.util.FilterInput;
import org.ebs.util.PageInput;
import org.ebs.util.SortInput;
import org.springframework.data.domain.Page;
import org.ebs.util.Utils;
import org.ebs.model.repos.MarkerSynonymRepository;
import org.ebs.services.to.MarkerSynonymTo;
import org.ebs.services.to.Input.MarkerSynonymInput;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 17-May-2020 3:09:41 PM
 */
public interface MarkerSynonymService {

	/**
	 * 
	 * @param MarkerSynonym
	 */
	public MarkerSynonymTo createMarkerSynonym(MarkerSynonymInput MarkerSynonym);

	/**
	 * 
	 * @param idmarkersynonym
	 */
	public int deleteMarkerSynonym(int idmarkersynonym);

	/**
	 * 
	 * @param markersynonymId
	 */
	public Optional<MarkerSynonymTo> findMarkerSynonym(int markersynonymId);

	/**
	 * 
	 * @param page
	 * @param sort
	 * @param filters
	 */
	public Page<MarkerSynonymTo> findMarkerSynonyms(PageInput page, SortInput sort, List<FilterInput> filters);

	/**
	 * 
	 * @param markersynonym
	 */
	public MarkerSynonymTo modifyMarkerSynonym(MarkerSynonymInput markersynonym);

}