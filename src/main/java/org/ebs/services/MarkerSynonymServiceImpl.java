///////////////////////////////////////////////////////////
//  MarkerSynonymServiceImpl.java
//  Macromedia ActionScript Implementation of the Class MarkerSynonymServiceImpl
//  Generated by Enterprise Architect
//  Created on:      20-Aug-2020 1:05:53 PM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.services;

import org.ebs.model.MarkerModel;
import org.ebs.model.repos.MarkerRepository;
import org.ebs.model.repos.MarkerSynonymRepository;
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
import org.ebs.services.to.MarkerSynonymTo;
import org.ebs.services.to.Input.MarkerSynonymInput;
import org.ebs.model.MarkerSynonymModel;
import org.ebs.services.to.MarkerTo;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 20-Aug-2020 1:05:53 PM
 */
@Service @Transactional(readOnly = true)
  class MarkerSynonymServiceImpl implements MarkerSynonymService {

	private MarkerSynonymRepository markersynonymRepository;
	private ConversionService converter;
	private MarkerRepository markerRepository;

	/**
	 * 
	 * @param MarkerSynonym
	 */
	@Override @Transactional(readOnly = false)
	public MarkerSynonymTo createMarkerSynonym(MarkerSynonymInput MarkerSynonym){
		MarkerSynonymModel model = converter.convert(MarkerSynonym,MarkerSynonymModel.class); 
		 model.setId(0);
		 MarkerModel markerModel = markerRepository.findById(MarkerSynonym.getmarker().getId()).get(); 
		model.setmarker(markerModel); 
		 
		 model= markersynonymRepository.save(model); 
		 return converter.convert(model, MarkerSynonymTo.class); 
	}

	/**
	 * 
	 * @param markersynonymId
	 */
	@Override @Transactional(readOnly = false)
	public int deleteMarkerSynonym(int markersynonymId){
		MarkerSynonymModel markersynonym = markersynonymRepository.findById(markersynonymId).orElseThrow(() -> new RuntimeException("MarkerSynonym not found")); 
		 markersynonym.setDeleted(true); 
		  markersynonymRepository.save(markersynonym); 
		 return markersynonymId;
	}

	/**
	 * 
	 * @param markersynonymId
	 */
	public Optional<MarkerTo> findMarker(int markersynonymId){
		return markersynonymRepository.findById(markersynonymId).map(r -> converter.convert(r.getmarker(),MarkerTo.class));
	}

	/**
	 * 
	 * @param markersynonymId
	 */
	@Override
	public Optional<MarkerSynonymTo> findMarkerSynonym(int markersynonymId){
		if(markersynonymId <1) 
		 {return Optional.empty();} 
		 return markersynonymRepository.findById(markersynonymId).filter(r -> !r.getDeleted().booleanValue()).map(r -> converter.convert(r,MarkerSynonymTo.class));
	}

	/**
	 * 
	 * @param page
	 * @param sort
	 * @param filters
	 */
	@Override
	public Page<MarkerSynonymTo> findMarkerSynonyms(PageInput page, SortInput sort, List<FilterInput> filters){
		return markersynonymRepository.findByCriteria(MarkerSynonymModel.class,filters,sort,page).map(r -> converter.convert(r,MarkerSynonymTo.class));
	}

	/**
	 * 
	 * @param markerRepository
	 * @param converter
	 * @param markersynonymRepository
	 */
	@Autowired
	public MarkerSynonymServiceImpl(MarkerRepository markerRepository, ConversionService converter, MarkerSynonymRepository markersynonymRepository){
		this.markersynonymRepository =markersynonymRepository; 
		 this.converter = converter;
		 this.markerRepository = markerRepository;
	}

	/**
	 * 
	 * @param markersynonym
	 */
	@Override @Transactional(readOnly = false)
	public MarkerSynonymTo modifyMarkerSynonym(MarkerSynonymInput markersynonym){
		MarkerSynonymModel target= markersynonymRepository.findById(markersynonym.getId()).orElseThrow(() -> new RuntimeException("MarkerSynonym not found")); 
		 MarkerSynonymModel source= converter.convert(markersynonym,MarkerSynonymModel.class); 
		 Utils.copyNotNulls(source,target); 
		 return converter.convert(markersynonymRepository.save(target), MarkerSynonymTo.class);
	}

}