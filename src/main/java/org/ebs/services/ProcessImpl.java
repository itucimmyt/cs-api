///////////////////////////////////////////////////////////
//  ProcessImpl.java
//  Macromedia ActionScript Implementation of the Class ProcessImpl
//  Generated by Enterprise Architect
//  Created on:      28-Apr-2020 12:07:10 AM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.services;

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
import org.ebs.services.to.ProcessTo;
import org.ebs.services.to.Input.ProcessInput;
import org.ebs.model.ProcessModel;
import org.ebs.model.repos.ProcessRepository;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 28-Apr-2020 12:07:10 AM
 */
@Service @Transactional(readOnly = true)
public class ProcessImpl implements ProcessService {

	private ProcessRepository processRepository;
	@Autowired
	private ConversionService converter;

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
	 * @param idprocess
	 */
	@Override @Transactional(readOnly = false)
	public int deleteProcess(int idprocess){
		ProcessModel process = processRepository.findById(idprocess).orElseThrow(() -> new RuntimeException("Request not found")); 
		 process.setDeleted(true); 
		  processRepository.save(process); 
		 return idprocess;
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
	 * @param process
	 */
	@Override @Transactional(readOnly = false)
	public ProcessTo modifyProcess(ProcessInput process){
		ProcessModel target= processRepository.findById(process.getId()).orElseThrow(() -> new RuntimeException("Request not found")); 
		 ProcessModel source= converter.convert(process,ProcessModel.class); 
		 Utils.copyNotNulls(source,target); 
		 return converter.convert(processRepository.save(target), ProcessTo.class);
	}

	/**
	 * 
	 * @param processRepository
	 */
	@Autowired
	public ProcessImpl(ProcessRepository processRepository){
		this.processRepository =processRepository;
	}

}