///////////////////////////////////////////////////////////
//  PreferenceResolver.java
//  Macromedia ActionScript Implementation of the Class PreferenceResolver
//  Generated by Enterprise Architect
//  Created on:      17-May-2020 3:09:58 PM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.graphql.resolvers;

import org.ebs.model.PreferenceModel;
import org.ebs.model.repos.AlertRepository;
import org.ebs.model.repos.PreferenceRepository;
import org.ebs.model.repos.StyleThemeRepository;
import org.ebs.model.repos.UserRepository;
import org.ebs.services.AlertService;
import org.ebs.services.PreferenceService;
import org.ebs.services.StyleThemeService;
import org.ebs.services.UserService;
import org.ebs.services.to.AlertTo;
import org.ebs.services.to.PreferenceTo;
import org.ebs.services.to.StyleThemeTo;
import org.ebs.services.to.UserTo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.ConversionService;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import com.coxautodev.graphql.tools.GraphQLResolver;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 17-May-2020 3:09:58 PM
 */
@Component @Validated
public class PreferenceResolver implements GraphQLResolver<PreferenceTo> {

	private PreferenceService preferenceService;
	private PreferenceRepository preferenceRepository;
	@Autowired
	private ConversionService converter;
	private UserService userService;
	private UserRepository userRepository;
	private AlertService alertService;
	private AlertRepository alertRepository;
	private StyleThemeService stylethemeService;
	private StyleThemeRepository stylethemeRepository;

	/**
	 * 
	 * @param preferenceTo
	 */
	public AlertTo getAlert(PreferenceTo preferenceTo){
		PreferenceModel preferenceModel = preferenceRepository.findById(preferenceTo.getId()).get(); 
		 return alertService.findAlert(preferenceModel.getAlert().getId()).get();
	}

	/**
	 * 
	 * @param preferenceTo
	 */
	public StyleThemeTo getStyleTheme(PreferenceTo preferenceTo){
		PreferenceModel preferenceModel = preferenceRepository.findById(preferenceTo.getId()).get(); 
		 return stylethemeService.findStyleTheme(preferenceModel.getStyleTheme().getId()).get();
	}

	/**
	 * 
	 * @param preferenceTo
	 */
	public UserTo getUser(PreferenceTo preferenceTo){
		PreferenceModel preferenceModel = preferenceRepository.findById(preferenceTo.getId()).get(); 
		 return userService.findUser(preferenceModel.getUser().getId()).get();
	}

	/**
	 * 
	 * @param stylethemeRepository
	 * @param stylethemeService
	 * @param alertRepository
	 * @param alertService
	 * @param userRepository
	 * @param userService
	 * @param preferenceRepository
	 * @param preferenceService
	 */
	@Autowired
	public PreferenceResolver(StyleThemeRepository stylethemeRepository, StyleThemeService stylethemeService, AlertRepository alertRepository, AlertService alertService, UserRepository userRepository, UserService userService, PreferenceRepository preferenceRepository, PreferenceService preferenceService){
		this.preferenceService = preferenceService; 
		this.preferenceRepository = preferenceRepository; 
		this.userService = userService; 
		this.userRepository = userRepository; 
		this.alertService = alertService; 
		this.alertRepository = alertRepository; 
		this.stylethemeService = stylethemeService; 
		this.stylethemeRepository = stylethemeRepository; 
	
	}

}