///////////////////////////////////////////////////////////
//  AssayGeneConverter.java
//  Macromedia ActionScript Implementation of the Class AssayGeneConverter
//  Generated by Enterprise Architect
//  Created on:      07-Sep-2020 8:10:53 AM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.services.converter;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
import org.springframework.beans.BeanUtils;
import org.ebs.model.AssayGeneModel;
import org.ebs.services.to.AssayGeneTo;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 07-Sep-2020 8:10:53 AM
 */
@Component
  class AssayGeneConverter implements Converter<AssayGeneModel,AssayGeneTo> {

	/**
	 * 
	 * @param source
	 */
	@Override
	public AssayGeneTo convert(AssayGeneModel source){
		AssayGeneTo target = new  AssayGeneTo(); 
		BeanUtils.copyProperties(source, target); 
		return target;
	}

}