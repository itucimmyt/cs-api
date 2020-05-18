///////////////////////////////////////////////////////////
//  PreferenceImpl.java
//  Macromedia ActionScript Implementation of the Class PreferenceImpl
//  Generated by Enterprise Architect
//  Created on:      17-May-2020 3:09:57 PM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.services;

import org.ebs.model.UserModel;
import org.ebs.model.repos.UserRepository;
import org.ebs.model.AlertModel;
import org.ebs.model.repos.AlertRepository;
import org.ebs.model.StyleThemeModel;
import org.ebs.model.repos.StyleThemeRepository;
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
import org.ebs.services.to.PreferenceTo;
import org.ebs.services.to.Input.PreferenceInput;
import org.ebs.model.PreferenceModel;
import org.ebs.model.repos.PreferenceRepository;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 17-May-2020 3:09:57 PM
 */
@Service @Transactional(readOnly = true)
public class PreferenceImpl implements PreferenceService {

	private PreferenceRepository preferenceRepository;
	@Autowired
	private ConversionService converter;
	@Autowired
	private UserRepository userRepository;
	@Autowired
	private AlertRepository alertRepository;
	@Autowired
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
		StyleThemeModel stylethemeModel = stylethemeRepository.findById(Preference.getStyleTheme().getId()).get(); 
		model.setStyleTheme(stylethemeModel); 
		 
		 model= preferenceRepository.save(model); 
		 return converter.convert(model, PreferenceTo.class); 
	}

	/**
	 * 
	 * @param idpreference
	 */
	@Override @Transactional(readOnly = false)
	public int deletePreference(int idpreference){
		PreferenceModel preference = preferenceRepository.findById(idpreference).orElseThrow(() -> new RuntimeException("Request not found")); 
		 preference.setDeleted(true); 
		  preferenceRepository.save(preference); 
		 return idpreference;
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
	 * @param preference
	 */
	@Override @Transactional(readOnly = false)
	public PreferenceTo modifyPreference(PreferenceInput preference){
		PreferenceModel target= preferenceRepository.findById(preference.getId()).orElseThrow(() -> new RuntimeException("Request not found")); 
		 PreferenceModel source= converter.convert(preference,PreferenceModel.class); 
		 Utils.copyNotNulls(source,target); 
		 return converter.convert(preferenceRepository.save(target), PreferenceTo.class);
	}

	/**
	 * 
	 * @param preferenceRepository
	 */
	@Autowired
	public PreferenceImpl(PreferenceRepository preferenceRepository){
		this.preferenceRepository =preferenceRepository;
	}

}