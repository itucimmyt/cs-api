///////////////////////////////////////////////////////////
//  ServiceRepository.java
//  Macromedia ActionScript Implementation of the Interface ServiceRepository
//  Generated by Enterprise Architect
//  Created on:      17-May-2020 3:10:16 PM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.model.repos;

import java.util.List;

import org.ebs.model.ServiceModel;
import org.ebs.util.RepositoryExt;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 17-May-2020 3:10:16 PM
 */
public interface ServiceRepository extends JpaRepository<ServiceModel,Integer>, RepositoryExt<ServiceModel> {

	/**
	 * 
	 * @param serviceproviderId
	 */
	//public List<ServiceModel> findByServiceproviderId(int serviceproviderId);

	/**
	 * 
	 * @param servicetypeId
	 */
   public List<ServiceModel> findByPurposeId(int servicetypeId);

}