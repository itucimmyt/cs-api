///////////////////////////////////////////////////////////
//  ProcessConverter.java
//  Macromedia ActionScript Implementation of the Class ProcessConverter
//  Generated by Enterprise Architect
//  Created on:      07-Sep-2020 8:11:46 AM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.services.converter;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
import org.springframework.beans.BeanUtils;
import org.ebs.model.ProcessModel;
import org.ebs.services.to.ProcessTo;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 07-Sep-2020 8:11:46 AM
 */
@Component
  class ProcessConverter implements Converter<ProcessModel,ProcessTo> {

	/**
	 * 
	 * @param source
	 */
	@Override
	public ProcessTo convert(ProcessModel source){
		ProcessTo target = new  ProcessTo(); 
		BeanUtils.copyProperties(source, target); 
		return target;
	}

}