///////////////////////////////////////////////////////////
//  DomainInstanceService.java
//  Macromedia ActionScript Implementation of the Interface DomainInstanceService
//  Generated by Enterprise Architect
//  Created on:      02-May-2021 6:19:46 AM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.services;

import java.util.List;
import java.util.Optional;
import org.ebs.util.FilterInput;
import org.ebs.util.PageInput;
import org.ebs.util.SortInput;
import org.springframework.data.domain.Page;
import org.ebs.services.to.DomainInstanceTo;
import org.ebs.services.to.Input.DomainInstanceInput;
import org.ebs.services.to.InstanceTo;
import org.ebs.services.to.DomainTo;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 02-May-2021 6:19:46 AM
 */
public interface DomainInstanceService {

	/**
	 * 
	 * @param DomainInstance
	 */
	public DomainInstanceTo createDomainInstance(DomainInstanceInput DomainInstance);

	/**
	 * 
	 * @param domainInstanceId
	 */
	public int deleteDomainInstance(int domainInstanceId);

	/**
	 * 
	 * @param domaininstanceId
	 */
	public Optional<DomainTo> findDomain(int domaininstanceId);

	/**
	 * 
	 * @param domainInstanceId
	 */
	public Optional<DomainInstanceTo> findDomainInstance(int domainInstanceId);

	/**
	 * 
	 * @param page
	 * @param sort
	 * @param filters
	 */
	public Page<DomainInstanceTo> findDomainInstances(PageInput page, SortInput sort, List<FilterInput> filters);

	/**
	 * 
	 * @param domaininstanceId
	 */
	public Optional<InstanceTo> findInstance(int domaininstanceId);

	/**
	 * 
	 * @param domainInstance
	 */
	public DomainInstanceTo modifyDomainInstance(DomainInstanceInput domainInstance);

}