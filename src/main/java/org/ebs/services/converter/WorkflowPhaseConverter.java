///////////////////////////////////////////////////////////
//  WorkflowPhaseConverter.java
//  Macromedia ActionScript Implementation of the Class WorkflowPhaseConverter
//  Generated by Enterprise Architect
//  Created on:      07-Aug-2020 3:02:45 PM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.services.converter;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
import org.springframework.beans.BeanUtils;
import org.ebs.model.WorkflowPhaseModel;
import org.ebs.services.to.WorkflowPhaseTo;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 07-Aug-2020 3:02:45 PM
 */
@Component
  class WorkflowPhaseConverter implements Converter<WorkflowPhaseModel,WorkflowPhaseTo> {

	/**
	 * 
	 * @param source
	 */
	@Override
	public WorkflowPhaseTo convert(WorkflowPhaseModel source){
		WorkflowPhaseTo target = new  WorkflowPhaseTo(); 
		BeanUtils.copyProperties(source, target); 
		return target;
	}

}