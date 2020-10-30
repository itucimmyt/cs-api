///////////////////////////////////////////////////////////
//  InstanceServiceImpl.java
//  Macromedia ActionScript Implementation of the Class InstanceServiceImpl
//  Generated by Enterprise Architect
//  Created on:      10-Sep-2020 10:43:50 PM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.services;

import org.ebs.model.repos.SessionRepository;
import org.ebs.model.repos.AuditLogsRepository;
import org.ebs.model.TenantModel;
import org.ebs.model.repos.TenantRepository;
import org.ebs.model.repos.InstanceRepository;
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
import java.util.stream.Collectors;
import java.util.Set;
import org.ebs.services.to.InstanceTo;
import org.ebs.services.to.Input.InstanceInput;
import org.ebs.model.InstanceModel;
import org.ebs.services.to.SessionTo;
import org.ebs.services.to.AuditLogsTo;
import org.ebs.services.to.ComponentTo;
import org.ebs.services.to.TenantTo;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 10-Sep-2020 10:43:50 PM
 */
@Service @Transactional(readOnly = true)
  class InstanceServiceImpl implements InstanceService {

	private InstanceRepository instanceRepository;
	private ConversionService converter;
	private SessionRepository sessionRepository;
	private AuditLogsRepository auditlogsRepository;
	private TenantRepository tenantRepository;
	private ComponentRepository componentRepository;

	/**
	 *
	 * @param Instance
	 */
	@Override @Transactional(readOnly = false)
	public InstanceTo createInstance(InstanceInput Instance){
		InstanceModel model = converter.convert(Instance,InstanceModel.class);
		 model.setId(0);
		 TenantModel tenantModel = tenantRepository.findById(Instance.getTenant().getId()).get();
		model.setTenant(tenantModel);

		 model= instanceRepository.save(model);
		 return converter.convert(model, InstanceTo.class);
	}

	/**
	 *
	 * @param instanceId
	 */
	@Override @Transactional(readOnly = false)
	public int deleteInstance(int instanceId){
		InstanceModel instance = instanceRepository.findById(instanceId).orElseThrow(() -> new RuntimeException("Instance not found"));
		 instance.setDeleted(true);
		  instanceRepository.save(instance);
		 return instanceId;
	}

	/**
	 *
	 * @param instanceId
	 */
	public Set<AuditLogsTo> findAuditLogss(int instanceId){
		return auditlogsRepository.findByInstanceId(instanceId).stream().map(e -> converter.convert(e,AuditLogsTo.class)).collect(Collectors.toSet());
	}

	/**
	 *
	 * @param instanceId
	 */
	public Set<ComponentTo> findComponents(int instanceId){
		return instanceRepository.findById(instanceId).get().getComponents().stream().map(e->converter.convert(e, ComponentTo.class)).collect(Collectors.toSet());
	}

	/**
	 *
	 * @param instanceId
	 */
	@Override
	public Optional<InstanceTo> findInstance(int instanceId){
		if(instanceId <1)
		 {return Optional.empty();}
		 return instanceRepository.findById(instanceId).filter(r -> !r.getDeleted().booleanValue()).map(r -> converter.convert(r,InstanceTo.class));
	}

	/**
	 *
	 * @param page
	 * @param sort
	 * @param filters
	 */
	@Override
	public Page<InstanceTo> findInstances(PageInput page, SortInput sort, List<FilterInput> filters, boolean disjunctionFilters){
		return instanceRepository.findByCriteria(InstanceModel.class,filters,sort,page,disjunctionFilters).map(r -> converter.convert(r,InstanceTo.class));
	}

	/**
	 *
	 * @param instanceId
	 */
	public Set<SessionTo> findSessions(int instanceId){
		return sessionRepository.findByInstanceId(instanceId).stream().map(e -> converter.convert(e,SessionTo.class)).collect(Collectors.toSet());
	}

	/**
	 *
	 * @param instanceId
	 */
	public Optional<TenantTo> findTenant(int instanceId){
		return instanceRepository.findById(instanceId).map(r -> converter.convert(r.getTenant(),TenantTo.class));
	}

	/**
	 *
	 * @param tenantRepository
	 * @param instanceRepository
	 * @param converter
	 * @param sessionRepository
	 * @param auditlogsRepository
	 * @param componentRepository
	 */
	@Autowired
	public InstanceServiceImpl(TenantRepository tenantRepository, InstanceRepository instanceRepository, ConversionService converter, SessionRepository sessionRepository, AuditLogsRepository auditlogsRepository, ComponentRepository componentRepository){
		this.instanceRepository =instanceRepository;
		 this.converter = converter;
		 this.sessionRepository = sessionRepository;
		 this.auditlogsRepository = auditlogsRepository;
		 this.componentRepository = componentRepository;
		 this.tenantRepository = tenantRepository;
	}

	/**
	 *
	 * @param instance
	 */
	@Override @Transactional(readOnly = false)
	public InstanceTo modifyInstance(InstanceInput instance){
		InstanceModel target= instanceRepository.findById(instance.getId()).orElseThrow(() -> new RuntimeException("Instance not found"));
		 InstanceModel source= converter.convert(instance,InstanceModel.class);
		 Utils.copyNotNulls(source,target);
		 return converter.convert(instanceRepository.save(target), InstanceTo.class);
	}

}