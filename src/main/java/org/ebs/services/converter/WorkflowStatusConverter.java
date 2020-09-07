///////////////////////////////////////////////////////////
//  WorkflowStatusConverter.java
//  Macromedia ActionScript Implementation of the Class WorkflowStatusConverter
//  Generated by Enterprise Architect
//  Created on:      07-Sep-2020 8:12:49 AM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.services.converter;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
import org.springframework.beans.BeanUtils;
import org.ebs.model.WorkflowStatusModel;
import org.ebs.services.to.WorkflowStatusTo;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 07-Sep-2020 8:12:49 AM
 */
@Component
  class WorkflowStatusConverter implements Converter<WorkflowStatusModel,WorkflowStatusTo> {

	/**
	 * 
	 * @param source
	 */
	@Override
	public WorkflowStatusTo convert(WorkflowStatusModel source){
		WorkflowStatusTo target = new  WorkflowStatusTo(); 
		BeanUtils.copyProperties(source, target); 
		return target;
	}

}