///////////////////////////////////////////////////////////
//  StyleThemeServiceImpl.java
//  Macromedia ActionScript Implementation of the Class StyleThemeServiceImpl
//  Generated by Enterprise Architect
//  Created on:      10-Sep-2020 10:44:41 PM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.services;

import org.ebs.model.repos.StyleThemeRepository;
import org.ebs.model.repos.PreferenceRepository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import java.util.Optional;
import org.ebs.util.FilterInput;
import org.ebs.util.PageInput;
import org.ebs.util.SortInput;
import org.ebs.util.Utils;
import org.springframework.core.convert.ConversionService;
import java.util.stream.Collectors;
import java.util.Set;
import org.ebs.services.to.StyleThemeTo;
import org.ebs.services.to.Input.StyleThemeInput;
import org.ebs.model.StyleThemeModel;
import org.ebs.services.to.PreferenceTo;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 10-Sep-2020 10:44:41 PM
 */
@Service @Transactional(readOnly = true)
  class StyleThemeServiceImpl implements StyleThemeService {

	private StyleThemeRepository stylethemeRepository;
	private ConversionService converter;
	private PreferenceRepository preferenceRepository;

	/**
	 *
	 * @param StyleTheme
	 */
	@Override @Transactional(readOnly = false)
	public StyleThemeTo createStyleTheme(StyleThemeInput StyleTheme){
		StyleThemeModel model = converter.convert(StyleTheme,StyleThemeModel.class);
		 model.setId(0);

		 model= stylethemeRepository.save(model);
		 return converter.convert(model, StyleThemeTo.class);
	}

	/**
	 *
	 * @param styleThemeId
	 */
	@Override @Transactional(readOnly = false)
	public int deleteStyleTheme(int styleThemeId){
		StyleThemeModel styletheme = stylethemeRepository.findById(styleThemeId).orElseThrow(() -> new RuntimeException("StyleTheme not found"));
		 styletheme.setDeleted(true);
		  stylethemeRepository.save(styletheme);
		 return styleThemeId;
	}

	/**
	 *
	 * @param stylethemeId
	 */
	public Set<PreferenceTo> findPreferences(int stylethemeId){
		return preferenceRepository.findByStylethemeId(stylethemeId).stream().map(e -> converter.convert(e,PreferenceTo.class)).collect(Collectors.toSet());
	}

	/**
	 *
	 * @param styleThemeId
	 */
	@Override
	public Optional<StyleThemeTo> findStyleTheme(int styleThemeId){
		if(styleThemeId <1)
		 {return Optional.empty();}
		 return stylethemeRepository.findById(styleThemeId).filter(r -> !r.getDeleted().booleanValue()).map(r -> converter.convert(r,StyleThemeTo.class));
	}

	/**
	 *
	 * @param page
	 * @param sort
	 * @param filters
	 */
	@Override
	public Page<StyleThemeTo> findStyleThemes(PageInput page, SortInput sort, List<FilterInput> filters, boolean disjunctionFilters){
		return stylethemeRepository.findByCriteria(StyleThemeModel.class,filters,sort,page,disjunctionFilters).map(r -> converter.convert(r,StyleThemeTo.class));
	}

	/**
	 *
	 * @param styleTheme
	 */
	@Override @Transactional(readOnly = false)
	public StyleThemeTo modifyStyleTheme(StyleThemeInput styleTheme){
		StyleThemeModel target= stylethemeRepository.findById(styleTheme.getId()).orElseThrow(() -> new RuntimeException("StyleTheme not found"));
		 StyleThemeModel source= converter.convert(styleTheme,StyleThemeModel.class);
		 Utils.copyNotNulls(source,target);
		 return converter.convert(stylethemeRepository.save(target), StyleThemeTo.class);
	}

	/**
	 *
	 * @param preferenceRepository
	 * @param converter
	 * @param stylethemeRepository
	 */
	@Autowired
	public StyleThemeServiceImpl(PreferenceRepository preferenceRepository, ConversionService converter, StyleThemeRepository stylethemeRepository){
		this.stylethemeRepository =stylethemeRepository;
		 this.converter = converter;
		 this.preferenceRepository = preferenceRepository;
	}

}