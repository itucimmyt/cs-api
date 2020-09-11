///////////////////////////////////////////////////////////
//  VendorConverterInput.java
//  Macromedia ActionScript Implementation of the Class VendorConverterInput
//  Generated by Enterprise Architect
//  Created on:      10-Sep-2020 10:44:56 PM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.services.converter;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
import org.springframework.beans.BeanUtils;
import org.ebs.model.VendorModel;
import org.ebs.services.to.Input.VendorInput;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 10-Sep-2020 10:44:56 PM
 */
@Component
  class VendorConverterInput implements Converter<VendorInput,VendorModel> {

	/**
	 * 
	 * @param source
	 */
	@Override
	public VendorModel convert(VendorInput source){
		VendorModel target = new  VendorModel(); 
		BeanUtils.copyProperties(source, target); 
		return target;
	}

}