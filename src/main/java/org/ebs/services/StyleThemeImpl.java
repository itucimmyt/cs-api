///////////////////////////////////////////////////////////
//  StyleThemeImpl.java
//  Macromedia ActionScript Implementation of the Class StyleThemeImpl
//  Generated by Enterprise Architect
//  Created on:      17-May-2020 3:10:22 PM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.services;

import java.util.List;
import java.util.Optional;

import org.ebs.model.StyleThemeModel;
import org.ebs.model.repos.StyleThemeRepository;
import org.ebs.services.to.StyleThemeTo;
import org.ebs.services.to.Input.StyleThemeInput;
import org.ebs.util.FilterInput;
import org.ebs.util.PageInput;
import org.ebs.util.SortInput;
import org.ebs.util.Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.ConversionService;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 17-May-2020 3:10:22 PM
 */
@Service @Transactional(readOnly = true)
public class StyleThemeImpl implements StyleThemeService {

	private StyleThemeRepository stylethemeRepository;
	@Autowired
	private ConversionService converter;

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
	 * @param idstyletheme
	 */
	@Override @Transactional(readOnly = false)
	public int deleteStyleTheme(int idstyletheme){
		StyleThemeModel styletheme = stylethemeRepository.findById(idstyletheme).orElseThrow(() -> new RuntimeException("Request not found")); 
		 styletheme.setDeleted(true); 
		  stylethemeRepository.save(styletheme); 
		 return idstyletheme;
	}

	/**
	 * 
	 * @param stylethemeId
	 */
	@Override
	public Optional<StyleThemeTo> findStyleTheme(int stylethemeId){
		if(stylethemeId <1) 
		 {return Optional.empty();} 
		 return stylethemeRepository.findById(stylethemeId).filter(r -> !r.getDeleted().booleanValue()).map(r -> converter.convert(r,StyleThemeTo.class));
	}

	/**
	 * 
	 * @param page
	 * @param sort
	 * @param filters
	 */
	@Override
	public Page<StyleThemeTo> findStyleThemes(PageInput page, SortInput sort, List<FilterInput> filters){
		return stylethemeRepository.findByCriteria(StyleThemeModel.class,filters,sort,page).map(r -> converter.convert(r,StyleThemeTo.class));
	}

	/**
	 * 
	 * @param styletheme
	 */
	@Override @Transactional(readOnly = false)
	public StyleThemeTo modifyStyleTheme(StyleThemeInput styletheme){
		StyleThemeModel target= stylethemeRepository.findById(styletheme.getId()).orElseThrow(() -> new RuntimeException("Request not found")); 
		 StyleThemeModel source= converter.convert(styletheme,StyleThemeModel.class); 
		 Utils.copyNotNulls(source,target); 
		 return converter.convert(stylethemeRepository.save(target), StyleThemeTo.class);
	}

	/**
	 * 
	 * @param stylethemeRepository
	 */
	@Autowired
	public StyleThemeImpl(StyleThemeRepository stylethemeRepository){
		this.stylethemeRepository =stylethemeRepository;
	}

}