///////////////////////////////////////////////////////////
//  ProgramConverterInput.java
//  Macromedia ActionScript Implementation of the Class ProgramConverterInput
//  Generated by Enterprise Architect
//  Created on:      10-Sep-2020 12:19:48 AM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.services.converter;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
import org.springframework.beans.BeanUtils;
import org.ebs.model.ProgramModel;
import org.ebs.services.to.Input.ProgramInput;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 10-Sep-2020 12:19:48 AM
 */
@Component
  class ProgramConverterInput implements Converter<ProgramInput,ProgramModel> {

	/**
	 * 
	 * @param source
	 */
	@Override
	public ProgramModel convert(ProgramInput source){
		ProgramModel target = new  ProgramModel(); 
		BeanUtils.copyProperties(source, target); 
		return target;
	}

}