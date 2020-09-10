///////////////////////////////////////////////////////////
//  ServiceTypeConverterInput.java
//  Macromedia ActionScript Implementation of the Class ServiceTypeConverterInput
//  Generated by Enterprise Architect
//  Created on:      10-Sep-2020 12:20:14 AM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.services.converter;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
import org.springframework.beans.BeanUtils;
import org.ebs.model.ServiceTypeModel;
import org.ebs.services.to.Input.ServiceTypeInput;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 10-Sep-2020 12:20:14 AM
 */
@Component
  class ServiceTypeConverterInput implements Converter<ServiceTypeInput,ServiceTypeModel> {

	/**
	 * 
	 * @param source
	 */
	@Override
	public ServiceTypeModel convert(ServiceTypeInput source){
		ServiceTypeModel target = new  ServiceTypeModel(); 
		BeanUtils.copyProperties(source, target); 
		return target;
	}

}