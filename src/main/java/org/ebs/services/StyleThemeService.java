///////////////////////////////////////////////////////////
//  StyleThemeService.java
//  Macromedia ActionScript Implementation of the Interface StyleThemeService
//  Generated by Enterprise Architect
//  Created on:      10-Sep-2020 10:44:41 PM
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
import org.ebs.services.to.StyleThemeTo;
import org.ebs.services.to.Input.StyleThemeInput;
import org.ebs.services.to.PreferenceTo;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 10-Sep-2020 10:44:41 PM
 */
public interface StyleThemeService {

	/**
	 *
	 * @param StyleTheme
	 */
	public StyleThemeTo createStyleTheme(StyleThemeInput StyleTheme);

	/**
	 *
	 * @param styleThemeId
	 */
	public int deleteStyleTheme(int styleThemeId);

	/**
	 *
	 * @param stylethemeId
	 */
	public Set<PreferenceTo> findPreferences(int stylethemeId);

	/**
	 *
	 * @param styleThemeId
	 */
	public Optional<StyleThemeTo> findStyleTheme(int styleThemeId);

	/**
	 *
	 * @param page
	 * @param sort
	 * @param filters
	 */
	public Page<StyleThemeTo> findStyleThemes(PageInput page, SortInput sort, List<FilterInput> filters, boolean disjunctionFilters);

	/**
	 *
	 * @param styleTheme
	 */
	public StyleThemeTo modifyStyleTheme(StyleThemeInput styleTheme);

}