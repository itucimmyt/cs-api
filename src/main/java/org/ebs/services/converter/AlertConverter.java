///////////////////////////////////////////////////////////
//  AlertConverter.java
//  Macromedia ActionScript Implementation of the Class AlertConverter
//  Generated by Enterprise Architect
//  Created on:      17-May-2020 3:09:12 PM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.services.converter;

import org.ebs.model.AlertModel;
import org.ebs.services.to.AlertTo;
import org.springframework.beans.BeanUtils;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 17-May-2020 3:09:12 PM
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