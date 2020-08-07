///////////////////////////////////////////////////////////
//  CustomerConverterInput.java
//  Macromedia ActionScript Implementation of the Class CustomerConverterInput
//  Generated by Enterprise Architect
//  Created on:      07-Aug-2020 2:59:21 PM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.services.converter;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
import org.springframework.beans.BeanUtils;
import org.ebs.model.CustomerModel;
import org.ebs.services.to.Input.CustomerInput;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 07-Aug-2020 2:59:21 PM
 */
@Component
  class CustomerConverterInput implements Converter<CustomerInput,CustomerModel> {

	/**
	 * 
	 * @param source
	 */
	@Override
	public CustomerModel convert(CustomerInput source){
		CustomerModel target = new  CustomerModel(); 
		BeanUtils.copyProperties(source, target); 
		return target;
	}

}