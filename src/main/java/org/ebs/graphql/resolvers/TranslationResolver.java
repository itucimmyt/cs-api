///////////////////////////////////////////////////////////
//  TranslationResolver.java
//  Macromedia ActionScript Implementation of the Class TranslationResolver
//  Generated by Enterprise Architect
//  Created on:      09-Aug-2020 4:51:46 PM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.graphql.resolvers;

import org.ebs.services.TranslationService;
import org.ebs.services.to.LanguageTo;
import org.ebs.services.to.HtmlTagTo;
import com.coxautodev.graphql.tools.GraphQLResolver;
import org.ebs.services.to.TranslationTo;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 09-Aug-2020 4:51:46 PM
 */
@Component @Validated
public class TranslationResolver implements GraphQLResolver<TranslationTo> {

	private TranslationService translationService;

	/**
	 * 
	 * @param translationTo
	 */
	public HtmlTagTo getHtmltag(TranslationTo translationTo){
		return translationService.findHtmlTag(translationTo.getId()).get();
	}

	/**
	 * 
	 * @param translationTo
	 */
	public LanguageTo getLanguage(TranslationTo translationTo){
		return translationService.findLanguage(translationTo.getId()).get();
	}

	/**
	 * 
	 * @param translationService
	 */
	@Autowired
	public TranslationResolver(TranslationService translationService){
		this.translationService = translationService; 
	
	}

}