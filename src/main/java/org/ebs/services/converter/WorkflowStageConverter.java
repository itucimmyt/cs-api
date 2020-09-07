///////////////////////////////////////////////////////////
//  WorkflowStageConverter.java
//  Macromedia ActionScript Implementation of the Class WorkflowStageConverter
//  Generated by Enterprise Architect
//  Created on:      07-Sep-2020 8:12:47 AM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.services.converter;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
import org.springframework.beans.BeanUtils;
import org.ebs.model.WorkflowStageModel;
import org.ebs.services.to.WorkflowStageTo;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 07-Sep-2020 8:12:47 AM
 */
@Component
  class WorkflowStageConverter implements Converter<WorkflowStageModel,WorkflowStageTo> {

	/**
	 * 
	 * @param source
	 */
	@Override
	public WorkflowStageTo convert(WorkflowStageModel source){
		WorkflowStageTo target = new  WorkflowStageTo(); 
		BeanUtils.copyProperties(source, target); 
		return target;
	}

}