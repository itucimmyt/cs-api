///////////////////////////////////////////////////////////
//  RoleConverter.java
//  Macromedia ActionScript Implementation of the Class RoleConverter
//  Generated by Enterprise Architect
//  Created on:      17-May-2020 3:10:08 PM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.services.converter;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
import org.springframework.beans.BeanUtils;
import org.ebs.model.RoleModel;
import org.ebs.services.to.Input.RoleInput;
import org.ebs.services.to.RoleTo;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 17-May-2020 3:10:08 PM
 */
@Component
public class RoleConverter implements Converter<RoleModel,RoleTo> {

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