///////////////////////////////////////////////////////////
//  DelegationRepository.java
//  Macromedia ActionScript Implementation of the Interface DelegationRepository
//  Generated by Enterprise Architect
//  Created on:      17-May-2020 3:09:32 PM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.model.repos;

import java.util.List;

import org.ebs.model.DelegationModel;
import org.ebs.util.RepositoryExt;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 17-May-2020 3:09:32 PM
 */
public interface DelegationRepository extends JpaRepository<DelegationModel,Integer>, RepositoryExt<DelegationModel> {

	/**
	 * 
	 * @param userId
	 */
	public List<DelegationModel> findByUserId(int userId);

}