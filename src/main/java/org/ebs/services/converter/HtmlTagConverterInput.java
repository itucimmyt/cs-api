///////////////////////////////////////////////////////////
//  HtmlTagConverterInput.java
//  Macromedia ActionScript Implementation of the Class HtmlTagConverterInput
//  Generated by Enterprise Architect
//  Created on:      15-Jun-2020 5:13:34 PM
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
 * @created 15-Jun-2020 5:13:34 PM
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