///////////////////////////////////////////////////////////
//  SeasonConverterInput.java
//  Macromedia ActionScript Implementation of the Class SeasonConverterInput
//  Generated by Enterprise Architect
//  Created on:      07-Sep-2020 8:12:02 AM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.services.converter;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
import org.springframework.beans.BeanUtils;
import org.ebs.model.SeasonModel;
import org.ebs.services.to.Input.SeasonInput;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 07-Sep-2020 8:12:02 AM
 */
@Component
  class SeasonConverterInput implements Converter<SeasonInput,SeasonModel> {

	/**
	 * 
	 * @param source
	 */
	@Override
	public SeasonModel convert(SeasonInput source){
		SeasonModel target = new  SeasonModel(); 
		BeanUtils.copyProperties(source, target); 
		return target;
	}

}