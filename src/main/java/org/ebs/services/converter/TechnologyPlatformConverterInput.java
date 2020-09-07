///////////////////////////////////////////////////////////
//  TechnologyPlatformConverterInput.java
//  Macromedia ActionScript Implementation of the Class TechnologyPlatformConverterInput
//  Generated by Enterprise Architect
//  Created on:      07-Sep-2020 8:12:16 AM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.services.converter;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
import org.springframework.beans.BeanUtils;
import org.ebs.model.TechnologyPlatformModel;
import org.ebs.services.to.Input.TechnologyPlatformInput;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 07-Sep-2020 8:12:16 AM
 */
@Component
  class TechnologyPlatformConverterInput implements Converter<TechnologyPlatformInput,TechnologyPlatformModel> {

	/**
	 * 
	 * @param source
	 */
	@Override
	public TechnologyPlatformModel convert(TechnologyPlatformInput source){
		TechnologyPlatformModel target = new  TechnologyPlatformModel(); 
		BeanUtils.copyProperties(source, target); 
		return target;
	}

}