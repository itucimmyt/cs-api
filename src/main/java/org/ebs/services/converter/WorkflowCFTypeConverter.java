///////////////////////////////////////////////////////////
//  WorkflowCFTypeConverter.java
//  Macromedia ActionScript Implementation of the Class WorkflowCFTypeConverter
//  Generated by Enterprise Architect
//  Created on:      20-Aug-2020 1:06:52 PM
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
 * @created 20-Aug-2020 1:06:52 PM
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