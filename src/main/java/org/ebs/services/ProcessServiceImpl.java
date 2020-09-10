///////////////////////////////////////////////////////////
//  ProcessServiceImpl.java
//  Macromedia ActionScript Implementation of the Class ProcessServiceImpl
//  Generated by Enterprise Architect
//  Created on:      10-Sep-2020 12:19:48 AM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.services;

import org.ebs.model.repos.ProcessRepository;
import org.ebs.model.repos.WorkflowNodeRepository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import java.util.Optional;
import org.ebs.util.FilterInput;
import org.ebs.util.PageInput;
import org.ebs.util.SortInput;
import org.ebs.util.Utils;
import org.springframework.core.convert.ConversionService;
import java.util.stream.Collectors;
import java.util.Set;
import org.ebs.model.ProcessModel;
import org.ebs.services.to.ProcessTo;
import org.ebs.services.to.Input.ProcessInput;
import org.ebs.services.to.WorkflowNodeTo;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 10-Sep-2020 12:19:48 AM
 */
@Service @Transactional(readOnly = true)
  class ProcessServiceImpl implements ProcessService {

	private ProcessRepository processRepository;
	private ConversionService converter;
	public WorkflowNodeRepository workflownodeRepository;

	/**
	 * 
	 * @param Process
	 */
	@Override @Transactional(readOnly = false)
	public ProcessTo createProcess(ProcessInput Process){
		ProcessModel model = converter.convert(Process,ProcessModel.class); 
		 model.setId(0);
		  
		 model= processRepository.save(model); 
		 return converter.convert(model, ProcessTo.class); 
	}

	/**
	 * 
	 * @param processId
	 */
	@Override @Transactional(readOnly = false)
	public int deleteProcess(int processId){
		ProcessModel process = processRepository.findById(processId).orElseThrow(() -> new RuntimeException("Process not found")); 
		 process.setDeleted(true); 
		  processRepository.save(process); 
		 return processId;
	}

	/**
	 * 
	 * @param processId
	 */
	@Override
	public Optional<ProcessTo> findProcess(int processId){
		if(processId <1) 
		 {return Optional.empty();} 
		 return processRepository.findById(processId).filter(r -> !r.getDeleted().booleanValue()).map(r -> converter.convert(r,ProcessTo.class));
	}

	/**
	 * 
	 * @param page
	 * @param sort
	 * @param filters
	 */
	@Override
	public Page<ProcessTo> findProcesss(PageInput page, SortInput sort, List<FilterInput> filters){
		return processRepository.findByCriteria(ProcessModel.class,filters,sort,page).map(r -> converter.convert(r,ProcessTo.class));
	}

	/**
	 * 
	 * @param processId
	 */
	public Set<WorkflowNodeTo> findWorkflowNodes(int processId){
		return workflownodeRepository.findByProcessId(processId).stream().map(e -> converter.convert(e,WorkflowNodeTo.class)).collect(Collectors.toSet());
	}

	/**
	 * 
	 * @param process
	 */
	@Override @Transactional(readOnly = false)
	public ProcessTo modifyProcess(ProcessInput process){
		ProcessModel target= processRepository.findById(process.getId()).orElseThrow(() -> new RuntimeException("Process not found")); 
		 ProcessModel source= converter.convert(process,ProcessModel.class); 
		 Utils.copyNotNulls(source,target); 
		 return converter.convert(processRepository.save(target), ProcessTo.class);
	}

	/**
	 * 
	 * @param workflownodeRepository
	 * @param converter
	 * @param processRepository
	 */
	@Autowired
	public ProcessServiceImpl(WorkflowNodeRepository workflownodeRepository, ConversionService converter, ProcessRepository processRepository){
		this.processRepository =processRepository; 
		 this.converter = converter;
		 this.workflownodeRepository = workflownodeRepository;
	}

}