///////////////////////////////////////////////////////////
//  ProjectConverterInput.java
//  Macromedia ActionScript Implementation of the Class ProjectConverterInput
//  Generated by Enterprise Architect
//  Created on:      20-Aug-2020 1:06:14 PM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.services.converter;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
import org.springframework.beans.BeanUtils;
import org.ebs.model.ProjectModel;
import org.ebs.services.to.Input.ProjectInput;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 20-Aug-2020 1:06:14 PM
 */
@Component
  class ProjectConverterInput implements Converter<ProjectInput,ProjectModel> {

	/**
	 * 
	 * @param source
	 */
	@Override
	public ProjectModel convert(ProjectInput source){
		ProjectModel target = new  ProjectModel(); 
		BeanUtils.copyProperties(source, target); 
		return target;
	}

}