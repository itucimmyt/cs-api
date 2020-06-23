///////////////////////////////////////////////////////////
//  ServiceTypeRepository.java
//  Macromedia ActionScript Implementation of the Interface ServiceTypeRepository
//  Generated by Enterprise Architect
//  Created on:      15-Jun-2020 5:14:28 PM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.model.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.ebs.model.ServiceTypeModel;
import org.ebs.util.RepositoryExt;
import java.util.List;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 15-Jun-2020 5:14:28 PM
 */
public interface ServiceTypeRepository extends JpaRepository<ServiceTypeModel,Integer>, RepositoryExt<ServiceTypeModel> {

	/**
	 * 
	 * @param cropId
	 */
	public List<ServiceTypeModel> findByCropId(int cropId);

}