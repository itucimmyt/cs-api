///////////////////////////////////////////////////////////
//  ProcessResolver.java
//  Macromedia ActionScript Implementation of the Class ProcessResolver
//  Generated by Enterprise Architect
//  Created on:      20-Aug-2020 1:06:11 PM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.graphql.resolvers;

import com.coxautodev.graphql.tools.GraphQLResolver;
import org.ebs.services.to.ProcessTo;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import java.util.Set;
import org.ebs.services.ProcessService;
import org.ebs.services.to.WorkflowNodeTo;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 20-Aug-2020 1:06:11 PM
 */
@Component @Validated
public class ProcessResolver implements GraphQLResolver<ProcessTo> {

	private ProcessService processService;

	/**
	 * 
	 * @param process
	 */
	public Set<WorkflowNodeTo> getWorkflownodes(ProcessTo process){
		return processService.findWorkflowNodes(process.getId());
	}

	/**
	 * 
	 * @param processService
	 */
	@Autowired
	public ProcessResolver(ProcessService processService){
		this.processService = processService; 
	
	}

}