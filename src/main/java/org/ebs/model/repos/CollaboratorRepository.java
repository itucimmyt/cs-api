///////////////////////////////////////////////////////////
//  CollaboratorRepository.java
//  Macromedia ActionScript Implementation of the Interface CollaboratorRepository
//  Generated by Enterprise Architect
//  Created on:      13-Jul-2020 5:06:18 PM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.model.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.ebs.model.CollaboratorModel;
import org.ebs.util.RepositoryExt;
import java.util.List;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 13-Jul-2020 5:06:18 PM
 */
public interface CollaboratorRepository extends JpaRepository<CollaboratorModel,Integer>, RepositoryExt<CollaboratorModel> {

	/**
	 * 
	 * @param personId
	 */
	public List<CollaboratorModel> findByPersonId(int personId);

}