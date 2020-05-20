///////////////////////////////////////////////////////////
//  PurposeConverterInput.java
//  Macromedia ActionScript Implementation of the Class PurposeConverterInput
//  Generated by Enterprise Architect
//  Created on:      17-May-2020 3:10:03 PM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.services.converter;

import org.ebs.model.PurposeModel;
import org.ebs.services.to.Input.PurposeInput;
import org.springframework.beans.BeanUtils;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 17-May-2020 3:10:03 PM
 */
@Component
public class PurposeConverterInput implements Converter<PurposeInput,PurposeModel> {

	/**
	 * 
	 * @param source
	 */
	@Override
	public PurposeModel convert(PurposeInput source){
		PurposeModel target = new  PurposeModel(); 
		BeanUtils.copyProperties(source, target); 
		return target;
	}

}