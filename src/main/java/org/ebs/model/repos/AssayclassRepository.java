///////////////////////////////////////////////////////////
//  AssayclassRepository.java
//  Macromedia ActionScript Implementation of the Interface AssayclassRepository
//  Generated by Enterprise Architect
//  Created on:      07-Aug-2020 2:59:03 PM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.model.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.ebs.model.AssayclassModel;
import org.ebs.util.RepositoryExt;
import java.util.List;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 07-Aug-2020 2:59:03 PM
 */
public interface AssayclassRepository extends JpaRepository<AssayclassModel,Integer>, RepositoryExt<AssayclassModel> {

	/**
	 * 
	 * @param serviceId
	 */
	public List<AssayclassModel> findByServiceId(int serviceId);

}