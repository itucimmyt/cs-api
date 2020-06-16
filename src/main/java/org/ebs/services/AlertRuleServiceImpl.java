///////////////////////////////////////////////////////////
//  AlertRuleServiceImpl.java
//  Macromedia ActionScript Implementation of the Class AlertRuleServiceImpl
//  Generated by Enterprise Architect
//  Created on:      15-Jun-2020 5:13:08 PM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.services;

import org.ebs.model.AlertModel;
import org.ebs.model.repos.AlertRepository;
import org.ebs.model.repos.AlertRuleRepository;
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
import org.ebs.services.to.AlertRuleTo;
import org.ebs.services.to.Input.AlertRuleInput;
import org.ebs.model.AlertRuleModel;
import org.ebs.services.to.AlertTo;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 15-Jun-2020 5:13:08 PM
 */
@Service @Transactional(readOnly = true)
  class AlertRuleServiceImpl implements AlertRuleService {

	private AlertRuleRepository alertruleRepository;
	private ConversionService converter;
	private AlertRepository alertRepository;

	/**
	 * 
	 * @param alertRepository
	 * @param converter
	 * @param alertruleRepository
	 */
	@Autowired
	public AlertRuleServiceImpl(AlertRepository alertRepository, ConversionService converter, AlertRuleRepository alertruleRepository){
		this.alertruleRepository =alertruleRepository; 
		 this.converter = converter;
		 this.alertRepository = alertRepository;
	}

	/**
	 * 
	 * @param AlertRule
	 */
	@Override @Transactional(readOnly = false)
	public AlertRuleTo createAlertRule(AlertRuleInput AlertRule){
		AlertRuleModel model = converter.convert(AlertRule,AlertRuleModel.class); 
		 model.setId(0);
		 AlertModel alertModel = alertRepository.findById(AlertRule.getAlert().getId()).get(); 
		model.setAlert(alertModel); 
		 
		 model= alertruleRepository.save(model); 
		 return converter.convert(model, AlertRuleTo.class); 
	}

	/**
	 * 
	 * @param alertruleId
	 */
	@Override @Transactional(readOnly = false)
	public int deleteAlertRule(int alertruleId){
		AlertRuleModel alertrule = alertruleRepository.findById(alertruleId).orElseThrow(() -> new RuntimeException("AlertRule not found")); 
		 alertrule.setDeleted(true); 
		  alertruleRepository.save(alertrule); 
		 return alertruleId;
	}

	/**
	 * 
	 * @param alertruleId
	 */
	public Optional<AlertTo> findAlert(int alertruleId){
		return alertruleRepository.findById(alertruleId).map(r -> converter.convert(r.getAlert(),AlertTo.class));
	}

	/**
	 * 
	 * @param alertruleId
	 */
	@Override
	public Optional<AlertRuleTo> findAlertRule(int alertruleId){
		if(alertruleId <1) 
		 {return Optional.empty();} 
		 return alertruleRepository.findById(alertruleId).filter(r -> !r.getDeleted().booleanValue()).map(r -> converter.convert(r,AlertRuleTo.class));
	}

	/**
	 * 
	 * @param page
	 * @param sort
	 * @param filters
	 */
	@Override
	public Page<AlertRuleTo> findAlertRules(PageInput page, SortInput sort, List<FilterInput> filters){
		return alertruleRepository.findByCriteria(AlertRuleModel.class,filters,sort,page).map(r -> converter.convert(r,AlertRuleTo.class));
	}

	/**
	 * 
	 * @param alertrule
	 */
	@Override @Transactional(readOnly = false)
	public AlertRuleTo modifyAlertRule(AlertRuleInput alertrule){
		AlertRuleModel target= alertruleRepository.findById(alertrule.getId()).orElseThrow(() -> new RuntimeException("AlertRule not found")); 
		 AlertRuleModel source= converter.convert(alertrule,AlertRuleModel.class); 
		 Utils.copyNotNulls(source,target); 
		 return converter.convert(alertruleRepository.save(target), AlertRuleTo.class);
	}

}