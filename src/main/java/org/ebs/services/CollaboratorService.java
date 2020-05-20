///////////////////////////////////////////////////////////
//  CollaboratorService.java
//  Macromedia ActionScript Implementation of the Interface CollaboratorService
//  Generated by Enterprise Architect
//  Created on:      17-May-2020 3:09:24 PM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.services;

import java.util.List;
import java.util.Optional;

import org.ebs.services.to.CollaboratorTo;
import org.ebs.services.to.Input.CollaboratorInput;
import org.ebs.util.FilterInput;
import org.ebs.util.PageInput;
import org.ebs.util.SortInput;
import org.springframework.data.domain.Page;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 17-May-2020 3:09:24 PM
 */
public interface CollaboratorService {

	/**
	 * 
	 * @param Collaborator
	 */
	public CollaboratorTo createCollaborator(CollaboratorInput Collaborator);

	/**
	 * 
	 * @param idcollaborator
	 */
	public int deleteCollaborator(int idcollaborator);

	/**
	 * 
	 * @param collaboratorId
	 */
	public Optional<CollaboratorTo> findCollaborator(int collaboratorId);

	/**
	 * 
	 * @param page
	 * @param sort
	 * @param filters
	 */
	public Page<CollaboratorTo> findCollaborators(PageInput page, SortInput sort, List<FilterInput> filters);

	/**
	 * 
	 * @param collaborator
	 */
	public CollaboratorTo modifyCollaborator(CollaboratorInput collaborator);

}