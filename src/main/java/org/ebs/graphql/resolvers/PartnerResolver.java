///////////////////////////////////////////////////////////
//  PartnerResolver.java
//  Macromedia ActionScript Implementation of the Class PartnerResolver
//  Generated by Enterprise Architect
//  Created on:      17-May-2020 3:09:50 PM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.graphql.resolvers;

import com.coxautodev.graphql.tools.GraphQLResolver;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import java.util.stream.Collectors;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import org.springframework.core.convert.ConversionService;
import org.ebs.model.PartnerModel;
import org.ebs.services.to.PartnerTo;
import org.ebs.model.repos.PartnerRepository;
import org.ebs.services.PartnerService;
import org.ebs.services.PersonService;
import org.ebs.model.repos.PersonRepository;
import org.ebs.services.to.PersonTo;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 17-May-2020 3:09:50 PM
 */
@Component @Validated
public class PartnerResolver implements GraphQLResolver<PartnerTo> {

	private PartnerService partnerService;
	private PartnerRepository partnerRepository;
	@Autowired
	private ConversionService converter;
	private PersonService personService;
	private PersonRepository personRepository;

	/**
	 * 
	 * @param partnerTo
	 */
	public PersonTo getPerson(PartnerTo partnerTo){
		PartnerModel partnerModel = partnerRepository.findById(partnerTo.getId()).get(); 
		 return personService.findPerson(partnerModel.getPerson().getId()).get();
	}

	/**
	 * 
	 * @param personRepository
	 * @param personService
	 * @param partnerRepository
	 * @param partnerService
	 */
	@Autowired
	public PartnerResolver(PersonRepository personRepository, PersonService personService, PartnerRepository partnerRepository, PartnerService partnerService){
		this.partnerService = partnerService; 
		this.partnerRepository = partnerRepository; 
		this.personService = personService; 
		this.personRepository = personRepository; 
	
	}

}