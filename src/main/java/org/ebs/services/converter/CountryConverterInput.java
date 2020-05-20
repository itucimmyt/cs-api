///////////////////////////////////////////////////////////
//  CountryConverterInput.java
//  Macromedia ActionScript Implementation of the Class CountryConverterInput
//  Generated by Enterprise Architect
//  Created on:      17-May-2020 3:09:26 PM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.services.converter;

import org.ebs.model.CountryModel;
import org.ebs.services.to.Input.CountryInput;
import org.springframework.beans.BeanUtils;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 17-May-2020 3:09:26 PM
 */
@Component
public class CountryConverterInput implements Converter<CountryInput,CountryModel> {

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