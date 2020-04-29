///////////////////////////////////////////////////////////
//  CountryImpl.java
//  Macromedia ActionScript Implementation of the Class CountryImpl
//  Generated by Enterprise Architect
//  Created on:      28-Apr-2020 11:58:10 PM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.services;

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
import org.ebs.services.to.CountryTo;
import org.ebs.services.to.Input.CountryInput;
import org.ebs.model.CountryModel;
import org.ebs.model.repos.CountryRepository;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 28-Apr-2020 11:58:10 PM
 */
@Service @Transactional(readOnly = true)
public class CountryImpl implements CountryService {

	private CountryRepository countryRepository;
	@Autowired
	private ConversionService converter;

	/**
	 * 
	 * @param countryRepository
	 */
	@Autowired
	public CountryImpl(CountryRepository countryRepository){
		this.countryRepository =countryRepository;
	}

	/**
	 * 
	 * @param Country
	 */
	@Override @Transactional(readOnly = false)
	public CountryTo createCountry(CountryInput Country){
		CountryModel model = converter.convert(Country,CountryModel.class); 
		 model.setId(0);
		  
		 model= countryRepository.save(model); 
		 return converter.convert(model, CountryTo.class); 
	}

	/**
	 * 
	 * @param idcountry
	 */
	@Override @Transactional(readOnly = false)
	public int deleteCountry(int idcountry){
		CountryModel country = countryRepository.findById(idcountry).orElseThrow(() -> new RuntimeException("Request not found")); 
		 country.setDeleted(true); 
		  countryRepository.save(country); 
		 return idcountry;
	}

	/**
	 * 
	 * @param countryId
	 */
	@Override
	public Optional<CountryTo> findCountry(int countryId){
		if(countryId <1) 
		 {return Optional.empty();} 
		 return countryRepository.findById(countryId).filter(r -> !r.getDeleted().booleanValue()).map(r -> converter.convert(r,CountryTo.class));
	}

	/**
	 * 
	 * @param page
	 * @param sort
	 * @param filters
	 */
	@Override
	public Page<CountryTo> findCountrys(PageInput page, SortInput sort, List<FilterInput> filters){
		return countryRepository.findByCriteria(CountryModel.class,filters,sort,page).map(r -> converter.convert(r,CountryTo.class));
	}

	/**
	 * 
	 * @param country
	 */
	@Override @Transactional(readOnly = false)
	public CountryTo modifyCountry(CountryInput country){
		CountryModel target= countryRepository.findById(country.getId()).orElseThrow(() -> new RuntimeException("Request not found")); 
		 CountryModel source= converter.convert(country,CountryModel.class); 
		 Utils.copyNotNulls(source,target); 
		 return converter.convert(countryRepository.save(target), CountryTo.class);
	}

}