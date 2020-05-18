///////////////////////////////////////////////////////////
//  MarkerImpl.java
//  Macromedia ActionScript Implementation of the Class MarkerImpl
//  Generated by Enterprise Architect
//  Created on:      17-May-2020 3:09:39 PM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.services;

import org.ebs.model.AssayGeneModel;
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
import org.ebs.services.to.MarkerTo;
import org.ebs.services.to.Input.MarkerInput;
import org.ebs.model.MarkerModel;
import org.ebs.model.repos.MarkerRepository;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 17-May-2020 3:09:39 PM
 */
@Service @Transactional(readOnly = true)
public class MarkerImpl implements MarkerService {

	private MarkerRepository markerRepository;
	@Autowired
	private ConversionService converter;
	@Autowired
	private AssayGeneRepository assaygeneRepository;

	/**
	 * 
	 * @param Marker
	 */
	@Override @Transactional(readOnly = false)
	public MarkerTo createMarker(MarkerInput Marker){
		MarkerModel model = converter.convert(Marker,MarkerModel.class); 
		 model.setId(0);
		 AssayGeneModel assaygeneModel = assaygeneRepository.findById(Marker.getAssayGene().getId()).get(); 
		model.setAssayGene(assaygeneModel); 
		 
		 model= markerRepository.save(model); 
		 return converter.convert(model, MarkerTo.class); 
	}

	/**
	 * 
	 * @param idmarker
	 */
	@Override @Transactional(readOnly = false)
	public int deleteMarker(int idmarker){
		MarkerModel marker = markerRepository.findById(idmarker).orElseThrow(() -> new RuntimeException("Request not found")); 
		 marker.setDeleted(true); 
		  markerRepository.save(marker); 
		 return idmarker;
	}

	/**
	 * 
	 * @param markerId
	 */
	@Override
	public Optional<MarkerTo> findMarker(int markerId){
		if(markerId <1) 
		 {return Optional.empty();} 
		 return markerRepository.findById(markerId).filter(r -> !r.getDeleted().booleanValue()).map(r -> converter.convert(r,MarkerTo.class));
	}

	/**
	 * 
	 * @param page
	 * @param sort
	 * @param filters
	 */
	@Override
	public Page<MarkerTo> findMarkers(PageInput page, SortInput sort, List<FilterInput> filters){
		return markerRepository.findByCriteria(MarkerModel.class,filters,sort,page).map(r -> converter.convert(r,MarkerTo.class));
	}

	/**
	 * 
	 * @param markerRepository
	 */
	@Autowired
	public MarkerImpl(MarkerRepository markerRepository){
		this.markerRepository =markerRepository;
	}

	/**
	 * 
	 * @param marker
	 */
	@Override @Transactional(readOnly = false)
	public MarkerTo modifyMarker(MarkerInput marker){
		MarkerModel target= markerRepository.findById(marker.getId()).orElseThrow(() -> new RuntimeException("Request not found")); 
		 MarkerModel source= converter.convert(marker,MarkerModel.class); 
		 Utils.copyNotNulls(source,target); 
		 return converter.convert(markerRepository.save(target), MarkerTo.class);
	}

}