///////////////////////////////////////////////////////////
//  UserRepository.java
//  Macromedia ActionScript Implementation of the Interface UserRepository
//  Generated by Enterprise Architect
//  Created on:      07-Sep-2020 8:12:27 AM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.model.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.ebs.model.UserModel;
import org.ebs.util.RepositoryExt;
import java.util.List;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 07-Sep-2020 8:12:27 AM
 */
public interface UserRepository extends JpaRepository<UserModel,Integer>, RepositoryExt<UserModel> {

	/**
	 * 
	 * @param personId
	 */
	public List<UserModel> findByPersonId(int personId);

	/**
	 * 
	 * @param tenantId
	 */
	public List<UserModel> findByTenantId(int tenantId);

}