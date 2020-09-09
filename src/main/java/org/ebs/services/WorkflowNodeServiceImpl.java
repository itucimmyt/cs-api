///////////////////////////////////////////////////////////
//  WorkflowNodeServiceImpl.java
//  Macromedia ActionScript Implementation of the Class WorkflowNodeServiceImpl
//  Generated by Enterprise Architect
//  Created on:      07-Sep-2020 8:12:43 AM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.services;

import org.ebs.model.WorkflowModel;
import org.ebs.model.repos.WorkflowRepository;
import org.ebs.model.EntityReferenceModel;
import org.ebs.model.HtmlTagModel;
import org.ebs.model.ModuleModel;
import org.ebs.model.ProcessModel;
import org.ebs.model.WorkflowModel;
import org.ebs.model.WorkflowNodeModel;
import org.ebs.model.repos.ActionRepository;
import org.ebs.model.repos.EntityReferenceRepository;
import org.ebs.model.repos.HtmlTagRepository;
import org.ebs.model.repos.ModuleRepository;
import org.ebs.model.repos.ProcessRepository;
import org.ebs.model.repos.WorkflowEventRepository;
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
import org.ebs.services.to.ActionTo;
import org.ebs.services.to.EntityReferenceTo;
import org.ebs.services.to.HtmlTagTo;
import org.ebs.services.to.ProcessTo;
import org.ebs.services.to.ModuleTo;
import org.ebs.services.to.WorkflowStageTo;
import org.ebs.services.to.WorkflowTo;
import org.ebs.services.to.WorkflowNodeCFTo;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 07-Sep-2020 8:12:43 AM
 */
@Service @Transactional(readOnly = true)
  class WorkflowNodeServiceImpl implements WorkflowNodeService {

	private WorkflowNodeRepository workflowNodeRepository;
	private ConversionService converter;
	private WorkflowRepository workflowRepository;
	private EntityReferenceRepository entityreferenceRepository;
	private HtmlTagRepository htmltagRepository;
	private ProcessRepository processRepository;
	private ModuleRepository moduleRepository;
	public WorkflowStageRepository workflowStageRepository;
	public ActionRepository actionRepository;
	public EntityReferenceRepository entityReferenceRepository;
	public WorkflowEventRepository workflowEventRepository;
	public HtmlTagRepository htmlTagRepository;
	public WorkflowNodeCFRepository workflowNodeCFRepository;

	/**
	 * 
	 * @param workflowNode
	 */
	@Override @Transactional(readOnly = false)
	public WorkflowNodeTo createWorkflowNode(WorkflowNodeInput WorkflowNode){
		WorkflowNodeModel model = converter.convert(WorkflowNode,WorkflowNodeModel.class); 
		 model.setId(0);
		 initWorkflowNodeModel(workflowNode, model);
		 model = workflownodeRepository.save(model); 
		 return converter.convert(model, WorkflowNodeTo.class); 
	}

	void initWorkflowNodeModel(WorkflowNodeInput workflowNode, WorkflowNodeModel model) {
		Optional<WorkflowNodeInput> optWFN = Optional.of(workflowNode);

		WorkflowModel workflowModel = optWFN
			.map(wfn -> wfn.getWorkflow())
			.map(w -> workflowRepository.findById(w.getId())
				.orElseThrow(() -> new RuntimeException("workflow does not exist")))
			.orElse(null);
		model.setWorkflow(workflowModel); 
		EntityReferenceModel entityreferenceModel = entityreferenceRepository.findById(WorkflowNode.getEntityReference().getId()).get(); 
		model.setEntityReference(entityreferenceModel); 
		HtmlTagModel htmltagModel = htmltagRepository.findById(WorkflowNode.getHtmlTag().getId()).get(); 
		model.setHtmlTag(htmltagModel); 
		ProcessModel processModel = processRepository.findById(WorkflowNode.getProcess().getId()).get(); 
		model.setProcess(processModel); 
		ModuleModel moduleModel = moduleRepository.findById(WorkflowNode.getModule().getId()).get(); 
		model.setModule(moduleModel); 
		 
		 model= workflowNodeRepository.save(model); 
		 return converter.convert(model, WorkflowNodeTo.class); 
	}

	/**
	 * 
	 * @param workflowNodeId
	 */
	@Override @Transactional(readOnly = false)
	public int deleteWorkflowNode(int workflowNodeId){
		WorkflowNodeModel workflowNode = workflowNodeRepository.findById(workflowNodeId).orElseThrow(() -> new RuntimeException("WorkflowNode not found")); 
		 workflowNode.setDeleted(true); 
		  workflowNodeRepository.save(workflowNode); 
		 return workflowNodeId;
	}

	/**
	 * 
	 * @param workflowNodeId
	 */
	public Set<ActionTo> findActions(int workflowNodeId){
		return actionRepository.findByWorkflowNodeId(workflowNodeId).stream().map(e -> converter.convert(e,ActionTo.class)).collect(Collectors.toSet());
	}

	/**
	 * 
	 * @param workflowNodeId
	 */
	public Optional<EntityReferenceTo> findEntityReference(int workflowNodeId){
		return workflowNodeRepository.findById(workflowNodeId).map(r -> converter.convert(r.getEntityReference(),EntityReferenceTo.class));
	}

	/**
	 * 
	 * @param workflowNodeId
	 */
	public Optional<HtmlTagTo> findHtmlTag(int workflowNodeId){
		return workflowNodeRepository.findById(workflowNodeId).map(r -> converter.convert(r.getHtmlTag(),HtmlTagTo.class));
	}

	/**
	 * 
	 * @param workflowNodeId
	 */
	public Optional<ModuleTo> findModule(int workflowNodeId){
		return workflowNodeRepository.findById(workflowNodeId).map(r -> converter.convert(r.getModule(),ModuleTo.class));
	}

	/**
	 * 
	 * @param workflowNodeId
	 */
	public Optional<ProcessTo> findProcess(int workflowNodeId){
		return workflowNodeRepository.findById(workflowNodeId).map(r -> converter.convert(r.getProcess(),ProcessTo.class));
	}

	/**
	 * 
	 * @param workflowNodeId
	 */
	public Optional<WorkflowTo> findWorkflow(int workflowNodeId){
		return workflowNodeRepository.findById(workflowNodeId).map(r -> converter.convert(r.getWorkflow(),WorkflowTo.class));
	}

	/**
	 * 
	 * @param workflowNodeId
	 */
	public Set<WorkflowEventTo> findWorkflowEvents(int workflowNodeId){
		return workflowEventRepository.findByWorkflowNodeId(workflowNodeId).stream().map(e -> converter.convert(e,WorkflowEventTo.class)).collect(Collectors.toSet());
	}

	/**
	 * 
	 * @param workflowNodeId
	 */
	@Override
	public Optional<WorkflowNodeTo> findWorkflowNode(int workflowNodeId){
		if(workflowNodeId <1) 
		 {return Optional.empty();} 
		 return workflowNodeRepository.findById(workflowNodeId).filter(r -> !r.getDeleted().booleanValue()).map(r -> converter.convert(r,WorkflowNodeTo.class));
	}

	/**
	 * 
	 * @param workflowNodeId
	 */
	public Set<WorkflowNodeCFTo> findWorkflowNodeCFs(int workflowNodeId){
		return workflowNodeCFRepository.findByWorkflowNodeId(workflowNodeId).stream().map(e -> converter.convert(e,WorkflowNodeCFTo.class)).collect(Collectors.toSet());
	}

	/**
	 * 
	 * @param page
	 * @param sort
	 * @param filters
	 */
	@Override
	public Page<WorkflowNodeTo> findWorkflowNodes(PageInput page, SortInput sort, List<FilterInput> filters){
		return workflowNodeRepository.findByCriteria(WorkflowNodeModel.class,filters,sort,page).map(r -> converter.convert(r,WorkflowNodeTo.class));
	}

	/**
	 * 
	 * @param workflowNodeId
	 */
	public Set<WorkflowTo> findWorkflows(int workflowNodeId){
		return workflowRepository.findByWorkflowNodeId(workflowNodeId).stream().map(e -> converter.convert(e,WorkflowTo.class)).collect(Collectors.toSet());
	}

	/**
	 * 
	 * @param workflowNodeId
	 */
	public Set<WorkflowStageTo> findWorkflowStages(int workflowNodeId){
		return workflowNodeRepository.findById(workflowNodeId).get().getWorkflowStages().stream().map(e->converter.convert(e, WorkflowStageTo.class)).collect(Collectors.toSet());
	}

	/**
	 * 
	 * @param workflowNode
	 */
	@Override @Transactional(readOnly = false)
	public WorkflowNodeTo modifyWorkflowNode(WorkflowNodeInput workflowNode){
		WorkflowNodeModel target= workflowNodeRepository.findById(workflowNode.getId()).orElseThrow(() -> new RuntimeException("WorkflowNode not found")); 
		 WorkflowNodeModel source= converter.convert(workflowNode,WorkflowNodeModel.class); 
		 Utils.copyNotNulls(source,target); 
		 return converter.convert(workflowNodeRepository.save(target), WorkflowNodeTo.class);
	}

	/**
	 * 
	 * @param workflownodecfRepository
	 * @param workflownodeRepository
	 * @param converter
	 * @param workflowstageRepository
	 * @param workflowRepository
	 * @param actionRepository
	 * @param entityreferenceRepository
	 * @param workfloweventRepository
	 * @param htmltagRepository
	 * @param processRepository
	 * @param moduleRepository
	 */
	@Autowired
	public WorkflowNodeServiceImpl(WorkflowNodeCFRepository workflownodecfRepository, WorkflowNodeRepository workflownodeRepository, ConversionService converter, WorkflowStageRepository workflowstageRepository, WorkflowRepository workflowRepository, ActionRepository actionRepository, EntityReferenceRepository entityreferenceRepository, WorkflowEventRepository workfloweventRepository, HtmlTagRepository htmltagRepository, ProcessRepository processRepository, ModuleRepository moduleRepository){
		this.workflowNodeRepository =workflownodeRepository; 
		 this.converter = converter;
		 this.workflowStageRepository = workflowstageRepository;
		 this.workflowRepository = workflowRepository;
		 this.actionRepository = actionRepository;
		 this.entityReferenceRepository = entityreferenceRepository;
		 this.workflowEventRepository = workfloweventRepository;
		 this.htmlTagRepository = htmltagRepository;
		 this.processRepository = processRepository;
		 this.moduleRepository = moduleRepository;
		 this.workflowNodeCFRepository = workflownodecfRepository;
	}

}