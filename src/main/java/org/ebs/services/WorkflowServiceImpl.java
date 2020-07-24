///////////////////////////////////////////////////////////
//  WorkflowServiceImpl.java
//  Macromedia ActionScript Implementation of the Class WorkflowServiceImpl
//  Generated by Enterprise Architect
//  Created on:      23-Jul-2020 10:47:41 PM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.services;

import org.ebs.model.TenantModel;
import org.ebs.model.repos.TenantRepository;
import org.ebs.model.repos.WorkflowRepository;
import org.ebs.model.repos.WorkflowPhaseRepository;
import org.ebs.model.repos.WorkflowInstanceRepository;
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
import org.ebs.services.to.WorkflowTo;
import org.ebs.services.to.Input.WorkflowInput;
import org.ebs.model.WorkflowModel;
import org.ebs.services.to.WorkflowPhaseTo;
import org.ebs.services.to.TenantTo;
import org.ebs.services.to.WorkflowInstanceTo;
import org.ebs.services.to.WorkflowNodeTo;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 23-Jul-2020 10:47:41 PM
 */
@Service @Transactional(readOnly = true)
  class WorkflowServiceImpl implements WorkflowService {

	private WorkflowRepository workflowRepository;
	private ConversionService converter;
	private TenantRepository tenantRepository;
	public WorkflowPhaseRepository workflowphaseRepository;
	public WorkflowInstanceRepository workflowinstanceRepository;
	public WorkflowNodeRepository workflownodeRepository;

	/**
	 * 
	 * @param Workflow
	 */
	@Override @Transactional(readOnly = false)
	public WorkflowTo createWorkflow(WorkflowInput Workflow){
		WorkflowModel model = converter.convert(Workflow,WorkflowModel.class); 
		 model.setId(0);
		 TenantModel tenantModel = tenantRepository.findById(Workflow.gettenant().getId()).get(); 
		model.settenant(tenantModel); 
		 
		 model= workflowRepository.save(model); 
		 return converter.convert(model, WorkflowTo.class); 
	}

	/**
	 * 
	 * @param workflowId
	 */
	@Override @Transactional(readOnly = false)
	public int deleteWorkflow(int workflowId){
		WorkflowModel workflow = workflowRepository.findById(workflowId).orElseThrow(() -> new RuntimeException("Workflow not found")); 
		 workflow.setDeleted(true); 
		  workflowRepository.save(workflow); 
		 return workflowId;
	}

	/**
	 * 
	 * @param workflowId
	 */
	public Optional<TenantTo> findTenant(int workflowId){
		return workflowRepository.findById(workflowId).map(r -> converter.convert(r.gettenant(),TenantTo.class));
	}

	/**
	 * 
	 * @param workflowId
	 */
	@Override
	public Optional<WorkflowTo> findWorkflow(int workflowId){
		if(workflowId <1) 
		 {return Optional.empty();} 
		 return workflowRepository.findById(workflowId).filter(r -> !r.getDeleted().booleanValue()).map(r -> converter.convert(r,WorkflowTo.class));
	}

	/**
	 * 
	 * @param workflowId
	 */
	public Set<WorkflowInstanceTo> findWorkflowInstances(int workflowId){
		return workflowinstanceRepository.findByWorkflowId(workflowId).stream().map(e -> converter.convert(e,WorkflowInstanceTo.class)).collect(Collectors.toSet());
	}

	/**
	 * 
	 * @param workflowId
	 */
	public Optional<WorkflowNodeTo> findWorkflowNode(int workflowId){
		return workflowRepository.findById(workflowId).map(r -> converter.convert(r.getworkflownode(),WorkflowNodeTo.class));
	}

	/**
	 * 
	 * @param workflowId
	 */
	public Set<WorkflowNodeTo> findWorkflowNodes(int workflowId){
		return workflownodeRepository.findByWorkflowId(workflowId).stream().map(e -> converter.convert(e,WorkflowNodeTo.class)).collect(Collectors.toSet());
	}

	/**
	 * 
	 * @param workflowId
	 */
	public Set<WorkflowPhaseTo> findWorkflowPhases(int workflowId){
		return workflowphaseRepository.findByWorkflowId(workflowId).stream().map(e -> converter.convert(e,WorkflowPhaseTo.class)).collect(Collectors.toSet());
	}

	/**
	 * 
	 * @param page
	 * @param sort
	 * @param filters
	 */
	@Override
	public Page<WorkflowTo> findWorkflows(PageInput page, SortInput sort, List<FilterInput> filters){
		return workflowRepository.findByCriteria(WorkflowModel.class,filters,sort,page).map(r -> converter.convert(r,WorkflowTo.class));
	}

	/**
	 * 
	 * @param workflow
	 */
	@Override @Transactional(readOnly = false)
	public WorkflowTo modifyWorkflow(WorkflowInput workflow){
		WorkflowModel target= workflowRepository.findById(workflow.getId()).orElseThrow(() -> new RuntimeException("Workflow not found")); 
		 WorkflowModel source= converter.convert(workflow,WorkflowModel.class); 
		 Utils.copyNotNulls(source,target); 
		 return converter.convert(workflowRepository.save(target), WorkflowTo.class);
	}

	/**
	 * 
	 * @param workflownodeRepository
	 * @param workflowRepository
	 * @param converter
	 * @param workflowphaseRepository
	 * @param tenantRepository
	 * @param workflowinstanceRepository
	 */
	@Autowired
	public WorkflowServiceImpl(WorkflowNodeRepository workflownodeRepository, WorkflowRepository workflowRepository, ConversionService converter, WorkflowPhaseRepository workflowphaseRepository, TenantRepository tenantRepository, WorkflowInstanceRepository workflowinstanceRepository){
		this.workflowRepository =workflowRepository; 
		 this.converter = converter;
		 this.workflowphaseRepository = workflowphaseRepository;
		 this.tenantRepository = tenantRepository;
		 this.workflowinstanceRepository = workflowinstanceRepository;
		 this.workflownodeRepository = workflownodeRepository;
	}

}