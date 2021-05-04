///////////////////////////////////////////////////////////
//  EntityReferenceConverter.java
//  Macromedia ActionScript Implementation of the Class EntityReferenceConverter
//  Generated by Enterprise Architect
//  Created on:      02-May-2021 6:19:48 AM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.services.converter;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
import org.springframework.beans.BeanUtils;
import org.ebs.model.EntityReferenceModel;
import org.ebs.services.to.EntityReferenceTo;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 02-May-2021 6:19:48 AM
 */
@Component
  class EntityReferenceConverter implements Converter<EntityReferenceModel,EntityReferenceTo> {

	/**
	 * 
	 * @param source
	 */
	@Override
	public EntityReferenceTo convert(EntityReferenceModel source){
		EntityReferenceTo target = new  EntityReferenceTo(); 
		BeanUtils.copyProperties(source, target); 
		return target;
	}

}