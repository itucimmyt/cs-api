///////////////////////////////////////////////////////////
//  WorkflowStatusTypeServiceImpl.java
//  Macromedia ActionScript Implementation of the Class WorkflowStatusTypeServiceImpl
//  Generated by Enterprise Architect
//  Created on:      09-Aug-2020 4:52:11 PM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.services;

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
import org.ebs.model.repos.WorkflowStatusRepository;
import org.ebs.model.repos.WorkflowStatusTypeRepository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Service;
import org.ebs.services.to.WorkflowStatusTypeTo;
import org.ebs.services.to.Input.WorkflowStatusTypeInput;
import org.ebs.model.WorkflowStatusTypeModel;
import org.ebs.services.to.WorkflowStatusTo;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 09-Aug-2020 4:52:11 PM
 */
@Service @Transactional(readOnly = true)
  class WorkflowStatusTypeServiceImpl implements WorkflowStatusTypeService {

	private WorkflowStatusTypeRepository workflowstatustypeRepository;
	private ConversionService converter;
	private WorkflowStatusRepository workflowstatusRepository;

	/**
	 * 
	 * @param WorkflowStatusType
	 */
	@Override @Transactional(readOnly = false)
	public WorkflowStatusTypeTo createWorkflowStatusType(WorkflowStatusTypeInput WorkflowStatusType){
		WorkflowStatusTypeModel model = converter.convert(WorkflowStatusType,WorkflowStatusTypeModel.class); 
		 model.setId(0);
		  
		 model= workflowstatustypeRepository.save(model); 
		 return converter.convert(model, WorkflowStatusTypeTo.class); 
	}

	/**
	 * 
	 * @param workflowstatustypeId
	 */
	@Override @Transactional(readOnly = false)
	public int deleteWorkflowStatusType(int workflowstatustypeId){
		WorkflowStatusTypeModel workflowstatustype = workflowstatustypeRepository.findById(workflowstatustypeId).orElseThrow(() -> new RuntimeException("WorkflowStatusType not found")); 
		 workflowstatustype.setDeleted(true); 
		  workflowstatustypeRepository.save(workflowstatustype); 
		 return workflowstatustypeId;
	}

	/**
	 * 
	 * @param workflowstatustypeId
	 */
	public Set<WorkflowStatusTo> findWorkflowStatuss(int workflowstatustypeId){
		return workflowstatusRepository.findByWorkflowstatustypeId(workflowstatustypeId).stream().map(e -> converter.convert(e,WorkflowStatusTo.class)).collect(Collectors.toSet());
	}

	/**
	 * 
	 * @param workflowstatustypeId
	 */
	@Override
	public Optional<WorkflowStatusTypeTo> findWorkflowStatusType(int workflowstatustypeId){
		if(workflowstatustypeId <1) 
		 {return Optional.empty();} 
		 return workflowstatustypeRepository.findById(workflowstatustypeId).filter(r -> !r.getDeleted().booleanValue()).map(r -> converter.convert(r,WorkflowStatusTypeTo.class));
	}

	/**
	 * 
	 * @param page
	 * @param sort
	 * @param filters
	 */
	@Override
	public Page<WorkflowStatusTypeTo> findWorkflowStatusTypes(PageInput page, SortInput sort, List<FilterInput> filters){
		return workflowstatustypeRepository.findByCriteria(WorkflowStatusTypeModel.class,filters,sort,page).map(r -> converter.convert(r,WorkflowStatusTypeTo.class));
	}

	/**
	 * 
	 * @param workflowstatustype
	 */
	@Override @Transactional(readOnly = false)
	public WorkflowStatusTypeTo modifyWorkflowStatusType(WorkflowStatusTypeInput workflowstatustype){
		WorkflowStatusTypeModel target= workflowstatustypeRepository.findById(workflowstatustype.getId()).orElseThrow(() -> new RuntimeException("WorkflowStatusType not found")); 
		 WorkflowStatusTypeModel source= converter.convert(workflowstatustype,WorkflowStatusTypeModel.class); 
		 Utils.copyNotNulls(source,target); 
		 return converter.convert(workflowstatustypeRepository.save(target), WorkflowStatusTypeTo.class);
	}

	/**
	 * 
	 * @param workflowstatusRepository
	 * @param converter
	 * @param workflowstatustypeRepository
	 */
	@Autowired
	public WorkflowStatusTypeServiceImpl(WorkflowStatusRepository workflowstatusRepository, ConversionService converter, WorkflowStatusTypeRepository workflowstatustypeRepository){
		this.workflowstatustypeRepository =workflowstatustypeRepository; 
		 this.converter = converter;
		 this.workflowstatusRepository = workflowstatusRepository;
	}

}