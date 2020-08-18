///////////////////////////////////////////////////////////
//  SessionServiceImpl.java
//  Macromedia ActionScript Implementation of the Class SessionServiceImpl
//  Generated by Enterprise Architect
//  Created on:      09-Aug-2020 4:51:33 PM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.services;

import java.util.List;
import java.util.Optional;

import org.ebs.model.InstanceModel;
import org.ebs.model.SessionModel;
import org.ebs.model.UserModel;
import org.ebs.model.repos.InstanceRepository;
import org.ebs.model.repos.SessionRepository;
import org.ebs.model.repos.UserRepository;
import org.ebs.services.to.InstanceTo;
import org.ebs.services.to.SessionTo;
import org.ebs.services.to.UserTo;
import org.ebs.services.to.Input.SessionInput;
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
 * @created 09-Aug-2020 4:51:33 PM
 */
@Service @Transactional(readOnly = true)
  class SessionServiceImpl implements SessionService {

	private SessionRepository sessionRepository;
	private ConversionService converter;
	private UserRepository userRepository;
	private InstanceRepository instanceRepository;

	/**
	 * 
	 * @param Session
	 */
	@Override @Transactional(readOnly = false)
	public SessionTo createSession(SessionInput Session){
		SessionModel model = converter.convert(Session,SessionModel.class); 
		 model.setId(0);
		 UserModel userModel = userRepository.findById(Session.getuser().getId()).get(); 
		model.setuser(userModel); 
		InstanceModel instanceModel = instanceRepository.findById(Session.getinstance().getId()).get(); 
		model.setinstance(instanceModel); 
		 
		 model= sessionRepository.save(model); 
		 return converter.convert(model, SessionTo.class); 
	}

	/**
	 * 
	 * @param sessionId
	 */
	@Override @Transactional(readOnly = false)
	public int deleteSession(int sessionId){
		SessionModel session = sessionRepository.findById(sessionId).orElseThrow(() -> new RuntimeException("Session not found")); 
		 session.setDeleted(true); 
		  sessionRepository.save(session); 
		 return sessionId;
	}

	/**
	 * 
	 * @param sessionId
	 */
	public Optional<InstanceTo> findInstance(int sessionId){
		return sessionRepository.findById(sessionId).map(r -> converter.convert(r.getinstance(),InstanceTo.class));
	}

	/**
	 * 
	 * @param sessionId
	 */
	@Override
	public Optional<SessionTo> findSession(int sessionId){
		if(sessionId <1) 
		 {return Optional.empty();} 
		 return sessionRepository.findById(sessionId).filter(r -> !r.getDeleted().booleanValue()).map(r -> converter.convert(r,SessionTo.class));
	}

	/**
	 * 
	 * @param page
	 * @param sort
	 * @param filters
	 */
	@Override
	public Page<SessionTo> findSessions(PageInput page, SortInput sort, List<FilterInput> filters){
		return sessionRepository.findByCriteria(SessionModel.class,filters,sort,page).map(r -> converter.convert(r,SessionTo.class));
	}

	/**
	 * 
	 * @param sessionId
	 */
	public Optional<UserTo> findUser(int sessionId){
		return sessionRepository.findById(sessionId).map(r -> converter.convert(r.getuser(),UserTo.class));
	}

	/**
	 * 
	 * @param session
	 */
	@Override @Transactional(readOnly = false)
	public SessionTo modifySession(SessionInput session){
		SessionModel target= sessionRepository.findById(session.getId()).orElseThrow(() -> new RuntimeException("Session not found")); 
		 SessionModel source= converter.convert(session,SessionModel.class); 
		 Utils.copyNotNulls(source,target); 
		 return converter.convert(sessionRepository.save(target), SessionTo.class);
	}

	/**
	 * 
	 * @param instanceRepository
	 * @param userRepository
	 * @param converter
	 * @param sessionRepository
	 */
	@Autowired
	public SessionServiceImpl(InstanceRepository instanceRepository, UserRepository userRepository, ConversionService converter, SessionRepository sessionRepository){
		this.sessionRepository =sessionRepository; 
		 this.converter = converter;
		 this.userRepository = userRepository;
		 this.instanceRepository = instanceRepository;
	}

}