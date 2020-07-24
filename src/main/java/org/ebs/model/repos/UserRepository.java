///////////////////////////////////////////////////////////
//  UserRepository.java
//  Macromedia ActionScript Implementation of the Interface UserRepository
//  Generated by Enterprise Architect
//  Created on:      23-Jul-2020 10:47:26 PM
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
 * @created 23-Jul-2020 10:47:26 PM
 */
public interface UserRepository extends JpaRepository<UserModel,Integer>, RepositoryExt<UserModel> {

	/**
	 * 
	 * @param tenantId
	 */
	public List<UserModel> findByTenantId(int tenantId);

}