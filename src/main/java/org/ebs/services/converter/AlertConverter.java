///////////////////////////////////////////////////////////
//  AlertConverter.java
//  Macromedia ActionScript Implementation of the Class AlertConverter
//  Generated by Enterprise Architect
//  Created on:      28-Apr-2020 11:58:04 PM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.services.converter;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
import org.springframework.beans.BeanUtils;
import org.ebs.model.AlertModel;
import org.ebs.services.to.Input.AlertInput;
import org.ebs.services.to.AlertTo;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 28-Apr-2020 11:58:04 PM
 */
@Component
public class AlertConverter implements Converter<AlertModel,AlertTo> {

	/**
	 * 
	 * @param source
	 */
	@Override
	public AlertTo convert(AlertModel source){
		AlertTo target = new  AlertTo(); 
		BeanUtils.copyProperties(source, target); 
		return target;
	}

}