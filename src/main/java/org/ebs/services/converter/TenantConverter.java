///////////////////////////////////////////////////////////
//  TenantConverter.java
//  Macromedia ActionScript Implementation of the Class TenantConverter
//  Generated by Enterprise Architect
//  Created on:      13-Mar-2021 12:02:58 AM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.services.converter;

import org.springframework.stereotype.Component;
import org.springframework.beans.BeanUtils;
import org.ebs.model.TenantModel;
import org.ebs.services.to.TenantTo;
import org.springframework.core.convert.converter.Converter;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 13-Mar-2021 12:02:58 AM
 */
@Component
  class TenantConverter implements Converter<TenantModel,TenantTo> {

	/**
	 * 
	 * @param source
	 */
	@Override
	public TenantTo convert(TenantModel source){
		TenantTo target = new  TenantTo(); 
		BeanUtils.copyProperties(source, target); 
		return target;
	}

}