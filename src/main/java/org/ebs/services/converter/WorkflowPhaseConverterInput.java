///////////////////////////////////////////////////////////
//  WorkflowPhaseConverterInput.java
//  Macromedia ActionScript Implementation of the Class WorkflowPhaseConverterInput
//  Generated by Enterprise Architect
//  Created on:      20-Aug-2020 1:07:03 PM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.services.converter;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
import org.springframework.beans.BeanUtils;
import org.ebs.model.WorkflowPhaseModel;
import org.ebs.services.to.Input.WorkflowPhaseInput;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 20-Aug-2020 1:07:03 PM
 */
@Component
  class WorkflowPhaseConverterInput implements Converter<WorkflowPhaseInput,WorkflowPhaseModel> {

	/**
	 * 
	 * @param source
	 */
	@Override
	public WorkflowPhaseModel convert(WorkflowPhaseInput source){
		WorkflowPhaseModel target = new  WorkflowPhaseModel(); 
		BeanUtils.copyProperties(source, target); 
		return target;
	}

}