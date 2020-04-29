///////////////////////////////////////////////////////////
//  HtmlTagConverter.java
//  Macromedia ActionScript Implementation of the Class HtmlTagConverter
//  Generated by Enterprise Architect
//  Created on:      28-Apr-2020 11:58:13 PM
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
 * @created 28-Apr-2020 11:58:13 PM
 */
@Component
public class HtmlTagConverter implements Converter<HtmlTagModel,HtmlTagTo> {

	/**
	 * 
	 * @param source
	 */
	@Override
	public HtmlTagTo convert(HtmlTagModel source){
		HtmlTagTo target = new  HtmlTagTo(); 
		BeanUtils.copyProperties(source, target); 
		return target;
	}

}