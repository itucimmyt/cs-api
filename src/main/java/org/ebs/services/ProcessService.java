///////////////////////////////////////////////////////////
//  ProcessService.java
//  Macromedia ActionScript Implementation of the Interface ProcessService
//  Generated by Enterprise Architect
//  Created on:      04-Sep-2020 10:05:41 AM
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
import org.ebs.services.to.ProcessTo;
import org.ebs.services.to.Input.ProcessInput;
import org.ebs.services.to.WorkflowNodeTo;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 04-Sep-2020 10:05:41 AM
 */
public interface ProcessService {

	/**
	 *
	 * @param Process
	 */
	public ProcessTo createprocess(ProcessInput Process);

	/**
	 *
	 * @param processId
	 */
	public int deleteprocess(int processId);

	/**
	 *
	 * @param processId
	 */
	public Optional<ProcessTo> findprocess(int processId);

	/**
	 *
	 * @param page
	 * @param sort
	 * @param filters
	 */
	public Page<ProcessTo> findprocesss(PageInput page, SortInput sort, List<FilterInput> filters, boolean disjunctionFilters);

	/**
	 *
	 * @param processId
	 */
	public Set<WorkflowNodeTo> findworkflownodes(int processId);

	/**
	 *
	 * @param process
	 */
	public ProcessTo modifyprocess(ProcessInput process);

}