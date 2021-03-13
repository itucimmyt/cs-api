///////////////////////////////////////////////////////////
//  RequestConverterInput.java
//  Macromedia ActionScript Implementation of the Class RequestConverterInput
//  Generated by Enterprise Architect
//  Created on:      13-Mar-2021 12:02:52 AM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.services.converter;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
import org.springframework.beans.BeanUtils;
import org.ebs.model.RequestModel;
import org.ebs.services.to.Input.RequestInput;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 13-Mar-2021 12:02:52 AM
 */
@Component
  class RequestConverterInput implements Converter<RequestInput,RequestModel> {

	/**
	 * 
	 * @param source
	 */
	@Override
	public RequestModel convert(RequestInput source){
		RequestModel target = new  RequestModel(); 
		BeanUtils.copyProperties(source, target); 
		return target;
	}

}