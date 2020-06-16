///////////////////////////////////////////////////////////
//  RequestConverterInput.java
//  Macromedia ActionScript Implementation of the Class RequestConverterInput
//  Generated by Enterprise Architect
//  Created on:      15-Jun-2020 5:14:13 PM
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
 * @created 15-Jun-2020 5:14:13 PM
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