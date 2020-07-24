///////////////////////////////////////////////////////////
//  ModuleRepository.java
//  Macromedia ActionScript Implementation of the Interface ModuleRepository
//  Generated by Enterprise Architect
//  Created on:      23-Jul-2020 10:46:36 PM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.model.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.ebs.model.ModuleModel;
import org.ebs.util.RepositoryExt;
import java.util.List;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 23-Jul-2020 10:46:36 PM
 */
public interface ModuleRepository extends JpaRepository<ModuleModel,Integer>, RepositoryExt<ModuleModel> {

	/**
	 * 
	 * @param componentId
	 */
	public List<ModuleModel> findByComponentId(int componentId);

}