///////////////////////////////////////////////////////////
//  OrganizationConverter.java
//  Macromedia ActionScript Implementation of the Class OrganizationConverter
//  Generated by Enterprise Architect
//  Created on:      17-May-2020 3:09:47 PM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.services.converter;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
import org.springframework.beans.BeanUtils;
import org.ebs.model.OrganizationModel;
import org.ebs.services.to.Input.OrganizationInput;
import org.ebs.services.to.OrganizationTo;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 17-May-2020 3:09:47 PM
 */
@Component
public class OrganizationConverter implements Converter<OrganizationModel,OrganizationTo> {

	/**
	 * 
	 * @param source
	 */
	@Override
	public OrganizationTo convert(OrganizationModel source){
		OrganizationTo target = new  OrganizationTo(); 
		BeanUtils.copyProperties(source, target); 
		return target;
	}

}