///////////////////////////////////////////////////////////
//  AttributesResolver.java
//  Macromedia ActionScript Implementation of the Class AttributesResolver
//  Generated by Enterprise Architect
//  Created on:      17-May-2020 3:09:18 PM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.graphql.resolvers;

import java.util.Set;
import java.util.stream.Collectors;

import org.ebs.model.repos.AttributesRepository;
import org.ebs.model.repos.TranslationRepository;
import org.ebs.services.AttributesService;
import org.ebs.services.TranslationService;
import org.ebs.services.to.AttributesTo;
import org.ebs.services.to.TranslationTo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.ConversionService;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import com.coxautodev.graphql.tools.GraphQLResolver;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 17-May-2020 3:09:18 PM
 */
@Component @Validated
public class AttributesResolver implements GraphQLResolver<AttributesTo> {

	private AttributesService attributesService;
	private AttributesRepository attributesRepository;
	@Autowired
	private ConversionService converter;
	private TranslationService translationService;
	private TranslationRepository translationRepository;

	/**
	 * 
	 * @param translationRepository
	 * @param translationService
	 * @param attributesRepository
	 * @param attributesService
	 */
	@Autowired
	public AttributesResolver(TranslationRepository translationRepository, TranslationService translationService, AttributesRepository attributesRepository, AttributesService attributesService){
		this.attributesService = attributesService; 
		this.attributesRepository = attributesRepository; 
		this.translationService = translationService; 
		this.translationRepository = translationRepository; 
	
	}

	/**
	 * 
	 * @param attributesTo
	 */
	public Set<TranslationTo> getTranslations(AttributesTo attributesTo){
		return translationRepository.findByAttributesId(attributesTo.getId()).stream() 
		 .map(e -> converter.convert(e,TranslationTo.class)) 
		 .collect(Collectors.toSet());
	}

}