///////////////////////////////////////////////////////////
//  EmailTemplateConverterInput.java
//  Macromedia ActionScript Implementation of the Class EmailTemplateConverterInput
//  Generated by Enterprise Architect
//  Created on:      13-Mar-2021 12:02:27 AM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.services.converter;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
import org.springframework.beans.BeanUtils;
import org.ebs.model.EmailTemplateModel;
import org.ebs.services.to.Input.EmailTemplateInput;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 13-Mar-2021 12:02:27 AM
 */
@Component
  class EmailTemplateConverterInput implements Converter<EmailTemplateInput,EmailTemplateModel> {

	/**
	 * 
	 * @param source
	 */
	@Override
	public EmailTemplateModel convert(EmailTemplateInput source){
		EmailTemplateModel target = new  EmailTemplateModel(); 
		BeanUtils.copyProperties(source, target); 
		return target;
	}

}