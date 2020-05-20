///////////////////////////////////////////////////////////
//  ProcessConverter.java
//  Macromedia ActionScript Implementation of the Class ProcessConverter
//  Generated by Enterprise Architect
//  Created on:      17-May-2020 3:09:59 PM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.services.converter;

import org.ebs.model.ProcessModel;
import org.ebs.services.to.ProcessTo;
import org.springframework.beans.BeanUtils;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 17-May-2020 3:09:59 PM
 */
@Component
public class ProcessConverter implements Converter<ProcessModel,ProcessTo> {

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