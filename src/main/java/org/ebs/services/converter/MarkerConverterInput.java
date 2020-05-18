///////////////////////////////////////////////////////////
//  MarkerConverterInput.java
//  Macromedia ActionScript Implementation of the Class MarkerConverterInput
//  Generated by Enterprise Architect
//  Created on:      17-May-2020 3:09:39 PM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.services.converter;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
import org.springframework.beans.BeanUtils;
import org.ebs.model.MarkerModel;
import org.ebs.services.to.Input.MarkerInput;
import org.ebs.services.to.MarkerTo;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 17-May-2020 3:09:39 PM
 */
@Component
public class MarkerConverterInput implements Converter<MarkerInput,MarkerModel> {

	/**
	 * 
	 * @param source
	 */
	@Override
	public MarkerModel convert(MarkerInput source){
		MarkerModel target = new  MarkerModel(); 
		BeanUtils.copyProperties(source, target); 
		return target;
	}

}