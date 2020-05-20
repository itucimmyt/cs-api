///////////////////////////////////////////////////////////
//  VendorConverterInput.java
//  Macromedia ActionScript Implementation of the Class VendorConverterInput
//  Generated by Enterprise Architect
//  Created on:      17-May-2020 3:10:33 PM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.services.converter;

import org.ebs.model.VendorModel;
import org.ebs.services.to.Input.VendorInput;
import org.springframework.beans.BeanUtils;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 17-May-2020 3:10:33 PM
 */
@Component
public class VendorConverterInput implements Converter<VendorInput,VendorModel> {

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