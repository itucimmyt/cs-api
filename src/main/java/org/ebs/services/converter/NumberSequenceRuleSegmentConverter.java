///////////////////////////////////////////////////////////
//  NumberSequenceRuleSegmentConverter.java
//  Macromedia ActionScript Implementation of the Class NumberSequenceRuleSegmentConverter
//  Generated by Enterprise Architect
//  Created on:      07-Aug-2020 3:00:15 PM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.services.converter;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
import org.springframework.beans.BeanUtils;
import org.ebs.model.NumberSequenceRuleSegmentModel;
import org.ebs.services.to.NumberSequenceRuleSegmentTo;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 07-Aug-2020 3:00:15 PM
 */
@Component
  class NumberSequenceRuleSegmentConverter implements Converter<NumberSequenceRuleSegmentModel,NumberSequenceRuleSegmentTo> {

	/**
	 * 
	 * @param source
	 */
	@Override
	public NumberSequenceRuleSegmentTo convert(NumberSequenceRuleSegmentModel source){
		NumberSequenceRuleSegmentTo target = new  NumberSequenceRuleSegmentTo(); 
		BeanUtils.copyProperties(source, target); 
		return target;
	}

}