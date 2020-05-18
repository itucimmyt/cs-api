///////////////////////////////////////////////////////////
//  StageImpl.java
//  Macromedia ActionScript Implementation of the Class StageImpl
//  Generated by Enterprise Architect
//  Created on:      17-May-2020 3:10:20 PM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.services;

import org.springframework.core.convert.ConversionService;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import java.util.Optional;
import org.ebs.util.FilterInput;
import org.ebs.util.PageInput;
import org.ebs.util.SortInput;
import org.ebs.util.Utils;
import org.ebs.services.to.StageTo;
import org.ebs.services.to.Input.StageInput;
import org.ebs.model.StageModel;
import org.ebs.model.repos.StageRepository;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 17-May-2020 3:10:20 PM
 */
@Service @Transactional(readOnly = true)
public class StageImpl implements StageService {

	private StageRepository stageRepository;
	@Autowired
	private ConversionService converter;

	/**
	 * 
	 * @param Stage
	 */
	@Override @Transactional(readOnly = false)
	public StageTo createStage(StageInput Stage){
		StageModel model = converter.convert(Stage,StageModel.class); 
		 model.setId(0);
		  
		 model= stageRepository.save(model); 
		 return converter.convert(model, StageTo.class); 
	}

	/**
	 * 
	 * @param idstage
	 */
	@Override @Transactional(readOnly = false)
	public int deleteStage(int idstage){
		StageModel stage = stageRepository.findById(idstage).orElseThrow(() -> new RuntimeException("Request not found")); 
		 stage.setDeleted(true); 
		  stageRepository.save(stage); 
		 return idstage;
	}

	/**
	 * 
	 * @param stageId
	 */
	@Override
	public Optional<StageTo> findStage(int stageId){
		if(stageId <1) 
		 {return Optional.empty();} 
		 return stageRepository.findById(stageId).filter(r -> !r.getDeleted().booleanValue()).map(r -> converter.convert(r,StageTo.class));
	}

	/**
	 * 
	 * @param page
	 * @param sort
	 * @param filters
	 */
	@Override
	public Page<StageTo> findStages(PageInput page, SortInput sort, List<FilterInput> filters){
		return stageRepository.findByCriteria(StageModel.class,filters,sort,page).map(r -> converter.convert(r,StageTo.class));
	}

	/**
	 * 
	 * @param stage
	 */
	@Override @Transactional(readOnly = false)
	public StageTo modifyStage(StageInput stage){
		StageModel target= stageRepository.findById(stage.getId()).orElseThrow(() -> new RuntimeException("Request not found")); 
		 StageModel source= converter.convert(stage,StageModel.class); 
		 Utils.copyNotNulls(source,target); 
		 return converter.convert(stageRepository.save(target), StageTo.class);
	}

	/**
	 * 
	 * @param stageRepository
	 */
	@Autowired
	public StageImpl(StageRepository stageRepository){
		this.stageRepository =stageRepository;
	}

}