///////////////////////////////////////////////////////////
//  AssayclassRepository.java
//  Macromedia ActionScript Implementation of the Interface AssayclassRepository
//  Generated by Enterprise Architect
//  Created on:      10-Sep-2020 10:43:19 PM
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
 * @created 10-Sep-2020 10:43:19 PM
 */
public interface AssayclassRepository extends JpaRepository<AssayclassModel,Integer>, RepositoryExt<AssayclassModel> {

	/**
	 * 
	 * @param serviceId
	 */
	public List<AssayclassModel> findByServiceId(int serviceId);

}