///////////////////////////////////////////////////////////
//  HtmlTagService.java
//  Macromedia ActionScript Implementation of the Interface HtmlTagService
//  Generated by Enterprise Architect
//  Created on:      09-Aug-2020 4:50:44 PM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.services;

import java.util.List;
import java.util.Optional;
import org.ebs.util.FilterInput;
import org.ebs.util.PageInput;
import org.ebs.util.SortInput;
import org.springframework.data.domain.Page;
import java.util.Set;
import org.springframework.stereotype.Component;
import org.ebs.services.to.HtmlTagTo;
import org.ebs.services.to.Input.HtmlTagInput;
import org.ebs.services.to.AttributesTo;
import org.ebs.services.to.MessageTo;
import org.ebs.services.to.ComponentTo;
import org.ebs.services.to.WorkflowTo;
import org.ebs.services.to.WorkflowPhaseTo;
import org.ebs.services.to.AlertTo;
import org.ebs.services.to.WorkflowStageTo;
import org.ebs.services.to.TranslationTo;
import org.ebs.services.to.WorkflowNodeTo;
import org.ebs.services.to.ModuleTo;
import org.ebs.services.to.WorkflowNodeCFTo;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 09-Aug-2020 4:50:44 PM
 */
public interface HtmlTagService {

	/**
	 * 
	 * @param HtmlTag
	 */
	public HtmlTagTo createHtmlTag(HtmlTagInput HtmlTag);

	/**
	 * 
	 * @param htmltagId
	 */
	public int deleteHtmlTag(int htmltagId);

	/**
	 * 
	 * @param htmltagId
	 */
	public Set<AlertTo> findAlerts(int htmltagId);

	/**
	 * 
	 * @param htmltagId
	 */
	public Set<AttributesTo> findAttributess(int htmltagId);

	/**
	 * 
	 * @param htmltagId
	 */
	public Set<ComponentTo> findComponents(int htmltagId);

	/**
	 * 
	 * @param htmltagId
	 */
	public Optional<HtmlTagTo> findHtmlTag(int htmltagId);

	/**
	 * 
	 * @param page
	 * @param sort
	 * @param filters
	 */
	public Page<HtmlTagTo> findHtmlTags(PageInput page, SortInput sort, List<FilterInput> filters);

	/**
	 * 
	 * @param htmltagId
	 */
	public Set<MessageTo> findMessages(int htmltagId);

	/**
	 * 
	 * @param htmltagId
	 */
	public Set<ModuleTo> findModules(int htmltagId);

	/**
	 * 
	 * @param htmltagId
	 */
	public Set<TranslationTo> findTranslations(int htmltagId);

	/**
	 * 
	 * @param htmltagId
	 */
	public Set<WorkflowNodeCFTo> findWorkflowNodeCFs(int htmltagId);

	/**
	 * 
	 * @param htmltagId
	 */
	public Set<WorkflowNodeTo> findWorkflowNodes(int htmltagId);

	/**
	 * 
	 * @param htmltagId
	 */
	public Set<WorkflowPhaseTo> findWorkflowPhases(int htmltagId);

	/**
	 * 
	 * @param htmltagId
	 */
	public Set<WorkflowTo> findWorkflows(int htmltagId);

	/**
	 * 
	 * @param htmltagId
	 */
	public Set<WorkflowStageTo> findWorkflowStages(int htmltagId);

	/**
	 * 
	 * @param htmltag
	 */
	public HtmlTagTo modifyHtmlTag(HtmlTagInput htmltag);

}