///////////////////////////////////////////////////////////
//  InstanceConverter.java
//  Macromedia ActionScript Implementation of the Class InstanceConverter
//  Generated by Enterprise Architect
//  Created on:      17-May-2020 3:09:36 PM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.services.converter;

import org.ebs.model.InstanceModel;
import org.ebs.services.to.InstanceTo;
import org.springframework.beans.BeanUtils;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 17-May-2020 3:09:36 PM
 */
@Component
public class InstanceConverter implements Converter<InstanceModel,InstanceTo> {

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