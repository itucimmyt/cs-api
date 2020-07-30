///////////////////////////////////////////////////////////
//  SessionConverter.java
//  Macromedia ActionScript Implementation of the Class SessionConverter
//  Generated by Enterprise Architect
//  Created on:      27-Jul-2020 8:43:32 AM
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
 * @created 27-Jul-2020 8:43:32 AM
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