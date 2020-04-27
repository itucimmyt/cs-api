///////////////////////////////////////////////////////////
//  ModuleConverterInput.java
//  Macromedia ActionScript Implementation of the Class ModuleConverterInput
//  Generated by Enterprise Architect
//  Created on:      27-Apr-2020 9:47:43 AM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.services.converter;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
import org.springframework.beans.BeanUtils;
import org.ebs.model.ModuleModel;
import org.ebs.services.to.Input.ModuleInput;
import org.ebs.services.to.ModuleTo;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 27-Apr-2020 9:47:43 AM
 */
@Component
public class ModuleConverterInput implements Converter<ModuleInput,ModuleModel> {

	/**
	 * 
	 * @param source
	 */
	@Override
	public ModuleModel convert(ModuleInput source){
		ModuleModel target = new  ModuleModel(); 
		BeanUtils.copyProperties(source, target); 
		return target;
	}

}