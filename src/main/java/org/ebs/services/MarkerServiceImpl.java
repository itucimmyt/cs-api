///////////////////////////////////////////////////////////
//  MarkerServiceImpl.java
//  Macromedia ActionScript Implementation of the Class MarkerServiceImpl
//  Generated by Enterprise Architect
//  Created on:      10-Sep-2020 12:19:26 AM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.services;

import org.ebs.model.AssayGeneModel;
import org.ebs.model.repos.AssayGeneRepository;
import org.ebs.model.repos.MarkerRepository;
import org.ebs.model.repos.MarkerSynonymRepository;
import org.ebs.model.repos.VendorRepository;
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
import org.ebs.services.to.MarkerTo;
import org.ebs.services.to.Input.MarkerInput;
import org.ebs.model.MarkerModel;
import org.ebs.services.to.MarkerSynonymTo;
import org.ebs.services.to.AssayGeneTo;
import org.ebs.services.to.VendorTo;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 10-Sep-2020 12:19:26 AM
 */
@Service @Transactional(readOnly = true)
  class MarkerServiceImpl implements MarkerService {

	private MarkerRepository markerRepository;
	private ConversionService converter;
	private AssayGeneRepository assaygeneRepository;
	public MarkerSynonymRepository markersynonymRepository;
	public VendorRepository vendorRepository;

	/**
	 * 
	 * @param Marker
	 */
	@Override @Transactional(readOnly = false)
	public MarkerTo createMarker(MarkerInput Marker){
		MarkerModel model = converter.convert(Marker,MarkerModel.class); 
		 model.setId(0);
		 AssayGeneModel assaygeneModel = assaygeneRepository.findById(Marker.getAssaygene().getId()).get(); 
		model.setAssaygene(assaygeneModel); 
		 
		 model= markerRepository.save(model); 
		 return converter.convert(model, MarkerTo.class); 
	}

	/**
	 * 
	 * @param markerId
	 */
	@Override @Transactional(readOnly = false)
	public int deleteMarker(int markerId){
		MarkerModel marker = markerRepository.findById(markerId).orElseThrow(() -> new RuntimeException("Marker not found")); 
		 marker.setDeleted(true); 
		  markerRepository.save(marker); 
		 return markerId;
	}

	/**
	 * 
	 * @param markerId
	 */
	public Optional<AssayGeneTo> findAssayGene(int markerId){
		return markerRepository.findById(markerId).map(r -> converter.convert(r.getAssaygene(),AssayGeneTo.class));
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
	 * @param markerId
	 */
	public Set<MarkerSynonymTo> findMarkerSynonyms(int markerId){
		return markersynonymRepository.findByMarkerId(markerId).stream().map(e -> converter.convert(e,MarkerSynonymTo.class)).collect(Collectors.toSet());
	}

	/**
	 * 
	 * @param markerId
	 */
	public Set<VendorTo> findVendors(int markerId){
		return markerRepository.findById(markerId).get().getVendors().stream().map(e->converter.convert(e, VendorTo.class)).collect(Collectors.toSet());
	}

	/**
	 * 
	 * @param vendorRepository
	 * @param assaygeneRepository
	 * @param markersynonymRepository
	 * @param converter
	 * @param markerRepository
	 */
	@Autowired
	public MarkerServiceImpl(VendorRepository vendorRepository, AssayGeneRepository assaygeneRepository, MarkerSynonymRepository markersynonymRepository, ConversionService converter, MarkerRepository markerRepository){
		this.markerRepository =markerRepository; 
		 this.converter = converter;
		 this.markersynonymRepository = markersynonymRepository;
		 this.assaygeneRepository = assaygeneRepository;
		 this.vendorRepository = vendorRepository;
	}

	/**
	 * 
	 * @param marker
	 */
	@Override @Transactional(readOnly = false)
	public MarkerTo modifyMarker(MarkerInput marker){
		MarkerModel target= markerRepository.findById(marker.getId()).orElseThrow(() -> new RuntimeException("Marker not found")); 
		 MarkerModel source= converter.convert(marker,MarkerModel.class); 
		 Utils.copyNotNulls(source,target); 
		 return converter.convert(markerRepository.save(target), MarkerTo.class);
	}

}