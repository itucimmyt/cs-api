///////////////////////////////////////////////////////////
//  DonorRepository.java
//  Macromedia ActionScript Implementation of the Interface DonorRepository
//  Generated by Enterprise Architect
//  Created on:      27-Jul-2020 8:42:28 AM
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
 * @created 27-Jul-2020 8:42:28 AM
 */
public interface DonorRepository extends JpaRepository<DonorModel,Integer>, RepositoryExt<DonorModel> {

	/**
	 * 
	 * @param personId
	 */
	public List<DonorModel> findByPersonId(int personId);

}