///////////////////////////////////////////////////////////
//  LanguageConverter.java
//  Macromedia ActionScript Implementation of the Class LanguageConverter
//  Generated by Enterprise Architect
//  Created on:      09-Aug-2020 4:50:47 PM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.services.converter;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
import org.springframework.beans.BeanUtils;
import org.ebs.model.LanguageModel;
import org.ebs.services.to.LanguageTo;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 09-Aug-2020 4:50:47 PM
 */
@Component
  class LanguageConverter implements Converter<LanguageModel,LanguageTo> {

	/**
	 * 
	 * @param source
	 */
	@Override
	public LanguageTo convert(LanguageModel source){
		LanguageTo target = new  LanguageTo(); 
		BeanUtils.copyProperties(source, target); 
		return target;
	}

}