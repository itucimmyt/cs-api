///////////////////////////////////////////////////////////
//  LanguageConverterInput.java
//  Macromedia ActionScript Implementation of the Class LanguageConverterInput
//  Generated by Enterprise Architect
//  Created on:      07-Aug-2020 2:59:51 PM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.services.converter;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
import org.springframework.beans.BeanUtils;
import org.ebs.model.LanguageModel;
import org.ebs.services.to.Input.LanguageInput;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 07-Aug-2020 2:59:51 PM
 */
@Component
  class LanguageConverterInput implements Converter<LanguageInput,LanguageModel> {

	/**
	 * 
	 * @param source
	 */
	@Override
	public LanguageModel convert(LanguageInput source){
		LanguageModel target = new  LanguageModel(); 
		BeanUtils.copyProperties(source, target); 
		return target;
	}

}