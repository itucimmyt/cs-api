///////////////////////////////////////////////////////////
//  DataFormatConverterInput.java
//  Macromedia ActionScript Implementation of the Class DataFormatConverterInput
//  Generated by Enterprise Architect
//  Created on:      07-Sep-2020 8:11:08 AM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.services.converter;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
import org.springframework.beans.BeanUtils;
import org.ebs.model.DataFormatModel;
import org.ebs.services.to.Input.DataFormatInput;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 07-Sep-2020 8:11:08 AM
 */
@Component
  class DataFormatConverterInput implements Converter<DataFormatInput,DataFormatModel> {

	/**
	 * 
	 * @param source
	 */
	@Override
	public DataFormatModel convert(DataFormatInput source){
		DataFormatModel target = new  DataFormatModel(); 
		BeanUtils.copyProperties(source, target); 
		return target;
	}

}