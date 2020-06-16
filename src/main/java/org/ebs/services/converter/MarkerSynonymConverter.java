///////////////////////////////////////////////////////////
//  MarkerSynonymConverter.java
//  Macromedia ActionScript Implementation of the Class MarkerSynonymConverter
//  Generated by Enterprise Architect
//  Created on:      15-Jun-2020 5:13:42 PM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.services.converter;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
import org.springframework.beans.BeanUtils;
import org.ebs.model.MarkerSynonymModel;
import org.ebs.services.to.MarkerSynonymTo;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 15-Jun-2020 5:13:42 PM
 */
@Component
  class MarkerSynonymConverter implements Converter<MarkerSynonymModel,MarkerSynonymTo> {

	/**
	 * 
	 * @param source
	 */
	@Override
	public MarkerSynonymTo convert(MarkerSynonymModel source){
		MarkerSynonymTo target = new  MarkerSynonymTo(); 
		BeanUtils.copyProperties(source, target); 
		return target;
	}

}