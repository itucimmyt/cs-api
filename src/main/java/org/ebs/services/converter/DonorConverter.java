///////////////////////////////////////////////////////////
//  DonorConverter.java
//  Macromedia ActionScript Implementation of the Class DonorConverter
//  Generated by Enterprise Architect
//  Created on:      07-Aug-2020 2:59:31 PM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.services.converter;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
import org.springframework.beans.BeanUtils;
import org.ebs.model.DonorModel;
import org.ebs.services.to.DonorTo;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 07-Aug-2020 2:59:31 PM
 */
@Component
  class DonorConverter implements Converter<DonorModel,DonorTo> {

	/**
	 * 
	 * @param source
	 */
	@Override
	public DonorTo convert(DonorModel source){
		DonorTo target = new  DonorTo(); 
		BeanUtils.copyProperties(source, target); 
		return target;
	}

}