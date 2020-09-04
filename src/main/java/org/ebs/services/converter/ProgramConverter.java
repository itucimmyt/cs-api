///////////////////////////////////////////////////////////
//  ProgramConverter.java
//  Macromedia ActionScript Implementation of the Class ProgramConverter
//  Generated by Enterprise Architect
//  Created on:      04-Sep-2020 10:05:41 AM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.services.converter;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
import org.springframework.beans.BeanUtils;
import org.ebs.model.ProgramModel;
import org.ebs.services.to.ProgramTo;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 04-Sep-2020 10:05:41 AM
 */
@Component
  class ProgramConverter implements Converter<ProgramModel,ProgramTo> {

	/**
	 * 
	 * @param source
	 */
	@Override
	public ProgramTo convert(ProgramModel source){
		ProgramTo target = new  ProgramTo(); 
		BeanUtils.copyProperties(source, target); 
		return target;
	}

}