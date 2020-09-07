///////////////////////////////////////////////////////////
//  LanguageServiceImpl.java
//  Macromedia ActionScript Implementation of the Class LanguageServiceImpl
//  Generated by Enterprise Architect
//  Created on:      07-Sep-2020 8:11:23 AM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.services;

import org.ebs.model.repos.LanguageRepository;
import org.ebs.model.repos.TranslationRepository;
import org.ebs.model.repos.PersonRepository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import java.util.Optional;
import org.ebs.util.FilterInput;
import org.ebs.util.PageInput;
import org.ebs.util.SortInput;
import org.ebs.util.Utils;
import org.springframework.core.convert.ConversionService;
import java.util.stream.Collectors;
import java.util.Set;
import org.ebs.services.to.LanguageTo;
import org.ebs.services.to.Input.LanguageInput;
import org.ebs.model.LanguageModel;
import org.ebs.services.to.TranslationTo;
import org.ebs.services.to.PersonTo;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 07-Sep-2020 8:11:23 AM
 */
@Service @Transactional(readOnly = true)
  class LanguageServiceImpl implements LanguageService {

	private LanguageRepository languageRepository;
	private ConversionService converter;
	public TranslationRepository translationRepository;
	public PersonRepository personRepository;

	/**
	 * 
	 * @param Language
	 */
	@Override @Transactional(readOnly = false)
	public LanguageTo createLanguage(LanguageInput Language){
		LanguageModel model = converter.convert(Language,LanguageModel.class); 
		 model.setId(0);
		  
		 model= languageRepository.save(model); 
		 return converter.convert(model, LanguageTo.class); 
	}

	/**
	 * 
	 * @param languageId
	 */
	@Override @Transactional(readOnly = false)
	public int deleteLanguage(int languageId){
		LanguageModel language = languageRepository.findById(languageId).orElseThrow(() -> new RuntimeException("Language not found")); 
		 language.setDeleted(true); 
		  languageRepository.save(language); 
		 return languageId;
	}

	/**
	 * 
	 * @param languageId
	 */
	@Override
	public Optional<LanguageTo> findLanguage(int languageId){
		if(languageId <1) 
		 {return Optional.empty();} 
		 return languageRepository.findById(languageId).filter(r -> !r.getDeleted().booleanValue()).map(r -> converter.convert(r,LanguageTo.class));
	}

	/**
	 * 
	 * @param page
	 * @param sort
	 * @param filters
	 */
	@Override
	public Page<LanguageTo> findLanguages(PageInput page, SortInput sort, List<FilterInput> filters){
		return languageRepository.findByCriteria(LanguageModel.class,filters,sort,page).map(r -> converter.convert(r,LanguageTo.class));
	}

	/**
	 * 
	 * @param languageId
	 */
	public Set<PersonTo> findPersons(int languageId){
		return personRepository.findByLanguageId(languageId).stream().map(e -> converter.convert(e,PersonTo.class)).collect(Collectors.toSet());
	}

	/**
	 * 
	 * @param languageId
	 */
	public Set<TranslationTo> findTranslations(int languageId){
		return translationRepository.findByLanguageId(languageId).stream().map(e -> converter.convert(e,TranslationTo.class)).collect(Collectors.toSet());
	}

	/**
	 * 
	 * @param personRepository
	 * @param translationRepository
	 * @param converter
	 * @param languageRepository
	 */
	@Autowired
	public LanguageServiceImpl(PersonRepository personRepository, TranslationRepository translationRepository, ConversionService converter, LanguageRepository languageRepository){
		this.languageRepository =languageRepository; 
		 this.converter = converter;
		 this.translationRepository = translationRepository;
		 this.personRepository = personRepository;
	}

	/**
	 * 
	 * @param language
	 */
	@Override @Transactional(readOnly = false)
	public LanguageTo modifyLanguage(LanguageInput language){
		LanguageModel target= languageRepository.findById(language.getId()).orElseThrow(() -> new RuntimeException("Language not found")); 
		 LanguageModel source= converter.convert(language,LanguageModel.class); 
		 Utils.copyNotNulls(source,target); 
		 return converter.convert(languageRepository.save(target), LanguageTo.class);
	}

}