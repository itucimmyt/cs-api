///////////////////////////////////////////////////////////
//  WorkflowNodeConverter.java
//  Macromedia ActionScript Implementation of the Class WorkflowNodeConverter
//  Generated by Enterprise Architect
//  Created on:      28-Apr-2020 11:58:33 PM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.services.converter;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
import org.springframework.beans.BeanUtils;
import org.ebs.model.WorkflowNodeModel;
import org.ebs.services.to.Input.WorkflowNodeInput;
import org.ebs.services.to.WorkflowNodeTo;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 28-Apr-2020 11:58:33 PM
 */
@Component
public class WorkflowNodeConverter implements Converter<WorkflowNodeModel,WorkflowNodeTo> {

	/**
	 * 
	 * @param source
	 */
	@Override
	public WorkflowNodeTo convert(WorkflowNodeModel source){
		WorkflowNodeTo target = new  WorkflowNodeTo(); 
		BeanUtils.copyProperties(source, target); 
		return target;
	}

}