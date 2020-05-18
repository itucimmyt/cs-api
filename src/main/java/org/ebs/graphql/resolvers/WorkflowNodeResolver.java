///////////////////////////////////////////////////////////
//  WorkflowNodeResolver.java
//  Macromedia ActionScript Implementation of the Class WorkflowNodeResolver
//  Generated by Enterprise Architect
//  Created on:      17-May-2020 3:10:36 PM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.graphql.resolvers;

import com.coxautodev.graphql.tools.GraphQLResolver;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import java.util.stream.Collectors;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import org.springframework.core.convert.ConversionService;
import org.ebs.model.WorkflowNodeModel;
import org.ebs.services.to.WorkflowNodeTo;
import org.ebs.model.repos.WorkflowNodeRepository;
import org.ebs.services.WorkflowNodeService;
import org.ebs.services.WorkflowService;
import org.ebs.model.repos.WorkflowRepository;
import org.ebs.services.to.WorkflowTo;
import org.ebs.model.repos.ProcessRepository;
import org.ebs.services.ProcessService;
import org.ebs.services.to.ProcessTo;
import org.ebs.model.repos.ModuleRepository;
import org.ebs.services.ModuleService;
import org.ebs.services.to.ModuleTo;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 17-May-2020 3:10:36 PM
 */
@Component @Validated
public class WorkflowNodeResolver implements GraphQLResolver<WorkflowNodeTo> {

	private WorkflowNodeService workflownodeService;
	private WorkflowNodeRepository workflownodeRepository;
	@Autowired
	private ConversionService converter;
	private WorkflowService workflowService;
	private WorkflowRepository workflowRepository;
	private ProcessService processService;
	private ProcessRepository processRepository;
	private ModuleService moduleService;
	private ModuleRepository moduleRepository;

	/**
	 * 
	 * @param workflownodeTo
	 */
	public Set<ModuleTo> getModules(WorkflowNodeTo workflownodeTo){
		return moduleRepository.findByWorkflownodeId(workflownodeTo.getId()).stream() 
		 .map(e -> converter.convert(e,ModuleTo.class)) 
		 .collect(Collectors.toSet());
	}

	/**
	 * 
	 * @param workflownodeTo
	 */
	public Set<ProcessTo> getProcesss(WorkflowNodeTo workflownodeTo){
		return processRepository.findByWorkflownodeId(workflownodeTo.getId()).stream() 
		 .map(e -> converter.convert(e,ProcessTo.class)) 
		 .collect(Collectors.toSet());
	}

	/**
	 * 
	 * @param workflownodeTo
	 */
	public WorkflowTo getWorkflow(WorkflowNodeTo workflownodeTo){
		WorkflowNodeModel workflownodeModel = workflownodeRepository.findById(workflownodeTo.getId()).get(); 
		 return workflowService.findWorkflow(workflownodeModel.getWorkflow().getId()).get();
	}

	/**
	 * 
	 * @param workflownodeTo
	 */
	public Set<WorkflowTo> getWorkflows(WorkflowNodeTo workflownodeTo){
		return workflowRepository.findByWorkflownodeId(workflownodeTo.getId()).stream() 
		 .map(e -> converter.convert(e,WorkflowTo.class)) 
		 .collect(Collectors.toSet());
	}

	/**
	 * 
	 * @param moduleRepository
	 * @param moduleService
	 * @param processRepository
	 * @param processService
	 * @param workflowRepository
	 * @param workflowService
	 * @param workflownodeRepository
	 * @param workflownodeService
	 */
	@Autowired
	public WorkflowNodeResolver(ModuleRepository moduleRepository, ModuleService moduleService, ProcessRepository processRepository, ProcessService processService, WorkflowRepository workflowRepository, WorkflowService workflowService, WorkflowNodeRepository workflownodeRepository, WorkflowNodeService workflownodeService){
		this.workflownodeService = workflownodeService; 
		this.workflownodeRepository = workflownodeRepository; 
		this.workflowService = workflowService; 
		this.workflowRepository = workflowRepository; 
		this.workflowService = workflowService; 
		this.workflowRepository = workflowRepository; 
		this.processService = processService; 
		this.processRepository = processRepository; 
		this.moduleService = moduleService; 
		this.moduleRepository = moduleRepository; 
	
	}

}