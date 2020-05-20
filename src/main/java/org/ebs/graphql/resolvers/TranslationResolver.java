///////////////////////////////////////////////////////////
//  TranslationResolver.java
//  Macromedia ActionScript Implementation of the Class TranslationResolver
//  Generated by Enterprise Architect
//  Created on:      17-May-2020 3:10:30 PM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.graphql.resolvers;

import org.ebs.model.TranslationModel;
import org.ebs.model.repos.AlertRepository;
import org.ebs.model.repos.AttributesRepository;
import org.ebs.model.repos.HtmlTagRepository;
import org.ebs.model.repos.LanguageRepository;
import org.ebs.model.repos.MessageRepository;
import org.ebs.model.repos.ModuleRepository;
import org.ebs.model.repos.TranslationRepository;
import org.ebs.services.AlertService;
import org.ebs.services.AttributesService;
import org.ebs.services.HtmlTagService;
import org.ebs.services.LanguageService;
import org.ebs.services.MessageService;
import org.ebs.services.ModuleService;
import org.ebs.services.TranslationService;
import org.ebs.services.to.AlertTo;
import org.ebs.services.to.AttributesTo;
import org.ebs.services.to.HtmlTagTo;
import org.ebs.services.to.LanguageTo;
import org.ebs.services.to.MessageTo;
import org.ebs.services.to.ModuleTo;
import org.ebs.services.to.TranslationTo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.ConversionService;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import com.coxautodev.graphql.tools.GraphQLResolver;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 17-May-2020 3:10:30 PM
 */
@Component @Validated
public class TranslationResolver implements GraphQLResolver<TranslationTo> {
	private static final Logger log = LoggerFactory.getLogger(TranslationResolver.class);
	private TranslationService translationService;
	private TranslationRepository translationRepository;
	@Autowired
	private ConversionService converter;
	private AlertService alertService;
	private AlertRepository alertRepository;
	private AttributesService attributesService;
	private AttributesRepository attributesRepository;
	private LanguageService languageService;
	private LanguageRepository languageRepository;
	private MessageService messageService;
	private MessageRepository messageRepository;
	private HtmlTagService htmltagService;
	private HtmlTagRepository htmltagRepository;
	private ModuleService moduleService;
	private ModuleRepository moduleRepository;

	/**
	 * 
	 * @param translationTo
	 */
	public AlertTo getAlert(TranslationTo translationTo){
		TranslationModel translationModel = translationRepository.findById(translationTo.getId()).get(); 
		 return alertService.findAlert(translationModel.getAlert().getId()).get();
	}

	/**
	 * 
	 * @param translationTo
	 */
	public AttributesTo getAttributes(TranslationTo translationTo){
		TranslationModel translationModel = translationRepository.findById(translationTo.getId()).get(); 
		 return attributesService.findAttributes(translationModel.getAttributes().getId()).get();
	}

	/**
	 * 
	 * @param translationTo
	 */
	public HtmlTagTo getHtmltag(TranslationTo translationTo){

		log.info("Entro");
		TranslationModel translationModel = translationRepository.findById(translationTo.getId()).get(); 
		 return htmltagService.findHtmlTags(translationModel.getHtmlTag().getId()).get();
	}

	/**
	 * 
	 * @param translationTo
	 */
	public LanguageTo getLanguage(TranslationTo translationTo){
		TranslationModel translationModel = translationRepository.findById(translationTo.getId()).get(); 
		 return languageService.findLanguage(translationModel.getLanguage().getId()).get();
	}

	/**
	 * 
	 * @param translationTo
	 */
	public MessageTo getMessage(TranslationTo translationTo){
		TranslationModel translationModel = translationRepository.findById(translationTo.getId()).get(); 
		 return messageService.findMessage(translationModel.getMessage().getId()).get();
	}

	/**
	 * 
	 * @param translationTo
	 */
	public ModuleTo getModule(TranslationTo translationTo){
		TranslationModel translationModel = translationRepository.findById(translationTo.getId()).get(); 
		 return moduleService.findModule(translationModel.getModule().getId()).get();
	}

	/**
	 * 
	 * @param messageService
	 * @param translationService
	 * @param translationRepository
	 * @param alertService
	 * @param alertRepository
	 * @param attributesService
	 * @param attributesRepository
	 * @param languageRepository
	 * @param messageRepository
	 * @param htmltagService
	 * @param htmltagRepository
	 * @param moduleService
	 * @param moduleRepository
	 * @param languageService
	 */
	@Autowired
	public TranslationResolver(MessageService messageService, TranslationService translationService, TranslationRepository translationRepository, AlertService alertService, AlertRepository alertRepository, AttributesService attributesService, AttributesRepository attributesRepository, LanguageRepository languageRepository, MessageRepository messageRepository, HtmlTagService htmltagService, HtmlTagRepository htmltagRepository, ModuleService moduleService, ModuleRepository moduleRepository, LanguageService languageService){
		this.translationService = translationService; 
		this.translationRepository = translationRepository; 
		this.alertService = alertService; 
		this.alertRepository = alertRepository; 
		this.attributesService = attributesService; 
		this.attributesRepository = attributesRepository; 
		this.languageService = languageService; 
		this.languageRepository = languageRepository; 
		this.messageService = messageService; 
		this.messageRepository = messageRepository; 
		this.htmltagService = htmltagService; 
		this.htmltagRepository = htmltagRepository; 
		this.moduleService = moduleService; 
		this.moduleRepository = moduleRepository; 
	
	}

}