///////////////////////////////////////////////////////////
//  RequestConverter.java
//  Macromedia ActionScript Implementation of the Class RequestConverter
//  Generated by Enterprise Architect
//  Created on:      07-Aug-2020 3:01:04 PM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.services.converter;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
import org.springframework.beans.BeanUtils;
import org.ebs.model.RequestModel;
import org.ebs.services.to.RequestTo;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 07-Aug-2020 3:01:04 PM
 */
@Component
  class RequestConverter implements Converter<RequestModel,RequestTo> {

	/**
	 * 
	 * @param source
	 */
	@Override
	public RequestTo convert(RequestModel source){
		RequestTo target = new  RequestTo(); 
		BeanUtils.copyProperties(source, target); 
		return target;
	}

}