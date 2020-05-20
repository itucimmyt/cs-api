///////////////////////////////////////////////////////////
//  SeasonConverter.java
//  Macromedia ActionScript Implementation of the Class SeasonConverter
//  Generated by Enterprise Architect
//  Created on:      17-May-2020 3:10:13 PM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.services.converter;

import org.ebs.model.SeasonModel;
import org.ebs.services.to.SeasonTo;
import org.springframework.beans.BeanUtils;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 17-May-2020 3:10:13 PM
 */
@Component
public class SeasonConverter implements Converter<SeasonModel,SeasonTo> {

	/**
	 * 
	 * @param source
	 */
	@Override
	public SeasonTo convert(SeasonModel source){
		SeasonTo target = new  SeasonTo(); 
		BeanUtils.copyProperties(source, target); 
		return target;
	}

}