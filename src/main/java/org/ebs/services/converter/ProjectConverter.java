///////////////////////////////////////////////////////////
//  ProjectConverter.java
//  Macromedia ActionScript Implementation of the Class ProjectConverter
//  Generated by Enterprise Architect
//  Created on:      23-Jul-2020 10:46:57 PM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.services.converter;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
import org.springframework.beans.BeanUtils;
import org.ebs.model.ProjectModel;
import org.ebs.services.to.ProjectTo;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 23-Jul-2020 10:46:57 PM
 */
@Component
  class ProjectConverter implements Converter<ProjectModel,ProjectTo> {

	/**
	 * 
	 * @param source
	 */
	@Override
	public ProjectTo convert(ProjectModel source){
		ProjectTo target = new  ProjectTo(); 
		BeanUtils.copyProperties(source, target); 
		return target;
	}

}