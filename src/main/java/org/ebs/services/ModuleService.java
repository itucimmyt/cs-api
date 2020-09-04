///////////////////////////////////////////////////////////
//  ModuleService.java
//  Macromedia ActionScript Implementation of the Interface ModuleService
//  Generated by Enterprise Architect
//  Created on:      04-Sep-2020 10:05:20 AM
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
import org.ebs.services.to.ModuleTo;
import org.ebs.services.to.Input.ModuleInput;
import org.ebs.services.to.ComponentTo;
import org.ebs.services.to.HtmlTagTo;
import org.ebs.services.to.WorkflowNodeTo;
import org.ebs.services.to.ActionTo;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 04-Sep-2020 10:05:20 AM
 */
public interface ModuleService {

	/**
	 * 
	 * @param Module
	 */
	public ModuleTo createmodule(ModuleInput Module);

	/**
	 * 
	 * @param moduleId
	 */
	public int deletemodule(int moduleId);

	/**
	 * 
	 * @param moduleId
	 */
	public Set<ActionTo> findactions(int moduleId);

	/**
	 * 
	 * @param moduleId
	 */
	public Optional<ComponentTo> findcomponent(int moduleId);

	/**
	 * 
	 * @param moduleId
	 */
	public Optional<HtmlTagTo> findhtmltag(int moduleId);

	/**
	 * 
	 * @param moduleId
	 */
	public Optional<ModuleTo> findmodule(int moduleId);

	/**
	 * 
	 * @param page
	 * @param sort
	 * @param filters
	 */
	public Page<ModuleTo> findmodules(PageInput page, SortInput sort, List<FilterInput> filters);

	/**
	 * 
	 * @param moduleId
	 */
	public Set<WorkflowNodeTo> findworkflownodes(int moduleId);

	/**
	 * 
	 * @param module
	 */
	public ModuleTo modifymodule(ModuleInput module);

}