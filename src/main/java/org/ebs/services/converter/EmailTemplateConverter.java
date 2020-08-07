///////////////////////////////////////////////////////////
//  EmailTemplateConverter.java
//  Macromedia ActionScript Implementation of the Class EmailTemplateConverter
//  Generated by Enterprise Architect
//  Created on:      07-Aug-2020 2:59:34 PM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.services.converter;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
import org.springframework.beans.BeanUtils;
import org.ebs.model.EmailTemplateModel;
import org.ebs.services.to.EmailTemplateTo;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 07-Aug-2020 2:59:34 PM
 */
@Component
  class EmailTemplateConverter implements Converter<EmailTemplateModel,EmailTemplateTo> {

	/**
	 * 
	 * @param source
	 */
	@Override
	public EmailTemplateTo convert(EmailTemplateModel source){
		EmailTemplateTo target = new  EmailTemplateTo(); 
		BeanUtils.copyProperties(source, target); 
		return target;
	}

}