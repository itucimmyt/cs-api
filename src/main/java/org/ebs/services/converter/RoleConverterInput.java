///////////////////////////////////////////////////////////
//  RoleConverterInput.java
//  Macromedia ActionScript Implementation of the Class RoleConverterInput
//  Generated by Enterprise Architect
//  Created on:      13-Jul-2020 5:07:13 PM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.services.converter;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
import org.springframework.beans.BeanUtils;
import org.ebs.model.RoleModel;
import org.ebs.services.to.Input.RoleInput;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 13-Jul-2020 5:07:13 PM
 */
@Component
  class RoleConverterInput implements Converter<RoleInput,RoleModel> {

	/**
	 * 
	 * @param source
	 */
	@Override
	public RoleModel convert(RoleInput source){
		RoleModel target = new  RoleModel(); 
		BeanUtils.copyProperties(source, target); 
		return target;
	}

}