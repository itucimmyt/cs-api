///////////////////////////////////////////////////////////
//  WorkflowConverter.java
//  Macromedia ActionScript Implementation of the Class WorkflowConverter
//  Generated by Enterprise Architect
//  Created on:      17-May-2020 3:10:34 PM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.services.converter;

import org.ebs.model.WorkflowModel;
import org.ebs.services.to.WorkflowTo;
import org.springframework.beans.BeanUtils;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 17-May-2020 3:10:34 PM
 */
@Component
public class WorkflowConverter implements Converter<WorkflowModel,WorkflowTo> {

	/**
	 * 
	 * @param source
	 */
	@Override
	public WorkflowTo convert(WorkflowModel source){
		WorkflowTo target = new  WorkflowTo(); 
		BeanUtils.copyProperties(source, target); 
		return target;
	}

}