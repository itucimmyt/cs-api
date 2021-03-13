///////////////////////////////////////////////////////////
//  PersonConverter.java
//  Macromedia ActionScript Implementation of the Class PersonConverter
//  Generated by Enterprise Architect
//  Created on:      13-Mar-2021 12:02:44 AM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.services.converter;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
import org.springframework.beans.BeanUtils;
import org.ebs.model.PersonModel;
import org.ebs.services.to.PersonTo;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 13-Mar-2021 12:02:44 AM
 */
@Component
  class PersonConverter implements Converter<PersonModel,PersonTo> {

	/**
	 * 
	 * @param source
	 */
	@Override
	public PersonTo convert(PersonModel source){
		PersonTo target = new  PersonTo(); 
		BeanUtils.copyProperties(source, target); 
		return target;
	}

}