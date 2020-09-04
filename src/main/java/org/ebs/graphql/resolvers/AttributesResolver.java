///////////////////////////////////////////////////////////
//  AttributesResolver.java
//  Macromedia ActionScript Implementation of the Class AttributesResolver
//  Generated by Enterprise Architect
//  Created on:      04-Sep-2020 10:04:43 AM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.graphql.resolvers;

import com.coxautodev.graphql.tools.GraphQLResolver;
import org.ebs.services.to.AttributesTo;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.ebs.services.AttributesService;
import org.ebs.services.to.EntityReferenceTo;
import org.ebs.services.to.HtmlTagTo;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 04-Sep-2020 10:04:43 AM
 */
@Component @Validated
public class AttributesResolver implements GraphQLResolver<AttributesTo> {

	private AttributesService attributesService;

	/**
	 * 
	 * @param attributesService
	 */
	@Autowired
	public AttributesResolver(AttributesService attributesService){
		this.attributesService = attributesService; 
	
	}

	/**
	 * 
	 * @param attributesTo
	 */
	public EntityReferenceTo getEntityreference(AttributesTo attributesTo){
		return attributesService.findentityreference(attributesTo.getId()).get();
	}

	/**
	 * 
	 * @param attributesTo
	 */
	public HtmlTagTo getHtmltag(AttributesTo attributesTo){
		return attributesService.findhtmltag(attributesTo.getId()).get();
	}

}