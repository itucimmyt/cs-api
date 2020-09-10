///////////////////////////////////////////////////////////
//  OrganizationRepository.java
//  Macromedia ActionScript Implementation of the Interface OrganizationRepository
//  Generated by Enterprise Architect
//  Created on:      10-Sep-2020 12:19:38 AM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.model.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.ebs.model.OrganizationModel;
import org.ebs.util.RepositoryExt;
import java.util.List;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 10-Sep-2020 12:19:38 AM
 */
public interface OrganizationRepository extends JpaRepository<OrganizationModel,Integer>, RepositoryExt<OrganizationModel> {

	/**
	 * 
	 * @param customerId
	 */
	public List<OrganizationModel> findByCustomerId(int customerId);

}