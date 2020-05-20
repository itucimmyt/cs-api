///////////////////////////////////////////////////////////
//  CollaboratorConverterInput.java
//  Macromedia ActionScript Implementation of the Class CollaboratorConverterInput
//  Generated by Enterprise Architect
//  Created on:      17-May-2020 3:09:23 PM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.services.converter;

import org.ebs.model.CollaboratorModel;
import org.ebs.services.to.Input.CollaboratorInput;
import org.springframework.beans.BeanUtils;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 17-May-2020 3:09:23 PM
 */
@Component
public class CollaboratorConverterInput implements Converter<CollaboratorInput,CollaboratorModel> {

	/**
	 * 
	 * @param source
	 */
	@Override
	public CollaboratorModel convert(CollaboratorInput source){
		CollaboratorModel target = new  CollaboratorModel(); 
		BeanUtils.copyProperties(source, target); 
		return target;
	}

}