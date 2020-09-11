///////////////////////////////////////////////////////////
//  TechnologyPlatformServiceImpl.java
//  Macromedia ActionScript Implementation of the Class TechnologyPlatformServiceImpl
//  Generated by Enterprise Architect
//  Created on:      10-Sep-2020 10:44:45 PM
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
import org.ebs.services.to.AssayclassTo;
import org.ebs.services.to.VendorTo;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 10-Sep-2020 10:44:45 PM
 */
@Service @Transactional(readOnly = true)
  class TechnologyPlatformServiceImpl implements TechnologyPlatformService {

	private TechnologyPlatformRepository technologyplatformRepository;
	private ConversionService converter;
	private AssayclassRepository assayclassRepository;
	private VendorRepository vendorRepository;

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
	 * @param technologyPlatformId
	 */
	@Override @Transactional(readOnly = false)
	public int deleteTechnologyPlatform(int technologyPlatformId){
		TechnologyPlatformModel technologyplatform = technologyplatformRepository.findById(technologyPlatformId).orElseThrow(() -> new RuntimeException("TechnologyPlatform not found")); 
		 technologyplatform.setDeleted(true); 
		  technologyplatformRepository.save(technologyplatform); 
		 return technologyPlatformId;
	}

	/**
	 * 
	 * @param technologyplatformId
	 */
	public Set<AssayclassTo> findAssayclasss(int technologyplatformId){
		return technologyplatformRepository.findById(technologyplatformId).get().getAssayclasss().stream().map(e->converter.convert(e, AssayclassTo.class)).collect(Collectors.toSet());
	}

	/**
	 * 
	 * @param technologyPlatformId
	 */
	@Override
	public Optional<TechnologyPlatformTo> findTechnologyPlatform(int technologyPlatformId){
		if(technologyPlatformId <1) 
		 {return Optional.empty();} 
		 return technologyplatformRepository.findById(technologyPlatformId).filter(r -> !r.getDeleted().booleanValue()).map(r -> converter.convert(r,TechnologyPlatformTo.class));
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
	 * @param technologyplatformId
	 */
	public Set<VendorTo> findVendors(int technologyplatformId){
		return vendorRepository.findByTechnologyplatformId(technologyplatformId).stream().map(e -> converter.convert(e,VendorTo.class)).collect(Collectors.toSet());
	}

	/**
	 * 
	 * @param technologyPlatform
	 */
	@Override @Transactional(readOnly = false)
	public TechnologyPlatformTo modifyTechnologyPlatform(TechnologyPlatformInput technologyPlatform){
		TechnologyPlatformModel target= technologyplatformRepository.findById(technologyPlatform.getId()).orElseThrow(() -> new RuntimeException("TechnologyPlatform not found")); 
		 TechnologyPlatformModel source= converter.convert(technologyPlatform,TechnologyPlatformModel.class); 
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