///////////////////////////////////////////////////////////
//  TenantConverterInput.java
//  Macromedia ActionScript Implementation of the Class TenantConverterInput
//  Generated by Enterprise Architect
//  Created on:      27-Jul-2020 8:43:37 AM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.services.converter;

import org.ebs.model.TenantModel;
import org.ebs.services.to.Input.TenantInput;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
import org.springframework.beans.BeanUtils;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 27-Jul-2020 8:43:37 AM
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