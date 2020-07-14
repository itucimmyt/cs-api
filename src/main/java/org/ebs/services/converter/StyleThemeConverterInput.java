///////////////////////////////////////////////////////////
//  StyleThemeConverterInput.java
//  Macromedia ActionScript Implementation of the Class StyleThemeConverterInput
//  Generated by Enterprise Architect
//  Created on:      13-Jul-2020 5:07:22 PM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.services.converter;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
import org.springframework.beans.BeanUtils;
import org.ebs.model.StyleThemeModel;
import org.ebs.services.to.Input.StyleThemeInput;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 13-Jul-2020 5:07:22 PM
 */
@Component
  class StyleThemeConverterInput implements Converter<StyleThemeInput,StyleThemeModel> {

	/**
	 * 
	 * @param source
	 */
	@Override
	public StyleThemeModel convert(StyleThemeInput source){
		StyleThemeModel target = new  StyleThemeModel(); 
		BeanUtils.copyProperties(source, target); 
		return target;
	}

}