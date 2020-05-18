///////////////////////////////////////////////////////////
//  AlertConverterInput.java
//  Macromedia ActionScript Implementation of the Class AlertConverterInput
//  Generated by Enterprise Architect
//  Created on:      17-May-2020 3:09:12 PM
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
 * @created 17-May-2020 3:09:12 PM
 */
@Component
public class AlertConverterInput implements Converter<AlertInput,AlertModel> {

	/**
	 * 
	 * @param source
	 */
	@Override
	public AlertModel convert(AlertInput source){
		AlertModel target = new  AlertModel(); 
		BeanUtils.copyProperties(source, target); 
		return target;
	}

}