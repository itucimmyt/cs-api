///////////////////////////////////////////////////////////
//  CollaboratorImpl.java
//  Macromedia ActionScript Implementation of the Class CollaboratorImpl
//  Generated by Enterprise Architect
//  Created on:      28-Apr-2020 12:06:55 AM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.services;

import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import java.util.Optional;
import org.ebs.util.FilterInput;
import org.ebs.util.PageInput;
import org.ebs.util.SortInput;
import org.ebs.util.Utils;
import org.springframework.core.convert.ConversionService;
import org.ebs.services.to.CollaboratorTo;
import org.ebs.services.to.Input.CollaboratorInput;
import org.ebs.model.CollaboratorModel;
import org.ebs.model.repos.CollaboratorRepository;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 28-Apr-2020 12:06:55 AM
 */
@Service @Transactional(readOnly = true)
public class CollaboratorImpl implements CollaboratorService {

	private CollaboratorRepository collaboratorRepository;
	@Autowired
	private ConversionService converter;

	/**
	 * 
	 * @param collaboratorRepository
	 */
	@Autowired
	public CollaboratorImpl(CollaboratorRepository collaboratorRepository){
		this.collaboratorRepository =collaboratorRepository;
	}

	/**
	 * 
	 * @param Collaborator
	 */
	@Override @Transactional(readOnly = false)
	public CollaboratorTo createCollaborator(CollaboratorInput Collaborator){
		CollaboratorModel model = converter.convert(Collaborator,CollaboratorModel.class); 
		 model.setId(0); 
		 model= collaboratorRepository.save(model); 
		 return converter.convert(model, CollaboratorTo.class); 
	}

	/**
	 * 
	 * @param idcollaborator
	 */
	@Override @Transactional(readOnly = false)
	public int deleteCollaborator(int idcollaborator){
		CollaboratorModel collaborator = collaboratorRepository.findById(idcollaborator).orElseThrow(() -> new RuntimeException("Request not found")); 
		 collaborator.setDeleted(true); 
		  collaboratorRepository.save(collaborator); 
		 return idcollaborator;
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
	 * @param collaborator
	 */
	@Override @Transactional(readOnly = false)
	public CollaboratorTo modifyCollaborator(CollaboratorInput collaborator){
		CollaboratorModel target= collaboratorRepository.findById(collaborator.getId()).orElseThrow(() -> new RuntimeException("Request not found")); 
		 CollaboratorModel source= converter.convert(collaborator,CollaboratorModel.class); 
		 Utils.copyNotNulls(source,target); 
		 return converter.convert(collaboratorRepository.save(target), CollaboratorTo.class);
	}

}