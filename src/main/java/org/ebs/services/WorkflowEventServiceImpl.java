///////////////////////////////////////////////////////////
//  WorkflowEventServiceImpl.java
//  Macromedia ActionScript Implementation of the Class WorkflowEventServiceImpl
//  Generated by Enterprise Architect
//  Created on:      10-Sep-2020 12:20:45 AM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.services;

import org.ebs.model.WorkflowStageModel;
import org.ebs.model.repos.WorkflowStageRepository;
import org.ebs.model.WorkflowInstanceModel;
import org.ebs.model.repos.WorkflowInstanceRepository;
import org.ebs.model.WorkflowNodeModel;
import org.ebs.model.repos.WorkflowNodeRepository;
import org.ebs.model.repos.WorkflowEventRepository;
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
import org.ebs.services.to.WorkflowEventTo;
import org.ebs.services.to.Input.WorkflowEventInput;
import org.ebs.model.WorkflowEventModel;
import org.ebs.services.to.WorkflowStageTo;
import org.ebs.services.to.WorkflowInstanceTo;
import org.ebs.services.to.WorkflowNodeTo;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 10-Sep-2020 12:20:45 AM
 */
@Service @Transactional(readOnly = true)
  class WorkflowEventServiceImpl implements WorkflowEventService {

	private WorkflowEventRepository workflowEventRepository;
	private ConversionService converter;
	private WorkflowStageRepository workflowstageRepository;
	private WorkflowInstanceRepository workflowinstanceRepository;
	private WorkflowNodeRepository workflownodeRepository;
	public WorkflowEventRepository workfloweventRepository;

	/**
	 * 
	 * @param WorkflowEvent
	 */
	@Override @Transactional(readOnly = false)
	public WorkflowEventTo createWorkflowEvent(WorkflowEventInput WorkflowEvent){
		WorkflowEventModel model = converter.convert(WorkflowEvent,WorkflowEventModel.class); 
		 model.setId(0);
		 WorkflowStageModel workflowstageModel = workflowstageRepository.findById(WorkflowEvent.getWorkflowstage().getId()).get(); 
		model.setWorkflowstage(workflowstageModel); 
		WorkflowInstanceModel workflowinstanceModel = workflowinstanceRepository.findById(WorkflowEvent.getWorkflowinstance().getId()).get(); 
		model.setWorkflowinstance(workflowinstanceModel); 
		WorkflowNodeModel workflownodeModel = workflownodeRepository.findById(WorkflowEvent.getWorkflownode().getId()).get(); 
		model.setWorkflownode(workflownodeModel); 
		 
		 model= workflowEventRepository.save(model); 
		 return converter.convert(model, WorkflowEventTo.class); 
	}

	/**
	 * 
	 * @param workflowEventId
	 */
	@Override @Transactional(readOnly = false)
	public int deleteWorkflowEvent(int workflowEventId){
		WorkflowEventModel workflowEvent = workflowEventRepository.findById(workflowEventId).orElseThrow(() -> new RuntimeException("WorkflowEvent not found")); 
		 workflowEvent.setDeleted(true); 
		  workflowEventRepository.save(workflowEvent); 
		 return workflowEventId;
	}

	/**
	 * 
	 * @param workflowEventId
	 */
	@Override
	public Optional<WorkflowEventTo> findWorkflowEvent(int workflowEventId){
		if(workflowEventId <1) 
		 {return Optional.empty();} 
		 return workflowEventRepository.findById(workflowEventId).filter(r -> !r.getDeleted().booleanValue()).map(r -> converter.convert(r,WorkflowEventTo.class));
	}

	/**
	 * 
	 * @param page
	 * @param sort
	 * @param filters
	 */
	@Override
	public Page<WorkflowEventTo> findWorkflowEvents(PageInput page, SortInput sort, List<FilterInput> filters){
		return workflowEventRepository.findByCriteria(WorkflowEventModel.class,filters,sort,page).map(r -> converter.convert(r,WorkflowEventTo.class));
	}

	/**
	 * 
	 * @param workfloweventId
	 */
	public Optional<WorkflowInstanceTo> findWorkflowInstance(int workfloweventId){
		return workfloweventRepository.findById(workfloweventId).map(r -> converter.convert(r.getWorkflowinstance(),WorkflowInstanceTo.class));
	}

	/**
	 * 
	 * @param workfloweventId
	 */
	public Optional<WorkflowNodeTo> findWorkflowNode(int workfloweventId){
		return workfloweventRepository.findById(workfloweventId).map(r -> converter.convert(r.getWorkflownode(),WorkflowNodeTo.class));
	}

	/**
	 * 
	 * @param workfloweventId
	 */
	public Optional<WorkflowStageTo> findWorkflowStage(int workfloweventId){
		return workfloweventRepository.findById(workfloweventId).map(r -> converter.convert(r.getWorkflowstage(),WorkflowStageTo.class));
	}

	/**
	 * 
	 * @param workflowEvent
	 */
	@Override @Transactional(readOnly = false)
	public WorkflowEventTo modifyWorkflowEvent(WorkflowEventInput workflowEvent){
		WorkflowEventModel target= workflowEventRepository.findById(workflowEvent.getId()).orElseThrow(() -> new RuntimeException("WorkflowEvent not found")); 
		 WorkflowEventModel source= converter.convert(workflowEvent,WorkflowEventModel.class); 
		 Utils.copyNotNulls(source,target); 
		 return converter.convert(workflowEventRepository.save(target), WorkflowEventTo.class);
	}

	/**
	 * 
	 * @param workflownodeRepository
	 * @param workflowinstanceRepository
	 * @param workflowstageRepository
	 * @param converter
	 * @param workfloweventRepository
	 */
	@Autowired
	public WorkflowEventServiceImpl(WorkflowNodeRepository workflownodeRepository, WorkflowInstanceRepository workflowinstanceRepository, WorkflowStageRepository workflowstageRepository, ConversionService converter, WorkflowEventRepository workfloweventRepository){
		this.workflowEventRepository =workfloweventRepository; 
		 this.converter = converter;
		 this.workflowstageRepository = workflowstageRepository;
		 this.workflowinstanceRepository = workflowinstanceRepository;
		 this.workflownodeRepository = workflownodeRepository;
	}

}