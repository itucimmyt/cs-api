///////////////////////////////////////////////////////////
//  HtmlTagServiceImpl.java
//  Macromedia ActionScript Implementation of the Class HtmlTagServiceImpl
//  Generated by Enterprise Architect
//  Created on:      10-Sep-2020 10:43:47 PM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.services;

import org.ebs.model.repos.HtmlTagRepository;
import org.ebs.model.repos.AttributesRepository;
import org.ebs.model.repos.NotificationRepository;
import org.ebs.model.repos.ComponentRepository;
import org.ebs.model.repos.WorkflowRepository;
import org.ebs.model.repos.WorkflowPhaseRepository;
import org.ebs.model.repos.AlertRepository;
import org.ebs.model.repos.WorkflowStageRepository;
import org.ebs.model.repos.TranslationRepository;
import org.ebs.model.repos.WorkflowNodeRepository;
import org.ebs.model.repos.ModuleRepository;
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
import org.ebs.services.to.HtmlTagTo;
import org.ebs.services.to.Input.HtmlTagInput;
import org.ebs.model.HtmlTagModel;
import org.ebs.services.to.AttributesTo;
import org.ebs.services.to.NotificationTo;
import org.ebs.services.to.TranslationTo;
import org.ebs.services.to.WorkflowNodeTo;
import org.ebs.services.to.ModuleTo;
import org.ebs.services.to.WorkflowNodeCFTo;
import org.ebs.services.to.ComponentTo;
import org.ebs.services.to.WorkflowTo;
import org.ebs.services.to.WorkflowPhaseTo;
import org.ebs.services.to.AlertTo;
import org.ebs.services.to.WorkflowStageTo;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 10-Sep-2020 10:43:47 PM
 */
@Service @Transactional(readOnly = true)
  class HtmlTagServiceImpl implements HtmlTagService {

	private HtmlTagRepository htmltagRepository;
	private ConversionService converter;
	private AttributesRepository attributesRepository;
	private NotificationRepository notificationRepository;
	private ComponentRepository componentRepository;
	private WorkflowRepository workflowRepository;
	private WorkflowPhaseRepository workflowphaseRepository;
	private AlertRepository alertRepository;
	private WorkflowStageRepository workflowstageRepository;
	private TranslationRepository translationRepository;
	private WorkflowNodeRepository workflownodeRepository;
	private ModuleRepository moduleRepository;
	private WorkflowNodeCFRepository workflownodecfRepository;

	/**
	 *
	 * @param HtmlTag
	 */
	@Override @Transactional(readOnly = false)
	public HtmlTagTo createHtmlTag(HtmlTagInput HtmlTag){
		HtmlTagModel model = converter.convert(HtmlTag,HtmlTagModel.class);
		 model.setId(0);

		 model= htmltagRepository.save(model);
		 return converter.convert(model, HtmlTagTo.class);
	}

	/**
	 *
	 * @param htmlTagId
	 */
	@Override @Transactional(readOnly = false)
	public int deleteHtmlTag(int htmlTagId){
		HtmlTagModel htmltag = htmltagRepository.findById(htmlTagId).orElseThrow(() -> new RuntimeException("HtmlTag not found"));
		 htmltag.setDeleted(true);
		  htmltagRepository.save(htmltag);
		 return htmlTagId;
	}

	/**
	 *
	 * @param htmltagId
	 */
	public Set<AlertTo> findAlerts(int htmltagId){
		return alertRepository.findByHtmltagId(htmltagId).stream().map(e -> converter.convert(e,AlertTo.class)).collect(Collectors.toSet());
	}

	/**
	 *
	 * @param htmltagId
	 */
	public Set<AttributesTo> findAttributess(int htmltagId){
		return attributesRepository.findByHtmltagId(htmltagId).stream().map(e -> converter.convert(e,AttributesTo.class)).collect(Collectors.toSet());
	}

	/**
	 *
	 * @param htmltagId
	 */
	public Set<ComponentTo> findComponents(int htmltagId){
		return componentRepository.findByHtmltagId(htmltagId).stream().map(e -> converter.convert(e,ComponentTo.class)).collect(Collectors.toSet());
	}

	/**
	 *
	 * @param htmlTagId
	 */
	@Override
	public Optional<HtmlTagTo> findHtmlTag(int htmlTagId){
		if(htmlTagId <1)
		 {return Optional.empty();}
		 return htmltagRepository.findById(htmlTagId).filter(r -> !r.getDeleted().booleanValue()).map(r -> converter.convert(r,HtmlTagTo.class));
	}

	/**
	 *
	 * @param page
	 * @param sort
	 * @param filters
	 */
	@Override
	public Page<HtmlTagTo> findHtmlTags(PageInput page, SortInput sort, List<FilterInput> filters, boolean disjunctionFilters){
		return htmltagRepository.findByCriteria(HtmlTagModel.class,filters,sort,page,disjunctionFilters).map(r -> converter.convert(r,HtmlTagTo.class));
	}

	/**
	 *
	 * @param htmltagId
	 */
	public Set<ModuleTo> findModules(int htmltagId){
		return moduleRepository.findByHtmltagId(htmltagId).stream().map(e -> converter.convert(e,ModuleTo.class)).collect(Collectors.toSet());
	}

	/**
	 *
	 * @param htmltagId
	 */
	public Set<NotificationTo> findNotifications(int htmltagId){
		return notificationRepository.findByHtmltagId(htmltagId).stream().map(e -> converter.convert(e,NotificationTo.class)).collect(Collectors.toSet());
	}

	/**
	 *
	 * @param htmltagId
	 */
	public Set<TranslationTo> findTranslations(int htmltagId){
		return translationRepository.findByHtmltagId(htmltagId).stream().map(e -> converter.convert(e,TranslationTo.class)).collect(Collectors.toSet());
	}

	/**
	 *
	 * @param htmltagId
	 */
	public Set<WorkflowNodeCFTo> findWorkflowNodeCFs(int htmltagId){
		return workflownodecfRepository.findByHtmltagId(htmltagId).stream().map(e -> converter.convert(e,WorkflowNodeCFTo.class)).collect(Collectors.toSet());
	}

	/**
	 *
	 * @param htmltagId
	 */
	public Set<WorkflowNodeTo> findWorkflowNodes(int htmltagId){
		return workflownodeRepository.findByHtmltagId(htmltagId).stream().map(e -> converter.convert(e,WorkflowNodeTo.class)).collect(Collectors.toSet());
	}

	/**
	 *
	 * @param htmltagId
	 */
	public Set<WorkflowPhaseTo> findWorkflowPhases(int htmltagId){
		return workflowphaseRepository.findByHtmltagId(htmltagId).stream().map(e -> converter.convert(e,WorkflowPhaseTo.class)).collect(Collectors.toSet());
	}

	/**
	 *
	 * @param htmltagId
	 */
	public Set<WorkflowTo> findWorkflows(int htmltagId){
		return workflowRepository.findByHtmltagId(htmltagId).stream().map(e -> converter.convert(e,WorkflowTo.class)).collect(Collectors.toSet());
	}

	/**
	 *
	 * @param htmltagId
	 */
	public Set<WorkflowStageTo> findWorkflowStages(int htmltagId){
		return workflowstageRepository.findByHtmltagId(htmltagId).stream().map(e -> converter.convert(e,WorkflowStageTo.class)).collect(Collectors.toSet());
	}

	/**
	 *
	 * @param componentRepository
	 * @param moduleRepository
	 * @param workflownodeRepository
	 * @param translationRepository
	 * @param workflowstageRepository
	 * @param alertRepository
	 * @param workflowRepository
	 * @param notificationRepository
	 * @param attributesRepository
	 * @param converter
	 * @param htmltagRepository
	 * @param workflownodecfRepository
	 * @param workflowphaseRepository
	 */
	@Autowired
	public HtmlTagServiceImpl(ComponentRepository componentRepository, ModuleRepository moduleRepository, WorkflowNodeRepository workflownodeRepository, TranslationRepository translationRepository, WorkflowStageRepository workflowstageRepository, AlertRepository alertRepository, WorkflowRepository workflowRepository, NotificationRepository notificationRepository, AttributesRepository attributesRepository, ConversionService converter, HtmlTagRepository htmltagRepository, WorkflowNodeCFRepository workflownodecfRepository, WorkflowPhaseRepository workflowphaseRepository){
		this.htmltagRepository =htmltagRepository;
		 this.converter = converter;
		 this.attributesRepository = attributesRepository;
		 this.notificationRepository = notificationRepository;
		 this.componentRepository = componentRepository;
		 this.workflowRepository = workflowRepository;
		 this.workflowphaseRepository = workflowphaseRepository;
		 this.alertRepository = alertRepository;
		 this.workflowstageRepository = workflowstageRepository;
		 this.translationRepository = translationRepository;
		 this.workflownodeRepository = workflownodeRepository;
		 this.moduleRepository = moduleRepository;
		 this.workflownodecfRepository = workflownodecfRepository;
	}

	/**
	 *
	 * @param htmlTag
	 */
	@Override @Transactional(readOnly = false)
	public HtmlTagTo modifyHtmlTag(HtmlTagInput htmlTag){
		HtmlTagModel target= htmltagRepository.findById(htmlTag.getId()).orElseThrow(() -> new RuntimeException("HtmlTag not found"));
		 HtmlTagModel source= converter.convert(htmlTag,HtmlTagModel.class);
		 Utils.copyNotNulls(source,target);
		 return converter.convert(htmltagRepository.save(target), HtmlTagTo.class);
	}

}