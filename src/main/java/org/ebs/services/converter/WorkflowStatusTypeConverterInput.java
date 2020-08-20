///////////////////////////////////////////////////////////
//  WorkflowStatusTypeConverterInput.java
//  Macromedia ActionScript Implementation of the Class WorkflowStatusTypeConverterInput
//  Generated by Enterprise Architect
//  Created on:      20-Aug-2020 1:07:11 PM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.services.converter;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
import org.springframework.beans.BeanUtils;
import org.ebs.model.WorkflowStatusTypeModel;
import org.ebs.services.to.Input.WorkflowStatusTypeInput;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 20-Aug-2020 1:07:11 PM
 */
@Component
  class WorkflowStatusTypeConverterInput implements Converter<WorkflowStatusTypeInput,WorkflowStatusTypeModel> {

	/**
	 * 
	 * @param source
	 */
	@Override
	public WorkflowStatusTypeModel convert(WorkflowStatusTypeInput source){
		WorkflowStatusTypeModel target = new  WorkflowStatusTypeModel(); 
		BeanUtils.copyProperties(source, target); 
		return target;
	}

}