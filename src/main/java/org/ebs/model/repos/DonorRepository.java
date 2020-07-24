///////////////////////////////////////////////////////////
//  DonorRepository.java
//  Macromedia ActionScript Implementation of the Interface DonorRepository
//  Generated by Enterprise Architect
//  Created on:      23-Jul-2020 10:46:22 PM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.model.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.ebs.model.DonorModel;
import org.ebs.util.RepositoryExt;
import java.util.List;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 23-Jul-2020 10:46:22 PM
 */
public interface DonorRepository extends JpaRepository<DonorModel,Integer>, RepositoryExt<DonorModel> {

	/**
	 * 
	 * @param personId
	 */
	public List<DonorModel> findByPersonId(int personId);

}