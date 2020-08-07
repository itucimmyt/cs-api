///////////////////////////////////////////////////////////
//  ServiceTypeConverter.java
//  Macromedia ActionScript Implementation of the Class ServiceTypeConverter
//  Generated by Enterprise Architect
//  Created on:      07-Aug-2020 3:01:31 PM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.services.converter;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
import org.springframework.beans.BeanUtils;
import org.ebs.model.ServiceTypeModel;
import org.ebs.services.to.ServiceTypeTo;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 07-Aug-2020 3:01:31 PM
 */
@Component
  class ServiceTypeConverter implements Converter<ServiceTypeModel,ServiceTypeTo> {

	/**
	 * 
	 * @param source
	 */
	@Override
	public ServiceTypeTo convert(ServiceTypeModel source){
		ServiceTypeTo target = new  ServiceTypeTo(); 
		BeanUtils.copyProperties(source, target); 
		return target;
	}

}