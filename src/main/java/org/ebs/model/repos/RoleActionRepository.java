///////////////////////////////////////////////////////////
//  RoleActionRepository.java
//  Macromedia ActionScript Implementation of the Interface RoleActionRepository
//  Generated by Enterprise Architect
//  Created on:      07-Sep-2020 8:11:59 AM
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
 * @created 07-Sep-2020 8:11:59 AM
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