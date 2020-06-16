///////////////////////////////////////////////////////////
//  DelegationService.java
//  Macromedia ActionScript Implementation of the Interface DelegationService
//  Generated by Enterprise Architect
//  Created on:      15-Jun-2020 5:13:31 PM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.services;

import java.util.List;
import java.util.Optional;
import org.ebs.util.FilterInput;
import org.ebs.util.PageInput;
import org.ebs.util.SortInput;
import org.springframework.data.domain.Page;
import org.ebs.services.to.DelegationTo;
import org.ebs.services.to.Input.DelegationInput;
import org.ebs.services.to.UserTo;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 15-Jun-2020 5:13:31 PM
 */
public interface DelegationService {

	/**
	 * 
	 * @param Delegation
	 */
	public DelegationTo createDelegation(DelegationInput Delegation);

	/**
	 * 
	 * @param delegationId
	 */
	public int deleteDelegation(int delegationId);

	/**
	 * 
	 * @param delegationId
	 */
	public Optional<DelegationTo> findDelegation(int delegationId);

	/**
	 * 
	 * @param page
	 * @param sort
	 * @param filters
	 */
	public Page<DelegationTo> findDelegations(PageInput page, SortInput sort, List<FilterInput> filters);

	/**
	 * 
	 * @param delegationId
	 */
	public Optional<UserTo> findUser(int delegationId);

	/**
	 * 
	 * @param delegation
	 */
	public DelegationTo modifyDelegation(DelegationInput delegation);

}