///////////////////////////////////////////////////////////
//  CollaboratorResolver.java
//  Macromedia ActionScript Implementation of the Class CollaboratorResolver
//  Generated by Enterprise Architect
//  Created on:      10-Sep-2020 10:43:27 PM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.graphql.resolvers;

import com.coxautodev.graphql.tools.GraphQLResolver;
import org.ebs.services.to.CollaboratorTo;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.ebs.services.CollaboratorService;
import org.ebs.services.to.PersonTo;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 10-Sep-2020 10:43:27 PM
 */
@Component @Validated
public class CollaboratorResolver implements GraphQLResolver<CollaboratorTo> {

	private CollaboratorService collaboratorService;

	/**
	 * 
	 * @param collaboratorService
	 */
	@Autowired
	public CollaboratorResolver(CollaboratorService collaboratorService){
		this.collaboratorService = collaboratorService; 
	
	}

	/**
	 * 
	 * @param collaboratorTo
	 */
	public PersonTo getPerson(CollaboratorTo collaboratorTo){
		return collaboratorService.findPerson(collaboratorTo.getId()).get();
	}

}