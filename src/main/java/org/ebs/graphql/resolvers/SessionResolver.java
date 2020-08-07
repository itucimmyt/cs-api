///////////////////////////////////////////////////////////
//  SessionResolver.java
//  Macromedia ActionScript Implementation of the Class SessionResolver
//  Generated by Enterprise Architect
//  Created on:      07-Aug-2020 3:01:36 PM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.graphql.resolvers;

import com.coxautodev.graphql.tools.GraphQLResolver;
import org.ebs.services.to.SessionTo;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.ebs.services.SessionService;
import org.ebs.services.to.UserTo;
import org.ebs.services.to.InstanceTo;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 07-Aug-2020 3:01:36 PM
 */
@Component @Validated
public class SessionResolver implements GraphQLResolver<SessionTo> {

	private SessionService sessionService;

	/**
	 * 
	 * @param sessionTo
	 */
	public InstanceTo getInstance(SessionTo sessionTo){
		return sessionService.findInstance(sessionTo.getId()).get();
	}

	/**
	 * 
	 * @param sessionTo
	 */
	public UserTo getUser(SessionTo sessionTo){
		return sessionService.findUser(sessionTo.getId()).get();
	}

	/**
	 * 
	 * @param sessionService
	 */
	@Autowired
	public SessionResolver(SessionService sessionService){
		this.sessionService = sessionService; 
	
	}

}