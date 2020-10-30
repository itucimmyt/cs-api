///////////////////////////////////////////////////////////
//  TraitClassServiceImpl.java
//  Macromedia ActionScript Implementation of the Class TraitClassServiceImpl
//  Generated by Enterprise Architect
//  Created on:      10-Sep-2020 10:44:50 PM
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
 * @created 10-Sep-2020 10:44:50 PM
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
	 * @param traitClassId
	 */
	@Override @Transactional(readOnly = false)
	public int deleteTraitClass(int traitClassId){
		TraitClassModel traitclass = traitclassRepository.findById(traitClassId).orElseThrow(() -> new RuntimeException("TraitClass not found"));
		 traitclass.setDeleted(true);
		  traitclassRepository.save(traitclass);
		 return traitClassId;
	}

	/**
	 *
	 * @param traitClassId
	 */
	@Override
	public Optional<TraitClassTo> findTraitClass(int traitClassId){
		if(traitClassId <1)
		 {return Optional.empty();}
		 return traitclassRepository.findById(traitClassId).filter(r -> !r.getDeleted().booleanValue()).map(r -> converter.convert(r,TraitClassTo.class));
	}

	/**
	 *
	 * @param page
	 * @param sort
	 * @param filters
	 */
	@Override
	public Page<TraitClassTo> findTraitClasss(PageInput page, SortInput sort, List<FilterInput> filters, boolean disjunctionFilters){
		return traitclassRepository.findByCriteria(TraitClassModel.class,filters,sort,page,disjunctionFilters).map(r -> converter.convert(r,TraitClassTo.class));
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
	 * @param traitClass
	 */
	@Override @Transactional(readOnly = false)
	public TraitClassTo modifyTraitClass(TraitClassInput traitClass){
		TraitClassModel target= traitclassRepository.findById(traitClass.getId()).orElseThrow(() -> new RuntimeException("TraitClass not found"));
		 TraitClassModel source= converter.convert(traitClass,TraitClassModel.class);
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