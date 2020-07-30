///////////////////////////////////////////////////////////
//  WorkflowCFTypeService.java
//  Macromedia ActionScript Implementation of the Interface WorkflowCFTypeService
//  Generated by Enterprise Architect
//  Created on:      27-Jul-2020 8:43:51 AM
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
 * @created 27-Jul-2020 8:43:51 AM
 */
public interface WorkflowCFTypeService {

	/**
	 * 
	 * @param WorkflowCFType
	 */
	public WorkflowCFTypeTo createWorkflowCFType(WorkflowCFTypeInput WorkflowCFType);

	/**
	 * 
	 * @param workflowcftypeId
	 */
	public int deleteWorkflowCFType(int workflowcftypeId);

	/**
	 * 
	 * @param workflowcftypeId
	 */
	public Optional<WorkflowCFTypeTo> findWorkflowCFType(int workflowcftypeId);

	/**
	 * 
	 * @param page
	 * @param sort
	 * @param filters
	 */
	public Page<WorkflowCFTypeTo> findWorkflowCFTypes(PageInput page, SortInput sort, List<FilterInput> filters);

	/**
	 * 
	 * @param workflowcftypeId
	 */
	public Set<WorkflowNodeCFTo> findWorkflowNodeCFs(int workflowcftypeId);

	/**
	 * 
	 * @param workflowcftype
	 */
	public WorkflowCFTypeTo modifyWorkflowCFType(WorkflowCFTypeInput workflowcftype);

}