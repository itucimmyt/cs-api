///////////////////////////////////////////////////////////
//  TraitClassConverter.java
//  Macromedia ActionScript Implementation of the Class TraitClassConverter
//  Generated by Enterprise Architect
//  Created on:      20-Aug-2020 1:06:43 PM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.services.converter;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
import org.springframework.beans.BeanUtils;
import org.ebs.model.TraitClassModel;
import org.ebs.services.to.TraitClassTo;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 20-Aug-2020 1:06:43 PM
 */
@Component
  class TraitClassConverter implements Converter<TraitClassModel,TraitClassTo> {

	/**
	 * 
	 * @param source
	 */
	@Override
	public TraitClassTo convert(TraitClassModel source){
		TraitClassTo target = new  TraitClassTo(); 
		BeanUtils.copyProperties(source, target); 
		return target;
	}

}