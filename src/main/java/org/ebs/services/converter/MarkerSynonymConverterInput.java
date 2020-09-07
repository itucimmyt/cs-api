///////////////////////////////////////////////////////////
//  MarkerSynonymConverterInput.java
//  Macromedia ActionScript Implementation of the Class MarkerSynonymConverterInput
//  Generated by Enterprise Architect
//  Created on:      07-Sep-2020 8:11:26 AM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.services.converter;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
import org.springframework.beans.BeanUtils;
import org.ebs.model.MarkerSynonymModel;
import org.ebs.services.to.Input.MarkerSynonymInput;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 07-Sep-2020 8:11:26 AM
 */
@Component
  class MarkerSynonymConverterInput implements Converter<MarkerSynonymInput,MarkerSynonymModel> {

	/**
	 * 
	 * @param source
	 */
	@Override
	public MarkerSynonymModel convert(MarkerSynonymInput source){
		MarkerSynonymModel target = new  MarkerSynonymModel(); 
		BeanUtils.copyProperties(source, target); 
		return target;
	}

}