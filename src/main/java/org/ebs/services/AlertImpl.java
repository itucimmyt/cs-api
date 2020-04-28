///////////////////////////////////////////////////////////
//  AlertImpl.java
//  Macromedia ActionScript Implementation of the Class AlertImpl
//  Generated by Enterprise Architect
//  Created on:      28-Apr-2020 12:06:51 AM
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
import org.ebs.services.to.AlertTo;
import org.ebs.services.to.Input.AlertInput;
import org.ebs.model.AlertModel;
import org.ebs.model.repos.AlertRepository;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 28-Apr-2020 12:06:51 AM
 */
@Service @Transactional(readOnly = true)
public class AlertImpl implements AlertService {

	private AlertRepository alertRepository;
	@Autowired
	private ConversionService converter;

	/**
	 * 
	 * @param alertRepository
	 */
	@Autowired
	public AlertImpl(AlertRepository alertRepository){
		this.alertRepository =alertRepository;
	}

	/**
	 * 
	 * @param Alert
	 */
	@Override @Transactional(readOnly = false)
	public AlertTo createAlert(AlertInput Alert){
		AlertModel model = converter.convert(Alert,AlertModel.class); 
		 model.setId(0); 
		 model= alertRepository.save(model); 
		 return converter.convert(model, AlertTo.class); 
	}

	/**
	 * 
	 * @param idalert
	 */
	@Override @Transactional(readOnly = false)
	public int deleteAlert(int idalert){
		AlertModel alert = alertRepository.findById(idalert).orElseThrow(() -> new RuntimeException("Request not found")); 
		 alert.setDeleted(true); 
		  alertRepository.save(alert); 
		 return idalert;
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
	 * @param alert
	 */
	@Override @Transactional(readOnly = false)
	public AlertTo modifyAlert(AlertInput alert){
		AlertModel target= alertRepository.findById(alert.getId()).orElseThrow(() -> new RuntimeException("Request not found")); 
		 AlertModel source= converter.convert(alert,AlertModel.class); 
		 Utils.copyNotNulls(source,target); 
		 return converter.convert(alertRepository.save(target), AlertTo.class);
	}

}