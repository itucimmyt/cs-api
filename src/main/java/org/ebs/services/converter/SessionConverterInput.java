///////////////////////////////////////////////////////////
//  SessionConverterInput.java
//  Macromedia ActionScript Implementation of the Class SessionConverterInput
//  Generated by Enterprise Architect
//  Created on:      17-May-2020 3:10:19 PM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.services.converter;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
import org.springframework.beans.BeanUtils;
import org.ebs.model.SessionModel;
import org.ebs.services.to.Input.SessionInput;
import org.ebs.services.to.SessionTo;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 17-May-2020 3:10:19 PM
 */
@Component
public class SessionConverterInput implements Converter<SessionInput,SessionModel> {

	/**
	 * 
	 * @param source
	 */
	@Override
	public SessionModel convert(SessionInput source){
		SessionModel target = new  SessionModel(); 
		BeanUtils.copyProperties(source, target); 
		return target;
	}

}