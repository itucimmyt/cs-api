///////////////////////////////////////////////////////////
//  PreferenceServiceImpl.java
//  Macromedia ActionScript Implementation of the Class PreferenceServiceImpl
//  Generated by Enterprise Architect
//  Created on:      13-Mar-2021 12:02:48 AM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.services;

import org.ebs.model.UserModel;
import org.ebs.model.repos.UserRepository;
import org.ebs.model.AlertModel;
import org.ebs.model.repos.AlertRepository;
import org.ebs.model.StyleThemeModel;
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
import org.ebs.services.to.PreferenceTo;
import org.ebs.services.to.Input.PreferenceInput;
import org.ebs.model.PreferenceModel;
import org.ebs.services.to.UserTo;
import org.ebs.services.to.AlertTo;
import org.ebs.services.to.StyleThemeTo;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 13-Mar-2021 12:02:48 AM
 */
@Service @Transactional(readOnly = true)
  class PreferenceServiceImpl implements PreferenceService {

	private PreferenceRepository preferenceRepository;
	private ConversionService converter;
	private UserRepository userRepository;
	private AlertRepository alertRepository;
	private StyleThemeRepository stylethemeRepository;

	/**
	 * 
	 * @param Preference
	 */
	@Override @Transactional(readOnly = false)
	public PreferenceTo createPreference(PreferenceInput Preference){
		PreferenceModel model = converter.convert(Preference,PreferenceModel.class); 
		 model.setId(0);
		 UserModel userModel = userRepository.findById(Preference.getUser().getId()).get(); 
		model.setUser(userModel); 
		AlertModel alertModel = alertRepository.findById(Preference.getAlert().getId()).get(); 
		model.setAlert(alertModel); 
		StyleThemeModel stylethemeModel = stylethemeRepository.findById(Preference.getStyletheme().getId()).get(); 
		model.setStyletheme(stylethemeModel); 
		 
		 model= preferenceRepository.save(model); 
		 return converter.convert(model, PreferenceTo.class); 
	}

	/**
	 * 
	 * @param preferenceId
	 */
	@Override @Transactional(readOnly = false)
	public int deletePreference(int preferenceId){
		PreferenceModel preference = preferenceRepository.findById(preferenceId).orElseThrow(() -> new RuntimeException("Preference not found")); 
		 preference.setDeleted(true); 
		  preferenceRepository.save(preference); 
		 return preferenceId;
	}

	/**
	 * 
	 * @param preferenceId
	 */
	public Optional<AlertTo> findAlert(int preferenceId){
		return preferenceRepository.findById(preferenceId).map(r -> converter.convert(r.getAlert(),AlertTo.class));
	}

	/**
	 * 
	 * @param preferenceId
	 */
	@Override
	public Optional<PreferenceTo> findPreference(int preferenceId){
		if(preferenceId <1) 
		 {return Optional.empty();} 
		 return preferenceRepository.findById(preferenceId).filter(r -> !r.getDeleted().booleanValue()).map(r -> converter.convert(r,PreferenceTo.class));
	}

	/**
	 * 
	 * @param page
	 * @param sort
	 * @param filters
	 */
	@Override
	public Page<PreferenceTo> findPreferences(PageInput page, SortInput sort, List<FilterInput> filters){
		return preferenceRepository.findByCriteria(PreferenceModel.class,filters,sort,page).map(r -> converter.convert(r,PreferenceTo.class));
	}

	/**
	 * 
	 * @param preferenceId
	 */
	public Optional<StyleThemeTo> findStyleTheme(int preferenceId){
		return preferenceRepository.findById(preferenceId).map(r -> converter.convert(r.getStyletheme(),StyleThemeTo.class));
	}

	/**
	 * 
	 * @param preferenceId
	 */
	public Optional<UserTo> findUser(int preferenceId){
		return preferenceRepository.findById(preferenceId).map(r -> converter.convert(r.getUser(),UserTo.class));
	}

	/**
	 * 
	 * @param preference
	 */
	@Override @Transactional(readOnly = false)
	public PreferenceTo modifyPreference(PreferenceInput preference){
		PreferenceModel target= preferenceRepository.findById(preference.getId()).orElseThrow(() -> new RuntimeException("Preference not found")); 
		 PreferenceModel source= converter.convert(preference,PreferenceModel.class); 
		 Utils.copyNotNulls(source,target); 
		 return converter.convert(preferenceRepository.save(target), PreferenceTo.class);
	}

	/**
	 * 
	 * @param stylethemeRepository
	 * @param alertRepository
	 * @param userRepository
	 * @param converter
	 * @param preferenceRepository
	 */
	@Autowired
	public PreferenceServiceImpl(StyleThemeRepository stylethemeRepository, AlertRepository alertRepository, UserRepository userRepository, ConversionService converter, PreferenceRepository preferenceRepository){
		this.preferenceRepository =preferenceRepository; 
		 this.converter = converter;
		 this.userRepository = userRepository;
		 this.alertRepository = alertRepository;
		 this.stylethemeRepository = stylethemeRepository;
	}

}