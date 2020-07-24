///////////////////////////////////////////////////////////
//  SchemeService.java
//  Macromedia ActionScript Implementation of the Interface SchemeService
//  Generated by Enterprise Architect
//  Created on:      22-Jul-2020 4:17:37 PM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.services;

import java.util.List;
import java.util.Optional;
import org.ebs.util.FilterInput;
import org.ebs.util.PageInput;
import org.ebs.util.SortInput;
import org.springframework.data.domain.Page;
import org.ebs.services.to.SchemeTo;
import org.ebs.services.to.Input.SchemeInput;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 22-Jul-2020 4:17:37 PM
 */
public interface SchemeService {

	/**
	 * 
	 * @param Scheme
	 */
	public SchemeTo createScheme(SchemeInput Scheme);

	/**
	 * 
	 * @param schemeId
	 */
	public int deleteScheme(int schemeId);

	/**
	 * 
	 * @param schemeId
	 */
	public Optional<SchemeTo> findScheme(int schemeId);

	/**
	 * 
	 * @param page
	 * @param sort
	 * @param filters
	 */
	public Page<SchemeTo> findSchemes(PageInput page, SortInput sort, List<FilterInput> filters);

	/**
	 * 
	 * @param scheme
	 */
	public SchemeTo modifyScheme(SchemeInput scheme);

}