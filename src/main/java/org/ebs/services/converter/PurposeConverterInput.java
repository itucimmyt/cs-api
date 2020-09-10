///////////////////////////////////////////////////////////
//  PurposeConverterInput.java
//  Macromedia ActionScript Implementation of the Class PurposeConverterInput
//  Generated by Enterprise Architect
//  Created on:      10-Sep-2020 12:19:53 AM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.services.converter;

import org.springframework.beans.BeanUtils;
import org.ebs.model.PurposeModel;
import org.ebs.services.to.Input.PurposeInput;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 10-Sep-2020 12:19:53 AM
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