///////////////////////////////////////////////////////////
//  TenantService.java
//  Macromedia ActionScript Implementation of the Interface TenantService
//  Generated by Enterprise Architect
//  Created on:      04-Sep-2020 10:06:16 AM
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
import org.ebs.services.to.TenantTo;
import org.ebs.services.to.Input.TenantInput;
import org.ebs.services.to.UserTo;
import org.ebs.services.to.InstanceTo;
import org.ebs.services.to.WorkflowTo;
import org.ebs.services.to.OrganizationTo;
import org.ebs.services.to.AuthenticationTypeTo;
import org.ebs.services.to.NumberSequenceRuleTo;
import org.ebs.services.to.CustomerTo;
import org.ebs.services.to.PersonTo;
import org.ebs.services.to.EmailTemplateTo;
import org.ebs.services.to.ProgramTo;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 04-Sep-2020 10:06:16 AM
 */
public interface TenantService {

	/**
	 *
	 * @param Tenant
	 */
	public TenantTo createtenant(TenantInput Tenant);

	/**
	 *
	 * @param tenantId
	 */
	public int deletetenant(int tenantId);

	/**
	 *
	 * @param tenantId
	 */
	public Optional<AuthenticationTypeTo> findauthenticationtype(int tenantId);

	/**
	 *
	 * @param tenantId
	 */
	public Optional<CustomerTo> findcustomer(int tenantId);

	/**
	 *
	 * @param tenantId
	 */
	public Set<EmailTemplateTo> findemailtemplates(int tenantId);

	/**
	 *
	 * @param tenantId
	 */
	public Set<InstanceTo> findinstances(int tenantId);

	/**
	 *
	 * @param tenantId
	 */
	public Set<NumberSequenceRuleTo> findnumbersequencerules(int tenantId);

	/**
	 *
	 * @param tenantId
	 */
	public Optional<OrganizationTo> findorganization(int tenantId);

	/**
	 *
	 * @param tenantId
	 */
	public Set<PersonTo> findpersons(int tenantId);

	/**
	 *
	 * @param tenantId
	 */
	public Set<ProgramTo> findprograms(int tenantId);

	/**
	 *
	 * @param tenantId
	 */
	public Optional<TenantTo> findtenant(int tenantId);

	/**
	 *
	 * @param page
	 * @param sort
	 * @param filters
	 */
	public Page<TenantTo> findtenants(PageInput page, SortInput sort, List<FilterInput> filters, boolean disjunctionFilters);

	/**
	 *
	 * @param tenantId
	 */
	public Set<UserTo> findusers(int tenantId);

	/**
	 *
	 * @param tenantId
	 */
	public Set<WorkflowTo> findworkflows(int tenantId);

	/**
	 *
	 * @param tenant
	 */
	public TenantTo modifytenant(TenantInput tenant);

}