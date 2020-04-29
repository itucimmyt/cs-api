///////////////////////////////////////////////////////////
//  MessageImpl.java
//  Macromedia ActionScript Implementation of the Class MessageImpl
//  Generated by Enterprise Architect
//  Created on:      28-Apr-2020 11:58:17 PM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.services;

import org.ebs.model.ComponentModel;
import org.ebs.model.repos.ComponentRepository;
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
import org.ebs.services.to.MessageTo;
import org.ebs.services.to.Input.MessageInput;
import org.ebs.model.MessageModel;
import org.ebs.model.repos.MessageRepository;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 28-Apr-2020 11:58:17 PM
 */
@Service @Transactional(readOnly = true)
public class MessageImpl implements MessageService {

	private MessageRepository messageRepository;
	@Autowired
	private ConversionService converter;
	@Autowired
	private ComponentRepository componentRepository;

	/**
	 * 
	 * @param Message
	 */
	@Override @Transactional(readOnly = false)
	public MessageTo createMessage(MessageInput Message){
		MessageModel model = converter.convert(Message,MessageModel.class); 
		 model.setId(0);
		 ComponentModel componentModel = componentRepository.findById(Message.getComponent().getId()).get(); 
		model.setComponent(componentModel); 
		 
		 model= messageRepository.save(model); 
		 return converter.convert(model, MessageTo.class); 
	}

	/**
	 * 
	 * @param idmessage
	 */
	@Override @Transactional(readOnly = false)
	public int deleteMessage(int idmessage){
		MessageModel message = messageRepository.findById(idmessage).orElseThrow(() -> new RuntimeException("Request not found")); 
		 message.setDeleted(true); 
		  messageRepository.save(message); 
		 return idmessage;
	}

	/**
	 * 
	 * @param messageId
	 */
	@Override
	public Optional<MessageTo> findMessage(int messageId){
		if(messageId <1) 
		 {return Optional.empty();} 
		 return messageRepository.findById(messageId).filter(r -> !r.getDeleted().booleanValue()).map(r -> converter.convert(r,MessageTo.class));
	}

	/**
	 * 
	 * @param page
	 * @param sort
	 * @param filters
	 */
	@Override
	public Page<MessageTo> findMessages(PageInput page, SortInput sort, List<FilterInput> filters){
		return messageRepository.findByCriteria(MessageModel.class,filters,sort,page).map(r -> converter.convert(r,MessageTo.class));
	}

	/**
	 * 
	 * @param messageRepository
	 */
	@Autowired
	public MessageImpl(MessageRepository messageRepository){
		this.messageRepository =messageRepository;
	}

	/**
	 * 
	 * @param message
	 */
	@Override @Transactional(readOnly = false)
	public MessageTo modifyMessage(MessageInput message){
		MessageModel target= messageRepository.findById(message.getId()).orElseThrow(() -> new RuntimeException("Request not found")); 
		 MessageModel source= converter.convert(message,MessageModel.class); 
		 Utils.copyNotNulls(source,target); 
		 return converter.convert(messageRepository.save(target), MessageTo.class);
	}

}