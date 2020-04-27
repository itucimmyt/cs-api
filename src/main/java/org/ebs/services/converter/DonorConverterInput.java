///////////////////////////////////////////////////////////
//  DonorConverterInput.java
//  Macromedia ActionScript Implementation of the Class DonorConverterInput
//  Generated by Enterprise Architect
//  Created on:      27-Apr-2020 9:47:38 AM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.services.converter;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
import org.springframework.beans.BeanUtils;
import org.ebs.model.DonorModel;
import org.ebs.services.to.Input.DonorInput;
import org.ebs.services.to.DonorTo;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 27-Apr-2020 9:47:38 AM
 */
@Component
public class DonorConverterInput implements Converter<DonorInput,DonorModel> {

	/**
	 * 
	 * @param source
	 */
	@Override
	public DonorModel convert(DonorInput source){
		DonorModel target = new  DonorModel(); 
		BeanUtils.copyProperties(source, target); 
		return target;
	}

}