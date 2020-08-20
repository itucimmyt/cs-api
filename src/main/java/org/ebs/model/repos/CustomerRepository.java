///////////////////////////////////////////////////////////
//  CustomerRepository.java
//  Macromedia ActionScript Implementation of the Interface CustomerRepository
//  Generated by Enterprise Architect
//  Created on:      20-Aug-2020 1:05:36 PM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.model.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.ebs.model.CustomerModel;
import org.ebs.util.RepositoryExt;
import java.util.List;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 20-Aug-2020 1:05:36 PM
 */
public interface CustomerRepository extends JpaRepository<CustomerModel,Integer>, RepositoryExt<CustomerModel> {

	/**
	 * 
	 * @param organizationId
	 */
	public List<CustomerModel> findByOrganizationId(int organizationId);

}