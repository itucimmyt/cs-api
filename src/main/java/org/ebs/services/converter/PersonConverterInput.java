///////////////////////////////////////////////////////////
//  PersonConverterInput.java
//  Macromedia ActionScript Implementation of the Class PersonConverterInput
//  Generated by Enterprise Architect
//  Created on:      17-May-2020 3:09:52 PM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.services.converter;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
import org.springframework.beans.BeanUtils;
import org.ebs.model.PersonModel;
import org.ebs.services.to.Input.PersonInput;
import org.ebs.services.to.PersonTo;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 17-May-2020 3:09:52 PM
 */
@Component
public class PersonConverterInput implements Converter<PersonInput,PersonModel> {

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