///////////////////////////////////////////////////////////
//  RoleActionConverter.java
//  Macromedia ActionScript Implementation of the Class RoleActionConverter
//  Generated by Enterprise Architect
//  Created on:      04-Sep-2020 10:05:53 AM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.services.converter;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
import org.springframework.beans.BeanUtils;
import org.ebs.model.RoleActionModel;
import org.ebs.services.to.RoleActionTo;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 04-Sep-2020 10:05:53 AM
 */
@Component
  class RoleActionConverter implements Converter<RoleActionModel,RoleActionTo> {

	/**
	 * 
	 * @param source
	 */
	@Override
	public RoleActionTo convert(RoleActionModel source){
		RoleActionTo target = new  RoleActionTo(); 
		BeanUtils.copyProperties(source, target); 
		return target;
	}

}