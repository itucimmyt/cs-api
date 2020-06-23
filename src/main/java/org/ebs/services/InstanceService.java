///////////////////////////////////////////////////////////
//  InstanceService.java
//  Macromedia ActionScript Implementation of the Interface InstanceService
//  Generated by Enterprise Architect
//  Created on:      15-Jun-2020 5:13:37 PM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.services;

import java.util.List;
import java.util.Optional;
import org.ebs.util.FilterInput;
import org.ebs.util.PageInput;
import org.ebs.util.SortInput;
import org.springframework.data.domain.Page;
import java.util.Set;
import org.springframework.stereotype.Component;
import org.ebs.services.to.InstanceTo;
import org.ebs.services.to.Input.InstanceInput;
import org.ebs.services.to.SessionTo;
import org.ebs.services.to.AuditLogsTo;
import org.ebs.services.to.ComponentTo;
import org.ebs.services.to.TenantTo;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 15-Jun-2020 5:13:37 PM
 */
public interface InstanceService {

	/**
	 * 
	 * @param Instance
	 */
	public InstanceTo createInstance(InstanceInput Instance);

	/**
	 * 
	 * @param instanceId
	 */
	public int deleteInstance(int instanceId);

	/**
	 * 
	 * @param instanceId
	 */
	public Set<AuditLogsTo> findAuditLogss(int instanceId);

	/**
	 * 
	 * @param instanceId
	 */
	public Optional<ComponentTo> findComponent(int instanceId);

	/**
	 * 
	 * @param instanceId
	 */
	public Optional<InstanceTo> findInstance(int instanceId);

	/**
	 * 
	 * @param page
	 * @param sort
	 * @param filters
	 */
	public Page<InstanceTo> findInstances(PageInput page, SortInput sort, List<FilterInput> filters);

	/**
	 * 
	 * @param instanceId
	 */
	public Set<SessionTo> findSessions(int instanceId);

	/**
	 * 
	 * @param instanceId
	 */
	public Optional<TenantTo> findTenant(int instanceId);

	/**
	 * 
	 * @param instance
	 */
	public InstanceTo modifyInstance(InstanceInput instance);

}