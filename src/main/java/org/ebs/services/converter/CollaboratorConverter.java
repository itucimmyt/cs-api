///////////////////////////////////////////////////////////
//  CollaboratorConverter.java
//  Macromedia ActionScript Implementation of the Class CollaboratorConverter
//  Generated by Enterprise Architect
//  Created on:      09-Aug-2020 4:50:21 PM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.services.converter;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
import org.springframework.beans.BeanUtils;
import org.ebs.model.CollaboratorModel;
import org.ebs.services.to.CollaboratorTo;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 09-Aug-2020 4:50:21 PM
 */
@Component
  class CollaboratorConverter implements Converter<CollaboratorModel,CollaboratorTo> {

	/**
	 * 
	 * @param source
	 */
	@Override
	public CollaboratorTo convert(CollaboratorModel source){
		CollaboratorTo target = new  CollaboratorTo(); 
		BeanUtils.copyProperties(source, target); 
		return target;
	}

}