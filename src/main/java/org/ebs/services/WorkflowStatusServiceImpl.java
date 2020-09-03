///////////////////////////////////////////////////////////
//  WorkflowStatusServiceImpl.java
//  Macromedia ActionScript Implementation of the Class WorkflowStatusServiceImpl
//  Generated by Enterprise Architect
//  Created on:      09-Aug-2020 4:52:10 PM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.services;

import java.util.List;
import java.util.Optional;

import org.ebs.model.WorkflowInstanceModel;
import org.ebs.model.WorkflowStatusModel;
import org.ebs.model.WorkflowStatusTypeModel;
import org.ebs.model.repos.WorkflowInstanceRepository;
import org.ebs.model.repos.WorkflowStatusRepository;
import org.ebs.model.repos.WorkflowStatusTypeRepository;
import org.ebs.services.to.WorkflowInstanceTo;
import org.ebs.services.to.WorkflowStatusTo;
import org.ebs.services.to.WorkflowStatusTypeTo;
import org.ebs.services.to.Input.WorkflowStatusInput;
import org.ebs.util.FilterInput;
import org.ebs.util.PageInput;
import org.ebs.util.SortInput;
import org.ebs.util.Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.ConversionService;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 09-Aug-2020 4:52:10 PM
 */
@Service @Transactional(readOnly = true)
  class WorkflowStatusServiceImpl implements WorkflowStatusService {

	private WorkflowStatusRepository workflowstatusRepository;
	private ConversionService converter;
	private WorkflowInstanceRepository workflowinstanceRepository;
	public WorkflowStatusTypeRepository workflowstatustypeRepository;

	/**
	 * 
	 * @param workflowStatus
	 */
	@Override @Transactional(readOnly = false)
	public WorkflowStatusTo createWorkflowStatus(WorkflowStatusInput workflowStatus){
		WorkflowStatusModel model = converter.convert(workflowStatus,WorkflowStatusModel.class); 
		model.setId(0);
		initWorkflowStatus(workflowStatus, model);
		 
		model = workflowstatusRepository.save(model); 
		return converter.convert(model, WorkflowStatusTo.class); 
	}

	void initWorkflowStatus(WorkflowStatusInput input, WorkflowStatusModel model) {
		Optional<WorkflowStatusInput> optInput = Optional.of(input);
		WorkflowInstanceModel wfInstance = optInput.map(i -> i.getworkflowinstance())
			.map(i -> workflowinstanceRepository.findById(i.getId())
				.orElseThrow(() -> new RuntimeException("workflowinstance does not exist")))
			.orElse(null);
		model.setworkflowinstance(wfInstance);

		WorkflowStatusTypeModel wfStatusType = optInput.map(i -> i.getworkflowstatustype())
			.map(i -> workflowstatustypeRepository.findById(i.getId())
				.orElseThrow(() -> new RuntimeException("workflowstatustype does not exist")))
			.orElse(null);
		model.setworkflowstatustype(wfStatusType);;
	}

	/**
	 * 
	 * @param workflowstatusId
	 */
	@Override @Transactional(readOnly = false)
	public int deleteWorkflowStatus(int workflowstatusId){
		WorkflowStatusModel workflowstatus = workflowstatusRepository.findById(workflowstatusId).orElseThrow(() -> new RuntimeException("WorkflowStatus not found")); 
		 workflowstatus.setDeleted(true); 
		  workflowstatusRepository.save(workflowstatus); 
		 return workflowstatusId;
	}

	/**
	 * 
	 * @param workflowstatusId
	 */
	public Optional<WorkflowInstanceTo> findWorkflowInstance(int workflowstatusId){
		return workflowstatusRepository.findById(workflowstatusId).map(r -> converter.convert(r.getworkflowinstance(),WorkflowInstanceTo.class));
	}

	/**
	 * 
	 * @param workflowstatusId
	 */
	@Override
	public Optional<WorkflowStatusTo> findWorkflowStatus(int workflowstatusId){
		if(workflowstatusId <1) 
		 {return Optional.empty();} 
		 return workflowstatusRepository.findById(workflowstatusId).filter(r -> !r.getDeleted().booleanValue()).map(r -> converter.convert(r,WorkflowStatusTo.class));
	}

	/**
	 * 
	 * @param page
	 * @param sort
	 * @param filters
	 */
	@Override
	public Page<WorkflowStatusTo> findWorkflowStatuss(PageInput page, SortInput sort, List<FilterInput> filters){
		return workflowstatusRepository.findByCriteria(WorkflowStatusModel.class,filters,sort,page).map(r -> converter.convert(r,WorkflowStatusTo.class));
	}

	/**
	 * 
	 * @param workflowstatusId
	 */
	public Optional<WorkflowStatusTypeTo> findWorkflowStatusType(int workflowstatusId){
		return workflowstatusRepository.findById(workflowstatusId).map(r -> converter.convert(r.getworkflowstatustype(),WorkflowStatusTypeTo.class));
	}

	/**
	 * 
	 * @param workflowstatus
	 */
	@Override @Transactional(readOnly = false)
	public WorkflowStatusTo modifyWorkflowStatus(WorkflowStatusInput workflowstatus){
		WorkflowStatusModel target= workflowstatusRepository.findById(workflowstatus.getId())
			.orElseThrow(() -> new RuntimeException("WorkflowStatus not found")); 
		WorkflowStatusModel source= converter.convert(workflowstatus,WorkflowStatusModel.class); 
		
		initWorkflowStatus(workflowstatus, source);
		Utils.copyNotNulls(source,target);
		 return converter.convert(workflowstatusRepository.save(target), WorkflowStatusTo.class);
	}

	/**
	 * 
	 * @param workflowinstanceRepository
	 * @param workflowstatustypeRepository
	 * @param converter
	 * @param workflowstatusRepository
	 */
	@Autowired
	public WorkflowStatusServiceImpl(WorkflowInstanceRepository workflowinstanceRepository, WorkflowStatusTypeRepository workflowstatustypeRepository, ConversionService converter, WorkflowStatusRepository workflowstatusRepository){
		this.workflowstatusRepository =workflowstatusRepository; 
		 this.converter = converter;
		 this.workflowstatustypeRepository = workflowstatustypeRepository;
		 this.workflowinstanceRepository = workflowinstanceRepository;
	}

}