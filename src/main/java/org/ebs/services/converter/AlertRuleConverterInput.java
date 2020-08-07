///////////////////////////////////////////////////////////
//  AlertRuleConverterInput.java
//  Macromedia ActionScript Implementation of the Class AlertRuleConverterInput
//  Generated by Enterprise Architect
//  Created on:      07-Aug-2020 2:59:00 PM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.services.converter;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
import org.springframework.beans.BeanUtils;
import org.ebs.model.AlertRuleModel;
import org.ebs.services.to.Input.AlertRuleInput;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 07-Aug-2020 2:59:00 PM
 */
@Component
  class AlertRuleConverterInput implements Converter<AlertRuleInput,AlertRuleModel> {

	/**
	 * 
	 * @param source
	 */
	@Override
	public AlertRuleModel convert(AlertRuleInput source){
		AlertRuleModel target = new  AlertRuleModel(); 
		BeanUtils.copyProperties(source, target); 
		return target;
	}

}