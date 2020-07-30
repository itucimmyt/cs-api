///////////////////////////////////////////////////////////
//  TenantService.java
//  Macromedia ActionScript Implementation of the Interface TenantService
//  Generated by Enterprise Architect
//  Created on:      27-Jul-2020 8:43:39 AM
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
import org.ebs.services.to.EmailTemplateTo;
import org.ebs.services.to.NumberSequenceRuleTo;
import org.ebs.services.to.CustomerTo;
import org.ebs.services.to.PersonTo;
import org.ebs.services.to.ProgramTo;
import org.ebs.services.to.UserTo;
import org.ebs.services.to.InstanceTo;
import org.ebs.services.to.WorkflowTo;
import org.ebs.services.to.OrganizationTo;
import org.ebs.services.to.AuthenticationTypeTo;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 27-Jul-2020 8:43:39 AM
 */
public interface TenantService {

	/**
	 * 
	 * @param Tenant
	 */
	public TenantTo createTenant(TenantInput Tenant);

	/**
	 * 
	 * @param tenantId
	 */
	public int deleteTenant(int tenantId);

	/**
	 * 
	 * @param tenantId
	 */
	public Optional<AuthenticationTypeTo> findAuthenticationType(int tenantId);

	/**
	 * 
	 * @param tenantId
	 */
	public Optional<CustomerTo> findCustomer(int tenantId);

	/**
	 * 
	 * @param tenantId
	 */
	public Set<EmailTemplateTo> findEmailTemplates(int tenantId);

	/**
	 * 
	 * @param tenantId
	 */
	public Set<InstanceTo> findInstances(int tenantId);

	/**
	 * 
	 * @param tenantId
	 */
	public Set<NumberSequenceRuleTo> findNumberSequenceRules(int tenantId);

	/**
	 * 
	 * @param tenantId
	 */
	public Optional<OrganizationTo> findOrganization(int tenantId);

	/**
	 * 
	 * @param tenantId
	 */
	public Set<PersonTo> findPersons(int tenantId);

	/**
	 * 
	 * @param tenantId
	 */
	public Set<ProgramTo> findPrograms(int tenantId);

	/**
	 * 
	 * @param tenantId
	 */
	public Optional<TenantTo> findTenant(int tenantId);

	/**
	 * 
	 * @param page
	 * @param sort
	 * @param filters
	 */
	public Page<TenantTo> findTenants(PageInput page, SortInput sort, List<FilterInput> filters);

	/**
	 * 
	 * @param tenantId
	 */
	public Set<UserTo> findUsers(int tenantId);

	/**
	 * 
	 * @param tenantId
	 */
	public Set<WorkflowTo> findWorkflows(int tenantId);

	/**
	 * 
	 * @param tenant
	 */
	public TenantTo modifyTenant(TenantInput tenant);

}