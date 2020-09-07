///////////////////////////////////////////////////////////
//  AssayclassService.java
//  Macromedia ActionScript Implementation of the Interface AssayclassService
//  Generated by Enterprise Architect
//  Created on:      07-Sep-2020 8:10:52 AM
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
import org.springframework.stereotype.Service;
import org.ebs.services.to.AssayclassTo;
import org.ebs.services.to.Input.AssayclassInput;
import org.ebs.services.to.TechnologyPlatformTo;
import org.ebs.services.to.ServiceTo;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 07-Sep-2020 8:10:52 AM
 */
public interface AssayclassService {

	/**
	 * 
	 * @param Assayclass
	 */
	public AssayclassTo createAssayclass(AssayclassInput Assayclass);

	/**
	 * 
	 * @param assayclassId
	 */
	public int deleteAssayclass(int assayclassId);

	/**
	 * 
	 * @param assayclassId
	 */
	public Optional<AssayclassTo> findAssayclass(int assayclassId);

	/**
	 * 
	 * @param page
	 * @param sort
	 * @param filters
	 */
	public Page<AssayclassTo> findAssayclasss(PageInput page, SortInput sort, List<FilterInput> filters);

	/**
	 * 
	 * @param assayclassId
	 */
	public Optional<ServiceTo> findService(int assayclassId);

	/**
	 * 
	 * @param assayclassId
	 */
	public Set<TechnologyPlatformTo> findTechnologyPlatforms(int assayclassId);

	/**
	 * 
	 * @param assayclass
	 */
	public AssayclassTo modifyAssayclass(AssayclassInput assayclass);

}