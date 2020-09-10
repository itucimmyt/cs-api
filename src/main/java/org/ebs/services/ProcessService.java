///////////////////////////////////////////////////////////
//  ProcessService.java
//  Macromedia ActionScript Implementation of the Interface ProcessService
//  Generated by Enterprise Architect
//  Created on:      10-Sep-2020 12:19:47 AM
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
 * @created 10-Sep-2020 12:19:47 AM
 */
public interface ProcessService {

	/**
	 * 
	 * @param Process
	 */
	public ProcessTo createProcess(ProcessInput Process);

	/**
	 * 
	 * @param processId
	 */
	public int deleteProcess(int processId);

	/**
	 * 
	 * @param processId
	 */
	public Optional<ProcessTo> findProcess(int processId);

	/**
	 * 
	 * @param page
	 * @param sort
	 * @param filters
	 */
	public Page<ProcessTo> findProcesss(PageInput page, SortInput sort, List<FilterInput> filters);

	/**
	 * 
	 * @param processId
	 */
	public Set<WorkflowNodeTo> findWorkflowNodes(int processId);

	/**
	 * 
	 * @param process
	 */
	public ProcessTo modifyProcess(ProcessInput process);

}