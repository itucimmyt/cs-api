///////////////////////////////////////////////////////////
//  PurposeRepository.java
//  Macromedia ActionScript Implementation of the Interface PurposeRepository
//  Generated by Enterprise Architect
//  Created on:      07-Sep-2020 8:11:52 AM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.model.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.ebs.model.PurposeModel;
import org.ebs.util.RepositoryExt;
import java.util.List;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 07-Sep-2020 8:11:52 AM
 */
public interface PurposeRepository extends JpaRepository<PurposeModel,Integer>, RepositoryExt<PurposeModel> {

	/**
	 * 
	 * @param serviceTypeId
	 */
	public List<PurposeModel> findByServiceTypeId(int serviceTypeId);

}