///////////////////////////////////////////////////////////
//  PersonService.java
//  Macromedia ActionScript Implementation of the Interface PersonService
//  Generated by Enterprise Architect
//  Created on:      07-Sep-2020 8:11:43 AM
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
import org.ebs.services.to.PersonTo;
import org.ebs.services.to.Input.PersonInput;
import org.ebs.services.to.RequestTo;
import org.ebs.services.to.AddressTo;
import org.ebs.services.to.TenantTo;
import org.ebs.services.to.CollaboratorTo;
import org.ebs.services.to.LanguageTo;
import org.ebs.services.to.DonorTo;
import org.ebs.services.to.PartnerTo;
import org.ebs.services.to.VendorTo;
import org.ebs.services.to.ProjectTo;
import org.ebs.services.to.UserTo;
import org.ebs.services.to.TeamTo;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 07-Sep-2020 8:11:43 AM
 */
public interface PersonService {

	/**
	 * 
	 * @param Person
	 */
	public PersonTo createPerson(PersonInput Person);

	/**
	 * 
	 * @param personId
	 */
	public int deletePerson(int personId);

	/**
	 * 
	 * @param personId
	 */
	public Set<AddressTo> findAddresss(int personId);

	/**
	 * 
	 * @param personId
	 */
	public Set<CollaboratorTo> findCollaborators(int personId);

	/**
	 * 
	 * @param personId
	 */
	public Set<DonorTo> findDonors(int personId);

	/**
	 * 
	 * @param personId
	 */
	public Optional<LanguageTo> findLanguage(int personId);

	/**
	 * 
	 * @param personId
	 */
	public Set<PartnerTo> findPartners(int personId);

	/**
	 * 
	 * @param personId
	 */
	public Optional<PersonTo> findPerson(int personId);

	/**
	 * 
	 * @param page
	 * @param sort
	 * @param filters
	 */
	public Page<PersonTo> findPersons(PageInput page, SortInput sort, List<FilterInput> filters);

	/**
	 * 
	 * @param personId
	 */
	public Set<ProjectTo> findProjects(int personId);

	/**
	 * 
	 * @param personId
	 */
	public Set<RequestTo> findRequests(int personId);

	/**
	 * 
	 * @param personId
	 */
	public Set<TeamTo> findTeams(int personId);

	/**
	 * 
	 * @param personId
	 */
	public Optional<TenantTo> findTenant(int personId);

	/**
	 * 
	 * @param personId
	 */
	public Set<UserTo> findUsers(int personId);

	/**
	 * 
	 * @param personId
	 */
	public Set<VendorTo> findVendors(int personId);

	/**
	 * 
	 * @param person
	 */
	public PersonTo modifyPerson(PersonInput person);

}