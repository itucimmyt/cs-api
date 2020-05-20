///////////////////////////////////////////////////////////
//  PhaseImpl.java
//  Macromedia ActionScript Implementation of the Class PhaseImpl
//  Generated by Enterprise Architect
//  Created on:      17-May-2020 3:09:54 PM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.services;

import java.util.List;
import java.util.Optional;

import org.ebs.model.PhaseModel;
import org.ebs.model.PipelineModel;
import org.ebs.model.repos.PhaseRepository;
import org.ebs.model.repos.PipelineRepository;
import org.ebs.services.to.PhaseTo;
import org.ebs.services.to.Input.PhaseInput;
import org.ebs.util.FilterInput;
import org.ebs.util.PageInput;
import org.ebs.util.SortInput;
import org.ebs.util.Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.ConversionService;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 17-May-2020 3:09:54 PM
 */
@Service @Transactional(readOnly = true)
public class PhaseImpl implements PhaseService {

	private PhaseRepository phaseRepository;
	@Autowired
	private ConversionService converter;
	@Autowired
	private PipelineRepository pipelineRepository;

	/**
	 * 
	 * @param Phase
	 */
	@Override @Transactional(readOnly = false)
	public PhaseTo createPhase(PhaseInput Phase){
		PhaseModel model = converter.convert(Phase,PhaseModel.class); 
		 model.setId(0);
		 PipelineModel pipelineModel = pipelineRepository.findById(Phase.getPipeline().getId()).get(); 
		model.setPipeline(pipelineModel); 
		 
		 model= phaseRepository.save(model); 
		 return converter.convert(model, PhaseTo.class); 
	}

	/**
	 * 
	 * @param idphase
	 */
	@Override @Transactional(readOnly = false)
	public int deletePhase(int idphase){
		PhaseModel phase = phaseRepository.findById(idphase).orElseThrow(() -> new RuntimeException("Request not found")); 
		 phase.setDeleted(true); 
		  phaseRepository.save(phase); 
		 return idphase;
	}

	/**
	 * 
	 * @param phaseId
	 */
	@Override
	public Optional<PhaseTo> findPhase(int phaseId){
		if(phaseId <1) 
		 {return Optional.empty();} 
		 return phaseRepository.findById(phaseId).filter(r -> !r.getDeleted().booleanValue()).map(r -> converter.convert(r,PhaseTo.class));
	}

	/**
	 * 
	 * @param page
	 * @param sort
	 * @param filters
	 */
	@Override
	public Page<PhaseTo> findPhases(PageInput page, SortInput sort, List<FilterInput> filters){
		return phaseRepository.findByCriteria(PhaseModel.class,filters,sort,page).map(r -> converter.convert(r,PhaseTo.class));
	}

	/**
	 * 
	 * @param phase
	 */
	@Override @Transactional(readOnly = false)
	public PhaseTo modifyPhase(PhaseInput phase){
		PhaseModel target= phaseRepository.findById(phase.getId()).orElseThrow(() -> new RuntimeException("Request not found")); 
		 PhaseModel source= converter.convert(phase,PhaseModel.class); 
		 Utils.copyNotNulls(source,target); 
		 return converter.convert(phaseRepository.save(target), PhaseTo.class);
	}

	/**
	 * 
	 * @param phaseRepository
	 */
	@Autowired
	public PhaseImpl(PhaseRepository phaseRepository){
		this.phaseRepository =phaseRepository;
	}

}