///////////////////////////////////////////////////////////
//  ProcessResolver.java
//  Macromedia ActionScript Implementation of the Class ProcessResolver
//  Generated by Enterprise Architect
//  Created on:      02-May-2021 6:19:57 AM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.graphql.resolvers;

import com.coxautodev.graphql.tools.GraphQLResolver;
import org.ebs.services.to.ProcessTo;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.ebs.services.ProcessService;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 02-May-2021 6:19:57 AM
 */
@Component @Validated
public class ProcessResolver implements GraphQLResolver<ProcessTo> {

	private ProcessService processService;

	/**
	 * 
	 * @param processService
	 */
	@Autowired
	public ProcessResolver(ProcessService processService){
		this.processService = processService; 
	
	}

}