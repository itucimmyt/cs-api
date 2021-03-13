///////////////////////////////////////////////////////////
//  TranslationConverter.java
//  Macromedia ActionScript Implementation of the Class TranslationConverter
//  Generated by Enterprise Architect
//  Created on:      13-Mar-2021 12:02:59 AM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.services.converter;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
import org.springframework.beans.BeanUtils;
import org.ebs.model.TranslationModel;
import org.ebs.services.to.TranslationTo;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 13-Mar-2021 12:02:59 AM
 */
@Component
  class TranslationConverter implements Converter<TranslationModel,TranslationTo> {

	/**
	 * 
	 * @param source
	 */
	@Override
	public TranslationTo convert(TranslationModel source){
		TranslationTo target = new  TranslationTo(); 
		BeanUtils.copyProperties(source, target); 
		return target;
	}

}