///////////////////////////////////////////////////////////
//  AddressConverter.java
//  Macromedia ActionScript Implementation of the Class AddressConverter
//  Generated by Enterprise Architect
//  Created on:      10-Sep-2020 10:43:13 PM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.services.converter;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
import org.springframework.beans.BeanUtils;
import org.ebs.model.AddressModel;
import org.ebs.services.to.AddressTo;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 10-Sep-2020 10:43:13 PM
 */
@Component
  class AddressConverter implements Converter<AddressModel,AddressTo> {

	/**
	 * 
	 * @param source
	 */
	@Override
	public AddressTo convert(AddressModel source){
		AddressTo target = new  AddressTo(); 
		BeanUtils.copyProperties(source, target); 
		return target;
	}

}