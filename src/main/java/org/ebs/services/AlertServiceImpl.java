///////////////////////////////////////////////////////////
//  AlertServiceImpl.java
//  Macromedia ActionScript Implementation of the Class AlertServiceImpl
//  Generated by Enterprise Architect
//  Created on:      10-Sep-2020 10:43:17 PM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.services;

import org.ebs.model.HtmlTagModel;
import org.ebs.model.repos.HtmlTagRepository;
import org.ebs.model.repos.AlertRepository;
import org.ebs.model.repos.AlertRuleRepository;
import org.ebs.model.repos.PreferenceRepository;
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
import org.ebs.services.to.AlertTo;
import org.ebs.services.to.Input.AlertInput;
import org.ebs.model.AlertModel;
import org.ebs.services.to.PreferenceTo;
import org.ebs.services.to.AlertRuleTo;
import org.ebs.services.to.HtmlTagTo;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 10-Sep-2020 10:43:17 PM
 */
@Service @Transactional(readOnly = true)
  class AlertServiceImpl implements AlertService {

	private AlertRepository alertRepository;
	private ConversionService converter;
	private HtmlTagRepository htmltagRepository;
	private AlertRuleRepository alertruleRepository;
	private PreferenceRepository preferenceRepository;

	/**
	 * 
	 * @param preferenceRepository
	 * @param htmltagRepository
	 * @param alertruleRepository
	 * @param converter
	 * @param alertRepository
	 */
	@Autowired
	public AlertServiceImpl(PreferenceRepository preferenceRepository, HtmlTagRepository htmltagRepository, AlertRuleRepository alertruleRepository, ConversionService converter, AlertRepository alertRepository){
		this.alertRepository =alertRepository; 
		 this.converter = converter;
		 this.alertruleRepository = alertruleRepository;
		 this.htmltagRepository = htmltagRepository;
		 this.preferenceRepository = preferenceRepository;
	}

	/**
	 * 
	 * @param Alert
	 */
	@Override @Transactional(readOnly = false)
	public AlertTo createAlert(AlertInput Alert){
		AlertModel model = converter.convert(Alert,AlertModel.class); 
		 model.setId(0);
		 HtmlTagModel htmltagModel = htmltagRepository.findById(Alert.getHtmltag().getId()).get(); 
		model.setHtmltag(htmltagModel); 
		 
		 model= alertRepository.save(model); 
		 return converter.convert(model, AlertTo.class); 
	}

	/**
	 * 
	 * @param alertId
	 */
	@Override @Transactional(readOnly = false)
	public int deleteAlert(int alertId){
		AlertModel alert = alertRepository.findById(alertId).orElseThrow(() -> new RuntimeException("Alert not found")); 
		 alert.setDeleted(true); 
		  alertRepository.save(alert); 
		 return alertId;
	}

	/**
	 * 
	 * @param alertId
	 */
	@Override
	public Optional<AlertTo> findAlert(int alertId){
		if(alertId <1) 
		 {return Optional.empty();} 
		 return alertRepository.findById(alertId).filter(r -> !r.getDeleted().booleanValue()).map(r -> converter.convert(r,AlertTo.class));
	}

	/**
	 * 
	 * @param alertId
	 */
	public Set<AlertRuleTo> findAlertRules(int alertId){
		return alertruleRepository.findByAlertId(alertId).stream().map(e -> converter.convert(e,AlertRuleTo.class)).collect(Collectors.toSet());
	}

	/**
	 * 
	 * @param page
	 * @param sort
	 * @param filters
	 */
	@Override
	public Page<AlertTo> findAlerts(PageInput page, SortInput sort, List<FilterInput> filters){
		return alertRepository.findByCriteria(AlertModel.class,filters,sort,page).map(r -> converter.convert(r,AlertTo.class));
	}

	/**
	 * 
	 * @param alertId
	 */
	public Optional<HtmlTagTo> findHtmlTag(int alertId){
		return alertRepository.findById(alertId).map(r -> converter.convert(r.getHtmltag(),HtmlTagTo.class));
	}

	/**
	 * 
	 * @param alertId
	 */
	public Set<PreferenceTo> findPreferences(int alertId){
		return preferenceRepository.findByAlertId(alertId).stream().map(e -> converter.convert(e,PreferenceTo.class)).collect(Collectors.toSet());
	}

	/**
	 * 
	 * @param alert
	 */
	@Override @Transactional(readOnly = false)
	public AlertTo modifyAlert(AlertInput alert){
		AlertModel target= alertRepository.findById(alert.getId()).orElseThrow(() -> new RuntimeException("Alert not found")); 
		 AlertModel source= converter.convert(alert,AlertModel.class); 
		 Utils.copyNotNulls(source,target); 
		 return converter.convert(alertRepository.save(target), AlertTo.class);
	}

}