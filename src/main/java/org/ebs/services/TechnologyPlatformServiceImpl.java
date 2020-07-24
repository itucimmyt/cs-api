///////////////////////////////////////////////////////////
//  TechnologyPlatformServiceImpl.java
//  Macromedia ActionScript Implementation of the Class TechnologyPlatformServiceImpl
//  Generated by Enterprise Architect
//  Created on:      23-Jul-2020 10:47:17 PM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.services;

import org.ebs.model.repos.TechnologyPlatformRepository;
import org.ebs.model.repos.AssayclassRepository;
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
import org.ebs.services.to.TechnologyPlatformTo;
import org.ebs.services.to.Input.TechnologyPlatformInput;
import org.ebs.model.TechnologyPlatformModel;
import org.ebs.services.to.VendorTo;
import org.ebs.services.to.AssayclassTo;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 23-Jul-2020 10:47:17 PM
 */
@Service @Transactional(readOnly = true)
  class TechnologyPlatformServiceImpl implements TechnologyPlatformService {

	private TechnologyPlatformRepository technologyplatformRepository;
	private ConversionService converter;
	public AssayclassRepository assayclassRepository;
	public VendorRepository vendorRepository;

	/**
	 * 
	 * @param TechnologyPlatform
	 */
	@Override @Transactional(readOnly = false)
	public TechnologyPlatformTo createTechnologyPlatform(TechnologyPlatformInput TechnologyPlatform){
		TechnologyPlatformModel model = converter.convert(TechnologyPlatform,TechnologyPlatformModel.class); 
		 model.setId(0);
		  
		 model= technologyplatformRepository.save(model); 
		 return converter.convert(model, TechnologyPlatformTo.class); 
	}

	/**
	 * 
	 * @param technologyplatformId
	 */
	@Override @Transactional(readOnly = false)
	public int deleteTechnologyPlatform(int technologyplatformId){
		TechnologyPlatformModel technologyplatform = technologyplatformRepository.findById(technologyplatformId).orElseThrow(() -> new RuntimeException("TechnologyPlatform not found")); 
		 technologyplatform.setDeleted(true); 
		  technologyplatformRepository.save(technologyplatform); 
		 return technologyplatformId;
	}

	/**
	 * 
	 * @param technologyplatformId
	 */
	@Override
	public Optional<TechnologyPlatformTo> findTechnologyPlatform(int technologyplatformId){
		if(technologyplatformId <1) 
		 {return Optional.empty();} 
		 return technologyplatformRepository.findById(technologyplatformId).filter(r -> !r.getDeleted().booleanValue()).map(r -> converter.convert(r,TechnologyPlatformTo.class));
	}

	/**
	 * 
	 * @param page
	 * @param sort
	 * @param filters
	 */
	@Override
	public Page<TechnologyPlatformTo> findTechnologyPlatforms(PageInput page, SortInput sort, List<FilterInput> filters){
		return technologyplatformRepository.findByCriteria(TechnologyPlatformModel.class,filters,sort,page).map(r -> converter.convert(r,TechnologyPlatformTo.class));
	}

	/**
	 * 
	 * @param technologyplatform
	 */
	@Override @Transactional(readOnly = false)
	public TechnologyPlatformTo modifyTechnologyPlatform(TechnologyPlatformInput technologyplatform){
		TechnologyPlatformModel target= technologyplatformRepository.findById(technologyplatform.getId()).orElseThrow(() -> new RuntimeException("TechnologyPlatform not found")); 
		 TechnologyPlatformModel source= converter.convert(technologyplatform,TechnologyPlatformModel.class); 
		 Utils.copyNotNulls(source,target); 
		 return converter.convert(technologyplatformRepository.save(target), TechnologyPlatformTo.class);
	}

	/**
	 * 
	 * @param vendorRepository
	 * @param assayclassRepository
	 * @param converter
	 * @param technologyplatformRepository
	 */
	@Autowired
	public TechnologyPlatformServiceImpl(VendorRepository vendorRepository, AssayclassRepository assayclassRepository, ConversionService converter, TechnologyPlatformRepository technologyplatformRepository){
		this.technologyplatformRepository =technologyplatformRepository; 
		 this.converter = converter;
		 this.assayclassRepository = assayclassRepository;
		 this.vendorRepository = vendorRepository;
	}

}