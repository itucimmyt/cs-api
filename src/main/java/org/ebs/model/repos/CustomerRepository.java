///////////////////////////////////////////////////////////
//  CustomerRepository.java
//  Macromedia ActionScript Implementation of the Interface CustomerRepository
//  Generated by Enterprise Architect
//  Created on:      13-Jul-2020 5:06:26 PM
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
 * @created 13-Jul-2020 5:06:26 PM
 */
public interface CustomerRepository extends JpaRepository<CustomerModel,Integer>, RepositoryExt<CustomerModel> {

	/**
	 * 
	 * @param organizationId
	 */
	public List<CustomerModel> findByOrganizationId(int organizationId);

}