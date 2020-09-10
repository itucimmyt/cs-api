///////////////////////////////////////////////////////////
//  ActionConverter.java
//  Macromedia ActionScript Implementation of the Class ActionConverter
//  Generated by Enterprise Architect
//  Created on:      10-Sep-2020 12:18:42 AM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.services.converter;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
import org.springframework.beans.BeanUtils;
import org.ebs.model.ActionModel;
import org.ebs.services.to.ActionTo;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 10-Sep-2020 12:18:42 AM
 */
@Component
  class ActionConverter implements Converter<ActionModel,ActionTo> {

	/**
	 * 
	 * @param source
	 */
	@Override
	public ActionTo convert(ActionModel source){
		ActionTo target = new  ActionTo(); 
		BeanUtils.copyProperties(source, target); 
		return target;
	}

}