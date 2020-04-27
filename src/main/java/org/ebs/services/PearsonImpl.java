///////////////////////////////////////////////////////////
//  PearsonImpl.java
//  Macromedia ActionScript Implementation of the Class PearsonImpl
//  Generated by Enterprise Architect
//  Created on:      27-Apr-2020 9:47:47 AM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.services;

import org.ebs.util.FilterInput;
import org.ebs.util.PageInput;
import org.ebs.util.SortInput;
import org.ebs.util.Utils;
import org.springframework.core.convert.ConversionService;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import java.util.Optional;
import org.ebs.services.to.PearsonTo;
import org.ebs.services.to.Input.PearsonInput;
import org.ebs.model.PearsonModel;
import org.ebs.model.repos.PearsonRepository;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 27-Apr-2020 9:47:47 AM
 */
@Service @Transactional(readOnly = true)
public class PearsonImpl implements PearsonService {

	@Autowired
	private ConversionService converter;
	private PearsonRepository pearsonRepository;

	/**
	 * 
	 * @param Pearson
	 */
	@Override @Transactional(readOnly = false)
	public PearsonTo createPearson(PearsonInput Pearson){
		PearsonModel model = converter.convert(Pearson,PearsonModel.class); 
		 model.setId(0); 
		 model= pearsonRepository.save(model); 
		 return converter.convert(model, PearsonTo.class); 
	}

	/**
	 * 
	 * @param idpearson
	 */
	@Override @Transactional(readOnly = false)
	public int deletePearson(int idpearson){
		PearsonModel pearson = pearsonRepository.findById(idpearson).orElseThrow(() -> new RuntimeException("Request not found")); 
		 pearson.setDeleted(true); 
		  pearsonRepository.save(pearson); 
		 return idpearson;
	}

	/**
	 * 
	 * @param pearsonId
	 */
	@Override
	public Optional<PearsonTo> findPearson(int pearsonId){
		if(pearsonId <1) 
		 {return Optional.empty();} 
		 return pearsonRepository.findById(pearsonId).filter(r -> !r.getDeleted().booleanValue()).map(r -> converter.convert(r,PearsonTo.class));
	}

	/**
	 * 
	 * @param page
	 * @param sort
	 * @param filters
	 */
	@Override
	public Page<PearsonTo> findPearsons(PageInput page, SortInput sort, List<FilterInput> filters){
		return pearsonRepository.findByCriteria(PearsonModel.class,filters,sort,page).map(r -> converter.convert(r,PearsonTo.class));
	}

	/**
	 * 
	 * @param pearson
	 */
	@Override @Transactional(readOnly = false)
	public PearsonTo modifyPearson(PearsonInput pearson){
		PearsonModel target= pearsonRepository.findById(pearson.getId()).orElseThrow(() -> new RuntimeException("Request not found")); 
		 PearsonModel source= converter.convert(pearson,PearsonModel.class); 
		 Utils.copyNotNulls(source,target); 
		 return converter.convert(pearsonRepository.save(target), PearsonTo.class);
	}

	/**
	 * 
	 * @param pearsonRepository
	 */
	@Autowired
	public PearsonImpl(PearsonRepository pearsonRepository){
		this.pearsonRepository =pearsonRepository;
	}

}