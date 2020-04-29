///////////////////////////////////////////////////////////
//  DelegationRepository.java
//  Macromedia ActionScript Implementation of the Interface DelegationRepository
//  Generated by Enterprise Architect
//  Created on:      28-Apr-2020 11:58:12 PM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.model.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.ebs.util.RepositoryExt;
import java.util.List;
import org.ebs.model.DelegationModel;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 28-Apr-2020 11:58:12 PM
 */
public interface DelegationRepository extends JpaRepository<DelegationModel,Integer>, RepositoryExt<DelegationModel> {

	/**
	 * 
	 * @param userId
	 */
	public List<DelegationModel> findByUserId(int userId);

}