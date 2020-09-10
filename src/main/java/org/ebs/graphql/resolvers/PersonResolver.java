///////////////////////////////////////////////////////////
//  PersonResolver.java
//  Macromedia ActionScript Implementation of the Class PersonResolver
//  Generated by Enterprise Architect
//  Created on:      10-Sep-2020 12:19:43 AM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.graphql.resolvers;

import org.ebs.services.to.LanguageTo;
import org.ebs.services.to.DonorTo;
import org.ebs.services.to.PartnerTo;
import org.ebs.services.to.VendorTo;
import org.ebs.services.to.ProjectTo;
import org.ebs.services.to.UserTo;
import org.ebs.services.to.TeamTo;
import com.coxautodev.graphql.tools.GraphQLResolver;
import org.ebs.services.to.PersonTo;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import java.util.Set;
import org.ebs.services.PersonService;
import org.ebs.services.to.RequestTo;
import org.ebs.services.to.AddressTo;
import org.ebs.services.to.TenantTo;
import org.ebs.services.to.CollaboratorTo;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 10-Sep-2020 12:19:43 AM
 */
@Component @Validated
public class PersonResolver implements GraphQLResolver<PersonTo> {

	private PersonService personService;

	/**
	 * 
	 * @param personTo
	 */
	public Set<AddressTo> getAddresss(PersonTo personTo){
		return personService.findAddresss(personTo.getId());
	}

	/**
	 * 
	 * @param person
	 */
	public Set<CollaboratorTo> getCollaborators(PersonTo person){
		return personService.findCollaborators(person.getId());
	}

	/**
	 * 
	 * @param person
	 */
	public Set<DonorTo> getDonors(PersonTo person){
		return personService.findDonors(person.getId());
	}

	/**
	 * 
	 * @param personTo
	 */
	public LanguageTo getLanguage(PersonTo personTo){
		return personService.findLanguage(personTo.getId()).get();
	}

	/**
	 * 
	 * @param person
	 */
	public Set<PartnerTo> getPartners(PersonTo person){
		return personService.findPartners(person.getId());
	}

	/**
	 * 
	 * @param person
	 */
	public Set<ProjectTo> getProjects(PersonTo person){
		return personService.findProjects(person.getId());
	}

	/**
	 * 
	 * @param person
	 */
	public Set<RequestTo> getRequests(PersonTo person){
		return personService.findRequests(person.getId());
	}

	/**
	 * 
	 * @param personTo
	 */
	public Set<TeamTo> getTeams(PersonTo personTo){
		return personService.findTeams(personTo.getId());
	}

	/**
	 * 
	 * @param personTo
	 */
	public TenantTo getTenant(PersonTo personTo){
		return personService.findTenant(personTo.getId()).get();
	}

	/**
	 * 
	 * @param person
	 */
	public Set<UserTo> getUsers(PersonTo person){
		return personService.findUsers(person.getId());
	}

	/**
	 * 
	 * @param person
	 */
	public Set<VendorTo> getVendors(PersonTo person){
		return personService.findVendors(person.getId());
	}

	/**
	 * 
	 * @param personService
	 */
	@Autowired
	public PersonResolver(PersonService personService){
		this.personService = personService; 
	
	}

}