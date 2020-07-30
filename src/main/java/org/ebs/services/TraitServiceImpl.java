///////////////////////////////////////////////////////////
//  TraitServiceImpl.java
//  Macromedia ActionScript Implementation of the Class TraitServiceImpl
//  Generated by Enterprise Architect
//  Created on:      27-Jul-2020 8:43:43 AM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.services;

import org.ebs.model.repos.TraitRepository;
import org.ebs.model.repos.TraitClassRepository;
import org.ebs.model.repos.AssayGeneRepository;
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
import org.ebs.services.to.TraitTo;
import org.ebs.services.to.Input.TraitInput;
import org.ebs.model.TraitModel;
import org.ebs.services.to.AssayGeneTo;
import org.ebs.services.to.TraitClassTo;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 27-Jul-2020 8:43:43 AM
 */
@Service @Transactional(readOnly = true)
  class TraitServiceImpl implements TraitService {

	private TraitRepository traitRepository;
	private ConversionService converter;
	public TraitClassRepository traitclassRepository;
	public AssayGeneRepository assaygeneRepository;

	/**
	 * 
	 * @param Trait
	 */
	@Override @Transactional(readOnly = false)
	public TraitTo createTrait(TraitInput Trait){
		TraitModel model = converter.convert(Trait,TraitModel.class); 
		 model.setId(0);
		  
		 model= traitRepository.save(model); 
		 return converter.convert(model, TraitTo.class); 
	}

	/**
	 * 
	 * @param traitId
	 */
	@Override @Transactional(readOnly = false)
	public int deleteTrait(int traitId){
		TraitModel trait = traitRepository.findById(traitId).orElseThrow(() -> new RuntimeException("Trait not found")); 
		 trait.setDeleted(true); 
		  traitRepository.save(trait); 
		 return traitId;
	}

	/**
	 * 
	 * @param traitId
	 */
	public Set<AssayGeneTo> findAssayGenes(int traitId){
		return assaygeneRepository.findByTraitId(traitId).stream().map(e -> converter.convert(e,AssayGeneTo.class)).collect(Collectors.toSet());
	}

	/**
	 * 
	 * @param traitId
	 */
	@Override
	public Optional<TraitTo> findTrait(int traitId){
		if(traitId <1) 
		 {return Optional.empty();} 
		 return traitRepository.findById(traitId).filter(r -> !r.getDeleted().booleanValue()).map(r -> converter.convert(r,TraitTo.class));
	}

	/**
	 * 
	 * @param traitId
	 */
	public Optional<TraitClassTo> findTraitClass(int traitId){
		return traitRepository.findById(traitId).map(r -> converter.convert(r.gettraitclass(),TraitClassTo.class));
	}

	/**
	 * 
	 * @param page
	 * @param sort
	 * @param filters
	 */
	@Override
	public Page<TraitTo> findTraits(PageInput page, SortInput sort, List<FilterInput> filters){
		return traitRepository.findByCriteria(TraitModel.class,filters,sort,page).map(r -> converter.convert(r,TraitTo.class));
	}

	/**
	 * 
	 * @param trait
	 */
	@Override @Transactional(readOnly = false)
	public TraitTo modifyTrait(TraitInput trait){
		TraitModel target= traitRepository.findById(trait.getId()).orElseThrow(() -> new RuntimeException("Trait not found")); 
		 TraitModel source= converter.convert(trait,TraitModel.class); 
		 Utils.copyNotNulls(source,target); 
		 return converter.convert(traitRepository.save(target), TraitTo.class);
	}

	/**
	 * 
	 * @param assaygeneRepository
	 * @param traitclassRepository
	 * @param converter
	 * @param traitRepository
	 */
	@Autowired
	public TraitServiceImpl(AssayGeneRepository assaygeneRepository, TraitClassRepository traitclassRepository, ConversionService converter, TraitRepository traitRepository){
		this.traitRepository =traitRepository; 
		 this.converter = converter;
		 this.traitclassRepository = traitclassRepository;
		 this.assaygeneRepository = assaygeneRepository;
	}

}