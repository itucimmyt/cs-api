///////////////////////////////////////////////////////////
//  ProcessService.java
//  Macromedia ActionScript Implementation of the Interface ProcessService
//  Generated by Enterprise Architect
//  Created on:      17-May-2020 3:10:00 PM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.services;

import java.util.List;
import java.util.Optional;
import org.ebs.util.FilterInput;
import org.ebs.util.PageInput;
import org.ebs.util.SortInput;
import org.springframework.data.domain.Page;
import org.ebs.util.Utils;
import org.ebs.model.repos.ProcessRepository;
import org.ebs.services.to.ProcessTo;
import org.ebs.services.to.Input.ProcessInput;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 17-May-2020 3:10:00 PM
 */
public interface ProcessService {

	/**
	 * 
	 * @param Process
	 */
	public ProcessTo createProcess(ProcessInput Process);

	/**
	 * 
	 * @param idprocess
	 */
	public int deleteProcess(int idprocess);

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