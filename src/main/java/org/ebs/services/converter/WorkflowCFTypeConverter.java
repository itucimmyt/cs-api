///////////////////////////////////////////////////////////
//  WorkflowCFTypeConverter.java
//  Macromedia ActionScript Implementation of the Class WorkflowCFTypeConverter
//  Generated by Enterprise Architect
//  Created on:      27-Jul-2020 8:43:50 AM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.services.converter;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
import org.springframework.beans.BeanUtils;
import org.ebs.model.WorkflowCFTypeModel;
import org.ebs.services.to.WorkflowCFTypeTo;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 27-Jul-2020 8:43:50 AM
 */
@Component
  class WorkflowCFTypeConverter implements Converter<WorkflowCFTypeModel,WorkflowCFTypeTo> {

	/**
	 * 
	 * @param source
	 */
	@Override
	public WorkflowCFTypeTo convert(WorkflowCFTypeModel source){
		WorkflowCFTypeTo target = new  WorkflowCFTypeTo(); 
		BeanUtils.copyProperties(source, target); 
		return target;
	}

}