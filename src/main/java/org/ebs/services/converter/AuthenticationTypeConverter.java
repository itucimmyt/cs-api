///////////////////////////////////////////////////////////
//  AuthenticationTypeConverter.java
//  Macromedia ActionScript Implementation of the Class AuthenticationTypeConverter
//  Generated by Enterprise Architect
//  Created on:      13-Jul-2020 5:06:15 PM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.services.converter;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
import org.springframework.beans.BeanUtils;
import org.ebs.model.AuthenticationTypeModel;
import org.ebs.services.to.AuthenticationTypeTo;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 13-Jul-2020 5:06:15 PM
 */
@Component
  class AuthenticationTypeConverter implements Converter<AuthenticationTypeModel,AuthenticationTypeTo> {

	/**
	 * 
	 * @param source
	 */
	@Override
	public AuthenticationTypeTo convert(AuthenticationTypeModel source){
		AuthenticationTypeTo target = new  AuthenticationTypeTo(); 
		BeanUtils.copyProperties(source, target); 
		return target;
	}

}