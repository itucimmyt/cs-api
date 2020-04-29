///////////////////////////////////////////////////////////
//  AlertRuleConverter.java
//  Macromedia ActionScript Implementation of the Class AlertRuleConverter
//  Generated by Enterprise Architect
//  Created on:      28-Apr-2020 11:58:04 PM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.services.converter;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
import org.springframework.beans.BeanUtils;
import org.ebs.model.AlertRuleModel;
import org.ebs.services.to.Input.AlertRuleInput;
import org.ebs.services.to.AlertRuleTo;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 28-Apr-2020 11:58:04 PM
 */
@Component
public class AlertRuleConverter implements Converter<AlertRuleModel,AlertRuleTo> {

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