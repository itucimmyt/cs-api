///////////////////////////////////////////////////////////
//  MessageResolver.java
//  Macromedia ActionScript Implementation of the Class MessageResolver
//  Generated by Enterprise Architect
//  Created on:      17-May-2020 3:09:43 PM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.graphql.resolvers;

import com.coxautodev.graphql.tools.GraphQLResolver;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import java.util.stream.Collectors;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import org.springframework.core.convert.ConversionService;
import org.ebs.model.MessageModel;
import org.ebs.services.to.MessageTo;
import org.ebs.model.repos.MessageRepository;
import org.ebs.services.MessageService;
import org.ebs.model.repos.TranslationRepository;
import org.ebs.services.TranslationService;
import org.ebs.services.to.TranslationTo;
import org.ebs.services.ComponentService;
import org.ebs.model.repos.ComponentRepository;
import org.ebs.services.to.ComponentTo;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 17-May-2020 3:09:43 PM
 */
@Component @Validated
public class MessageResolver implements GraphQLResolver<MessageTo> {

	private MessageService messageService;
	private MessageRepository messageRepository;
	@Autowired
	private ConversionService converter;
	private TranslationService translationService;
	private TranslationRepository translationRepository;
	private ComponentService componentService;
	private ComponentRepository componentRepository;

	/**
	 * 
	 * @param messageTo
	 */
	public ComponentTo getComponent(MessageTo messageTo){
		MessageModel messageModel = messageRepository.findById(messageTo.getId()).get(); 
		 return componentService.findComponent(messageModel.getComponent().getId()).get();
	}

	/**
	 * 
	 * @param messageTo
	 */
	public Set<TranslationTo> getTranslations(MessageTo messageTo){
		return translationRepository.findByMessageId(messageTo.getId()).stream() 
		 .map(e -> converter.convert(e,TranslationTo.class)) 
		 .collect(Collectors.toSet());
	}

	/**
	 * 
	 * @param componentRepository
	 * @param componentService
	 * @param translationRepository
	 * @param translationService
	 * @param messageRepository
	 * @param messageService
	 */
	@Autowired
	public MessageResolver(ComponentRepository componentRepository, ComponentService componentService, TranslationRepository translationRepository, TranslationService translationService, MessageRepository messageRepository, MessageService messageService){
		this.messageService = messageService; 
		this.messageRepository = messageRepository; 
		this.translationService = translationService; 
		this.translationRepository = translationRepository; 
		this.componentService = componentService; 
		this.componentRepository = componentRepository; 
	
	}

}