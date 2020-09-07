///////////////////////////////////////////////////////////
//  AddressConverterInput.java
//  Macromedia ActionScript Implementation of the Class AddressConverterInput
//  Generated by Enterprise Architect
//  Created on:      07-Sep-2020 8:10:46 AM
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
 * @created 07-Sep-2020 8:10:46 AM
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