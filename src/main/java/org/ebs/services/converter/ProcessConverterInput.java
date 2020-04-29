///////////////////////////////////////////////////////////
//  ProcessConverterInput.java
//  Macromedia ActionScript Implementation of the Class ProcessConverterInput
//  Generated by Enterprise Architect
//  Created on:      28-Apr-2020 11:58:24 PM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.services.converter;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
import org.springframework.beans.BeanUtils;
import org.ebs.model.ProcessModel;
import org.ebs.services.to.Input.ProcessInput;
import org.ebs.services.to.ProcessTo;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 28-Apr-2020 11:58:24 PM
 */
@Component
public class ProcessConverterInput implements Converter<ProcessInput,ProcessModel> {

	/**
	 * 
	 * @param source
	 */
	@Override
	public ProcessModel convert(ProcessInput source){
		ProcessModel target = new  ProcessModel(); 
		BeanUtils.copyProperties(source, target); 
		return target;
	}

}