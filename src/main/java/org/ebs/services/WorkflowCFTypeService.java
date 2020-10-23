///////////////////////////////////////////////////////////
//  WorkflowCFTypeService.java
//  Macromedia ActionScript Implementation of the Interface WorkflowCFTypeService
//  Generated by Enterprise Architect
//  Created on:      04-Sep-2020 10:06:29 AM
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
import org.ebs.services.to.WorkflowCFTypeTo;
import org.ebs.services.to.Input.WorkflowCFTypeInput;
import org.ebs.services.to.WorkflowNodeCFTo;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 04-Sep-2020 10:06:29 AM
 */
public interface WorkflowCFTypeService {

	/**
	 *
	 * @param WorkflowCFType
	 */
	public WorkflowCFTypeTo createworkflowcftype(WorkflowCFTypeInput WorkflowCFType);

	/**
	 *
	 * @param workflowcftypeId
	 */
	public int deleteworkflowcftype(int workflowcftypeId);

	/**
	 *
	 * @param workflowcftypeId
	 */
	public Optional<WorkflowCFTypeTo> findworkflowcftype(int workflowcftypeId);

	/**
	 *
	 * @param page
	 * @param sort
	 * @param filters
	 */
	public Page<WorkflowCFTypeTo> findworkflowcftypes(PageInput page, SortInput sort, List<FilterInput> filters, boolean disjunctionFilters);

	/**
	 *
	 * @param workflowcftypeId
	 */
	public Set<WorkflowNodeCFTo> findworkflownodecfs(int workflowcftypeId);

	/**
	 *
	 * @param workflowcftype
	 */
	public WorkflowCFTypeTo modifyworkflowcftype(WorkflowCFTypeInput workflowcftype);

}