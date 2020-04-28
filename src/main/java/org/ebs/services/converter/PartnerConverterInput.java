///////////////////////////////////////////////////////////
//  PartnerConverterInput.java
//  Macromedia ActionScript Implementation of the Class PartnerConverterInput
//  Generated by Enterprise Architect
//  Created on:      28-Apr-2020 12:07:07 AM
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
 * @created 28-Apr-2020 12:07:07 AM
 */
@Component
public class PartnerConverterInput implements Converter<PartnerInput,PartnerModel> {

	/**
	 * 
	 * @param source
	 */
	@Override
	public PartnerModel convert(PartnerInput source){
		PartnerModel target = new  PartnerModel(); 
		BeanUtils.copyProperties(source, target); 
		return target;
	}

}