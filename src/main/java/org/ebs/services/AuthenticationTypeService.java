///////////////////////////////////////////////////////////
//  AuthenticationTypeService.java
//  Macromedia ActionScript Implementation of the Interface AuthenticationTypeService
//  Generated by Enterprise Architect
//  Created on:      20-Aug-2020 1:05:29 PM
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
import org.ebs.services.to.AuthenticationTypeTo;
import org.ebs.services.to.Input.AuthenticationTypeInput;
import org.ebs.services.to.TenantTo;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 20-Aug-2020 1:05:29 PM
 */
public interface AuthenticationTypeService {

	/**
	 * 
	 * @param AuthenticationType
	 */
	public AuthenticationTypeTo createAuthenticationType(AuthenticationTypeInput AuthenticationType);

	/**
	 * 
	 * @param authenticationtypeId
	 */
	public int deleteAuthenticationType(int authenticationtypeId);

	/**
	 * 
	 * @param authenticationtypeId
	 */
	public Optional<AuthenticationTypeTo> findAuthenticationType(int authenticationtypeId);

	/**
	 * 
	 * @param page
	 * @param sort
	 * @param filters
	 */
	public Page<AuthenticationTypeTo> findAuthenticationTypes(PageInput page, SortInput sort, List<FilterInput> filters);

	/**
	 * 
	 * @param authenticationtypeId
	 */
	public Set<TenantTo> findTenants(int authenticationtypeId);

	/**
	 * 
	 * @param authenticationtype
	 */
	public AuthenticationTypeTo modifyAuthenticationType(AuthenticationTypeInput authenticationtype);

}