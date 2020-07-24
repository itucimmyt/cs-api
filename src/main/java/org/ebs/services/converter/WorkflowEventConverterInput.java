///////////////////////////////////////////////////////////
//  WorkflowEventConverterInput.java
//  Macromedia ActionScript Implementation of the Class WorkflowEventConverterInput
//  Generated by Enterprise Architect
//  Created on:      23-Jul-2020 10:47:32 PM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.services.converter;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
import org.springframework.beans.BeanUtils;
import org.ebs.model.WorkflowEventModel;
import org.ebs.services.to.Input.WorkflowEventInput;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 23-Jul-2020 10:47:32 PM
 */
@Component
  class WorkflowEventConverterInput implements Converter<WorkflowEventInput,WorkflowEventModel> {

	/**
	 * 
	 * @param source
	 */
	@Override
	public WorkflowEventModel convert(WorkflowEventInput source){
		WorkflowEventModel target = new  WorkflowEventModel(); 
		BeanUtils.copyProperties(source, target); 
		return target;
	}

}