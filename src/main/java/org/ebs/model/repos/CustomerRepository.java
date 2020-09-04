///////////////////////////////////////////////////////////
//  CustomerRepository.java
//  Macromedia ActionScript Implementation of the Interface CustomerRepository
//  Generated by Enterprise Architect
//  Created on:      04-Sep-2020 10:04:56 AM
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
 * @created 04-Sep-2020 10:04:56 AM
 */
public interface CustomerRepository extends JpaRepository<CustomerModel,Integer>, RepositoryExt<CustomerModel> {

	/**
	 * 
	 * @param organizationId
	 */
	public List<CustomerModel> findByOrganizationId(int organizationId);

}