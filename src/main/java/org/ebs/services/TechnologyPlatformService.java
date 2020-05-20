///////////////////////////////////////////////////////////
//  TechnologyPlatformService.java
//  Macromedia ActionScript Implementation of the Interface TechnologyPlatformService
//  Generated by Enterprise Architect
//  Created on:      17-May-2020 3:10:24 PM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.services;

import java.util.List;
import java.util.Optional;

import org.ebs.services.to.TechnologyPlatformTo;
import org.ebs.services.to.Input.TechnologyPlatformInput;
import org.ebs.util.FilterInput;
import org.ebs.util.PageInput;
import org.ebs.util.SortInput;
import org.springframework.data.domain.Page;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 17-May-2020 3:10:24 PM
 */
public interface TechnologyPlatformService {

	/**
	 * 
	 * @param TechnologyPlatform
	 */
	public TechnologyPlatformTo createTechnologyPlatform(TechnologyPlatformInput TechnologyPlatform);

	/**
	 * 
	 * @param idtechnologyplatform
	 */
	public int deleteTechnologyPlatform(int idtechnologyplatform);

	/**
	 * 
	 * @param technologyplatformId
	 */
	public Optional<TechnologyPlatformTo> findTechnologyPlatform(int technologyplatformId);

	/**
	 * 
	 * @param page
	 * @param sort
	 * @param filters
	 */
	public Page<TechnologyPlatformTo> findTechnologyPlatforms(PageInput page, SortInput sort, List<FilterInput> filters);

	/**
	 * 
	 * @param technologyplatform
	 */
	public TechnologyPlatformTo modifyTechnologyPlatform(TechnologyPlatformInput technologyplatform);

}