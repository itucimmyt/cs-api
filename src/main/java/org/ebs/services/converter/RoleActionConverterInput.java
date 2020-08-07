///////////////////////////////////////////////////////////
//  RoleActionConverterInput.java
//  Macromedia ActionScript Implementation of the Class RoleActionConverterInput
//  Generated by Enterprise Architect
//  Created on:      07-Aug-2020 3:01:08 PM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.services.converter;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
import org.springframework.beans.BeanUtils;
import org.ebs.model.RoleActionModel;
import org.ebs.services.to.Input.RoleActionInput;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 07-Aug-2020 3:01:08 PM
 */
@Component
  class RoleActionConverterInput implements Converter<RoleActionInput,RoleActionModel> {

	/**
	 * 
	 * @param source
	 */
	@Override
	public RoleActionModel convert(RoleActionInput source){
		RoleActionModel target = new  RoleActionModel(); 
		BeanUtils.copyProperties(source, target); 
		return target;
	}

}