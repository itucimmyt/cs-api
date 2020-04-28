///////////////////////////////////////////////////////////
//  ActionConverter.java
//  Macromedia ActionScript Implementation of the Class ActionConverter
//  Generated by Enterprise Architect
//  Created on:      28-Apr-2020 12:06:49 AM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.services.converter;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
import org.springframework.beans.BeanUtils;
import org.ebs.model.ActionModel;
import org.ebs.services.to.Input.ActionInput;
import org.ebs.services.to.ActionTo;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 28-Apr-2020 12:06:49 AM
 */
@Component
public class ActionConverter implements Converter<ActionModel,ActionTo> {

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