///////////////////////////////////////////////////////////
//  TenantRepository.java
//  Macromedia ActionScript Implementation of the Interface TenantRepository
//  Generated by Enterprise Architect
//  Created on:      13-Mar-2021 12:02:58 AM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.model.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.ebs.model.TenantModel;
import org.ebs.util.RepositoryExt;
import java.util.List;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 13-Mar-2021 12:02:58 AM
 */
public interface TenantRepository extends JpaRepository<TenantModel,Integer>, RepositoryExt<TenantModel> {

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