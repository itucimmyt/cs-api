///////////////////////////////////////////////////////////
//  MarkerRepository.java
//  Macromedia ActionScript Implementation of the Interface MarkerRepository
//  Generated by Enterprise Architect
//  Created on:      04-Sep-2020 10:05:16 AM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.model.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.ebs.model.MarkerModel;
import org.ebs.util.RepositoryExt;
import java.util.List;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 04-Sep-2020 10:05:16 AM
 */
public interface MarkerRepository extends JpaRepository<MarkerModel,Integer>, RepositoryExt<MarkerModel> {

	/**
	 * 
	 * @param assaygeneId
	 */
	public List<MarkerModel> findByAssaygeneId(int assaygeneId);

}