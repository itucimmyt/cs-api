///////////////////////////////////////////////////////////
//  PersonService.java
//  Macromedia ActionScript Implementation of the Interface PersonService
//  Generated by Enterprise Architect
//  Created on:      04-Sep-2020 10:05:36 AM
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
import org.ebs.services.to.CollaboratorTo;
import org.ebs.services.to.LanguageTo;
import org.ebs.services.to.DonorTo;
import org.ebs.services.to.PartnerTo;
import org.ebs.services.to.VendorTo;
import org.ebs.services.to.ProjectTo;
import org.ebs.services.to.UserTo;
import org.ebs.services.to.TeamTo;
import org.ebs.services.to.RequestTo;
import org.ebs.services.to.AddressTo;
import org.ebs.services.to.TenantTo;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 04-Sep-2020 10:05:36 AM
 */
public interface PersonService {

	/**
	 * 
	 * @param Person
	 */
	public PersonTo createperson(PersonInput Person);

	/**
	 * 
	 * @param personId
	 */
	public int deleteperson(int personId);

	/**
	 * 
	 * @param personId
	 */
	public Set<AddressTo> findaddresss(int personId);

	/**
	 * 
	 * @param personId
	 */
	public Set<CollaboratorTo> findcollaborators(int personId);

	/**
	 * 
	 * @param personId
	 */
	public Set<DonorTo> finddonors(int personId);

	/**
	 * 
	 * @param personId
	 */
	public Optional<LanguageTo> findlanguage(int personId);

	/**
	 * 
	 * @param personId
	 */
	public Set<PartnerTo> findpartners(int personId);

	/**
	 * 
	 * @param personId
	 */
	public Optional<PersonTo> findperson(int personId);

	/**
	 * 
	 * @param page
	 * @param sort
	 * @param filters
	 */
	public Page<PersonTo> findpersons(PageInput page, SortInput sort, List<FilterInput> filters);

	/**
	 * 
	 * @param personId
	 */
	public Set<ProjectTo> findprojects(int personId);

	/**
	 * 
	 * @param personId
	 */
	public Set<RequestTo> findrequests(int personId);

	/**
	 * 
	 * @param personId
	 */
	public Set<TeamTo> findteams(int personId);

	/**
	 * 
	 * @param personId
	 */
	public Optional<TenantTo> findtenant(int personId);

	/**
	 * 
	 * @param personId
	 */
	public Set<UserTo> findusers(int personId);

	/**
	 * 
	 * @param personId
	 */
	public Set<VendorTo> findvendors(int personId);

	/**
	 * 
	 * @param person
	 */
	public PersonTo modifyperson(PersonInput person);

}