///////////////////////////////////////////////////////////
//  DonorResolver.java
//  Macromedia ActionScript Implementation of the Class DonorResolver
//  Generated by Enterprise Architect
//  Created on:      17-May-2020 3:09:34 PM
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
import org.ebs.model.DonorModel;
import org.ebs.services.to.DonorTo;
import org.ebs.model.repos.DonorRepository;
import org.ebs.services.DonorService;
import org.ebs.services.PersonService;
import org.ebs.model.repos.PersonRepository;
import org.ebs.services.to.PersonTo;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 17-May-2020 3:09:34 PM
 */
@Component @Validated
public class DonorResolver implements GraphQLResolver<DonorTo> {

	private DonorService donorService;
	private DonorRepository donorRepository;
	@Autowired
	private ConversionService converter;
	private PersonService personService;
	private PersonRepository personRepository;

	/**
	 * 
	 * @param personRepository
	 * @param personService
	 * @param donorRepository
	 * @param donorService
	 */
	@Autowired
	public DonorResolver(PersonRepository personRepository, PersonService personService, DonorRepository donorRepository, DonorService donorService){
		this.donorService = donorService; 
		this.donorRepository = donorRepository; 
		this.personService = personService; 
		this.personRepository = personRepository; 
	
	}

	/**
	 * 
	 * @param donorTo
	 */
	public PersonTo getPerson(DonorTo donorTo){
		DonorModel donorModel = donorRepository.findById(donorTo.getId()).get(); 
		 return personService.findPerson(donorModel.getPerson().getId()).get();
	}

}