///////////////////////////////////////////////////////////
//  TraitClassServiceImpl.java
//  Macromedia ActionScript Implementation of the Class TraitClassServiceImpl
//  Generated by Enterprise Architect
//  Created on:      27-Jul-2020 8:43:42 AM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.services;

import org.ebs.model.repos.TraitRepository;
import org.ebs.model.repos.TraitClassRepository;
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
import org.springframework.core.convert.ConversionService;
import java.util.stream.Collectors;
import java.util.Set;
import org.ebs.services.to.TraitClassTo;
import org.ebs.services.to.Input.TraitClassInput;
import org.ebs.model.TraitClassModel;
import org.ebs.services.to.TraitTo;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 27-Jul-2020 8:43:42 AM
 */
@Service @Transactional(readOnly = true)
  class TraitClassServiceImpl implements TraitClassService {

	private TraitClassRepository traitclassRepository;
	private ConversionService converter;
	private TraitRepository traitRepository;

	/**
	 * 
	 * @param TraitClass
	 */
	@Override @Transactional(readOnly = false)
	public TraitClassTo createTraitClass(TraitClassInput TraitClass){
		TraitClassModel model = converter.convert(TraitClass,TraitClassModel.class); 
		 model.setId(0);
		  
		 model= traitclassRepository.save(model); 
		 return converter.convert(model, TraitClassTo.class); 
	}

	/**
	 * 
	 * @param traitclassId
	 */
	@Override @Transactional(readOnly = false)
	public int deleteTraitClass(int traitclassId){
		TraitClassModel traitclass = traitclassRepository.findById(traitclassId).orElseThrow(() -> new RuntimeException("TraitClass not found")); 
		 traitclass.setDeleted(true); 
		  traitclassRepository.save(traitclass); 
		 return traitclassId;
	}

	/**
	 * 
	 * @param traitclassId
	 */
	@Override
	public Optional<TraitClassTo> findTraitClass(int traitclassId){
		if(traitclassId <1) 
		 {return Optional.empty();} 
		 return traitclassRepository.findById(traitclassId).filter(r -> !r.getDeleted().booleanValue()).map(r -> converter.convert(r,TraitClassTo.class));
	}

	/**
	 * 
	 * @param page
	 * @param sort
	 * @param filters
	 */
	@Override
	public Page<TraitClassTo> findTraitClasss(PageInput page, SortInput sort, List<FilterInput> filters){
		return traitclassRepository.findByCriteria(TraitClassModel.class,filters,sort,page).map(r -> converter.convert(r,TraitClassTo.class));
	}

	/**
	 * 
	 * @param traitclassId
	 */
	public Set<TraitTo> findTraits(int traitclassId){
		return traitRepository.findByTraitclassId(traitclassId).stream().map(e -> converter.convert(e,TraitTo.class)).collect(Collectors.toSet());
	}

	/**
	 * 
	 * @param traitclass
	 */
	@Override @Transactional(readOnly = false)
	public TraitClassTo modifyTraitClass(TraitClassInput traitclass){
		TraitClassModel target= traitclassRepository.findById(traitclass.getId()).orElseThrow(() -> new RuntimeException("TraitClass not found")); 
		 TraitClassModel source= converter.convert(traitclass,TraitClassModel.class); 
		 Utils.copyNotNulls(source,target); 
		 return converter.convert(traitclassRepository.save(target), TraitClassTo.class);
	}

	/**
	 * 
	 * @param traitRepository
	 * @param converter
	 * @param traitclassRepository
	 */
	@Autowired
	public TraitClassServiceImpl(TraitRepository traitRepository, ConversionService converter, TraitClassRepository traitclassRepository){
		this.traitclassRepository =traitclassRepository; 
		 this.converter = converter;
		 this.traitRepository = traitRepository;
	}

}