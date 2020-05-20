///////////////////////////////////////////////////////////
//  MarkerRepository.java
//  Macromedia ActionScript Implementation of the Interface MarkerRepository
//  Generated by Enterprise Architect
//  Created on:      17-May-2020 3:09:40 PM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.model.repos;

import java.util.List;

import org.ebs.model.MarkerModel;
import org.ebs.util.RepositoryExt;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 17-May-2020 3:09:40 PM
 */
public interface MarkerRepository extends JpaRepository<MarkerModel,Integer>, RepositoryExt<MarkerModel> {

	/**
	 * 
	 * @param assaygeneId
	 */
	public List<MarkerModel> findByAssaygeneId(int assaygeneId);

}