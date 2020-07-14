///////////////////////////////////////////////////////////
//  NumberSequenceRuleServiceImpl.java
//  Macromedia ActionScript Implementation of the Class NumberSequenceRuleServiceImpl
//  Generated by Enterprise Architect
//  Created on:      13-Jul-2020 5:06:52 PM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.services;

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
import org.ebs.model.TenantModel;
import org.ebs.model.repos.TenantRepository;
import org.ebs.model.repos.NumberSequenceRuleRepository;
import org.ebs.model.repos.EntityReferenceRepository;
import org.ebs.model.repos.NumberSequenceRuleSegmentRepository;
import org.springframework.transaction.annotation.Transactional;
import org.ebs.services.to.NumberSequenceRuleTo;
import org.ebs.services.to.Input.NumberSequenceRuleInput;
import org.ebs.model.NumberSequenceRuleModel;
import org.ebs.services.to.EntityReferenceTo;
import org.ebs.services.to.TenantTo;
import org.ebs.services.to.NumberSequenceRuleSegmentTo;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 13-Jul-2020 5:06:52 PM
 */
@Service @Transactional(readOnly = true)
  class NumberSequenceRuleServiceImpl implements NumberSequenceRuleService {

	private NumberSequenceRuleRepository numbersequenceruleRepository;
	private ConversionService converter;
	private TenantRepository tenantRepository;
	public EntityReferenceRepository entityreferenceRepository;
	public NumberSequenceRuleSegmentRepository numbersequencerulesegmentRepository;

	/**
	 * 
	 * @param NumberSequenceRule
	 */
	@Override @Transactional(readOnly = false)
	public NumberSequenceRuleTo createNumberSequenceRule(NumberSequenceRuleInput NumberSequenceRule){
		NumberSequenceRuleModel model = converter.convert(NumberSequenceRule,NumberSequenceRuleModel.class); 
		 model.setId(0);
		 TenantModel tenantModel = tenantRepository.findById(NumberSequenceRule.gettenant().getId()).get(); 
		model.settenant(tenantModel); 
		 
		 model= numbersequenceruleRepository.save(model); 
		 return converter.convert(model, NumberSequenceRuleTo.class); 
	}

	/**
	 * 
	 * @param numbersequenceruleId
	 */
	@Override @Transactional(readOnly = false)
	public int deleteNumberSequenceRule(int numbersequenceruleId){
		NumberSequenceRuleModel numbersequencerule = numbersequenceruleRepository.findById(numbersequenceruleId).orElseThrow(() -> new RuntimeException("NumberSequenceRule not found")); 
		 numbersequencerule.setDeleted(true); 
		  numbersequenceruleRepository.save(numbersequencerule); 
		 return numbersequenceruleId;
	}

	/**
	 * 
	 * @param numbersequenceruleId
	 */
	@Override
	public Optional<NumberSequenceRuleTo> findNumberSequenceRule(int numbersequenceruleId){
		if(numbersequenceruleId <1) 
		 {return Optional.empty();} 
		 return numbersequenceruleRepository.findById(numbersequenceruleId).filter(r -> !r.getDeleted().booleanValue()).map(r -> converter.convert(r,NumberSequenceRuleTo.class));
	}

	/**
	 * 
	 * @param page
	 * @param sort
	 * @param filters
	 */
	@Override
	public Page<NumberSequenceRuleTo> findNumberSequenceRules(PageInput page, SortInput sort, List<FilterInput> filters){
		return numbersequenceruleRepository.findByCriteria(NumberSequenceRuleModel.class,filters,sort,page).map(r -> converter.convert(r,NumberSequenceRuleTo.class));
	}

	/**
	 * 
	 * @param numbersequenceruleId
	 */
	public Set<NumberSequenceRuleSegmentTo> findNumberSequenceRuleSegments(int numbersequenceruleId){
		return numbersequencerulesegmentRepository.findByNumbersequenceruleId(numbersequenceruleId).stream().map(e -> converter.convert(e,NumberSequenceRuleSegmentTo.class)).collect(Collectors.toSet());
	}

	/**
	 * 
	 * @param numbersequenceruleId
	 */
	public Optional<TenantTo> findTenant(int numbersequenceruleId){
		return numbersequenceruleRepository.findById(numbersequenceruleId).map(r -> converter.convert(r.gettenant(),TenantTo.class));
	}

	/**
	 * 
	 * @param numbersequencerule
	 */
	@Override @Transactional(readOnly = false)
	public NumberSequenceRuleTo modifyNumberSequenceRule(NumberSequenceRuleInput numbersequencerule){
		NumberSequenceRuleModel target= numbersequenceruleRepository.findById(numbersequencerule.getId()).orElseThrow(() -> new RuntimeException("NumberSequenceRule not found")); 
		 NumberSequenceRuleModel source= converter.convert(numbersequencerule,NumberSequenceRuleModel.class); 
		 Utils.copyNotNulls(source,target); 
		 return converter.convert(numbersequenceruleRepository.save(target), NumberSequenceRuleTo.class);
	}

	/**
	 * 
	 * @param numbersequencerulesegmentRepository
	 * @param tenantRepository
	 * @param entityreferenceRepository
	 * @param converter
	 * @param numbersequenceruleRepository
	 */
	@Autowired
	public NumberSequenceRuleServiceImpl(NumberSequenceRuleSegmentRepository numbersequencerulesegmentRepository, TenantRepository tenantRepository, EntityReferenceRepository entityreferenceRepository, ConversionService converter, NumberSequenceRuleRepository numbersequenceruleRepository){
		this.numbersequenceruleRepository =numbersequenceruleRepository; 
		 this.converter = converter;
		 this.entityreferenceRepository = entityreferenceRepository;
		 this.tenantRepository = tenantRepository;
		 this.numbersequencerulesegmentRepository = numbersequencerulesegmentRepository;
	}

}