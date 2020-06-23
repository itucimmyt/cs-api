///////////////////////////////////////////////////////////
//  SchemeConverterInput.java
//  Macromedia ActionScript Implementation of the Class SchemeConverterInput
//  Generated by Enterprise Architect
//  Created on:      15-Jun-2020 5:14:20 PM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.services.converter;

import org.springframework.stereotype.Component;
import org.springframework.beans.BeanUtils;
import org.ebs.model.SchemeModel;
import org.ebs.services.to.Input.SchemeInput;
import org.springframework.core.convert.converter.Converter;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 15-Jun-2020 5:14:20 PM
 */
@Component
  class SchemeConverterInput implements Converter<SchemeInput,SchemeModel> {

	/**
	 * 
	 * @param source
	 */
	@Override
	public SchemeModel convert(SchemeInput source){
		SchemeModel target = new  SchemeModel(); 
		BeanUtils.copyProperties(source, target); 
		return target;
	}

}