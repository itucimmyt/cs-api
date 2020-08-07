///////////////////////////////////////////////////////////
//  CountryConverterInput.java
//  Macromedia ActionScript Implementation of the Class CountryConverterInput
//  Generated by Enterprise Architect
//  Created on:      07-Aug-2020 2:59:15 PM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.services.converter;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
import org.springframework.beans.BeanUtils;
import org.ebs.model.CountryModel;
import org.ebs.services.to.Input.CountryInput;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 07-Aug-2020 2:59:15 PM
 */
@Component
  class CountryConverterInput implements Converter<CountryInput,CountryModel> {

	/**
	 * 
	 * @param source
	 */
	@Override
	public CountryModel convert(CountryInput source){
		CountryModel target = new  CountryModel(); 
		BeanUtils.copyProperties(source, target); 
		return target;
	}

}