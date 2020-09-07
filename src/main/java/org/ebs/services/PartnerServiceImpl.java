///////////////////////////////////////////////////////////
//  PartnerServiceImpl.java
//  Macromedia ActionScript Implementation of the Class PartnerServiceImpl
//  Generated by Enterprise Architect
//  Created on:      07-Sep-2020 8:11:40 AM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.services;

import org.ebs.model.PersonModel;
import org.ebs.model.repos.PersonRepository;
import org.ebs.model.repos.PartnerRepository;
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
import org.ebs.model.PartnerModel;
import org.ebs.services.to.PartnerTo;
import org.ebs.services.to.Input.PartnerInput;
import org.ebs.services.to.PersonTo;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 07-Sep-2020 8:11:40 AM
 */
@Service @Transactional(readOnly = true)
  class PartnerServiceImpl implements PartnerService {

	private PartnerRepository partnerRepository;
	private ConversionService converter;
	private PersonRepository personRepository;

	/**
	 * 
	 * @param Partner
	 */
	@Override @Transactional(readOnly = false)
	public PartnerTo createPartner(PartnerInput Partner){
		PartnerModel model = converter.convert(Partner,PartnerModel.class); 
		 model.setId(0);
		 PersonModel personModel = personRepository.findById(Partner.getPerson().getId()).get(); 
		model.setPerson(personModel); 
		 
		 model= partnerRepository.save(model); 
		 return converter.convert(model, PartnerTo.class); 
	}

	/**
	 * 
	 * @param partnerId
	 */
	@Override @Transactional(readOnly = false)
	public int deletePartner(int partnerId){
		PartnerModel partner = partnerRepository.findById(partnerId).orElseThrow(() -> new RuntimeException("Partner not found")); 
		 partner.setDeleted(true); 
		  partnerRepository.save(partner); 
		 return partnerId;
	}

	/**
	 * 
	 * @param partnerId
	 */
	@Override
	public Optional<PartnerTo> findPartner(int partnerId){
		if(partnerId <1) 
		 {return Optional.empty();} 
		 return partnerRepository.findById(partnerId).filter(r -> !r.getDeleted().booleanValue()).map(r -> converter.convert(r,PartnerTo.class));
	}

	/**
	 * 
	 * @param page
	 * @param sort
	 * @param filters
	 */
	@Override
	public Page<PartnerTo> findPartners(PageInput page, SortInput sort, List<FilterInput> filters){
		return partnerRepository.findByCriteria(PartnerModel.class,filters,sort,page).map(r -> converter.convert(r,PartnerTo.class));
	}

	/**
	 * 
	 * @param partnerId
	 */
	public Optional<PersonTo> findPerson(int partnerId){
		return partnerRepository.findById(partnerId).map(r -> converter.convert(r.getPerson(),PersonTo.class));
	}

	/**
	 * 
	 * @param partner
	 */
	@Override @Transactional(readOnly = false)
	public PartnerTo modifyPartner(PartnerInput partner){
		PartnerModel target= partnerRepository.findById(partner.getId()).orElseThrow(() -> new RuntimeException("Partner not found")); 
		 PartnerModel source= converter.convert(partner,PartnerModel.class); 
		 Utils.copyNotNulls(source,target); 
		 return converter.convert(partnerRepository.save(target), PartnerTo.class);
	}

	/**
	 * 
	 * @param personRepository
	 * @param converter
	 * @param partnerRepository
	 */
	@Autowired
	public PartnerServiceImpl(PersonRepository personRepository, ConversionService converter, PartnerRepository partnerRepository){
		this.partnerRepository =partnerRepository; 
		 this.converter = converter;
		 this.personRepository = personRepository;
	}

}