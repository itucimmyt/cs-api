///////////////////////////////////////////////////////////
//  ProcessService.java
//  Macromedia ActionScript Implementation of the Interface ProcessService
//  Generated by Enterprise Architect
//  Created on:      13-Mar-2021 12:02:49 AM
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
import org.ebs.services.to.NodeTo;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 13-Mar-2021 12:02:49 AM
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
	public Set<NodeTo> findNodes(int processId);

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
	 * @param process
	 */
	public ProcessTo modifyProcess(ProcessInput process);

}