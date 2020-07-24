///////////////////////////////////////////////////////////
//  ServiceConverterInput.java
//  Macromedia ActionScript Implementation of the Class ServiceConverterInput
//  Generated by Enterprise Architect
//  Created on:      23-Jul-2020 10:47:09 PM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.services.converter;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
import org.springframework.beans.BeanUtils;
import org.ebs.model.ServiceModel;
import org.ebs.services.to.Input.ServiceInput;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 23-Jul-2020 10:47:09 PM
 */
@Component
  class ServiceConverterInput implements Converter<ServiceInput,ServiceModel> {

	/**
	 * 
	 * @param source
	 */
	@Override
	public ServiceModel convert(ServiceInput source){
		ServiceModel target = new  ServiceModel(); 
		BeanUtils.copyProperties(source, target); 
		return target;
	}

}