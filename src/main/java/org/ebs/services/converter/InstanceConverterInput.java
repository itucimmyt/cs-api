///////////////////////////////////////////////////////////
//  InstanceConverterInput.java
//  Macromedia ActionScript Implementation of the Class InstanceConverterInput
//  Generated by Enterprise Architect
//  Created on:      17-May-2020 3:09:36 PM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.services.converter;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
import org.springframework.beans.BeanUtils;
import org.ebs.model.InstanceModel;
import org.ebs.services.to.Input.InstanceInput;
import org.ebs.services.to.InstanceTo;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 17-May-2020 3:09:36 PM
 */
@Component
public class InstanceConverterInput implements Converter<InstanceInput,InstanceModel> {

	/**
	 * 
	 * @param source
	 */
	@Override
	public InstanceModel convert(InstanceInput source){
		InstanceModel target = new  InstanceModel(); 
		BeanUtils.copyProperties(source, target); 
		return target;
	}

}