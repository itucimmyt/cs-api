///////////////////////////////////////////////////////////
//  PearsonConverterInput.java
//  Macromedia ActionScript Implementation of the Class PearsonConverterInput
//  Generated by Enterprise Architect
//  Created on:      28-Apr-2020 11:58:22 PM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.services.converter;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
import org.springframework.beans.BeanUtils;
import org.ebs.model.PearsonModel;
import org.ebs.services.to.Input.PearsonInput;
import org.ebs.services.to.PearsonTo;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 28-Apr-2020 11:58:22 PM
 */
@Component
public class PearsonConverterInput implements Converter<PearsonInput,PearsonModel> {

	/**
	 * 
	 * @param source
	 */
	@Override
	public PearsonModel convert(PearsonInput source){
		PearsonModel target = new  PearsonModel(); 
		BeanUtils.copyProperties(source, target); 
		return target;
	}

}