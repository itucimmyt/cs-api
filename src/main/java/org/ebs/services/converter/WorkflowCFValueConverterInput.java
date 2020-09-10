///////////////////////////////////////////////////////////
//  WorkflowCFValueConverterInput.java
//  Macromedia ActionScript Implementation of the Class WorkflowCFValueConverterInput
//  Generated by Enterprise Architect
//  Created on:      10-Sep-2020 12:20:42 AM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.services.converter;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
import org.springframework.beans.BeanUtils;
import org.ebs.model.WorkflowCFValueModel;
import org.ebs.services.to.Input.WorkflowCFValueInput;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 10-Sep-2020 12:20:42 AM
 */
@Component
  class WorkflowCFValueConverterInput implements Converter<WorkflowCFValueInput,WorkflowCFValueModel> {

	/**
	 * 
	 * @param source
	 */
	@Override
	public WorkflowCFValueModel convert(WorkflowCFValueInput source){
		WorkflowCFValueModel target = new  WorkflowCFValueModel(); 
		BeanUtils.copyProperties(source, target); 
		return target;
	}

}