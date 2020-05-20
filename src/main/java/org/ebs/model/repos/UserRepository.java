///////////////////////////////////////////////////////////
//  UserRepository.java
//  Macromedia ActionScript Implementation of the Interface UserRepository
//  Generated by Enterprise Architect
//  Created on:      17-May-2020 3:10:32 PM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.model.repos;

import java.util.List;

import org.ebs.model.UserModel;
import org.ebs.util.RepositoryExt;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 17-May-2020 3:10:32 PM
 */
public interface UserRepository extends JpaRepository<UserModel,Integer>, RepositoryExt<UserModel> {

	/**
	 * 
	 * @param tenantId
	 */
	public List<UserModel> findByTenantId(int tenantId);

}