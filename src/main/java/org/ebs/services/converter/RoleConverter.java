///////////////////////////////////////////////////////////
//  RoleConverter.java
//  Macromedia ActionScript Implementation of the Class RoleConverter
//  Generated by Enterprise Architect
//  Created on:      04-Sep-2020 10:05:54 AM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.services.converter;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
import org.springframework.beans.BeanUtils;
import org.ebs.model.RoleModel;
import org.ebs.services.to.RoleTo;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 04-Sep-2020 10:05:54 AM
 */
@Component
  class RoleConverter implements Converter<RoleModel,RoleTo> {

	/**
	 * 
	 * @param source
	 */
	@Override
	public RoleTo convert(RoleModel source){
		RoleTo target = new  RoleTo(); 
		BeanUtils.copyProperties(source, target); 
		return target;
	}

}