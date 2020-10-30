///////////////////////////////////////////////////////////
//  CountryConverter.java
//  Macromedia ActionScript Implementation of the Class CountryConverter
//  Generated by Enterprise Architect
//  Created on:      10-Sep-2020 10:43:30 PM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.services.converter;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
import org.springframework.beans.BeanUtils;
import org.ebs.model.CountryModel;
import org.ebs.services.to.CountryTo;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 10-Sep-2020 10:43:30 PM
 */
@Component
  class CountryConverter implements Converter<CountryModel,CountryTo> {

	/**
	 * 
	 * @param source
	 */
	@Override
	public CountryTo convert(CountryModel source){
		CountryTo target = new  CountryTo(); 
		BeanUtils.copyProperties(source, target); 
		return target;
	}

}