///////////////////////////////////////////////////////////
//  DataFormatConverter.java
//  Macromedia ActionScript Implementation of the Class DataFormatConverter
//  Generated by Enterprise Architect
//  Created on:      20-Aug-2020 1:05:37 PM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.services.converter;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
import org.springframework.beans.BeanUtils;
import org.ebs.model.DataFormatModel;
import org.ebs.services.to.DataFormatTo;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 20-Aug-2020 1:05:37 PM
 */
@Component
  class DataFormatConverter implements Converter<DataFormatModel,DataFormatTo> {

	/**
	 * 
	 * @param source
	 */
	@Override
	public DataFormatTo convert(DataFormatModel source){
		DataFormatTo target = new  DataFormatTo(); 
		BeanUtils.copyProperties(source, target); 
		return target;
	}

}