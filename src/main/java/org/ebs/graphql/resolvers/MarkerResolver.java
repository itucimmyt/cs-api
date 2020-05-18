///////////////////////////////////////////////////////////
//  MarkerResolver.java
//  Macromedia ActionScript Implementation of the Class MarkerResolver
//  Generated by Enterprise Architect
//  Created on:      17-May-2020 3:09:40 PM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.graphql.resolvers;

import com.coxautodev.graphql.tools.GraphQLResolver;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import java.util.stream.Collectors;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import org.springframework.core.convert.ConversionService;
import org.ebs.model.MarkerModel;
import org.ebs.services.to.MarkerTo;
import org.ebs.model.repos.MarkerRepository;
import org.ebs.services.MarkerService;
import org.ebs.services.VendorService;
import org.ebs.model.repos.VendorRepository;
import org.ebs.services.to.VendorTo;
import org.ebs.model.repos.MarkerSynonymRepository;
import org.ebs.services.MarkerSynonymService;
import org.ebs.services.to.MarkerSynonymTo;
import org.ebs.services.AssayGeneService;
import org.ebs.model.repos.AssayGeneRepository;
import org.ebs.services.to.AssayGeneTo;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 17-May-2020 3:09:40 PM
 */
@Component @Validated
public class MarkerResolver implements GraphQLResolver<MarkerTo> {

	private MarkerService markerService;
	private MarkerRepository markerRepository;
	@Autowired
	private ConversionService converter;
	private VendorService vendorService;
	private VendorRepository vendorRepository;
	private MarkerSynonymService markersynonymService;
	private MarkerSynonymRepository markersynonymRepository;
	private AssayGeneService assaygeneService;
	private AssayGeneRepository assaygeneRepository;

	/**
	 * 
	 * @param markerTo
	 */
	public AssayGeneTo getAssayGene(MarkerTo markerTo){
		MarkerModel markerModel = markerRepository.findById(markerTo.getId()).get(); 
		 return assaygeneService.findAssayGene(markerModel.getAssayGene().getId()).get();
	}

	/**
	 * 
	 * @param markerTo
	 */
	public Set<MarkerSynonymTo> getMarkerSynonyms(MarkerTo markerTo){
		return markersynonymRepository.findByMarkerId(markerTo.getId()).stream() 
		 .map(e -> converter.convert(e,MarkerSynonymTo.class)) 
		 .collect(Collectors.toSet());
	}

	/**
	 * 
	 * @param assaygeneRepository
	 * @param assaygeneService
	 * @param markersynonymRepository
	 * @param markersynonymService
	 * @param vendorRepository
	 * @param vendorService
	 * @param markerRepository
	 * @param markerService
	 */
	@Autowired
	public MarkerResolver(AssayGeneRepository assaygeneRepository, AssayGeneService assaygeneService, MarkerSynonymRepository markersynonymRepository, MarkerSynonymService markersynonymService, VendorRepository vendorRepository, VendorService vendorService, MarkerRepository markerRepository, MarkerService markerService){
		this.markerService = markerService; 
		this.markerRepository = markerRepository; 
		this.vendorService = vendorService; 
		this.vendorRepository = vendorRepository; 
		this.markersynonymService = markersynonymService; 
		this.markersynonymRepository = markersynonymRepository; 
		this.assaygeneService = assaygeneService; 
		this.assaygeneRepository = assaygeneRepository; 
	
	}

}