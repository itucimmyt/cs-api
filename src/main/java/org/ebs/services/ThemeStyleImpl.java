///////////////////////////////////////////////////////////
//  ThemeStyleImpl.java
//  Macromedia ActionScript Implementation of the Class ThemeStyleImpl
//  Generated by Enterprise Architect
//  Created on:      27-Apr-2020 9:47:54 AM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.services;

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
import org.ebs.services.to.ThemeStyleTo;
import org.ebs.services.to.Input.ThemeStyleInput;
import org.ebs.model.ThemeStyleModel;
import org.ebs.model.repos.ThemeStyleRepository;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 27-Apr-2020 9:47:54 AM
 */
@Service @Transactional(readOnly = true)
public class ThemeStyleImpl implements ThemeStyleService {

	@Autowired
	private ConversionService converter;
	private ThemeStyleRepository themestyleRepository;

	/**
	 * 
	 * @param ThemeStyle
	 */
	@Override @Transactional(readOnly = false)
	public ThemeStyleTo createThemeStyle(ThemeStyleInput ThemeStyle){
		ThemeStyleModel model = converter.convert(ThemeStyle,ThemeStyleModel.class); 
		 model.setId(0); 
		 model= themestyleRepository.save(model); 
		 return converter.convert(model, ThemeStyleTo.class); 
	}

	/**
	 * 
	 * @param idthemestyle
	 */
	@Override @Transactional(readOnly = false)
	public int deleteThemeStyle(int idthemestyle){
		ThemeStyleModel themestyle = themestyleRepository.findById(idthemestyle).orElseThrow(() -> new RuntimeException("Request not found")); 
		 themestyle.setDeleted(true); 
		  themestyleRepository.save(themestyle); 
		 return idthemestyle;
	}

	/**
	 * 
	 * @param themestyleId
	 */
	@Override
	public Optional<ThemeStyleTo> findThemeStyle(int themestyleId){
		if(themestyleId <1) 
		 {return Optional.empty();} 
		 return themestyleRepository.findById(themestyleId).filter(r -> !r.getDeleted().booleanValue()).map(r -> converter.convert(r,ThemeStyleTo.class));
	}

	/**
	 * 
	 * @param page
	 * @param sort
	 * @param filters
	 */
	@Override
	public Page<ThemeStyleTo> findThemeStyles(PageInput page, SortInput sort, List<FilterInput> filters){
		return themestyleRepository.findByCriteria(ThemeStyleModel.class,filters,sort,page).map(r -> converter.convert(r,ThemeStyleTo.class));
	}

	/**
	 * 
	 * @param themestyle
	 */
	@Override @Transactional(readOnly = false)
	public ThemeStyleTo modifyThemeStyle(ThemeStyleInput themestyle){
		ThemeStyleModel target= themestyleRepository.findById(themestyle.getId()).orElseThrow(() -> new RuntimeException("Request not found")); 
		 ThemeStyleModel source= converter.convert(themestyle,ThemeStyleModel.class); 
		 Utils.copyNotNulls(source,target); 
		 return converter.convert(themestyleRepository.save(target), ThemeStyleTo.class);
	}

	/**
	 * 
	 * @param themestyleRepository
	 */
	@Autowired
	public ThemeStyleImpl(ThemeStyleRepository themestyleRepository){
		this.themestyleRepository =themestyleRepository;
	}

}