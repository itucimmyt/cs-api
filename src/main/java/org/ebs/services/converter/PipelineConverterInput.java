///////////////////////////////////////////////////////////
//  PipelineConverterInput.java
//  Macromedia ActionScript Implementation of the Class PipelineConverterInput
//  Generated by Enterprise Architect
//  Created on:      17-May-2020 3:09:55 PM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.services.converter;

import org.ebs.model.PipelineModel;
import org.ebs.services.to.Input.PipelineInput;
import org.springframework.beans.BeanUtils;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 17-May-2020 3:09:55 PM
 */
@Component
public class PipelineConverterInput implements Converter<PipelineInput,PipelineModel> {

	/**
	 * 
	 * @param source
	 */
	@Override
	public PipelineModel convert(PipelineInput source){
		PipelineModel target = new  PipelineModel(); 
		BeanUtils.copyProperties(source, target); 
		return target;
	}

}