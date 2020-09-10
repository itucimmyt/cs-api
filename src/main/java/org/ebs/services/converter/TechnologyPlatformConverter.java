///////////////////////////////////////////////////////////
//  TechnologyPlatformConverter.java
//  Macromedia ActionScript Implementation of the Class TechnologyPlatformConverter
//  Generated by Enterprise Architect
//  Created on:      10-Sep-2020 12:20:23 AM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.services.converter;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
import org.springframework.beans.BeanUtils;
import org.ebs.model.TechnologyPlatformModel;
import org.ebs.services.to.TechnologyPlatformTo;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 10-Sep-2020 12:20:23 AM
 */
@Component
  class TechnologyPlatformConverter implements Converter<TechnologyPlatformModel,TechnologyPlatformTo> {

	/**
	 * 
	 * @param source
	 */
	@Override
	public TechnologyPlatformTo convert(TechnologyPlatformModel source){
		TechnologyPlatformTo target = new  TechnologyPlatformTo(); 
		BeanUtils.copyProperties(source, target); 
		return target;
	}

}