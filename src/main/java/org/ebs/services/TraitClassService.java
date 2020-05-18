///////////////////////////////////////////////////////////
//  TraitClassService.java
//  Macromedia ActionScript Implementation of the Interface TraitClassService
//  Generated by Enterprise Architect
//  Created on:      17-May-2020 3:10:27 PM
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
import org.ebs.model.repos.TraitClassRepository;
import org.ebs.services.to.TraitClassTo;
import org.ebs.services.to.Input.TraitClassInput;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 17-May-2020 3:10:27 PM
 */
public interface TraitClassService {

	/**
	 * 
	 * @param TraitClass
	 */
	public TraitClassTo createTraitClass(TraitClassInput TraitClass);

	/**
	 * 
	 * @param idtraitclass
	 */
	public int deleteTraitClass(int idtraitclass);

	/**
	 * 
	 * @param traitclassId
	 */
	public Optional<TraitClassTo> findTraitClass(int traitclassId);

	/**
	 * 
	 * @param page
	 * @param sort
	 * @param filters
	 */
	public Page<TraitClassTo> findTraitClasss(PageInput page, SortInput sort, List<FilterInput> filters);

	/**
	 * 
	 * @param traitclass
	 */
	public TraitClassTo modifyTraitClass(TraitClassInput traitclass);

}