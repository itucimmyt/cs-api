///////////////////////////////////////////////////////////
//  WorkflowCFValueConverter.java
//  Macromedia ActionScript Implementation of the Class WorkflowCFValueConverter
//  Generated by Enterprise Architect
//  Created on:      09-Aug-2020 4:51:52 PM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.services.converter;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
import org.springframework.beans.BeanUtils;
import org.ebs.model.WorkflowCFValueModel;
import org.ebs.services.to.WorkflowCFValueTo;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 09-Aug-2020 4:51:52 PM
 */
@Component
  class WorkflowCFValueConverter implements Converter<WorkflowCFValueModel,WorkflowCFValueTo> {

	/**
	 * 
	 * @param source
	 */
	@Override
	public WorkflowCFValueTo convert(WorkflowCFValueModel source){
		WorkflowCFValueTo target = new  WorkflowCFValueTo(); 
		BeanUtils.copyProperties(source, target); 
		return target;
	}

}