///////////////////////////////////////////////////////////
//  TenantConverterInput.java
//  Macromedia ActionScript Implementation of the Class TenantConverterInput
//  Generated by Enterprise Architect
//  Created on:      20-Aug-2020 1:06:41 PM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.services.converter;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
import org.springframework.beans.BeanUtils;
import org.ebs.model.TenantModel;
import org.ebs.services.to.Input.TenantInput;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 20-Aug-2020 1:06:41 PM
 */
@Component
  class TenantConverterInput implements Converter<TenantInput,TenantModel> {

	/**
	 * 
	 * @param source
	 */
	@Override
	public TenantModel convert(TenantInput source){
		TenantModel target = new  TenantModel(); 
		BeanUtils.copyProperties(source, target); 
		return target;
	}

}