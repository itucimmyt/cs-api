///////////////////////////////////////////////////////////
//  NumberSequenceRuleSegmentConverter.java
//  Macromedia ActionScript Implementation of the Class NumberSequenceRuleSegmentConverter
//  Generated by Enterprise Architect
//  Created on:      27-Jul-2020 8:42:53 AM
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
 * @created 27-Jul-2020 8:42:53 AM
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