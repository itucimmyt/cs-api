///////////////////////////////////////////////////////////
//  ComponentConverterInput.java
//  Macromedia ActionScript Implementation of the Class ComponentConverterInput
//  Generated by Enterprise Architect
//  Created on:      20-Aug-2020 1:05:31 PM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.services.converter;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
import org.springframework.beans.BeanUtils;
import org.ebs.model.ComponentModel;
import org.ebs.services.to.Input.ComponentInput;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 20-Aug-2020 1:05:31 PM
 */
@Component
  class ComponentConverterInput implements Converter<ComponentInput,ComponentModel> {

	/**
	 * 
	 * @param source
	 */
	@Override
	public ComponentModel convert(ComponentInput source){
		ComponentModel target = new  ComponentModel(); 
		BeanUtils.copyProperties(source, target); 
		return target;
	}

}