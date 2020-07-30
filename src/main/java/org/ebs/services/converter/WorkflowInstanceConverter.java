///////////////////////////////////////////////////////////
//  WorkflowInstanceConverter.java
//  Macromedia ActionScript Implementation of the Class WorkflowInstanceConverter
//  Generated by Enterprise Architect
//  Created on:      27-Jul-2020 8:43:56 AM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.services.converter;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
import org.springframework.beans.BeanUtils;
import org.ebs.model.WorkflowInstanceModel;
import org.ebs.services.to.WorkflowInstanceTo;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 27-Jul-2020 8:43:56 AM
 */
@Component
  class WorkflowInstanceConverter implements Converter<WorkflowInstanceModel,WorkflowInstanceTo> {

	/**
	 * 
	 * @param source
	 */
	@Override
	public WorkflowInstanceTo convert(WorkflowInstanceModel source){
		WorkflowInstanceTo target = new  WorkflowInstanceTo(); 
		BeanUtils.copyProperties(source, target); 
		return target;
	}

}