///////////////////////////////////////////////////////////
//  AuthenticationTypeConverterInput.java
//  Macromedia ActionScript Implementation of the Class AuthenticationTypeConverterInput
//  Generated by Enterprise Architect
//  Created on:      27-Jul-2020 8:42:12 AM
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
 * @created 27-Jul-2020 8:42:12 AM
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