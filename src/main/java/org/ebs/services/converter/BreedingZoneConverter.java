///////////////////////////////////////////////////////////
//  BreedingZoneConverter.java
//  Macromedia ActionScript Implementation of the Class BreedingZoneConverter
//  Generated by Enterprise Architect
//  Created on:      17-May-2020 3:09:22 PM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.services.converter;

import org.ebs.model.BreedingZoneModel;
import org.ebs.services.to.BreedingZoneTo;
import org.springframework.beans.BeanUtils;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 17-May-2020 3:09:22 PM
 */
@Component
public class BreedingZoneConverter implements Converter<BreedingZoneModel,BreedingZoneTo> {

	/**
	 * 
	 * @param source
	 */
	@Override
	public BreedingZoneTo convert(BreedingZoneModel source){
		BreedingZoneTo target = new  BreedingZoneTo(); 
		BeanUtils.copyProperties(source, target); 
		return target;
	}

}