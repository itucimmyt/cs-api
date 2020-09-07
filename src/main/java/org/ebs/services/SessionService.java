///////////////////////////////////////////////////////////
//  SessionService.java
//  Macromedia ActionScript Implementation of the Interface SessionService
//  Generated by Enterprise Architect
//  Created on:      07-Sep-2020 8:12:12 AM
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
 * @created 07-Sep-2020 8:12:12 AM
 */
public interface SessionService {

	/**
	 * 
	 * @param Session
	 */
	public SessionTo createSession(SessionInput Session);

	/**
	 * 
	 * @param sessionId
	 */
	public int deleteSession(int sessionId);

	/**
	 * 
	 * @param sessionId
	 */
	public Optional<InstanceTo> findInstance(int sessionId);

	/**
	 * 
	 * @param sessionId
	 */
	public Optional<SessionTo> findSession(int sessionId);

	/**
	 * 
	 * @param page
	 * @param sort
	 * @param filters
	 */
	public Page<SessionTo> findSessions(PageInput page, SortInput sort, List<FilterInput> filters);

	/**
	 * 
	 * @param sessionId
	 */
	public Optional<UserTo> findUser(int sessionId);

	/**
	 * 
	 * @param session
	 */
	public SessionTo modifySession(SessionInput session);

}