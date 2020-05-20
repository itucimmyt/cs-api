///////////////////////////////////////////////////////////
//  PersonRepository.java
//  Macromedia ActionScript Implementation of the Interface PersonRepository
//  Generated by Enterprise Architect
//  Created on:      17-May-2020 3:09:53 PM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.model.repos;

import java.util.List;

import org.ebs.model.PersonModel;
import org.ebs.util.RepositoryExt;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 17-May-2020 3:09:53 PM
 */
public interface PersonRepository extends JpaRepository<PersonModel,Integer>, RepositoryExt<PersonModel> {

	/**
	 * 
	 * @param addressId
	 */
	public List<PersonModel> findByAddressId(int addressId);

	/**
	 * 
	 * @param tenantId
	 */
	public List<PersonModel> findByTenantId(int tenantId);

}