///////////////////////////////////////////////////////////
//  HtmlTagResolver.java
//  Macromedia ActionScript Implementation of the Class HtmlTagResolver
//  Generated by Enterprise Architect
//  Created on:      04-Sep-2020 10:05:09 AM
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
 * @created 04-Sep-2020 10:05:09 AM
 */
@Component @Validated
public class HtmlTagResolver implements GraphQLResolver<HtmlTagTo> {

	private HtmlTagService htmltagService;

	/**
	 * 
	 * @param htmltag
	 */
	public Set<AlertTo> getAlerts(HtmlTagTo htmltag){
		return htmltagService.findalerts(htmltag.getId());
	}

	/**
	 * 
	 * @param htmltag
	 */
	public Set<AttributesTo> getAttributess(HtmlTagTo htmltag){
		return htmltagService.findattributess(htmltag.getId());
	}

	/**
	 * 
	 * @param htmltag
	 */
	public Set<ComponentTo> getComponents(HtmlTagTo htmltag){
		return htmltagService.findcomponents(htmltag.getId());
	}

	/**
	 * 
	 * @param htmltag
	 */
	public Set<ModuleTo> getModules(HtmlTagTo htmltag){
		return htmltagService.findmodules(htmltag.getId());
	}

	/**
	 * 
	 * @param htmltag
	 */
	public Set<NotificationTo> getNotifications(HtmlTagTo htmltag){
		return htmltagService.findnotifications(htmltag.getId());
	}

	/**
	 * 
	 * @param htmltag
	 */
	public Set<TranslationTo> getTranslations(HtmlTagTo htmltag){
		return htmltagService.findtranslations(htmltag.getId());
	}

	/**
	 * 
	 * @param htmltag
	 */
	public Set<WorkflowNodeCFTo> getWorkflownodecfs(HtmlTagTo htmltag){
		return htmltagService.findworkflownodecfs(htmltag.getId());
	}

	/**
	 * 
	 * @param htmltag
	 */
	public Set<WorkflowNodeTo> getWorkflownodes(HtmlTagTo htmltag){
		return htmltagService.findworkflownodes(htmltag.getId());
	}

	/**
	 * 
	 * @param htmltag
	 */
	public Set<WorkflowPhaseTo> getWorkflowphases(HtmlTagTo htmltag){
		return htmltagService.findworkflowphases(htmltag.getId());
	}

	/**
	 * 
	 * @param htmltag
	 */
	public Set<WorkflowTo> getWorkflows(HtmlTagTo htmltag){
		return htmltagService.findworkflows(htmltag.getId());
	}

	/**
	 * 
	 * @param htmltag
	 */
	public Set<WorkflowStageTo> getWorkflowstages(HtmlTagTo htmltag){
		return htmltagService.findworkflowstages(htmltag.getId());
	}

	/**
	 * 
	 * @param htmltagService
	 */
	@Autowired
	public HtmlTagResolver(HtmlTagService htmltagService){
		this.htmltagService = htmltagService; 
	
	}

}