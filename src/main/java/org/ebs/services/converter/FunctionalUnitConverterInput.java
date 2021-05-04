///////////////////////////////////////////////////////////
//  FunctionalUnitConverterInput.java
//  Macromedia ActionScript Implementation of the Class FunctionalUnitConverterInput
//  Generated by Enterprise Architect
//  Created on:      02-May-2021 6:19:49 AM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.services.converter;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
import org.springframework.beans.BeanUtils;
import org.ebs.model.FunctionalUnitModel;
import org.ebs.services.to.Input.FunctionalUnitInput;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 02-May-2021 6:19:49 AM
 */
@Component
  class FunctionalUnitConverterInput implements Converter<FunctionalUnitInput,FunctionalUnitModel> {

	/**
	 * 
	 * @param source
	 */
	@Override
	public FunctionalUnitModel convert(FunctionalUnitInput source){
		FunctionalUnitModel target = new  FunctionalUnitModel(); 
		BeanUtils.copyProperties(source, target); 
		return target;
	}

}