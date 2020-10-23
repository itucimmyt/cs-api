///////////////////////////////////////////////////////////
//  AlertService.java
//  Macromedia ActionScript Implementation of the Interface AlertService
//  Generated by Enterprise Architect
//  Created on:      04-Sep-2020 10:04:37 AM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.services;

import java.util.List;
import java.util.Optional;
import org.ebs.util.FilterInput;
import org.ebs.util.PageInput;
import org.ebs.util.SortInput;
import org.springframework.data.domain.Page;
import java.util.Set;
import org.ebs.services.to.AlertTo;
import org.ebs.services.to.Input.AlertInput;
import org.ebs.services.to.HtmlTagTo;
import org.ebs.services.to.PreferenceTo;
import org.ebs.services.to.AlertRuleTo;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 04-Sep-2020 10:04:37 AM
 */
public interface AlertService {

	/**
	 *
	 * @param Alert
	 */
	public AlertTo createalert(AlertInput Alert);

	/**
	 *
	 * @param alertId
	 */
	public int deletealert(int alertId);

	/**
	 *
	 * @param alertId
	 */
	public Optional<AlertTo> findalert(int alertId);

	/**
	 *
	 * @param alertId
	 */
	public Set<AlertRuleTo> findalertrules(int alertId);

	/**
	 *
	 * @param page
	 * @param sort
	 * @param filters
	 */
	public Page<AlertTo> findalerts(PageInput page, SortInput sort, List<FilterInput> filters, boolean disjunctionFilters);

	/**
	 *
	 * @param alertId
	 */
	public Optional<HtmlTagTo> findhtmltag(int alertId);

	/**
	 *
	 * @param alertId
	 */
	public Set<PreferenceTo> findpreferences(int alertId);

	/**
	 *
	 * @param alert
	 */
	public AlertTo modifyalert(AlertInput alert);

}