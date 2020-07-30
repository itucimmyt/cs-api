///////////////////////////////////////////////////////////
//  PermissionConverterInput.java
//  Macromedia ActionScript Implementation of the Class PermissionConverterInput
//  Generated by Enterprise Architect
//  Created on:      27-Jul-2020 8:43:00 AM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.services.converter;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
import org.springframework.beans.BeanUtils;
import org.ebs.model.PermissionModel;
import org.ebs.services.to.Input.PermissionInput;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 27-Jul-2020 8:43:00 AM
 */
@Component
  class PermissionConverterInput implements Converter<PermissionInput,PermissionModel> {

	/**
	 * 
	 * @param source
	 */
	@Override
	public PermissionModel convert(PermissionInput source){
		PermissionModel target = new  PermissionModel(); 
		BeanUtils.copyProperties(source, target); 
		return target;
	}

}