///////////////////////////////////////////////////////////
//  ServiceProviderRepository.java
//  Macromedia ActionScript Implementation of the Interface ServiceProviderRepository
//  Generated by Enterprise Architect
//  Created on:      27-Jul-2020 8:43:28 AM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.model.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.ebs.model.ServiceProviderModel;
import org.ebs.util.RepositoryExt;
import java.util.List;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 27-Jul-2020 8:43:28 AM
 */
public interface ServiceProviderRepository extends JpaRepository<ServiceProviderModel,Integer>, RepositoryExt<ServiceProviderModel> {

	/**
	 * 
	 * @param countryId
	 */
	public List<ServiceProviderModel> findByCountryId(int countryId);

}