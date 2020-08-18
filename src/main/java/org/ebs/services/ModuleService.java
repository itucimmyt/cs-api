///////////////////////////////////////////////////////////
//  ModuleService.java
//  Macromedia ActionScript Implementation of the Interface ModuleService
//  Generated by Enterprise Architect
//  Created on:      09-Aug-2020 4:50:54 PM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.services;

import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.ebs.services.to.ActionTo;
import org.ebs.services.to.ComponentTo;
import org.ebs.services.to.HtmlTagTo;
import org.ebs.services.to.ModuleTo;
import org.ebs.services.to.WorkflowNodeTo;
import org.ebs.services.to.Input.ModuleInput;
import org.ebs.util.FilterInput;
import org.ebs.util.PageInput;
import org.ebs.util.SortInput;
import org.springframework.data.domain.Page;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 09-Aug-2020 4:50:54 PM
 */
public interface ModuleService {

	/**
	 * 
	 * @param Module
	 */
	public ModuleTo createModule(ModuleInput Module);

	/**
	 * 
	 * @param moduleId
	 */
	public int deleteModule(int moduleId);

	/**
	 * 
	 * @param moduleId
	 */
	public Set<ActionTo> findActions(int moduleId);

	/**
	 * 
	 * @param moduleId
	 */
	public Optional<ComponentTo> findComponent(int moduleId);

	/**
	 * 
	 * @param moduleId
	 */
	public Optional<HtmlTagTo> findHtmlTag(int moduleId);

	/**
	 * 
	 * @param moduleId
	 */
	public Optional<ModuleTo> findModule(int moduleId);

	/**
	 * 
	 * @param page
	 * @param sort
	 * @param filters
	 */
	public Page<ModuleTo> findModules(PageInput page, SortInput sort, List<FilterInput> filters);

	/**
	 * 
	 * @param moduleId
	 */
	public Set<WorkflowNodeTo> findWorkflowNodes(int moduleId);

	/**
	 * 
	 * @param module
	 */
	public ModuleTo modifyModule(ModuleInput module);

}