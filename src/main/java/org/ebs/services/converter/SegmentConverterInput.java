///////////////////////////////////////////////////////////
//  SegmentConverterInput.java
//  Macromedia ActionScript Implementation of the Class SegmentConverterInput
//  Generated by Enterprise Architect
//  Created on:      20-Aug-2020 1:06:27 PM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.services.converter;

import org.springframework.beans.BeanUtils;
import org.ebs.model.SegmentModel;
import org.ebs.services.to.Input.SegmentInput;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 20-Aug-2020 1:06:27 PM
 */
@Component
  class SegmentConverterInput implements Converter<SegmentInput,SegmentModel> {

	/**
	 * 
	 * @param source
	 */
	@Override
	public SegmentModel convert(SegmentInput source){
		SegmentModel target = new  SegmentModel(); 
		BeanUtils.copyProperties(source, target); 
		return target;
	}

}