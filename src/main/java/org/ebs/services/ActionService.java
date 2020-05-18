///////////////////////////////////////////////////////////
//  ActionService.java
//  Macromedia ActionScript Implementation of the Interface ActionService
//  Generated by Enterprise Architect
//  Created on:      17-May-2020 3:09:10 PM
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
import org.ebs.model.repos.ActionRepository;
import org.ebs.services.to.ActionTo;
import org.ebs.services.to.Input.ActionInput;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 17-May-2020 3:09:10 PM
 */
public interface ActionService {

	/**
	 * 
	 * @param Action
	 */
	public ActionTo createAction(ActionInput Action);

	/**
	 * 
	 * @param idaction
	 */
	public int deleteAction(int idaction);

	/**
	 * 
	 * @param actionId
	 */
	public Optional<ActionTo> findAction(int actionId);

	/**
	 * 
	 * @param page
	 * @param sort
	 * @param filters
	 */
	public Page<ActionTo> findActions(PageInput page, SortInput sort, List<FilterInput> filters);

	/**
	 * 
	 * @param action
	 */
	public ActionTo modifyAction(ActionInput action);

}