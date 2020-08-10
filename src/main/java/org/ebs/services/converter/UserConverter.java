///////////////////////////////////////////////////////////
//  UserConverter.java
//  Macromedia ActionScript Implementation of the Class UserConverter
//  Generated by Enterprise Architect
//  Created on:      09-Aug-2020 4:51:47 PM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.services.converter;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
import org.springframework.beans.BeanUtils;
import org.ebs.model.UserModel;
import org.ebs.services.to.UserTo;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 09-Aug-2020 4:51:47 PM
 */
@Component
  class UserConverter implements Converter<UserModel,UserTo> {

	/**
	 * 
	 * @param source
	 */
	@Override
	public UserTo convert(UserModel source){
		UserTo target = new  UserTo(); 
		BeanUtils.copyProperties(source, target); 
		return target;
	}

}