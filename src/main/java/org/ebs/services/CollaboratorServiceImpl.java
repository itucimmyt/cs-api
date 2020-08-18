///////////////////////////////////////////////////////////
//  CollaboratorServiceImpl.java
//  Macromedia ActionScript Implementation of the Class CollaboratorServiceImpl
//  Generated by Enterprise Architect
//  Created on:      09-Aug-2020 4:50:23 PM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.services;

import java.util.List;
import java.util.Optional;

import org.ebs.model.CollaboratorModel;
import org.ebs.model.PersonModel;
import org.ebs.model.repos.CollaboratorRepository;
import org.ebs.model.repos.PersonRepository;
import org.ebs.services.to.CollaboratorTo;
import org.ebs.services.to.PersonTo;
import org.ebs.services.to.Input.CollaboratorInput;
import org.ebs.util.FilterInput;
import org.ebs.util.PageInput;
import org.ebs.util.SortInput;
import org.ebs.util.Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.ConversionService;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 09-Aug-2020 4:50:23 PM
 */
@Service @Transactional(readOnly = true)
  class CollaboratorServiceImpl implements CollaboratorService {

	private CollaboratorRepository collaboratorRepository;
	private ConversionService converter;
	private PersonRepository personRepository;

	/**
	 * 
	 * @param personRepository
	 * @param converter
	 * @param collaboratorRepository
	 */
	@Autowired
	public CollaboratorServiceImpl(PersonRepository personRepository, ConversionService converter, CollaboratorRepository collaboratorRepository){
		this.collaboratorRepository =collaboratorRepository; 
		 this.converter = converter;
		 this.personRepository = personRepository;
	}

	/**
	 * 
	 * @param Collaborator
	 */
	@Override @Transactional(readOnly = false)
	public CollaboratorTo createCollaborator(CollaboratorInput Collaborator){
		CollaboratorModel model = converter.convert(Collaborator,CollaboratorModel.class); 
		 model.setId(0);
		 PersonModel personModel = personRepository.findById(Collaborator.getperson().getId()).get(); 
		model.setperson(personModel); 
		 
		 model= collaboratorRepository.save(model); 
		 return converter.convert(model, CollaboratorTo.class); 
	}

	/**
	 * 
	 * @param collaboratorId
	 */
	@Override @Transactional(readOnly = false)
	public int deleteCollaborator(int collaboratorId){
		CollaboratorModel collaborator = collaboratorRepository.findById(collaboratorId).orElseThrow(() -> new RuntimeException("Collaborator not found")); 
		 collaborator.setDeleted(true); 
		  collaboratorRepository.save(collaborator); 
		 return collaboratorId;
	}

	/**
	 * 
	 * @param collaboratorId
	 */
	@Override
	public Optional<CollaboratorTo> findCollaborator(int collaboratorId){
		if(collaboratorId <1) 
		 {return Optional.empty();} 
		 return collaboratorRepository.findById(collaboratorId).filter(r -> !r.getDeleted().booleanValue()).map(r -> converter.convert(r,CollaboratorTo.class));
	}

	/**
	 * 
	 * @param page
	 * @param sort
	 * @param filters
	 */
	@Override
	public Page<CollaboratorTo> findCollaborators(PageInput page, SortInput sort, List<FilterInput> filters){
		return collaboratorRepository.findByCriteria(CollaboratorModel.class,filters,sort,page).map(r -> converter.convert(r,CollaboratorTo.class));
	}

	/**
	 * 
	 * @param collaboratorId
	 */
	public Optional<PersonTo> findPerson(int collaboratorId){
		return collaboratorRepository.findById(collaboratorId).map(r -> converter.convert(r.getperson(),PersonTo.class));
	}

	/**
	 * 
	 * @param collaborator
	 */
	@Override @Transactional(readOnly = false)
	public CollaboratorTo modifyCollaborator(CollaboratorInput collaborator){
		CollaboratorModel target= collaboratorRepository.findById(collaborator.getId()).orElseThrow(() -> new RuntimeException("Collaborator not found")); 
		 CollaboratorModel source= converter.convert(collaborator,CollaboratorModel.class); 
		 Utils.copyNotNulls(source,target); 
		 return converter.convert(collaboratorRepository.save(target), CollaboratorTo.class);
	}

}