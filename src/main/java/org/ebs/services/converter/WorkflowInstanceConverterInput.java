///////////////////////////////////////////////////////////
//  WorkflowInstanceConverterInput.java
//  Macromedia ActionScript Implementation of the Class WorkflowInstanceConverterInput
//  Generated by Enterprise Architect
//  Created on:      10-Sep-2020 10:45:05 PM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.services.converter;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
import org.springframework.beans.BeanUtils;
import org.ebs.model.WorkflowInstanceModel;
import org.ebs.services.to.Input.WorkflowInstanceInput;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 10-Sep-2020 10:45:05 PM
 */
@Component
  class WorkflowInstanceConverterInput implements Converter<WorkflowInstanceInput,WorkflowInstanceModel> {

	/**
	 * 
	 * @param source
	 */
	@Override
	public WorkflowInstanceModel convert(WorkflowInstanceInput source){
		WorkflowInstanceModel target = new  WorkflowInstanceModel(); 
		BeanUtils.copyProperties(source, target); 
		return target;
	}

}