///////////////////////////////////////////////////////////
//  WorkflowEventServiceImpl.java
//  Macromedia ActionScript Implementation of the Class WorkflowEventServiceImpl
//  Generated by Enterprise Architect
//  Created on:      09-Aug-2020 4:51:56 PM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.services;

import java.util.List;
import java.util.Optional;

import org.ebs.model.WorkflowEventModel;
import org.ebs.model.WorkflowInstanceModel;
import org.ebs.model.WorkflowNodeModel;
import org.ebs.model.WorkflowStageModel;
import org.ebs.model.repos.WorkflowEventRepository;
import org.ebs.model.repos.WorkflowInstanceRepository;
import org.ebs.model.repos.WorkflowNodeRepository;
import org.ebs.model.repos.WorkflowStageRepository;
import org.ebs.services.to.WorkflowEventTo;
import org.ebs.services.to.WorkflowInstanceTo;
import org.ebs.services.to.WorkflowNodeTo;
import org.ebs.services.to.WorkflowStageTo;
import org.ebs.services.to.Input.WorkflowEventInput;
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
 * @created 09-Aug-2020 4:51:56 PM
 */
@Service @Transactional(readOnly = true)
  class WorkflowEventServiceImpl implements WorkflowEventService {

	private WorkflowEventRepository workfloweventRepository;
	private ConversionService converter;
	private WorkflowStageRepository workflowstageRepository;
	private WorkflowInstanceRepository workflowinstanceRepository;
	private WorkflowNodeRepository workflownodeRepository;

	/**
	 * 
	 * @param WorkflowEvent
	 */
	@Override @Transactional(readOnly = false)
	public WorkflowEventTo createWorkflowEvent(WorkflowEventInput WorkflowEvent){
		WorkflowEventModel model = converter.convert(WorkflowEvent,WorkflowEventModel.class); 
		 model.setId(0);
		 WorkflowStageModel workflowstageModel = workflowstageRepository.findById(WorkflowEvent.getworkflowstage().getId()).get(); 
		model.setworkflowstage(workflowstageModel); 
		WorkflowInstanceModel workflowinstanceModel = workflowinstanceRepository.findById(WorkflowEvent.getworkflowinstance().getId()).get(); 
		model.setworkflowinstance(workflowinstanceModel); 
		WorkflowNodeModel workflownodeModel = workflownodeRepository.findById(WorkflowEvent.getworkflownode().getId()).get(); 
		model.setworkflownode(workflownodeModel); 
		 
		 model= workfloweventRepository.save(model); 
		 return converter.convert(model, WorkflowEventTo.class); 
	}

	/**
	 * 
	 * @param workfloweventId
	 */
	@Override @Transactional(readOnly = false)
	public int deleteWorkflowEvent(int workfloweventId){
		WorkflowEventModel workflowevent = workfloweventRepository.findById(workfloweventId).orElseThrow(() -> new RuntimeException("WorkflowEvent not found")); 
		 workflowevent.setDeleted(true); 
		  workfloweventRepository.save(workflowevent); 
		 return workfloweventId;
	}

	/**
	 * 
	 * @param workfloweventId
	 */
	@Override
	public Optional<WorkflowEventTo> findWorkflowEvent(int workfloweventId){
		if(workfloweventId <1) 
		 {return Optional.empty();} 
		 return workfloweventRepository.findById(workfloweventId).filter(r -> !r.getDeleted().booleanValue()).map(r -> converter.convert(r,WorkflowEventTo.class));
	}

	/**
	 * 
	 * @param page
	 * @param sort
	 * @param filters
	 */
	@Override
	public Page<WorkflowEventTo> findWorkflowEvents(PageInput page, SortInput sort, List<FilterInput> filters){
		return workfloweventRepository.findByCriteria(WorkflowEventModel.class,filters,sort,page).map(r -> converter.convert(r,WorkflowEventTo.class));
	}

	/**
	 * 
	 * @param workfloweventId
	 */
	public Optional<WorkflowInstanceTo> findWorkflowInstance(int workfloweventId){
		return workfloweventRepository.findById(workfloweventId).map(r -> converter.convert(r.getworkflowinstance(),WorkflowInstanceTo.class));
	}

	/**
	 * 
	 * @param workfloweventId
	 */
	public Optional<WorkflowNodeTo> findWorkflowNode(int workfloweventId){
		return workfloweventRepository.findById(workfloweventId).map(r -> converter.convert(r.getworkflownode(),WorkflowNodeTo.class));
	}

	/**
	 * 
	 * @param workfloweventId
	 */
	public Optional<WorkflowStageTo> findWorkflowStage(int workfloweventId){
		return workfloweventRepository.findById(workfloweventId).map(r -> converter.convert(r.getworkflowstage(),WorkflowStageTo.class));
	}

	/**
	 * 
	 * @param workflowevent
	 */
	@Override @Transactional(readOnly = false)
	public WorkflowEventTo modifyWorkflowEvent(WorkflowEventInput workflowevent){
		WorkflowEventModel target= workfloweventRepository.findById(workflowevent.getId()).orElseThrow(() -> new RuntimeException("WorkflowEvent not found")); 
		 WorkflowEventModel source= converter.convert(workflowevent,WorkflowEventModel.class); 
		 Utils.copyNotNulls(source,target); 
		 return converter.convert(workfloweventRepository.save(target), WorkflowEventTo.class);
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
		this.workfloweventRepository =workfloweventRepository; 
		 this.converter = converter;
		 this.workflowstageRepository = workflowstageRepository;
		 this.workflowinstanceRepository = workflowinstanceRepository;
		 this.workflownodeRepository = workflownodeRepository;
	}

}