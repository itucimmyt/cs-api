///////////////////////////////////////////////////////////
//  PartnerConverter.java
//  Macromedia ActionScript Implementation of the Class PartnerConverter
//  Generated by Enterprise Architect
//  Created on:      17-May-2020 3:09:49 PM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.services.converter;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
import org.springframework.beans.BeanUtils;
import org.ebs.model.PartnerModel;
import org.ebs.services.to.Input.PartnerInput;
import org.ebs.services.to.PartnerTo;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 17-May-2020 3:09:49 PM
 */
@Component
public class PartnerConverter implements Converter<PartnerModel,PartnerTo> {

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