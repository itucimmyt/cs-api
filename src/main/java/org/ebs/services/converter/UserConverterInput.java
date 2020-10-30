///////////////////////////////////////////////////////////
//  UserConverterInput.java
//  Macromedia ActionScript Implementation of the Class UserConverterInput
//  Generated by Enterprise Architect
//  Created on:      10-Sep-2020 10:44:54 PM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.services.converter;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
import org.springframework.beans.BeanUtils;
import org.ebs.model.UserModel;
import org.ebs.services.to.Input.UserInput;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 10-Sep-2020 10:44:54 PM
 */
@Component
  class UserConverterInput implements Converter<UserInput,UserModel> {

	/**
	 * 
	 * @param source
	 */
	@Override
	public UserModel convert(UserInput source){
		UserModel target = new  UserModel(); 
		BeanUtils.copyProperties(source, target); 
		return target;
	}

}