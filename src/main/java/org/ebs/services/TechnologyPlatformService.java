///////////////////////////////////////////////////////////
//  TechnologyPlatformService.java
//  Macromedia ActionScript Implementation of the Interface TechnologyPlatformService
//  Generated by Enterprise Architect
//  Created on:      04-Sep-2020 10:06:13 AM
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
import org.ebs.services.to.TechnologyPlatformTo;
import org.ebs.services.to.Input.TechnologyPlatformInput;
import org.ebs.services.to.AssayclassTo;
import org.ebs.services.to.VendorTo;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 04-Sep-2020 10:06:13 AM
 */
public interface TechnologyPlatformService {

	/**
	 * 
	 * @param TechnologyPlatform
	 */
	public TechnologyPlatformTo createtechnologyplatform(TechnologyPlatformInput TechnologyPlatform);

	/**
	 * 
	 * @param technologyplatformId
	 */
	public int deletetechnologyplatform(int technologyplatformId);

	/**
	 * 
	 * @param technologyplatformId
	 */
	public Set<AssayclassTo> findassayclasss(int technologyplatformId);

	/**
	 * 
	 * @param technologyplatformId
	 */
	public Optional<TechnologyPlatformTo> findtechnologyplatform(int technologyplatformId);

	/**
	 * 
	 * @param page
	 * @param sort
	 * @param filters
	 */
	public Page<TechnologyPlatformTo> findtechnologyplatforms(PageInput page, SortInput sort, List<FilterInput> filters);

	/**
	 * 
	 * @param technologyplatformId
	 */
	public Set<VendorTo> findvendors(int technologyplatformId);

	/**
	 * 
	 * @param technologyplatform
	 */
	public TechnologyPlatformTo modifytechnologyplatform(TechnologyPlatformInput technologyplatform);

}