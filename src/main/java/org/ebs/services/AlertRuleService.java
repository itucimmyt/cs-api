///////////////////////////////////////////////////////////
//  AlertRuleService.java
//  Macromedia ActionScript Implementation of the Interface AlertRuleService
//  Generated by Enterprise Architect
//  Created on:      13-Mar-2021 12:02:20 AM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.services;

import java.util.List;
import java.util.Optional;
import org.ebs.util.FilterInput;
import org.ebs.util.PageInput;
import org.ebs.util.SortInput;
import org.springframework.data.domain.Page;
import org.ebs.services.to.AlertRuleTo;
import org.ebs.services.to.Input.AlertRuleInput;
import org.ebs.services.to.AlertTo;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 13-Mar-2021 12:02:20 AM
 */
public interface AlertRuleService {

	/**
	 * 
	 * @param AlertRule
	 */
	public AlertRuleTo createAlertRule(AlertRuleInput AlertRule);

	/**
	 * 
	 * @param alertRuleId
	 */
	public int deleteAlertRule(int alertRuleId);

	/**
	 * 
	 * @param alertruleId
	 */
	public Optional<AlertTo> findAlert(int alertruleId);

	/**
	 * 
	 * @param alertRuleId
	 */
	public Optional<AlertRuleTo> findAlertRule(int alertRuleId);

	/**
	 * 
	 * @param page
	 * @param sort
	 * @param filters
	 */
	public Page<AlertRuleTo> findAlertRules(PageInput page, SortInput sort, List<FilterInput> filters);

	/**
	 * 
	 * @param alertRule
	 */
	public AlertRuleTo modifyAlertRule(AlertRuleInput alertRule);

}