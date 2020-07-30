///////////////////////////////////////////////////////////
//  AssayclassService.java
//  Macromedia ActionScript Implementation of the Interface AssayclassService
//  Generated by Enterprise Architect
//  Created on:      27-Jul-2020 8:42:06 AM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.services;

import java.util.List;
import java.util.Optional;
import org.ebs.util.FilterInput;
import org.ebs.util.PageInput;
import org.ebs.util.SortInput;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;
import org.ebs.services.to.AssayclassTo;
import org.ebs.services.to.Input.AssayclassInput;
import org.ebs.services.to.TechnologyPlatformTo;
import org.ebs.services.to.ServiceTo;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 27-Jul-2020 8:42:06 AM
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
	 * @param assayclass
	 */
	public AssayclassTo modifyAssayclass(AssayclassInput assayclass);

}