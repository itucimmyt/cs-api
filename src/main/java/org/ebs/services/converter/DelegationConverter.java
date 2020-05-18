///////////////////////////////////////////////////////////
//  DelegationConverter.java
//  Macromedia ActionScript Implementation of the Class DelegationConverter
//  Generated by Enterprise Architect
//  Created on:      17-May-2020 3:09:32 PM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.services.converter;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
import org.springframework.beans.BeanUtils;
import org.ebs.model.DelegationModel;
import org.ebs.services.to.Input.DelegationInput;
import org.ebs.services.to.DelegationTo;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 17-May-2020 3:09:32 PM
 */
@Component
public class DelegationConverter implements Converter<DelegationModel,DelegationTo> {

	/**
	 * 
	 * @param source
	 */
	@Override
	public DelegationTo convert(DelegationModel source){
		DelegationTo target = new  DelegationTo(); 
		BeanUtils.copyProperties(source, target); 
		return target;
	}

}