///////////////////////////////////////////////////////////
//  AuthenticationTypeConverterInput.java
//  Macromedia ActionScript Implementation of the Class AuthenticationTypeConverterInput
//  Generated by Enterprise Architect
//  Created on:      15-Jun-2020 5:13:17 PM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.services.converter;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
import org.springframework.beans.BeanUtils;
import org.ebs.model.AuthenticationTypeModel;
import org.ebs.services.to.Input.AuthenticationTypeInput;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 15-Jun-2020 5:13:17 PM
 */
@Component
  class AuthenticationTypeConverterInput implements Converter<AuthenticationTypeInput,AuthenticationTypeModel> {

	/**
	 * 
	 * @param source
	 */
	@Override
	public AuthenticationTypeModel convert(AuthenticationTypeInput source){
		AuthenticationTypeModel target = new  AuthenticationTypeModel(); 
		BeanUtils.copyProperties(source, target); 
		return target;
	}

}