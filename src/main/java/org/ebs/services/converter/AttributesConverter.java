///////////////////////////////////////////////////////////
//  AttributesConverter.java
//  Macromedia ActionScript Implementation of the Class AttributesConverter
//  Generated by Enterprise Architect
//  Created on:      17-May-2020 3:09:17 PM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.services.converter;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
import org.springframework.beans.BeanUtils;
import org.ebs.model.AttributesModel;
import org.ebs.services.to.Input.AttributesInput;
import org.ebs.services.to.AttributesTo;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 17-May-2020 3:09:17 PM
 */
@Component
public class AttributesConverter implements Converter<AttributesModel,AttributesTo> {

	/**
	 * 
	 * @param source
	 */
	@Override
	public AttributesTo convert(AttributesModel source){
		AttributesTo target = new  AttributesTo(); 
		BeanUtils.copyProperties(source, target); 
		return target;
	}

}