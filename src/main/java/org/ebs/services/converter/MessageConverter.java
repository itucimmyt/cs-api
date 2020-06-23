///////////////////////////////////////////////////////////
//  MessageConverter.java
//  Macromedia ActionScript Implementation of the Class MessageConverter
//  Generated by Enterprise Architect
//  Created on:      15-Jun-2020 5:13:44 PM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.services.converter;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
import org.springframework.beans.BeanUtils;
import org.ebs.model.MessageModel;
import org.ebs.services.to.MessageTo;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 15-Jun-2020 5:13:44 PM
 */
@Component
  class MessageConverter implements Converter<MessageModel,MessageTo> {

	/**
	 * 
	 * @param source
	 */
	@Override
	public MessageTo convert(MessageModel source){
		MessageTo target = new  MessageTo(); 
		BeanUtils.copyProperties(source, target); 
		return target;
	}

}