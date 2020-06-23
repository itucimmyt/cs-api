///////////////////////////////////////////////////////////
//  AddressConverterInput.java
//  Macromedia ActionScript Implementation of the Class AddressConverterInput
//  Generated by Enterprise Architect
//  Created on:      15-Jun-2020 5:13:04 PM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.services.converter;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
import org.springframework.beans.BeanUtils;
import org.ebs.model.AddressModel;
import org.ebs.services.to.Input.AddressInput;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 15-Jun-2020 5:13:04 PM
 */
@Component
  class AddressConverterInput implements Converter<AddressInput,AddressModel> {

	/**
	 * 
	 * @param source
	 */
	@Override
	public AddressModel convert(AddressInput source){
		AddressModel target = new  AddressModel(); 
		BeanUtils.copyProperties(source, target); 
		return target;
	}

}