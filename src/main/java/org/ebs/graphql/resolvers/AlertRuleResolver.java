///////////////////////////////////////////////////////////
//  AlertRuleResolver.java
//  Macromedia ActionScript Implementation of the Class AlertRuleResolver
//  Generated by Enterprise Architect
//  Created on:      15-Jun-2020 5:13:08 PM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.graphql.resolvers;

import org.ebs.services.to.AlertRuleTo;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.ebs.services.AlertRuleService;
import org.ebs.services.to.AlertTo;
import com.coxautodev.graphql.tools.GraphQLResolver;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 15-Jun-2020 5:13:08 PM
 */
@Component @Validated
public class AlertRuleResolver implements GraphQLResolver<AlertRuleTo> {

	private AlertRuleService alertruleService;

	/**
	 * 
	 * @param alertruleService
	 */
	@Autowired
	public AlertRuleResolver(AlertRuleService alertruleService){
		this.alertruleService = alertruleService; 
	
	}

	/**
	 * 
	 * @param alertruleTo
	 */
	public AlertTo getAlert(AlertRuleTo alertruleTo){
		return alertruleService.findAlert(alertruleTo.getId()).get();
	}

}