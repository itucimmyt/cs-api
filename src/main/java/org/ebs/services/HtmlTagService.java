///////////////////////////////////////////////////////////
//  HtmlTagService.java
//  Macromedia ActionScript Implementation of the Interface HtmlTagService
//  Generated by Enterprise Architect
//  Created on:      04-Sep-2020 10:05:09 AM
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
import org.ebs.services.to.NotificationTo;
import org.ebs.services.to.ComponentTo;
import org.ebs.services.to.WorkflowTo;
import org.ebs.services.to.WorkflowPhaseTo;
import org.ebs.services.to.AlertTo;
import org.ebs.services.to.AttributesTo;
import org.ebs.services.to.WorkflowStageTo;
import org.ebs.services.to.TranslationTo;
import org.ebs.services.to.WorkflowNodeTo;
import org.ebs.services.to.ModuleTo;
import org.ebs.services.to.WorkflowNodeCFTo;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 04-Sep-2020 10:05:09 AM
 */
public interface HtmlTagService {

	/**
	 * 
	 * @param HtmlTag
	 */
	public HtmlTagTo createhtmltag(HtmlTagInput HtmlTag);

	/**
	 * 
	 * @param htmltagId
	 */
	public int deletehtmltag(int htmltagId);

	/**
	 * 
	 * @param htmltagId
	 */
	public Set<AlertTo> findalerts(int htmltagId);

	/**
	 * 
	 * @param htmltagId
	 */
	public Set<AttributesTo> findattributess(int htmltagId);

	/**
	 * 
	 * @param htmltagId
	 */
	public Set<ComponentTo> findcomponents(int htmltagId);

	/**
	 * 
	 * @param htmltagId
	 */
	public Optional<HtmlTagTo> findhtmltag(int htmltagId);

	/**
	 * 
	 * @param page
	 * @param sort
	 * @param filters
	 */
	public Page<HtmlTagTo> findhtmltags(PageInput page, SortInput sort, List<FilterInput> filters);

	/**
	 * 
	 * @param htmltagId
	 */
	public Set<ModuleTo> findmodules(int htmltagId);

	/**
	 * 
	 * @param htmltagId
	 */
	public Set<NotificationTo> findnotifications(int htmltagId);

	/**
	 * 
	 * @param htmltagId
	 */
	public Set<TranslationTo> findtranslations(int htmltagId);

	/**
	 * 
	 * @param htmltagId
	 */
	public Set<WorkflowNodeCFTo> findworkflownodecfs(int htmltagId);

	/**
	 * 
	 * @param htmltagId
	 */
	public Set<WorkflowNodeTo> findworkflownodes(int htmltagId);

	/**
	 * 
	 * @param htmltagId
	 */
	public Set<WorkflowPhaseTo> findworkflowphases(int htmltagId);

	/**
	 * 
	 * @param htmltagId
	 */
	public Set<WorkflowTo> findworkflows(int htmltagId);

	/**
	 * 
	 * @param htmltagId
	 */
	public Set<WorkflowStageTo> findworkflowstages(int htmltagId);

	/**
	 * 
	 * @param htmltag
	 */
	public HtmlTagTo modifyhtmltag(HtmlTagInput htmltag);

}