///////////////////////////////////////////////////////////
//  CollaboratorService.java
//  Macromedia ActionScript Implementation of the Interface CollaboratorService
//  Generated by Enterprise Architect
//  Created on:      10-Sep-2020 10:43:27 PM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.services;

import java.util.List;
import java.util.Optional;
import org.ebs.util.FilterInput;
import org.ebs.util.PageInput;
import org.ebs.util.SortInput;
import org.springframework.data.domain.Page;
import org.ebs.services.to.CollaboratorTo;
import org.ebs.services.to.Input.CollaboratorInput;
import org.ebs.services.to.PersonTo;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 10-Sep-2020 10:43:27 PM
 */
public interface CollaboratorService {

	/**
	 *
	 * @param Collaborator
	 */
	public CollaboratorTo createCollaborator(CollaboratorInput Collaborator);

	/**
	 *
	 * @param collaboratorId
	 */
	public int deleteCollaborator(int collaboratorId);

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
	public Page<CollaboratorTo> findCollaborators(PageInput page, SortInput sort, List<FilterInput> filters, boolean disjunctionFilters);

	/**
	 *
	 * @param collaboratorId
	 */
	public Optional<PersonTo> findPerson(int collaboratorId);

	/**
	 *
	 * @param collaborator
	 */
	public CollaboratorTo modifyCollaborator(CollaboratorInput collaborator);

}