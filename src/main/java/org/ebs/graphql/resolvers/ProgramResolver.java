///////////////////////////////////////////////////////////
//  ProgramResolver.java
//  Macromedia ActionScript Implementation of the Class ProgramResolver
//  Generated by Enterprise Architect
//  Created on:      23-Jul-2020 10:46:55 PM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.graphql.resolvers;

import com.coxautodev.graphql.tools.GraphQLResolver;
import org.ebs.services.to.ProgramTo;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import java.util.Set;
import org.ebs.services.ProgramService;
import org.ebs.services.to.ProjectTo;
import org.ebs.services.to.TenantTo;
import org.ebs.services.to.CropTo;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 23-Jul-2020 10:46:55 PM
 */
@Component @Validated
public class ProgramResolver implements GraphQLResolver<ProgramTo> {

	private ProgramService programService;

	/**
	 * 
	 * @param programTo
	 */
	public CropTo getCrop(ProgramTo programTo){
		return programService.findCrop(programTo.getId()).get();
	}

	/**
	 * 
	 * @param program
	 */
	public Set<ProjectTo> getProjects(ProgramTo program){
		return programService.findProjects(program.getId());
	}

	/**
	 * 
	 * @param programTo
	 */
	public TenantTo getTenant(ProgramTo programTo){
		return programService.findTenant(programTo.getId()).get();
	}

	/**
	 * 
	 * @param programService
	 */
	@Autowired
	public ProgramResolver(ProgramService programService){
		this.programService = programService; 
	
	}

}