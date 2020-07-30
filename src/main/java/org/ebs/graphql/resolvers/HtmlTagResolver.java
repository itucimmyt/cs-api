///////////////////////////////////////////////////////////
//  HtmlTagResolver.java
//  Macromedia ActionScript Implementation of the Class HtmlTagResolver
//  Generated by Enterprise Architect
//  Created on:      27-Jul-2020 8:42:35 AM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.graphql.resolvers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import java.util.Set;
import org.ebs.services.HtmlTagService;
import org.ebs.services.to.TranslationTo;
import org.ebs.services.to.AlertTo;
import org.ebs.services.to.AttributesTo;
import org.ebs.services.to.ModuleTo;
import org.ebs.services.to.ComponentTo;
import org.ebs.services.to.MessageTo;
import org.ebs.services.to.WorkflowStageTo;
import com.coxautodev.graphql.tools.GraphQLResolver;
import org.ebs.services.to.HtmlTagTo;
import org.springframework.stereotype.Component;
import org.ebs.services.to.WorkflowPhaseTo;
import org.ebs.services.to.WorkflowTo;
import org.ebs.services.to.WorkflowNodeTo;
import org.ebs.services.to.WorkflowNodeCFTo;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 27-Jul-2020 8:42:35 AM
 */
@Component @Validated
public class HtmlTagResolver implements GraphQLResolver<HtmlTagTo> {

	private HtmlTagService htmltagService;

	/**
	 * 
	 * @param htmltag
	 */
	public Set<AlertTo> getAlerts(HtmlTagTo htmltag){
		return htmltagService.findAlerts(htmltag.getId());
	}

	/**
	 * 
	 * @param htmltag
	 */
	public Set<AttributesTo> getAttributess(HtmlTagTo htmltag){
		return htmltagService.findAttributess(htmltag.getId());
	}

	/**
	 * 
	 * @param htmltag
	 */
	public Set<ComponentTo> getComponents(HtmlTagTo htmltag){
		return htmltagService.findComponents(htmltag.getId());
	}

	/**
	 * 
	 * @param htmltag
	 */
	public Set<MessageTo> getMessages(HtmlTagTo htmltag){
		return htmltagService.findMessages(htmltag.getId());
	}

	/**
	 * 
	 * @param htmltag
	 */
	public Set<ModuleTo> getModules(HtmlTagTo htmltag){
		return htmltagService.findModules(htmltag.getId());
	}

	/**
	 * 
	 * @param htmltag
	 */
	public Set<TranslationTo> getTranslations(HtmlTagTo htmltag){
		return htmltagService.findTranslations(htmltag.getId());
	}

	/**
	 * 
	 * @param htmltag
	 */
	public Set<WorkflowNodeCFTo> getWorkflownodecfs(HtmlTagTo htmltag){
		return htmltagService.findWorkflowNodeCFs(htmltag.getId());
	}

	/**
	 * 
	 * @param htmltag
	 */
	public Set<WorkflowNodeTo> getWorkflownodes(HtmlTagTo htmltag){
		return htmltagService.findWorkflowNodes(htmltag.getId());
	}

	/**
	 * 
	 * @param htmltag
	 */
	public Set<WorkflowPhaseTo> getWorkflowphases(HtmlTagTo htmltag){
		return htmltagService.findWorkflowPhases(htmltag.getId());
	}

	/**
	 * 
	 * @param htmltag
	 */
	public Set<WorkflowTo> getWorkflows(HtmlTagTo htmltag){
		return htmltagService.findWorkflows(htmltag.getId());
	}

	/**
	 * 
	 * @param htmltag
	 */
	public Set<WorkflowStageTo> getWorkflowstages(HtmlTagTo htmltag){
		return htmltagService.findWorkflowStages(htmltag.getId());
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