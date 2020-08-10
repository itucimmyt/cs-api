///////////////////////////////////////////////////////////
//  WorkflowNodeServiceImpl.java
//  Macromedia ActionScript Implementation of the Class WorkflowNodeServiceImpl
//  Generated by Enterprise Architect
//  Created on:      09-Aug-2020 4:52:03 PM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.services;

import org.ebs.model.WorkflowModel;
import org.ebs.model.repos.WorkflowRepository;
import org.ebs.model.EntityReferenceModel;
import org.ebs.model.repos.EntityReferenceRepository;
import org.ebs.model.HtmlTagModel;
import org.ebs.model.repos.HtmlTagRepository;
import org.ebs.model.ModuleModel;
import org.ebs.model.repos.ModuleRepository;
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
import org.ebs.model.repos.ProcessRepository;
import org.ebs.model.repos.WorkflowNodeRepository;
import org.ebs.model.repos.WorkflowStageRepository;
import org.ebs.model.repos.ActionRepository;
import org.ebs.model.repos.WorkflowEventRepository;
import org.ebs.model.repos.WorkflowNodeCFRepository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.ebs.services.to.WorkflowNodeTo;
import org.ebs.services.to.Input.WorkflowNodeInput;
import org.ebs.model.WorkflowNodeModel;
import org.ebs.services.to.WorkflowEventTo;
import org.ebs.services.to.HtmlTagTo;
import org.ebs.services.to.ModuleTo;
import org.ebs.services.to.WorkflowNodeCFTo;
import org.ebs.services.to.ProcessTo;
import org.ebs.services.to.WorkflowStageTo;
import org.ebs.services.to.WorkflowTo;
import org.ebs.services.to.ActionTo;
import org.ebs.services.to.EntityReferenceTo;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 09-Aug-2020 4:52:03 PM
 */
@Service @Transactional(readOnly = true)
  class WorkflowNodeServiceImpl implements WorkflowNodeService {

	private WorkflowNodeRepository workflownodeRepository;
	private ConversionService converter;
	private WorkflowRepository workflowRepository;
	private EntityReferenceRepository entityreferenceRepository;
	private HtmlTagRepository htmltagRepository;
	private ModuleRepository moduleRepository;
	private ProcessRepository processRepository;
	public WorkflowStageRepository workflowstageRepository;
	public ActionRepository actionRepository;
	public WorkflowEventRepository workfloweventRepository;
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
		EntityReferenceModel entityreferenceModel = entityreferenceRepository.findById(WorkflowNode.getentityreference().getId()).get(); 
		model.setentityreference(entityreferenceModel); 
		HtmlTagModel htmltagModel = htmltagRepository.findById(WorkflowNode.gethtmltag().getId()).get(); 
		model.sethtmltag(htmltagModel); 
		ModuleModel moduleModel = moduleRepository.findById(WorkflowNode.getmodule().getId()).get(); 
		model.setmodule(moduleModel); 
		ProcessModel processModel = processRepository.findById(WorkflowNode.getprocess().getId()).get(); 
		model.setprocess(processModel); 
		 
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
	public Set<ActionTo> findActions(int workflownodeId){
		return actionRepository.findByWorkflownodeId(workflownodeId).stream().map(e -> converter.convert(e,ActionTo.class)).collect(Collectors.toSet());
	}

	/**
	 * 
	 * @param workflownodeId
	 */
	public Optional<EntityReferenceTo> findEntityReference(int workflownodeId){
		return workflownodeRepository.findById(workflownodeId).map(r -> converter.convert(r.getentityreference(),EntityReferenceTo.class));
	}

	/**
	 * 
	 * @param workflownodeId
	 */
	public Optional<HtmlTagTo> findHtmlTag(int workflownodeId){
		return workflownodeRepository.findById(workflownodeId).map(r -> converter.convert(r.gethtmltag(),HtmlTagTo.class));
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
	public Optional<ProcessTo> findProcess(int workflownodeId){
		return workflownodeRepository.findById(workflownodeId).map(r -> converter.convert(r.getprocess(),ProcessTo.class));
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
	 * @param workflownodeId
	 */
	public Set<WorkflowStageTo> findWorkflowStages(int workflownodeId){
		return workflownodeRepository.findById(workflownodeId).get().getworkflowstages().stream().map(e->converter.convert(e, WorkflowStageTo.class)).collect(Collectors.toSet());
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
	 * @param entityreferenceRepository
	 * @param workfloweventRepository
	 * @param htmltagRepository
	 * @param moduleRepository
	 * @param workflownodecfRepository
	 * @param processRepository
	 * @param workflownodeRepository
	 * @param converter
	 * @param workflowstageRepository
	 * @param workflowRepository
	 * @param actionRepository
	 */
	@Autowired
	public WorkflowNodeServiceImpl(EntityReferenceRepository entityreferenceRepository, WorkflowEventRepository workfloweventRepository, HtmlTagRepository htmltagRepository, ModuleRepository moduleRepository, WorkflowNodeCFRepository workflownodecfRepository, ProcessRepository processRepository, WorkflowNodeRepository workflownodeRepository, ConversionService converter, WorkflowStageRepository workflowstageRepository, WorkflowRepository workflowRepository, ActionRepository actionRepository){
		this.workflownodeRepository =workflownodeRepository; 
		 this.converter = converter;
		 this.workflowstageRepository = workflowstageRepository;
		 this.workflowRepository = workflowRepository;
		 this.actionRepository = actionRepository;
		 this.entityreferenceRepository = entityreferenceRepository;
		 this.workfloweventRepository = workfloweventRepository;
		 this.htmltagRepository = htmltagRepository;
		 this.moduleRepository = moduleRepository;
		 this.workflownodecfRepository = workflownodecfRepository;
		 this.processRepository = processRepository;
	}

}