///////////////////////////////////////////////////////////
//  RoleActionRepository.java
//  Macromedia ActionScript Implementation of the Interface RoleActionRepository
//  Generated by Enterprise Architect
//  Created on:      20-Aug-2020 1:06:22 PM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.model.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.ebs.model.RoleActionModel;
import org.ebs.util.RepositoryExt;
import java.util.List;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 20-Aug-2020 1:06:22 PM
 */
public interface RoleActionRepository extends JpaRepository<RoleActionModel,Integer>, RepositoryExt<RoleActionModel> {

	/**
	 * 
	 * @param actionId
	 */
	public List<RoleActionModel> findByActionId(int actionId);

	/**
	 * 
	 * @param roleId
	 */
	public List<RoleActionModel> findByRoleId(int roleId);

}