///////////////////////////////////////////////////////////
//  AlertRuleConverter.java
//  Macromedia ActionScript Implementation of the Class AlertRuleConverter
//  Generated by Enterprise Architect
//  Created on:      09-Aug-2020 4:50:09 PM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.services.converter;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
import org.springframework.beans.BeanUtils;
import org.ebs.model.AlertRuleModel;
import org.ebs.services.to.AlertRuleTo;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 09-Aug-2020 4:50:09 PM
 */
@Component
  class AlertRuleConverter implements Converter<AlertRuleModel,AlertRuleTo> {

	/**
	 * 
	 * @param source
	 */
	@Override
	public AlertRuleTo convert(AlertRuleModel source){
		AlertRuleTo target = new  AlertRuleTo(); 
		BeanUtils.copyProperties(source, target); 
		return target;
	}

}