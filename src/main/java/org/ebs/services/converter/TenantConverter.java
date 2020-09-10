///////////////////////////////////////////////////////////
//  TenantConverter.java
//  Macromedia ActionScript Implementation of the Class TenantConverter
//  Generated by Enterprise Architect
//  Created on:      10-Sep-2020 12:20:26 AM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.services.converter;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
import org.springframework.beans.BeanUtils;
import org.ebs.model.TenantModel;
import org.ebs.services.to.TenantTo;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 10-Sep-2020 12:20:26 AM
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