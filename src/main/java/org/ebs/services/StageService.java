///////////////////////////////////////////////////////////
//  StageService.java
//  Macromedia ActionScript Implementation of the Interface StageService
//  Generated by Enterprise Architect
//  Created on:      17-May-2020 3:10:21 PM
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
import org.ebs.model.repos.StageRepository;
import org.ebs.services.to.StageTo;
import org.ebs.services.to.Input.StageInput;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 17-May-2020 3:10:21 PM
 */
public interface StageService {

	/**
	 * 
	 * @param Stage
	 */
	public StageTo createStage(StageInput Stage);

	/**
	 * 
	 * @param idstage
	 */
	public int deleteStage(int idstage);

	/**
	 * 
	 * @param stageId
	 */
	public Optional<StageTo> findStage(int stageId);

	/**
	 * 
	 * @param page
	 * @param sort
	 * @param filters
	 */
	public Page<StageTo> findStages(PageInput page, SortInput sort, List<FilterInput> filters);

	/**
	 * 
	 * @param stage
	 */
	public StageTo modifyStage(StageInput stage);

}