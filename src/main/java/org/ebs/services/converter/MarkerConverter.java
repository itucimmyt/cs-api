///////////////////////////////////////////////////////////
//  MarkerConverter.java
//  Macromedia ActionScript Implementation of the Class MarkerConverter
//  Generated by Enterprise Architect
//  Created on:      23-Jul-2020 10:46:31 PM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.services.converter;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
import org.springframework.beans.BeanUtils;
import org.ebs.model.MarkerModel;
import org.ebs.services.to.MarkerTo;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 23-Jul-2020 10:46:31 PM
 */
@Component
  class MarkerConverter implements Converter<MarkerModel,MarkerTo> {

	/**
	 * 
	 * @param source
	 */
	@Override
	public MarkerTo convert(MarkerModel source){
		MarkerTo target = new  MarkerTo(); 
		BeanUtils.copyProperties(source, target); 
		return target;
	}

}