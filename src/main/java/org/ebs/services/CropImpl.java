///////////////////////////////////////////////////////////
//  CropImpl.java
//  Macromedia ActionScript Implementation of the Class CropImpl
//  Generated by Enterprise Architect
//  Created on:      17-May-2020 3:09:27 PM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.services;

import java.util.List;
import java.util.Optional;

import org.ebs.model.CropModel;
import org.ebs.model.repos.CropRepository;
import org.ebs.services.to.CropTo;
import org.ebs.services.to.Input.CropInput;
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
 * @created 17-May-2020 3:09:27 PM
 */
@Service @Transactional(readOnly = true)
public class CropImpl implements CropService {

	private CropRepository cropRepository;
	@Autowired
	private ConversionService converter;

	/**
	 * 
	 * @param Crop
	 */
	@Override @Transactional(readOnly = false)
	public CropTo createCrop(CropInput Crop){
		CropModel model = converter.convert(Crop,CropModel.class); 
		 model.setId(0);
		  
		 model= cropRepository.save(model); 
		 return converter.convert(model, CropTo.class); 
	}

	/**
	 * 
	 * @param cropRepository
	 */
	@Autowired
	public CropImpl(CropRepository cropRepository){
		this.cropRepository =cropRepository;
	}

	/**
	 * 
	 * @param idcrop
	 */
	@Override @Transactional(readOnly = false)
	public int deleteCrop(int idcrop){
		CropModel crop = cropRepository.findById(idcrop).orElseThrow(() -> new RuntimeException("Request not found")); 
		 crop.setDeleted(true); 
		  cropRepository.save(crop); 
		 return idcrop;
	}

	/**
	 * 
	 * @param cropId
	 */
	@Override
	public Optional<CropTo> findCrop(int cropId){
		if(cropId <1) 
		 {return Optional.empty();} 
		 return cropRepository.findById(cropId).filter(r -> !r.getDeleted().booleanValue()).map(r -> converter.convert(r,CropTo.class));
	}

	/**
	 * 
	 * @param page
	 * @param sort
	 * @param filters
	 */
	@Override
	public Page<CropTo> findCrops(PageInput page, SortInput sort, List<FilterInput> filters){
		return cropRepository.findByCriteria(CropModel.class,filters,sort,page).map(r -> converter.convert(r,CropTo.class));
	}

	/**
	 * 
	 * @param crop
	 */
	@Override @Transactional(readOnly = false)
	public CropTo modifyCrop(CropInput crop){
		CropModel target= cropRepository.findById(crop.getId()).orElseThrow(() -> new RuntimeException("Request not found")); 
		 CropModel source= converter.convert(crop,CropModel.class); 
		 Utils.copyNotNulls(source,target); 
		 return converter.convert(cropRepository.save(target), CropTo.class);
	}

}