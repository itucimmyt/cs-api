///////////////////////////////////////////////////////////
//  SeasonServiceImpl.java
//  Macromedia ActionScript Implementation of the Class SeasonServiceImpl
//  Generated by Enterprise Architect
//  Created on:      13-Jul-2020 5:07:18 PM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.services;

import org.ebs.model.repos.SeasonRepository;
import org.ebs.model.repos.CropRepository;
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
import org.ebs.services.to.SeasonTo;
import org.ebs.services.to.Input.SeasonInput;
import org.ebs.model.SeasonModel;
import org.ebs.services.to.CropTo;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 13-Jul-2020 5:07:18 PM
 */
@Service @Transactional(readOnly = true)
  class SeasonServiceImpl implements SeasonService {

	private SeasonRepository seasonRepository;
	private ConversionService converter;
	public CropRepository cropRepository;

	/**
	 * 
	 * @param Season
	 */
	@Override @Transactional(readOnly = false)
	public SeasonTo createSeason(SeasonInput Season){
		SeasonModel model = converter.convert(Season,SeasonModel.class); 
		 model.setId(0);
		  
		 model= seasonRepository.save(model); 
		 return converter.convert(model, SeasonTo.class); 
	}

	/**
	 * 
	 * @param seasonId
	 */
	@Override @Transactional(readOnly = false)
	public int deleteSeason(int seasonId){
		SeasonModel season = seasonRepository.findById(seasonId).orElseThrow(() -> new RuntimeException("Season not found")); 
		 season.setDeleted(true); 
		  seasonRepository.save(season); 
		 return seasonId;
	}

	/**
	 * 
	 * @param seasonId
	 */
	@Override
	public Optional<SeasonTo> findSeason(int seasonId){
		if(seasonId <1) 
		 {return Optional.empty();} 
		 return seasonRepository.findById(seasonId).filter(r -> !r.getDeleted().booleanValue()).map(r -> converter.convert(r,SeasonTo.class));
	}

	/**
	 * 
	 * @param page
	 * @param sort
	 * @param filters
	 */
	@Override
	public Page<SeasonTo> findSeasons(PageInput page, SortInput sort, List<FilterInput> filters){
		return seasonRepository.findByCriteria(SeasonModel.class,filters,sort,page).map(r -> converter.convert(r,SeasonTo.class));
	}

	/**
	 * 
	 * @param season
	 */
	@Override @Transactional(readOnly = false)
	public SeasonTo modifySeason(SeasonInput season){
		SeasonModel target= seasonRepository.findById(season.getId()).orElseThrow(() -> new RuntimeException("Season not found")); 
		 SeasonModel source= converter.convert(season,SeasonModel.class); 
		 Utils.copyNotNulls(source,target); 
		 return converter.convert(seasonRepository.save(target), SeasonTo.class);
	}

	/**
	 * 
	 * @param cropRepository
	 * @param converter
	 * @param seasonRepository
	 */
	@Autowired
	public SeasonServiceImpl(CropRepository cropRepository, ConversionService converter, SeasonRepository seasonRepository){
		this.seasonRepository =seasonRepository; 
		 this.converter = converter;
		 this.cropRepository = cropRepository;
	}

}