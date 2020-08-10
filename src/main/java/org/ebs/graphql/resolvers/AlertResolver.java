///////////////////////////////////////////////////////////
//  AlertResolver.java
//  Macromedia ActionScript Implementation of the Class AlertResolver
//  Generated by Enterprise Architect
//  Created on:      09-Aug-2020 4:50:09 PM
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
import org.ebs.services.to.HtmlTagTo;
import org.ebs.services.to.PreferenceTo;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 09-Aug-2020 4:50:09 PM
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
	 * @param alertTo
	 */
	public HtmlTagTo getHtmltag(AlertTo alertTo){
		return alertService.findHtmlTag(alertTo.getId()).get();
	}

	/**
	 * 
	 * @param alert
	 */
	public Set<PreferenceTo> getPreferences(AlertTo alert){
		return alertService.findPreferences(alert.getId());
	}

}