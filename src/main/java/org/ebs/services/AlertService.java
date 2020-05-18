///////////////////////////////////////////////////////////
//  AlertService.java
//  Macromedia ActionScript Implementation of the Interface AlertService
//  Generated by Enterprise Architect
//  Created on:      17-May-2020 3:09:14 PM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.services;

import java.util.List;
import java.util.Optional;
import org.ebs.util.FilterInput;
import org.ebs.util.PageInput;
import org.ebs.util.SortInput;
import org.springframework.data.domain.Page;
import org.ebs.util.Utils;
import org.ebs.model.repos.AlertRepository;
import org.ebs.services.to.AlertTo;
import org.ebs.services.to.Input.AlertInput;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 17-May-2020 3:09:14 PM
 */
public interface AlertService {

	/**
	 * 
	 * @param Alert
	 */
	public AlertTo createAlert(AlertInput Alert);

	/**
	 * 
	 * @param idalert
	 */
	public int deleteAlert(int idalert);

	/**
	 * 
	 * @param alertId
	 */
	public Optional<AlertTo> findAlert(int alertId);

	/**
	 * 
	 * @param page
	 * @param sort
	 * @param filters
	 */
	public Page<AlertTo> findAlerts(PageInput page, SortInput sort, List<FilterInput> filters);

	/**
	 * 
	 * @param alert
	 */
	public AlertTo modifyAlert(AlertInput alert);

}