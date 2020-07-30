///////////////////////////////////////////////////////////
//  AuditLogsConverter.java
//  Macromedia ActionScript Implementation of the Class AuditLogsConverter
//  Generated by Enterprise Architect
//  Created on:      27-Jul-2020 8:42:10 AM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.services.converter;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
import org.springframework.beans.BeanUtils;
import org.ebs.model.AuditLogsModel;
import org.ebs.services.to.AuditLogsTo;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 27-Jul-2020 8:42:10 AM
 */
@Component
  class AuditLogsConverter implements Converter<AuditLogsModel,AuditLogsTo> {

	/**
	 * 
	 * @param source
	 */
	@Override
	public AuditLogsTo convert(AuditLogsModel source){
		AuditLogsTo target = new  AuditLogsTo(); 
		BeanUtils.copyProperties(source, target); 
		return target;
	}

}