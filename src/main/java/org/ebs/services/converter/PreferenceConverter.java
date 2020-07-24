///////////////////////////////////////////////////////////
//  PreferenceConverter.java
//  Macromedia ActionScript Implementation of the Class PreferenceConverter
//  Generated by Enterprise Architect
//  Created on:      23-Jul-2020 10:46:51 PM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.services.converter;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
import org.springframework.beans.BeanUtils;
import org.ebs.model.PreferenceModel;
import org.ebs.services.to.PreferenceTo;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 23-Jul-2020 10:46:51 PM
 */
@Component
  class PreferenceConverter implements Converter<PreferenceModel,PreferenceTo> {

	/**
	 * 
	 * @param source
	 */
	@Override
	public PreferenceTo convert(PreferenceModel source){
		PreferenceTo target = new  PreferenceTo(); 
		BeanUtils.copyProperties(source, target); 
		return target;
	}

}