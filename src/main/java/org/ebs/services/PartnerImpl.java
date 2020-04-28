///////////////////////////////////////////////////////////
//  PartnerImpl.java
//  Macromedia ActionScript Implementation of the Class PartnerImpl
//  Generated by Enterprise Architect
//  Created on:      28-Apr-2020 12:07:07 AM
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
import org.ebs.services.to.PartnerTo;
import org.ebs.services.to.Input.PartnerInput;
import org.ebs.model.PartnerModel;
import org.ebs.model.repos.PartnerRepository;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 28-Apr-2020 12:07:07 AM
 */
@Service @Transactional(readOnly = true)
public class PartnerImpl implements PartnerService {

	private PartnerRepository partnerRepository;
	@Autowired
	private ConversionService converter;

	/**
	 * 
	 * @param Partner
	 */
	@Override @Transactional(readOnly = false)
	public PartnerTo createPartner(PartnerInput Partner){
		PartnerModel model = converter.convert(Partner,PartnerModel.class); 
		 model.setId(0); 
		 model= partnerRepository.save(model); 
		 return converter.convert(model, PartnerTo.class); 
	}

	/**
	 * 
	 * @param idpartner
	 */
	@Override @Transactional(readOnly = false)
	public int deletePartner(int idpartner){
		PartnerModel partner = partnerRepository.findById(idpartner).orElseThrow(() -> new RuntimeException("Request not found")); 
		 partner.setDeleted(true); 
		  partnerRepository.save(partner); 
		 return idpartner;
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
	 * @param partner
	 */
	@Override @Transactional(readOnly = false)
	public PartnerTo modifyPartner(PartnerInput partner){
		PartnerModel target= partnerRepository.findById(partner.getId()).orElseThrow(() -> new RuntimeException("Request not found")); 
		 PartnerModel source= converter.convert(partner,PartnerModel.class); 
		 Utils.copyNotNulls(source,target); 
		 return converter.convert(partnerRepository.save(target), PartnerTo.class);
	}

	/**
	 * 
	 * @param partnerRepository
	 */
	@Autowired
	public PartnerImpl(PartnerRepository partnerRepository){
		this.partnerRepository =partnerRepository;
	}

}