///////////////////////////////////////////////////////////
//  SessionService.java
//  Macromedia ActionScript Implementation of the Interface SessionService
//  Generated by Enterprise Architect
//  Created on:      04-Sep-2020 10:06:08 AM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.services;

import java.util.List;
import java.util.Optional;
import org.ebs.util.FilterInput;
import org.ebs.util.PageInput;
import org.ebs.util.SortInput;
import org.springframework.data.domain.Page;
import org.ebs.services.to.SessionTo;
import org.ebs.services.to.Input.SessionInput;
import org.ebs.services.to.UserTo;
import org.ebs.services.to.InstanceTo;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 04-Sep-2020 10:06:08 AM
 */
public interface SessionService {

	/**
	 *
	 * @param Session
	 */
	public SessionTo createsession(SessionInput Session);

	/**
	 *
	 * @param sessionId
	 */
	public int deletesession(int sessionId);

	/**
	 *
	 * @param sessionId
	 */
	public Optional<InstanceTo> findinstance(int sessionId);

	/**
	 *
	 * @param sessionId
	 */
	public Optional<SessionTo> findsession(int sessionId);

	/**
	 *
	 * @param page
	 * @param sort
	 * @param filters
	 */
	public Page<SessionTo> findsessions(PageInput page, SortInput sort, List<FilterInput> filters, boolean disjunctionFilters);

	/**
	 *
	 * @param sessionId
	 */
	public Optional<UserTo> finduser(int sessionId);

	/**
	 *
	 * @param session
	 */
	public SessionTo modifysession(SessionInput session);

}