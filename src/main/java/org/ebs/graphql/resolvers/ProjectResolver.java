///////////////////////////////////////////////////////////
//  ProjectResolver.java
//  Macromedia ActionScript Implementation of the Class ProjectResolver
//  Generated by Enterprise Architect
//  Created on:      10-Sep-2020 12:19:51 AM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.graphql.resolvers;

import com.coxautodev.graphql.tools.GraphQLResolver;
import org.ebs.services.to.ProjectTo;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.ebs.services.ProjectService;
import org.ebs.services.to.ProgramTo;
import org.ebs.services.to.PersonTo;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 10-Sep-2020 12:19:51 AM
 */
@Component @Validated
public class ProjectResolver implements GraphQLResolver<ProjectTo> {

	private ProjectService projectService;

	/**
	 * 
	 * @param projectTo
	 */
	public PersonTo getPerson(ProjectTo projectTo){
		return projectService.findPerson(projectTo.getId()).get();
	}

	/**
	 * 
	 * @param projectTo
	 */
	public ProgramTo getProgram(ProjectTo projectTo){
		return projectService.findProgram(projectTo.getId()).get();
	}

	/**
	 * 
	 * @param projectService
	 */
	@Autowired
	public ProjectResolver(ProjectService projectService){
		this.projectService = projectService; 
	
	}

}