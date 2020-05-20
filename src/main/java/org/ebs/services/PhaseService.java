///////////////////////////////////////////////////////////
//  PhaseService.java
//  Macromedia ActionScript Implementation of the Interface PhaseService
//  Generated by Enterprise Architect
//  Created on:      17-May-2020 3:09:55 PM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.services;

import java.util.List;
import java.util.Optional;

import org.ebs.services.to.PhaseTo;
import org.ebs.services.to.Input.PhaseInput;
import org.ebs.util.FilterInput;
import org.ebs.util.PageInput;
import org.ebs.util.SortInput;
import org.springframework.data.domain.Page;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 17-May-2020 3:09:55 PM
 */
public interface PhaseService {

	/**
	 * 
	 * @param Phase
	 */
	public PhaseTo createPhase(PhaseInput Phase);

	/**
	 * 
	 * @param idphase
	 */
	public int deletePhase(int idphase);

	/**
	 * 
	 * @param phaseId
	 */
	public Optional<PhaseTo> findPhase(int phaseId);

	/**
	 * 
	 * @param page
	 * @param sort
	 * @param filters
	 */
	public Page<PhaseTo> findPhases(PageInput page, SortInput sort, List<FilterInput> filters);

	/**
	 * 
	 * @param phase
	 */
	public PhaseTo modifyPhase(PhaseInput phase);

}