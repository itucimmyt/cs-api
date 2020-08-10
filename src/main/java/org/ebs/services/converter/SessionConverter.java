///////////////////////////////////////////////////////////
//  SessionConverter.java
//  Macromedia ActionScript Implementation of the Class SessionConverter
//  Generated by Enterprise Architect
//  Created on:      09-Aug-2020 4:51:32 PM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.services.converter;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
import org.springframework.beans.BeanUtils;
import org.ebs.model.SessionModel;
import org.ebs.services.to.SessionTo;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 09-Aug-2020 4:51:32 PM
 */
@Component
  class SessionConverter implements Converter<SessionModel,SessionTo> {

	/**
	 * 
	 * @param source
	 */
	@Override
	public SessionTo convert(SessionModel source){
		SessionTo target = new  SessionTo(); 
		BeanUtils.copyProperties(source, target); 
		return target;
	}

}