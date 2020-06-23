///////////////////////////////////////////////////////////
//  PreferenceResolver.java
//  Macromedia ActionScript Implementation of the Class PreferenceResolver
//  Generated by Enterprise Architect
//  Created on:      15-Jun-2020 5:14:00 PM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.graphql.resolvers;

import com.coxautodev.graphql.tools.GraphQLResolver;
import org.ebs.services.to.PreferenceTo;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.ebs.services.PreferenceService;
import org.ebs.services.to.UserTo;
import org.ebs.services.to.AlertTo;
import org.ebs.services.to.StyleThemeTo;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 15-Jun-2020 5:14:00 PM
 */
@Component @Validated
public class PreferenceResolver implements GraphQLResolver<PreferenceTo> {

	private PreferenceService preferenceService;

	/**
	 * 
	 * @param preferenceTo
	 */
	public AlertTo getAlert(PreferenceTo preferenceTo){
		return preferenceService.findAlert(preferenceTo.getId()).get();
	}

	/**
	 * 
	 * @param preferenceTo
	 */
	public StyleThemeTo getStyletheme(PreferenceTo preferenceTo){
		return preferenceService.findStyleTheme(preferenceTo.getId()).get();
	}

	/**
	 * 
	 * @param preferenceTo
	 */
	public UserTo getUser(PreferenceTo preferenceTo){
		return preferenceService.findUser(preferenceTo.getId()).get();
	}

	/**
	 * 
	 * @param preferenceService
	 */
	@Autowired
	public PreferenceResolver(PreferenceService preferenceService){
		this.preferenceService = preferenceService; 
	
	}

}