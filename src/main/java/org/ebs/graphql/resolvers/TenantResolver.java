///////////////////////////////////////////////////////////
//  TenantResolver.java
//  Macromedia ActionScript Implementation of the Class TenantResolver
//  Generated by Enterprise Architect
//  Created on:      27-Jul-2020 8:43:39 AM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.graphql.resolvers;

import com.coxautodev.graphql.tools.GraphQLResolver;
import org.ebs.services.to.TenantTo;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import java.util.Set;
import org.ebs.services.TenantService;
import org.ebs.services.to.EmailTemplateTo;
import org.ebs.services.to.ProgramTo;
import org.ebs.services.to.UserTo;
import org.ebs.services.to.InstanceTo;
import org.ebs.services.to.WorkflowTo;
import org.ebs.services.to.OrganizationTo;
import org.ebs.services.to.AuthenticationTypeTo;
import org.ebs.services.to.NumberSequenceRuleTo;
import org.ebs.services.to.CustomerTo;
import org.ebs.services.to.PersonTo;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 27-Jul-2020 8:43:39 AM
 */
@Component @Validated
public class TenantResolver implements GraphQLResolver<TenantTo> {

	private TenantService tenantService;

	/**
	 * 
	 * @param tenantTo
	 */
	public AuthenticationTypeTo getAuthenticationtype(TenantTo tenantTo){
		return tenantService.findAuthenticationType(tenantTo.getId()).get();
	}

	/**
	 * 
	 * @param tenantTo
	 */
	public CustomerTo getCustomer(TenantTo tenantTo){
		return tenantService.findCustomer(tenantTo.getId()).get();
	}

	/**
	 * 
	 * @param tenant
	 */
	public Set<EmailTemplateTo> getEmailtemplates(TenantTo tenant){
		return tenantService.findEmailTemplates(tenant.getId());
	}

	/**
	 * 
	 * @param tenant
	 */
	public Set<InstanceTo> getInstances(TenantTo tenant){
		return tenantService.findInstances(tenant.getId());
	}

	/**
	 * 
	 * @param tenant
	 */
	public Set<NumberSequenceRuleTo> getNumbersequencerules(TenantTo tenant){
		return tenantService.findNumberSequenceRules(tenant.getId());
	}

	/**
	 * 
	 * @param tenantTo
	 */
	public OrganizationTo getOrganization(TenantTo tenantTo){
		return tenantService.findOrganization(tenantTo.getId()).get();
	}

	/**
	 * 
	 * @param tenant
	 */
	public Set<PersonTo> getPersons(TenantTo tenant){
		return tenantService.findPersons(tenant.getId());
	}

	/**
	 * 
	 * @param tenant
	 */
	public Set<ProgramTo> getPrograms(TenantTo tenant){
		return tenantService.findPrograms(tenant.getId());
	}

	/**
	 * 
	 * @param tenant
	 */
	public Set<UserTo> getUsers(TenantTo tenant){
		return tenantService.findUsers(tenant.getId());
	}

	/**
	 * 
	 * @param tenant
	 */
	public Set<WorkflowTo> getWorkflows(TenantTo tenant){
		return tenantService.findWorkflows(tenant.getId());
	}

	/**
	 * 
	 * @param tenantService
	 */
	@Autowired
	public TenantResolver(TenantService tenantService){
		this.tenantService = tenantService; 
	
	}

}