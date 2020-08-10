///////////////////////////////////////////////////////////
//  WorkflowEventConverterInput.java
//  Macromedia ActionScript Implementation of the Class WorkflowEventConverterInput
//  Generated by Enterprise Architect
//  Created on:      09-Aug-2020 4:51:54 PM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.services.converter;

import org.springframework.beans.BeanUtils;
import org.ebs.model.WorkflowEventModel;
import org.ebs.services.to.Input.WorkflowEventInput;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 09-Aug-2020 4:51:54 PM
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