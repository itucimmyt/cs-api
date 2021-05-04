///////////////////////////////////////////////////////////
//  CustomerConverterInput.java
//  Macromedia ActionScript Implementation of the Class CustomerConverterInput
//  Generated by Enterprise Architect
//  Created on:      02-May-2021 6:19:45 AM
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
 * @created 02-May-2021 6:19:45 AM
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