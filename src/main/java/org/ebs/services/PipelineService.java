///////////////////////////////////////////////////////////
//  PipelineService.java
//  Macromedia ActionScript Implementation of the Interface PipelineService
//  Generated by Enterprise Architect
//  Created on:      17-May-2020 3:09:57 PM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.services;

import java.util.List;
import java.util.Optional;

import org.ebs.services.to.PipelineTo;
import org.ebs.services.to.Input.PipelineInput;
import org.ebs.util.FilterInput;
import org.ebs.util.PageInput;
import org.ebs.util.SortInput;
import org.springframework.data.domain.Page;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 17-May-2020 3:09:57 PM
 */
public interface PipelineService {

	/**
	 * 
	 * @param Pipeline
	 */
	public PipelineTo createPipeline(PipelineInput Pipeline);

	/**
	 * 
	 * @param idpipeline
	 */
	public int deletePipeline(int idpipeline);

	/**
	 * 
	 * @param pipelineId
	 */
	public Optional<PipelineTo> findPipeline(int pipelineId);

	/**
	 * 
	 * @param page
	 * @param sort
	 * @param filters
	 */
	public Page<PipelineTo> findPipelines(PageInput page, SortInput sort, List<FilterInput> filters);

	/**
	 * 
	 * @param pipeline
	 */
	public PipelineTo modifyPipeline(PipelineInput pipeline);

}