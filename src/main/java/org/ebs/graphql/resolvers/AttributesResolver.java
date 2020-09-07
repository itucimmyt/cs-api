///////////////////////////////////////////////////////////
//  AttributesResolver.java
//  Macromedia ActionScript Implementation of the Class AttributesResolver
//  Generated by Enterprise Architect
//  Created on:      07-Sep-2020 8:10:56 AM
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
 * @created 07-Sep-2020 8:10:56 AM
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
	public EntityReferenceTo getEntityReference(AttributesTo attributesTo){
		return attributesService.findEntityReference(attributesTo.getId()).get();
	}

	/**
	 * 
	 * @param attributesTo
	 */
	public HtmlTagTo getHtmlTag(AttributesTo attributesTo){
		return attributesService.findHtmlTag(attributesTo.getId()).get();
	}

}