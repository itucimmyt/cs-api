///////////////////////////////////////////////////////////
//  UserService.java
//  Macromedia ActionScript Implementation of the Interface UserService
//  Generated by Enterprise Architect
//  Created on:      04-Sep-2020 10:06:25 AM
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
import org.ebs.services.to.SessionTo;
import org.ebs.services.to.DelegationTo;
import org.ebs.services.to.TenantTo;
import org.ebs.services.to.PreferenceTo;
import org.ebs.services.to.RoleTo;
import org.ebs.services.to.PersonTo;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 04-Sep-2020 10:06:25 AM
 */
public interface UserService {

	/**
	 *
	 * @param User
	 */
	public UserTo createuser(UserInput User);

	/**
	 *
	 * @param userId
	 */
	public int deleteuser(int userId);

	/**
	 *
	 * @param userId
	 */
	public Set<DelegationTo> finddelegations(int userId);

	/**
	 *
	 * @param userId
	 */
	public Optional<PersonTo> findperson(int userId);

	/**
	 *
	 * @param userId
	 */
	public Set<PreferenceTo> findpreferences(int userId);

	/**
	 *
	 * @param userId
	 */
	public Set<RoleTo> findroles(int userId);

	/**
	 *
	 * @param userId
	 */
	public Set<SessionTo> findsessions(int userId);

	/**
	 *
	 * @param userId
	 */
	public Optional<TenantTo> findtenant(int userId);

	/**
	 *
	 * @param userId
	 */
	public Optional<UserTo> finduser(int userId);

	/**
	 *
	 * @param page
	 * @param sort
	 * @param filters
	 */
	public Page<UserTo> findusers(PageInput page, SortInput sort, List<FilterInput> filters, boolean disjunctionFilters);

	/**
	 *
	 * @param user
	 */
	public UserTo modifyuser(UserInput user);

}