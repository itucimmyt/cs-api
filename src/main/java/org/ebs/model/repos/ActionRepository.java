///////////////////////////////////////////////////////////
//  ActionRepository.java
//  Macromedia ActionScript Implementation of the Interface ActionRepository
//  Generated by Enterprise Architect
//  Created on:      28-Apr-2020 11:58:02 PM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.model.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.ebs.util.RepositoryExt;
import java.util.List;
import org.ebs.model.ActionModel;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 28-Apr-2020 11:58:02 PM
 */
public interface ActionRepository extends JpaRepository<ActionModel,Integer>, RepositoryExt<ActionModel> {

	/**
	 * 
	 * @param moduleId
	 */
	public List<ActionModel> findByModuleId(int moduleId);

}