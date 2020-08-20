///////////////////////////////////////////////////////////
//  NumberSequenceRuleSegmentConverterInput.java
//  Macromedia ActionScript Implementation of the Class NumberSequenceRuleSegmentConverterInput
//  Generated by Enterprise Architect
//  Created on:      20-Aug-2020 1:06:00 PM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.services.converter;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
import org.springframework.beans.BeanUtils;
import org.ebs.model.NumberSequenceRuleSegmentModel;
import org.ebs.services.to.Input.NumberSequenceRuleSegmentInput;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 20-Aug-2020 1:06:00 PM
 */
@Component
  class NumberSequenceRuleSegmentConverterInput implements Converter<NumberSequenceRuleSegmentInput,NumberSequenceRuleSegmentModel> {

	/**
	 * 
	 * @param source
	 */
	@Override
	public NumberSequenceRuleSegmentModel convert(NumberSequenceRuleSegmentInput source){
		NumberSequenceRuleSegmentModel target = new  NumberSequenceRuleSegmentModel(); 
		BeanUtils.copyProperties(source, target); 
		return target;
	}

}