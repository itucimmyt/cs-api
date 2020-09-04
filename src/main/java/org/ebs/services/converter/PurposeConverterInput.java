///////////////////////////////////////////////////////////
//  PurposeConverterInput.java
//  Macromedia ActionScript Implementation of the Class PurposeConverterInput
//  Generated by Enterprise Architect
//  Created on:      04-Sep-2020 10:05:46 AM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.services.converter;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
import org.springframework.beans.BeanUtils;
import org.ebs.model.PurposeModel;
import org.ebs.services.to.Input.PurposeInput;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 04-Sep-2020 10:05:46 AM
 */
@Component
  class PurposeConverterInput implements Converter<PurposeInput,PurposeModel> {

	/**
	 * 
	 * @param source
	 */
	@Override
	public PurposeModel convert(PurposeInput source){
		PurposeModel target = new  PurposeModel(); 
		BeanUtils.copyProperties(source, target); 
		return target;
	}

}