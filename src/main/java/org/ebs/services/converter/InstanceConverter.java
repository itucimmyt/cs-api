///////////////////////////////////////////////////////////
//  InstanceConverter.java
//  Macromedia ActionScript Implementation of the Class InstanceConverter
//  Generated by Enterprise Architect
//  Created on:      04-Sep-2020 10:05:11 AM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.services.converter;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
import org.springframework.beans.BeanUtils;
import org.ebs.model.InstanceModel;
import org.ebs.services.to.InstanceTo;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 04-Sep-2020 10:05:11 AM
 */
@Component
  class InstanceConverter implements Converter<InstanceModel,InstanceTo> {

	/**
	 * 
	 * @param source
	 */
	@Override
	public InstanceTo convert(InstanceModel source){
		InstanceTo target = new  InstanceTo(); 
		BeanUtils.copyProperties(source, target); 
		return target;
	}

}