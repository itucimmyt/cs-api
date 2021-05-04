///////////////////////////////////////////////////////////
//  CropConverterInput.java
//  Macromedia ActionScript Implementation of the Class CropConverterInput
//  Generated by Enterprise Architect
//  Created on:      02-May-2021 6:19:44 AM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.services.converter;

import org.ebs.model.CropModel;
import org.ebs.services.to.Input.CropInput;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
import org.springframework.beans.BeanUtils;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 02-May-2021 6:19:44 AM
 */
@Component
  class CropConverterInput implements Converter<CropInput,CropModel> {

	/**
	 * 
	 * @param source
	 */
	@Override
	public CropModel convert(CropInput source){
		CropModel target = new  CropModel(); 
		BeanUtils.copyProperties(source, target); 
		return target;
	}

}