///////////////////////////////////////////////////////////
//  TranslationImpl.java
//  Macromedia ActionScript Implementation of the Class TranslationImpl
//  Generated by Enterprise Architect
//  Created on:      17-May-2020 3:10:29 PM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.services;

import java.util.List;
import java.util.Optional;

import org.ebs.model.AlertModel;
import org.ebs.model.AttributesModel;
import org.ebs.model.HtmlTagModel;
import org.ebs.model.LanguageModel;
import org.ebs.model.MessageModel;
import org.ebs.model.ModuleModel;
import org.ebs.model.TranslationModel;
import org.ebs.model.repos.AlertRepository;
import org.ebs.model.repos.AttributesRepository;
import org.ebs.model.repos.HtmlTagRepository;
import org.ebs.model.repos.LanguageRepository;
import org.ebs.model.repos.MessageRepository;
import org.ebs.model.repos.ModuleRepository;
import org.ebs.model.repos.TranslationRepository;
import org.ebs.services.to.TranslationTo;
import org.ebs.services.to.Input.TranslationInput;
import org.ebs.util.FilterInput;
import org.ebs.util.PageInput;
import org.ebs.util.SortInput;
import org.ebs.util.Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.ConversionService;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 17-May-2020 3:10:29 PM
 */
@Service @Transactional(readOnly = true)
public class TranslationImpl implements TranslationService {

	private TranslationRepository translationRepository;
	@Autowired
	private ConversionService converter;
	@Autowired
	private AlertRepository alertRepository;
	@Autowired
	private AttributesRepository attributesRepository;
	@Autowired
	private LanguageRepository languageRepository;
	@Autowired
	private MessageRepository messageRepository;
	@Autowired
	private HtmlTagRepository htmltagRepository;
	@Autowired
	private ModuleRepository moduleRepository;

	/**
	 * 
	 * @param Translation
	 */
	@Override @Transactional(readOnly = false)
	public TranslationTo createTranslation(TranslationInput Translation){
		TranslationModel model = converter.convert(Translation,TranslationModel.class); 
		 model.setId(0);
		 AlertModel alertModel = alertRepository.findById(Translation.getAlert().getId()).get(); 
		model.setAlert(alertModel); 
		AttributesModel attributesModel = attributesRepository.findById(Translation.getAttributes().getId()).get(); 
		model.setAttributes(attributesModel); 
		LanguageModel languageModel = languageRepository.findById(Translation.getLanguage().getId()).get(); 
		model.setLanguage(languageModel); 
		MessageModel messageModel = messageRepository.findById(Translation.getMessage().getId()).get(); 
		model.setMessage(messageModel); 
		HtmlTagModel htmltagModel = htmltagRepository.findById(Translation.getHtmlTag().getId()).get(); 
		model.setHtmlTag(htmltagModel); 
		ModuleModel moduleModel = moduleRepository.findById(Translation.getModule().getId()).get(); 
		model.setModule(moduleModel); 
		 
		 model= translationRepository.save(model); 
		 return converter.convert(model, TranslationTo.class); 
	}

	/**
	 * 
	 * @param idtranslation
	 */
	@Override @Transactional(readOnly = false)
	public int deleteTranslation(int idtranslation){
		TranslationModel translation = translationRepository.findById(idtranslation).orElseThrow(() -> new RuntimeException("Request not found")); 
		 translation.setDeleted(true); 
		  translationRepository.save(translation); 
		 return idtranslation;
	}

	/**
	 * 
	 * @param translationId
	 */
	@Override
	public Optional<TranslationTo> findTranslation(int translationId){
		if(translationId <1) 
		 {return Optional.empty();} 
		 return translationRepository.findById(translationId).filter(r -> !r.getDeleted().booleanValue()).map(r -> converter.convert(r,TranslationTo.class));
	}

	/**
	 * 
	 * @param page
	 * @param sort
	 * @param filters
	 */
	@Override
	public Page<TranslationTo> findTranslations(PageInput page, SortInput sort, List<FilterInput> filters){
		return translationRepository.findByCriteria(TranslationModel.class,filters,sort,page).map(r -> converter.convert(r,TranslationTo.class));
	}

	/**
	 * 
	 * @param translation
	 */
	@Override @Transactional(readOnly = false)
	public TranslationTo modifyTranslation(TranslationInput translation){
		TranslationModel target= translationRepository.findById(translation.getId()).orElseThrow(() -> new RuntimeException("Request not found")); 
		 TranslationModel source= converter.convert(translation,TranslationModel.class); 
		 Utils.copyNotNulls(source,target); 
		 return converter.convert(translationRepository.save(target), TranslationTo.class);
	}

	/**
	 * 
	 * @param translationRepository
	 */
	@Autowired
	public TranslationImpl(TranslationRepository translationRepository){
		this.translationRepository =translationRepository;
	}

}