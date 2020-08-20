///////////////////////////////////////////////////////////
//  HtmlTagConverterInput.java
//  Macromedia ActionScript Implementation of the Class HtmlTagConverterInput
//  Generated by Enterprise Architect
//  Created on:      20-Aug-2020 1:05:45 PM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.services.converter;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
import org.springframework.beans.BeanUtils;
import org.ebs.model.HtmlTagModel;
import org.ebs.services.to.Input.HtmlTagInput;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 20-Aug-2020 1:05:45 PM
 */
@Component
  class HtmlTagConverterInput implements Converter<HtmlTagInput,HtmlTagModel> {

	/**
	 * 
	 * @param source
	 */
	@Override
	public HtmlTagModel convert(HtmlTagInput source){
		HtmlTagModel target = new  HtmlTagModel(); 
		BeanUtils.copyProperties(source, target); 
		return target;
	}

}