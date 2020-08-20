///////////////////////////////////////////////////////////
//  AssayclassConverter.java
//  Macromedia ActionScript Implementation of the Class AssayclassConverter
//  Generated by Enterprise Architect
//  Created on:      20-Aug-2020 1:05:22 PM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.services.converter;

import org.ebs.services.to.AssayclassTo;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
import org.springframework.beans.BeanUtils;
import org.ebs.model.AssayclassModel;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 20-Aug-2020 1:05:22 PM
 */
@Component
  class AssayclassConverter implements Converter<AssayclassModel,AssayclassTo> {

	/**
	 * 
	 * @param source
	 */
	@Override
	public AssayclassTo convert(AssayclassModel source){
		AssayclassTo target = new  AssayclassTo(); 
		BeanUtils.copyProperties(source, target); 
		return target;
	}

}