///////////////////////////////////////////////////////////
//  EntityReferenceServiceImpl.java
//  Macromedia ActionScript Implementation of the Class EntityReferenceServiceImpl
//  Generated by Enterprise Architect
//  Created on:      27-Jul-2020 8:42:33 AM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.services;

import org.ebs.model.repos.EntityReferenceRepository;
import org.ebs.model.repos.AttributesRepository;
import org.ebs.model.repos.EmailTemplateRepository;
import org.ebs.model.repos.SegmentRepository;
import org.ebs.model.repos.NumberSequenceRuleRepository;
import org.ebs.model.repos.WorkflowNodeCFRepository;
import org.ebs.model.repos.WorkflowNodeRepository;
import org.ebs.model.repos.WorkflowRepository;
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
import org.ebs.services.to.EntityReferenceTo;
import org.ebs.services.to.Input.EntityReferenceInput;
import org.ebs.model.EntityReferenceModel;
import org.ebs.services.to.AttributesTo;
import org.ebs.services.to.EmailTemplateTo;
import org.ebs.services.to.SegmentTo;
import org.ebs.services.to.NumberSequenceRuleTo;
import org.ebs.services.to.WorkflowNodeCFTo;
import org.ebs.services.to.WorkflowNodeTo;
import org.ebs.services.to.WorkflowTo;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 27-Jul-2020 8:42:33 AM
 */
@Service @Transactional(readOnly = true)
  class EntityReferenceServiceImpl implements EntityReferenceService {

	private EntityReferenceRepository entityreferenceRepository;
	private ConversionService converter;
	public AttributesRepository attributesRepository;
	public EmailTemplateRepository emailtemplateRepository;
	public SegmentRepository segmentRepository;
	public NumberSequenceRuleRepository numbersequenceruleRepository;
	public WorkflowNodeCFRepository workflownodecfRepository;
	public WorkflowNodeRepository workflownodeRepository;
	public WorkflowRepository workflowRepository;

	/**
	 * 
	 * @param EntityReference
	 */
	@Override @Transactional(readOnly = false)
	public EntityReferenceTo createEntityReference(EntityReferenceInput EntityReference){
		EntityReferenceModel model = converter.convert(EntityReference,EntityReferenceModel.class); 
		 model.setId(0);
		  
		 model= entityreferenceRepository.save(model); 
		 return converter.convert(model, EntityReferenceTo.class); 
	}

	/**
	 * 
	 * @param entityreferenceId
	 */
	@Override @Transactional(readOnly = false)
	public int deleteEntityReference(int entityreferenceId){
		EntityReferenceModel entityreference = entityreferenceRepository.findById(entityreferenceId).orElseThrow(() -> new RuntimeException("EntityReference not found")); 
		 entityreference.setDeleted(true); 
		  entityreferenceRepository.save(entityreference); 
		 return entityreferenceId;
	}

	/**
	 * 
	 * @param workflowRepository
	 * @param entityreferenceRepository
	 * @param converter
	 * @param attributesRepository
	 * @param emailtemplateRepository
	 * @param segmentRepository
	 * @param numbersequenceruleRepository
	 * @param workflownodecfRepository
	 * @param workflownodeRepository
	 */
	@Autowired
	public EntityReferenceServiceImpl(WorkflowRepository workflowRepository, EntityReferenceRepository entityreferenceRepository, ConversionService converter, AttributesRepository attributesRepository, EmailTemplateRepository emailtemplateRepository, SegmentRepository segmentRepository, NumberSequenceRuleRepository numbersequenceruleRepository, WorkflowNodeCFRepository workflownodecfRepository, WorkflowNodeRepository workflownodeRepository){
		this.entityreferenceRepository =entityreferenceRepository; 
		 this.converter = converter;
		 this.attributesRepository = attributesRepository;
		 this.emailtemplateRepository = emailtemplateRepository;
		 this.segmentRepository = segmentRepository;
		 this.numbersequenceruleRepository = numbersequenceruleRepository;
		 this.workflownodecfRepository = workflownodecfRepository;
		 this.workflownodeRepository = workflownodeRepository;
		 this.workflowRepository = workflowRepository;
	}

	/**
	 * 
	 * @param entityreferenceId
	 */
	public Set<AttributesTo> findAttributess(int entityreferenceId){
		return attributesRepository.findByEntityreferenceId(entityreferenceId).stream().map(e -> converter.convert(e,AttributesTo.class)).collect(Collectors.toSet());
	}

	/**
	 * 
	 * @param entityreferenceId
	 */
	@Override
	public Optional<EntityReferenceTo> findEntityReference(int entityreferenceId){
		if(entityreferenceId <1) 
		 {return Optional.empty();} 
		 return entityreferenceRepository.findById(entityreferenceId).filter(r -> !r.getDeleted().booleanValue()).map(r -> converter.convert(r,EntityReferenceTo.class));
	}

	/**
	 * 
	 * @param page
	 * @param sort
	 * @param filters
	 */
	@Override
	public Page<EntityReferenceTo> findEntityReferences(PageInput page, SortInput sort, List<FilterInput> filters){
		return entityreferenceRepository.findByCriteria(EntityReferenceModel.class,filters,sort,page).map(r -> converter.convert(r,EntityReferenceTo.class));
	}

	/**
	 * 
	 * @param entityreferenceId
	 */
	public Set<SegmentTo> findSegments(int entityreferenceId){
		return segmentRepository.findByEntityreferenceId(entityreferenceId).stream().map(e -> converter.convert(e,SegmentTo.class)).collect(Collectors.toSet());
	}

	/**
	 * 
	 * @param entityreferenceId
	 */
	public Set<WorkflowNodeCFTo> findWorkflowNodeCFs(int entityreferenceId){
		return workflownodecfRepository.findByEntityreferenceId(entityreferenceId).stream().map(e -> converter.convert(e,WorkflowNodeCFTo.class)).collect(Collectors.toSet());
	}

	/**
	 * 
	 * @param entityreferenceId
	 */
	public Set<WorkflowNodeTo> findWorkflowNodes(int entityreferenceId){
		return workflownodeRepository.findByEntityreferenceId(entityreferenceId).stream().map(e -> converter.convert(e,WorkflowNodeTo.class)).collect(Collectors.toSet());
	}

	/**
	 * 
	 * @param entityreferenceId
	 */
	public Set<WorkflowTo> findWorkflows(int entityreferenceId){
		return workflowRepository.findByEntityreferenceId(entityreferenceId).stream().map(e -> converter.convert(e,WorkflowTo.class)).collect(Collectors.toSet());
	}

	/**
	 * 
	 * @param entityreference
	 */
	@Override @Transactional(readOnly = false)
	public EntityReferenceTo modifyEntityReference(EntityReferenceInput entityreference){
		EntityReferenceModel target= entityreferenceRepository.findById(entityreference.getId()).orElseThrow(() -> new RuntimeException("EntityReference not found")); 
		 EntityReferenceModel source= converter.convert(entityreference,EntityReferenceModel.class); 
		 Utils.copyNotNulls(source,target); 
		 return converter.convert(entityreferenceRepository.save(target), EntityReferenceTo.class);
	}

}