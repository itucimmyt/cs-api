///////////////////////////////////////////////////////////
//  PersonConverterInput.java
//  Macromedia ActionScript Implementation of the Class PersonConverterInput
//  Generated by Enterprise Architect
//  Created on:      07-Sep-2020 8:11:41 AM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.services.converter;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
import org.springframework.beans.BeanUtils;
import org.ebs.model.PersonModel;
import org.ebs.services.to.Input.PersonInput;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 07-Sep-2020 8:11:41 AM
 */
@Component
  class PersonConverterInput implements Converter<PersonInput,PersonModel> {

	/**
	 * 
	 * @param source
	 */
	@Override
	public PersonModel convert(PersonInput source){
		PersonModel target = new  PersonModel(); 
		BeanUtils.copyProperties(source, target); 
		return target;
	}

}