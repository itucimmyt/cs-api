///////////////////////////////////////////////////////////
//  CollaboratorConverter.java
//  Macromedia ActionScript Implementation of the Class CollaboratorConverter
//  Generated by Enterprise Architect
//  Created on:      17-May-2020 3:09:23 PM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.services.converter;

import org.ebs.model.CollaboratorModel;
import org.ebs.services.to.CollaboratorTo;
import org.springframework.beans.BeanUtils;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 17-May-2020 3:09:23 PM
 */
@Component
public class CollaboratorConverter implements Converter<CollaboratorModel,CollaboratorTo> {

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