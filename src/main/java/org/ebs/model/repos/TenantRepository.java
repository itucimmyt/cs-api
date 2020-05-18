///////////////////////////////////////////////////////////
//  TenantRepository.java
//  Macromedia ActionScript Implementation of the Interface TenantRepository
//  Generated by Enterprise Architect
//  Created on:      17-May-2020 3:10:25 PM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.model.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.ebs.util.RepositoryExt;
import java.util.List;
import org.ebs.model.TenantModel;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 17-May-2020 3:10:25 PM
 */
public interface TenantRepository extends JpaRepository<TenantModel,Integer>, RepositoryExt<TenantModel> {

	/**
	 * 
	 * @param authenticationtypeId
	 */
	public List<TenantModel> findByAuthenticationtypeId(int authenticationtypeId);

	/**
	 * 
	 * @param customerId
	 */
	public List<TenantModel> findByCustomerId(int customerId);

	/**
	 * 
	 * @param organizationId
	 */
	public List<TenantModel> findByOrganizationId(int organizationId);

}