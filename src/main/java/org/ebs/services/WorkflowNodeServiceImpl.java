///////////////////////////////////////////////////////////
//  WorkflowNodeServiceImpl.java
//  Macromedia ActionScript Implementation of the Class WorkflowNodeServiceImpl
//  Generated by Enterprise Architect
//  Created on:      23-Jul-2020 10:47:39 PM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.services;

import org.ebs.model.WorkflowModel;
import org.ebs.model.repos.WorkflowRepository;
import org.ebs.model.ModuleModel;
import org.ebs.model.repos.ModuleRepository;
import org.ebs.model.repos.WorkflowNodeRepository;
import org.ebs.model.repos.WorkflowEventRepository;
import org.ebs.model.repos.WorkflowStageRepository;
import org.ebs.model.repos.ProcessRepository;
import org.ebs.model.repos.WorkflowNodeCFRepository;
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
import org.ebs.services.to.WorkflowNodeTo;
import org.ebs.services.to.Input.WorkflowNodeInput;
import org.ebs.model.WorkflowNodeModel;
import org.ebs.services.to.WorkflowEventTo;
import org.ebs.services.to.WorkflowStageTo;
import org.ebs.services.to.ProcessTo;
import org.ebs.services.to.WorkflowNodeCFTo;
import org.ebs.services.to.ModuleTo;
import org.ebs.services.to.WorkflowTo;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 23-Jul-2020 10:47:39 PM
 */
@Service @Transactional(readOnly = true)
  class WorkflowNodeServiceImpl implements WorkflowNodeService {

	private WorkflowNodeRepository workflownodeRepository;
	private ConversionService converter;
	private WorkflowRepository workflowRepository;
	private ModuleRepository moduleRepository;
	public WorkflowEventRepository workfloweventRepository;
	public WorkflowStageRepository workflowstageRepository;
	public ProcessRepository processRepository;
	public WorkflowNodeCFRepository workflownodecfRepository;

	/**
	 * 
	 * @param WorkflowNode
	 */
	@Override @Transactional(readOnly = false)
	public WorkflowNodeTo createWorkflowNode(WorkflowNodeInput WorkflowNode){
		WorkflowNodeModel model = converter.convert(WorkflowNode,WorkflowNodeModel.class); 
		 model.setId(0);
		 WorkflowModel workflowModel = workflowRepository.findById(WorkflowNode.getworkflow().getId()).get(); 
		model.setworkflow(workflowModel); 
		ModuleModel moduleModel = moduleRepository.findById(WorkflowNode.getmodule().getId()).get(); 
		model.setmodule(moduleModel); 
		 
		 model= workflownodeRepository.save(model); 
		 return converter.convert(model, WorkflowNodeTo.class); 
	}

	/**
	 * 
	 * @param workflownodeId
	 */
	@Override @Transactional(readOnly = false)
	public int deleteWorkflowNode(int workflownodeId){
		WorkflowNodeModel workflownode = workflownodeRepository.findById(workflownodeId).orElseThrow(() -> new RuntimeException("WorkflowNode not found")); 
		 workflownode.setDeleted(true); 
		  workflownodeRepository.save(workflownode); 
		 return workflownodeId;
	}

	/**
	 * 
	 * @param workflownodeId
	 */
	public Optional<ModuleTo> findModule(int workflownodeId){
		return workflownodeRepository.findById(workflownodeId).map(r -> converter.convert(r.getmodule(),ModuleTo.class));
	}

	/**
	 * 
	 * @param workflownodeId
	 */
	public Optional<WorkflowTo> findWorkflow(int workflownodeId){
		return workflownodeRepository.findById(workflownodeId).map(r -> converter.convert(r.getworkflow(),WorkflowTo.class));
	}

	/**
	 * 
	 * @param workflownodeId
	 */
	public Set<WorkflowEventTo> findWorkflowEvents(int workflownodeId){
		return workfloweventRepository.findByWorkflownodeId(workflownodeId).stream().map(e -> converter.convert(e,WorkflowEventTo.class)).collect(Collectors.toSet());
	}

	/**
	 * 
	 * @param workflownodeId
	 */
	@Override
	public Optional<WorkflowNodeTo> findWorkflowNode(int workflownodeId){
		if(workflownodeId <1) 
		 {return Optional.empty();} 
		 return workflownodeRepository.findById(workflownodeId).filter(r -> !r.getDeleted().booleanValue()).map(r -> converter.convert(r,WorkflowNodeTo.class));
	}

	/**
	 * 
	 * @param workflownodeId
	 */
	public Set<WorkflowNodeCFTo> findWorkflowNodeCFs(int workflownodeId){
		return workflownodecfRepository.findByWorkflownodeId(workflownodeId).stream().map(e -> converter.convert(e,WorkflowNodeCFTo.class)).collect(Collectors.toSet());
	}

	/**
	 * 
	 * @param page
	 * @param sort
	 * @param filters
	 */
	@Override
	public Page<WorkflowNodeTo> findWorkflowNodes(PageInput page, SortInput sort, List<FilterInput> filters){
		return workflownodeRepository.findByCriteria(WorkflowNodeModel.class,filters,sort,page).map(r -> converter.convert(r,WorkflowNodeTo.class));
	}

	/**
	 * 
	 * @param workflownodeId
	 */
	public Set<WorkflowTo> findWorkflows(int workflownodeId){
		return workflowRepository.findByWorkflownodeId(workflownodeId).stream().map(e -> converter.convert(e,WorkflowTo.class)).collect(Collectors.toSet());
	}

	/**
	 * 
	 * @param workflownode
	 */
	@Override @Transactional(readOnly = false)
	public WorkflowNodeTo modifyWorkflowNode(WorkflowNodeInput workflownode){
		WorkflowNodeModel target= workflownodeRepository.findById(workflownode.getId()).orElseThrow(() -> new RuntimeException("WorkflowNode not found")); 
		 WorkflowNodeModel source= converter.convert(workflownode,WorkflowNodeModel.class); 
		 Utils.copyNotNulls(source,target); 
		 return converter.convert(workflownodeRepository.save(target), WorkflowNodeTo.class);
	}

	/**
	 * 
	 * @param moduleRepository
	 * @param workflownodeRepository
	 * @param converter
	 * @param workflowRepository
	 * @param workfloweventRepository
	 * @param workflowstageRepository
	 * @param processRepository
	 * @param workflownodecfRepository
	 */
	@Autowired
	public WorkflowNodeServiceImpl(ModuleRepository moduleRepository, WorkflowNodeRepository workflownodeRepository, ConversionService converter, WorkflowRepository workflowRepository, WorkflowEventRepository workfloweventRepository, WorkflowStageRepository workflowstageRepository, ProcessRepository processRepository, WorkflowNodeCFRepository workflownodecfRepository){
		this.workflownodeRepository =workflownodeRepository; 
		 this.converter = converter;
		 this.workflowRepository = workflowRepository;
		 this.workfloweventRepository = workfloweventRepository;
		 this.workflowstageRepository = workflowstageRepository;
		 this.processRepository = processRepository;
		 this.workflownodecfRepository = workflownodecfRepository;
		 this.moduleRepository = moduleRepository;
	}

}