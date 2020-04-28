///////////////////////////////////////////////////////////
//  HtmlTagConverterInput.java
//  Macromedia ActionScript Implementation of the Class HtmlTagConverterInput
//  Generated by Enterprise Architect
//  Created on:      28-Apr-2020 12:07:00 AM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.services.converter;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
import org.springframework.beans.BeanUtils;
import org.ebs.model.HtmlTagModel;
import org.ebs.services.to.Input.HtmlTagInput;
import org.ebs.services.to.HtmlTagTo;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 28-Apr-2020 12:07:00 AM
 */
@Component
public class HtmlTagConverterInput implements Converter<HtmlTagInput,HtmlTagModel> {

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