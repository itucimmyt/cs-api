///////////////////////////////////////////////////////////
//  HtmlTagResolver.java
//  Macromedia ActionScript Implementation of the Class HtmlTagResolver
//  Generated by Enterprise Architect
//  Created on:      07-Sep-2020 8:11:18 AM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.graphql.resolvers;

import com.coxautodev.graphql.tools.GraphQLResolver;
import org.ebs.services.to.HtmlTagTo;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import java.util.Set;
import org.ebs.services.HtmlTagService;
import org.ebs.services.to.AttributesTo;
import org.ebs.services.to.NotificationTo;
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
 * @created 07-Sep-2020 8:11:18 AM
 */
@Component @Validated
public class HtmlTagResolver implements GraphQLResolver<HtmlTagTo> {

	private HtmlTagService htmlTagService;

	/**
	 * 
	 * @param htmlTag
	 */
	public Set<AlertTo> getAlerts(HtmlTagTo htmlTag){
		return htmlTagService.findAlerts(htmlTag.getId());
	}

	/**
	 * 
	 * @param htmlTag
	 */
	public Set<AttributesTo> getAttributess(HtmlTagTo htmlTag){
		return htmlTagService.findAttributess(htmlTag.getId());
	}

	/**
	 * 
	 * @param htmlTag
	 */
	public Set<ComponentTo> getComponents(HtmlTagTo htmlTag){
		return htmlTagService.findComponents(htmlTag.getId());
	}

	/**
	 * 
	 * @param htmlTag
	 */
	public Set<ModuleTo> getModules(HtmlTagTo htmlTag){
		return htmlTagService.findModules(htmlTag.getId());
	}

	/**
	 * 
	 * @param htmlTag
	 */
	public Set<NotificationTo> getNotifications(HtmlTagTo htmlTag){
		return htmlTagService.findNotifications(htmlTag.getId());
	}

	/**
	 * 
	 * @param htmlTag
	 */
	public Set<TranslationTo> getTranslations(HtmlTagTo htmlTag){
		return htmlTagService.findTranslations(htmlTag.getId());
	}

	/**
	 * 
	 * @param htmlTag
	 */
	public Set<WorkflowNodeCFTo> getWorkflowNodeCFs(HtmlTagTo htmlTag){
		return htmlTagService.findWorkflowNodeCFs(htmlTag.getId());
	}

	/**
	 * 
	 * @param htmlTag
	 */
	public Set<WorkflowNodeTo> getWorkflowNodes(HtmlTagTo htmlTag){
		return htmlTagService.findWorkflowNodes(htmlTag.getId());
	}

	/**
	 * 
	 * @param htmlTag
	 */
	public Set<WorkflowPhaseTo> getWorkflowPhases(HtmlTagTo htmlTag){
		return htmlTagService.findWorkflowPhases(htmlTag.getId());
	}

	/**
	 * 
	 * @param htmlTag
	 */
	public Set<WorkflowTo> getWorkflows(HtmlTagTo htmlTag){
		return htmlTagService.findWorkflows(htmlTag.getId());
	}

	/**
	 * 
	 * @param htmlTag
	 */
	public Set<WorkflowStageTo> getWorkflowStages(HtmlTagTo htmlTag){
		return htmlTagService.findWorkflowStages(htmlTag.getId());
	}

	/**
	 * 
	 * @param htmltagService
	 */
	@Autowired
	public HtmlTagResolver(HtmlTagService htmltagService){
		this.htmlTagService = htmltagService; 
	
	}

}