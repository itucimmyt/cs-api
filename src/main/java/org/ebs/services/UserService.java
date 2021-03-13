///////////////////////////////////////////////////////////
//  UserService.java
//  Macromedia ActionScript Implementation of the Interface UserService
//  Generated by Enterprise Architect
//  Created on:      13-Mar-2021 12:03:01 AM
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
import org.ebs.services.to.UserTo;
import org.ebs.services.to.Input.UserInput;
import org.ebs.services.to.DelegationTo;
import org.ebs.services.to.TenantTo;
import org.ebs.services.to.PreferenceTo;
import org.ebs.services.to.RoleTo;
import org.ebs.services.to.PersonTo;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 13-Mar-2021 12:03:01 AM
 */
public interface UserService {

	/**
	 * 
	 * @param User
	 */
	public UserTo createUser(UserInput User);

	/**
	 * 
	 * @param userId
	 */
	public int deleteUser(int userId);

	/**
	 * 
	 * @param userId
	 */
	public Set<DelegationTo> findDelegations(int userId);

	/**
	 * 
	 * @param userId
	 */
	public Optional<PersonTo> findPerson(int userId);

	/**
	 * 
	 * @param userId
	 */
	public Set<PreferenceTo> findPreferences(int userId);

	/**
	 * 
	 * @param userId
	 */
	public Set<RoleTo> findRoles(int userId);

	/**
	 * 
	 * @param userId
	 */
	public Optional<TenantTo> findTenant(int userId);

	/**
	 * 
	 * @param userId
	 */
	public Optional<UserTo> findUser(int userId);

	/**
	 * 
	 * @param page
	 * @param sort
	 * @param filters
	 */
	public Page<UserTo> findUsers(PageInput page, SortInput sort, List<FilterInput> filters);

	/**
	 * 
	 * @param user
	 */
	public UserTo modifyUser(UserInput user);

}