///////////////////////////////////////////////////////////
//  TraitClassConverterInput.java
//  Macromedia ActionScript Implementation of the Class TraitClassConverterInput
//  Generated by Enterprise Architect
//  Created on:      07-Sep-2020 8:12:21 AM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.services.converter;

import org.springframework.stereotype.Component;
import org.springframework.beans.BeanUtils;
import org.ebs.model.TraitClassModel;
import org.ebs.services.to.Input.TraitClassInput;
import org.springframework.core.convert.converter.Converter;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 07-Sep-2020 8:12:21 AM
 */
@Component
  class TraitClassConverterInput implements Converter<TraitClassInput,TraitClassModel> {

	/**
	 * 
	 * @param source
	 */
	@Override
	public TraitClassModel convert(TraitClassInput source){
		TraitClassModel target = new  TraitClassModel(); 
		BeanUtils.copyProperties(source, target); 
		return target;
	}

}