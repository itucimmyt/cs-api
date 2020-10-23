///////////////////////////////////////////////////////////
//  InstanceService.java
//  Macromedia ActionScript Implementation of the Interface InstanceService
//  Generated by Enterprise Architect
//  Created on:      04-Sep-2020 10:05:12 AM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.services;

import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.ebs.services.to.AuditLogsTo;
import org.ebs.services.to.ComponentTo;
import org.ebs.services.to.InstanceTo;
import org.ebs.services.to.SessionTo;
import org.ebs.services.to.TenantTo;
import org.ebs.services.to.Input.InstanceInput;
import org.ebs.util.FilterInput;
import org.ebs.util.PageInput;
import org.ebs.util.SortInput;
import org.springframework.data.domain.Page;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 04-Sep-2020 10:05:12 AM
 */
public interface InstanceService {

	/**
	 *
	 * @param Instance
	 */
	public InstanceTo createinstance(InstanceInput Instance);

	/**
	 *
	 * @param instanceId
	 */
	public int deleteinstance(int instanceId);

	/**
	 *
	 * @param instanceId
	 */
	public Set<AuditLogsTo> findauditlogss(int instanceId);

	/**
	 *
	 * @param instanceId
	 */
	public Set<ComponentTo> findcomponents(int instanceId);

	/**
	 *
	 * @param instanceId
	 */
	public Optional<InstanceTo> findinstance(int instanceId);

	/**
	 *
	 * @param page
	 * @param sort
	 * @param filters
	 */
	public Page<InstanceTo> findinstances(PageInput page, SortInput sort, List<FilterInput> filters, boolean disjunctionFilters);

	/**
	 *
	 * @param instanceId
	 */
	public Set<SessionTo> findsessions(int instanceId);

	/**
	 *
	 * @param instanceId
	 */
	public Optional<TenantTo> findtenant(int instanceId);

	/**
	 *
	 * @param instance
	 */
	public InstanceTo modifyinstance(InstanceInput instance);

}