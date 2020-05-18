///////////////////////////////////////////////////////////
//  TechnologyPlatformConverter.java
//  Macromedia ActionScript Implementation of the Class TechnologyPlatformConverter
//  Generated by Enterprise Architect
//  Created on:      17-May-2020 3:10:23 PM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.services.converter;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
import org.springframework.beans.BeanUtils;
import org.ebs.model.TechnologyPlatformModel;
import org.ebs.services.to.Input.TechnologyPlatformInput;
import org.ebs.services.to.TechnologyPlatformTo;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 17-May-2020 3:10:23 PM
 */
@Component
public class TechnologyPlatformConverter implements Converter<TechnologyPlatformModel,TechnologyPlatformTo> {

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