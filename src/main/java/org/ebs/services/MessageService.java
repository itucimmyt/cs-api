///////////////////////////////////////////////////////////
//  MessageService.java
//  Macromedia ActionScript Implementation of the Interface MessageService
//  Generated by Enterprise Architect
//  Created on:      28-Apr-2020 12:07:03 AM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.services;

import java.util.List;
import java.util.Optional;
import org.ebs.util.FilterInput;
import org.ebs.util.PageInput;
import org.ebs.util.SortInput;
import org.springframework.data.domain.Page;
import org.ebs.util.Utils;
import org.ebs.services.to.MessageTo;
import org.ebs.services.to.Input.MessageInput;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 28-Apr-2020 12:07:03 AM
 */
public interface MessageService {

	/**
	 * 
	 * @param Message
	 */
	public MessageTo createMessage(MessageInput Message);

	/**
	 * 
	 * @param idmessage
	 */
	public int deleteMessage(int idmessage);

	/**
	 * 
	 * @param messageId
	 */
	public Optional<MessageTo> findMessage(int messageId);

	/**
	 * 
	 * @param page
	 * @param sort
	 * @param filters
	 */
	public Page<MessageTo> findMessages(PageInput page, SortInput sort, List<FilterInput> filters);

	/**
	 * 
	 * @param message
	 */
	public MessageTo modifyMessage(MessageInput message);

}