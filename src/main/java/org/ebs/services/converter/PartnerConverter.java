///////////////////////////////////////////////////////////
//  PartnerConverter.java
//  Macromedia ActionScript Implementation of the Class PartnerConverter
//  Generated by Enterprise Architect
//  Created on:      10-Sep-2020 10:44:08 PM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.services.converter;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
import org.springframework.beans.BeanUtils;
import org.ebs.model.PartnerModel;
import org.ebs.services.to.PartnerTo;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 10-Sep-2020 10:44:08 PM
 */
@Component
  class PartnerConverter implements Converter<PartnerModel,PartnerTo> {

	/**
	 * 
	 * @param source
	 */
	@Override
	public PartnerTo convert(PartnerModel source){
		PartnerTo target = new  PartnerTo(); 
		BeanUtils.copyProperties(source, target); 
		return target;
	}

}