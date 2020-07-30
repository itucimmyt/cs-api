///////////////////////////////////////////////////////////
//  CropService.java
//  Macromedia ActionScript Implementation of the Interface CropService
//  Generated by Enterprise Architect
//  Created on:      27-Jul-2020 8:42:20 AM
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
import org.ebs.services.to.CropTo;
import org.ebs.services.to.Input.CropInput;
import org.ebs.services.to.ProgramTo;
import org.ebs.services.to.ServiceProviderTo;
import org.ebs.services.to.SeasonTo;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 27-Jul-2020 8:42:20 AM
 */
public interface CropService {

	/**
	 * 
	 * @param Crop
	 */
	public CropTo createCrop(CropInput Crop);

	/**
	 * 
	 * @param cropId
	 */
	public int deleteCrop(int cropId);

	/**
	 * 
	 * @param cropId
	 */
	public Optional<CropTo> findCrop(int cropId);

	/**
	 * 
	 * @param page
	 * @param sort
	 * @param filters
	 */
	public Page<CropTo> findCrops(PageInput page, SortInput sort, List<FilterInput> filters);

	/**
	 * 
	 * @param cropId
	 */
	public Set<ProgramTo> findPrograms(int cropId);

	/**
	 * 
	 * @param crop
	 */
	public CropTo modifyCrop(CropInput crop);

}