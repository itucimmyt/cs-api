///////////////////////////////////////////////////////////
//  NumberSequenceRuleConverter.java
//  Macromedia ActionScript Implementation of the Class NumberSequenceRuleConverter
//  Generated by Enterprise Architect
//  Created on:      27-Jul-2020 8:42:51 AM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.services.converter;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
import org.springframework.beans.BeanUtils;
import org.ebs.model.NumberSequenceRuleModel;
import org.ebs.services.to.NumberSequenceRuleTo;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 27-Jul-2020 8:42:51 AM
 */
@Component
  class NumberSequenceRuleConverter implements Converter<NumberSequenceRuleModel,NumberSequenceRuleTo> {

	/**
	 * 
	 * @param source
	 */
	@Override
	public NumberSequenceRuleTo convert(NumberSequenceRuleModel source){
		NumberSequenceRuleTo target = new  NumberSequenceRuleTo(); 
		BeanUtils.copyProperties(source, target); 
		return target;
	}

}