///////////////////////////////////////////////////////////
//  PreferenceConverterInput.java
//  Macromedia ActionScript Implementation of the Class PreferenceConverterInput
//  Generated by Enterprise Architect
//  Created on:      10-Sep-2020 12:19:44 AM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.services.converter;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
import org.springframework.beans.BeanUtils;
import org.ebs.model.PreferenceModel;
import org.ebs.services.to.Input.PreferenceInput;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 10-Sep-2020 12:19:44 AM
 */
@Component
  class PreferenceConverterInput implements Converter<PreferenceInput,PreferenceModel> {

	/**
	 * 
	 * @param source
	 */
	@Override
	public PreferenceModel convert(PreferenceInput source){
		PreferenceModel target = new  PreferenceModel(); 
		BeanUtils.copyProperties(source, target); 
		return target;
	}

}