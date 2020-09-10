///////////////////////////////////////////////////////////
//  NotificationServiceImpl.java
//  Macromedia ActionScript Implementation of the Class NotificationServiceImpl
//  Generated by Enterprise Architect
//  Created on:      10-Sep-2020 12:19:34 AM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.services;

import org.ebs.model.repos.NotificationRepository;
import org.ebs.model.repos.HtmlTagRepository;
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
import org.ebs.services.to.NotificationTo;
import org.ebs.services.to.Input.NotificationInput;
import org.ebs.model.NotificationModel;
import org.ebs.services.to.HtmlTagTo;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 10-Sep-2020 12:19:34 AM
 */
@Service @Transactional(readOnly = true)
  class NotificationServiceImpl implements NotificationService {

	private NotificationRepository notificationRepository;
	private ConversionService converter;
	public HtmlTagRepository htmltagRepository;

	/**
	 * 
	 * @param Notification
	 */
	@Override @Transactional(readOnly = false)
	public NotificationTo createNotification(NotificationInput Notification){
		NotificationModel model = converter.convert(Notification,NotificationModel.class); 
		 model.setId(0);
		  
		 model= notificationRepository.save(model); 
		 return converter.convert(model, NotificationTo.class); 
	}

	/**
	 * 
	 * @param notificationId
	 */
	@Override @Transactional(readOnly = false)
	public int deleteNotification(int notificationId){
		NotificationModel notification = notificationRepository.findById(notificationId).orElseThrow(() -> new RuntimeException("Notification not found")); 
		 notification.setDeleted(true); 
		  notificationRepository.save(notification); 
		 return notificationId;
	}

	/**
	 * 
	 * @param notificationId
	 */
	public Optional<HtmlTagTo> findHtmlTag(int notificationId){
		return notificationRepository.findById(notificationId).map(r -> converter.convert(r.getHtmltag(),HtmlTagTo.class));
	}

	/**
	 * 
	 * @param notificationId
	 */
	@Override
	public Optional<NotificationTo> findNotification(int notificationId){
		if(notificationId <1) 
		 {return Optional.empty();} 
		 return notificationRepository.findById(notificationId).filter(r -> !r.getDeleted().booleanValue()).map(r -> converter.convert(r,NotificationTo.class));
	}

	/**
	 * 
	 * @param page
	 * @param sort
	 * @param filters
	 */
	@Override
	public Page<NotificationTo> findNotifications(PageInput page, SortInput sort, List<FilterInput> filters){
		return notificationRepository.findByCriteria(NotificationModel.class,filters,sort,page).map(r -> converter.convert(r,NotificationTo.class));
	}

	/**
	 * 
	 * @param notification
	 */
	@Override @Transactional(readOnly = false)
	public NotificationTo modifyNotification(NotificationInput notification){
		NotificationModel target= notificationRepository.findById(notification.getId()).orElseThrow(() -> new RuntimeException("Notification not found")); 
		 NotificationModel source= converter.convert(notification,NotificationModel.class); 
		 Utils.copyNotNulls(source,target); 
		 return converter.convert(notificationRepository.save(target), NotificationTo.class);
	}

	/**
	 * 
	 * @param htmltagRepository
	 * @param converter
	 * @param notificationRepository
	 */
	@Autowired
	public NotificationServiceImpl(HtmlTagRepository htmltagRepository, ConversionService converter, NotificationRepository notificationRepository){
		this.notificationRepository =notificationRepository; 
		 this.converter = converter;
		 this.htmltagRepository = htmltagRepository;
	}

}