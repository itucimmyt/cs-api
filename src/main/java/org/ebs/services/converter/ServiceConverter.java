///////////////////////////////////////////////////////////
//  ServiceConverter.java
//  Macromedia ActionScript Implementation of the Class ServiceConverter
//  Generated by Enterprise Architect
//  Created on:      10-Sep-2020 12:20:10 AM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.services.converter;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
import org.springframework.beans.BeanUtils;
import org.ebs.model.ServiceModel;
import org.ebs.services.to.ServiceTo;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 10-Sep-2020 12:20:10 AM
 */
@Component
  class ServiceConverter implements Converter<ServiceModel,ServiceTo> {

	/**
	 * 
	 * @param source
	 */
	@Override
	public ServiceTo convert(ServiceModel source){
		ServiceTo target = new  ServiceTo(); 
		BeanUtils.copyProperties(source, target); 
		return target;
	}

}