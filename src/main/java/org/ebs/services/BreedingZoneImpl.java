///////////////////////////////////////////////////////////
//  BreedingZoneImpl.java
//  Macromedia ActionScript Implementation of the Class BreedingZoneImpl
//  Generated by Enterprise Architect
//  Created on:      17-May-2020 3:09:22 PM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.services;

import java.util.List;
import java.util.Optional;

import org.ebs.model.BreedingZoneModel;
import org.ebs.model.PipelineModel;
import org.ebs.model.repos.BreedingZoneRepository;
import org.ebs.model.repos.PipelineRepository;
import org.ebs.services.to.BreedingZoneTo;
import org.ebs.services.to.Input.BreedingZoneInput;
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
 * @created 17-May-2020 3:09:22 PM
 */
@Service @Transactional(readOnly = true)
public class BreedingZoneImpl implements BreedingZoneService {

	private BreedingZoneRepository breedingzoneRepository;
	@Autowired
	private ConversionService converter;
	@Autowired
	private PipelineRepository pipelineRepository;

	/**
	 * 
	 * @param breedingzoneRepository
	 */
	@Autowired
	public BreedingZoneImpl(BreedingZoneRepository breedingzoneRepository){
		this.breedingzoneRepository =breedingzoneRepository;
	}

	/**
	 * 
	 * @param BreedingZone
	 */
	@Override @Transactional(readOnly = false)
	public BreedingZoneTo createBreedingZone(BreedingZoneInput BreedingZone){
		BreedingZoneModel model = converter.convert(BreedingZone,BreedingZoneModel.class); 
		 model.setId(0);
		 PipelineModel pipelineModel = pipelineRepository.findById(BreedingZone.getPipeline().getId()).get(); 
		model.setPipeline(pipelineModel); 
		 
		 model= breedingzoneRepository.save(model); 
		 return converter.convert(model, BreedingZoneTo.class); 
	}

	/**
	 * 
	 * @param idbreedingzone
	 */
	@Override @Transactional(readOnly = false)
	public int deleteBreedingZone(int idbreedingzone){
		BreedingZoneModel breedingzone = breedingzoneRepository.findById(idbreedingzone).orElseThrow(() -> new RuntimeException("Request not found")); 
		 breedingzone.setDeleted(true); 
		  breedingzoneRepository.save(breedingzone); 
		 return idbreedingzone;
	}

	/**
	 * 
	 * @param breedingzoneId
	 */
	@Override
	public Optional<BreedingZoneTo> findBreedingZone(int breedingzoneId){
		if(breedingzoneId <1) 
		 {return Optional.empty();} 
		 return breedingzoneRepository.findById(breedingzoneId).filter(r -> !r.getDeleted().booleanValue()).map(r -> converter.convert(r,BreedingZoneTo.class));
	}

	/**
	 * 
	 * @param page
	 * @param sort
	 * @param filters
	 */
	@Override
	public Page<BreedingZoneTo> findBreedingZones(PageInput page, SortInput sort, List<FilterInput> filters){
		return breedingzoneRepository.findByCriteria(BreedingZoneModel.class,filters,sort,page).map(r -> converter.convert(r,BreedingZoneTo.class));
	}

	/**
	 * 
	 * @param breedingzone
	 */
	@Override @Transactional(readOnly = false)
	public BreedingZoneTo modifyBreedingZone(BreedingZoneInput breedingzone){
		BreedingZoneModel target= breedingzoneRepository.findById(breedingzone.getId()).orElseThrow(() -> new RuntimeException("Request not found")); 
		 BreedingZoneModel source= converter.convert(breedingzone,BreedingZoneModel.class); 
		 Utils.copyNotNulls(source,target); 
		 return converter.convert(breedingzoneRepository.save(target), BreedingZoneTo.class);
	}

}