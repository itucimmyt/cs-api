///////////////////////////////////////////////////////////
//  LanguageResolver.java
//  Macromedia ActionScript Implementation of the Class LanguageResolver
//  Generated by Enterprise Architect
//  Created on:      27-Jul-2020 8:42:39 AM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.graphql.resolvers;

import com.coxautodev.graphql.tools.GraphQLResolver;
import org.ebs.services.to.LanguageTo;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import java.util.Set;
import org.ebs.services.LanguageService;
import org.ebs.services.to.TranslationTo;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 27-Jul-2020 8:42:39 AM
 */
@Component @Validated
public class LanguageResolver implements GraphQLResolver<LanguageTo> {

	private LanguageService languageService;

	/**
	 * 
	 * @param language
	 */
	public Set<TranslationTo> getTranslations(LanguageTo language){
		return languageService.findTranslations(language.getId());
	}

	/**
	 * 
	 * @param languageService
	 */
	@Autowired
	public LanguageResolver(LanguageService languageService){
		this.languageService = languageService; 
	
	}

}