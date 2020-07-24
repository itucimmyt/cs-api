///////////////////////////////////////////////////////////
//  AlertResolver.java
//  Macromedia ActionScript Implementation of the Class AlertResolver
//  Generated by Enterprise Architect
//  Created on:      23-Jul-2020 10:46:01 PM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.graphql.resolvers;

import com.coxautodev.graphql.tools.GraphQLResolver;
import org.ebs.services.to.AlertTo;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import java.util.Set;
import org.ebs.services.AlertService;
import org.ebs.services.to.AlertRuleTo;
import org.ebs.services.to.TranslationTo;
import org.ebs.services.to.PreferenceTo;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 23-Jul-2020 10:46:01 PM
 */
@Component @Validated
public class AlertResolver implements GraphQLResolver<AlertTo> {

	private AlertService alertService;

	/**
	 * 
	 * @param alertService
	 */
	@Autowired
	public AlertResolver(AlertService alertService){
		this.alertService = alertService; 
	
	}

	/**
	 * 
	 * @param alert
	 */
	public Set<AlertRuleTo> getAlertrules(AlertTo alert){
		return alertService.findAlertRules(alert.getId());
	}

	/**
	 * 
	 * @param alert
	 */
	public Set<PreferenceTo> getPreferences(AlertTo alert){
		return alertService.findPreferences(alert.getId());
	}

	/**
	 * 
	 * @param alert
	 */
	public Set<TranslationTo> getTranslations(AlertTo alert){
		return alertService.findTranslations(alert.getId());
	}

}