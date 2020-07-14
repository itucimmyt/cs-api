///////////////////////////////////////////////////////////
//  AuditLogsServiceImpl.java
//  Macromedia ActionScript Implementation of the Class AuditLogsServiceImpl
//  Generated by Enterprise Architect
//  Created on:      13-Jul-2020 5:06:15 PM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.services;

import org.ebs.model.InstanceModel;
import org.ebs.model.repos.InstanceRepository;
import org.ebs.model.repos.AuditLogsRepository;
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
import org.ebs.services.to.AuditLogsTo;
import org.ebs.services.to.Input.AuditLogsInput;
import org.ebs.model.AuditLogsModel;
import org.ebs.services.to.InstanceTo;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 13-Jul-2020 5:06:15 PM
 */
@Service @Transactional(readOnly = true)
  class AuditLogsServiceImpl implements AuditLogsService {

	private AuditLogsRepository auditlogsRepository;
	private ConversionService converter;
	private InstanceRepository instanceRepository;

	/**
	 * 
	 * @param instanceRepository
	 * @param converter
	 * @param auditlogsRepository
	 */
	@Autowired
	public AuditLogsServiceImpl(InstanceRepository instanceRepository, ConversionService converter, AuditLogsRepository auditlogsRepository){
		this.auditlogsRepository =auditlogsRepository; 
		 this.converter = converter;
		 this.instanceRepository = instanceRepository;
	}

	/**
	 * 
	 * @param AuditLogs
	 */
	@Override @Transactional(readOnly = false)
	public AuditLogsTo createAuditLogs(AuditLogsInput AuditLogs){
		AuditLogsModel model = converter.convert(AuditLogs,AuditLogsModel.class); 
		 model.setId(0);
		 InstanceModel instanceModel = instanceRepository.findById(AuditLogs.getinstance().getId()).get(); 
		model.setinstance(instanceModel); 
		 
		 model= auditlogsRepository.save(model); 
		 return converter.convert(model, AuditLogsTo.class); 
	}

	/**
	 * 
	 * @param auditlogsId
	 */
	@Override @Transactional(readOnly = false)
	public int deleteAuditLogs(int auditlogsId){
		AuditLogsModel auditlogs = auditlogsRepository.findById(auditlogsId).orElseThrow(() -> new RuntimeException("AuditLogs not found")); 
		 auditlogs.setDeleted(true); 
		  auditlogsRepository.save(auditlogs); 
		 return auditlogsId;
	}

	/**
	 * 
	 * @param auditlogsId
	 */
	@Override
	public Optional<AuditLogsTo> findAuditLogs(int auditlogsId){
		if(auditlogsId <1) 
		 {return Optional.empty();} 
		 return auditlogsRepository.findById(auditlogsId).filter(r -> !r.getDeleted().booleanValue()).map(r -> converter.convert(r,AuditLogsTo.class));
	}

	/**
	 * 
	 * @param page
	 * @param sort
	 * @param filters
	 */
	@Override
	public Page<AuditLogsTo> findAuditLogss(PageInput page, SortInput sort, List<FilterInput> filters){
		return auditlogsRepository.findByCriteria(AuditLogsModel.class,filters,sort,page).map(r -> converter.convert(r,AuditLogsTo.class));
	}

	/**
	 * 
	 * @param auditlogsId
	 */
	public Optional<InstanceTo> findInstance(int auditlogsId){
		return auditlogsRepository.findById(auditlogsId).map(r -> converter.convert(r.getinstance(),InstanceTo.class));
	}

	/**
	 * 
	 * @param auditlogs
	 */
	@Override @Transactional(readOnly = false)
	public AuditLogsTo modifyAuditLogs(AuditLogsInput auditlogs){
		AuditLogsModel target= auditlogsRepository.findById(auditlogs.getId()).orElseThrow(() -> new RuntimeException("AuditLogs not found")); 
		 AuditLogsModel source= converter.convert(auditlogs,AuditLogsModel.class); 
		 Utils.copyNotNulls(source,target); 
		 return converter.convert(auditlogsRepository.save(target), AuditLogsTo.class);
	}

}