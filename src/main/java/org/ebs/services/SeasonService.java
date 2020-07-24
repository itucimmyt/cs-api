///////////////////////////////////////////////////////////
//  SeasonService.java
//  Macromedia ActionScript Implementation of the Interface SeasonService
//  Generated by Enterprise Architect
//  Created on:      23-Jul-2020 10:47:07 PM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.services;

import java.util.List;
import java.util.Optional;
import org.ebs.util.FilterInput;
import org.ebs.util.PageInput;
import org.ebs.util.SortInput;
import org.springframework.data.domain.Page;
import org.ebs.services.to.SeasonTo;
import org.ebs.services.to.Input.SeasonInput;
import org.ebs.services.to.CropTo;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 23-Jul-2020 10:47:07 PM
 */
public interface SeasonService {

	/**
	 * 
	 * @param Season
	 */
	public SeasonTo createSeason(SeasonInput Season);

	/**
	 * 
	 * @param seasonId
	 */
	public int deleteSeason(int seasonId);

	/**
	 * 
	 * @param seasonId
	 */
	public Optional<SeasonTo> findSeason(int seasonId);

	/**
	 * 
	 * @param page
	 * @param sort
	 * @param filters
	 */
	public Page<SeasonTo> findSeasons(PageInput page, SortInput sort, List<FilterInput> filters);

	/**
	 * 
	 * @param season
	 */
	public SeasonTo modifySeason(SeasonInput season);

}