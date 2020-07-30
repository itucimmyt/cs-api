///////////////////////////////////////////////////////////
//  MarkerSynonymRepository.java
//  Macromedia ActionScript Implementation of the Interface MarkerSynonymRepository
//  Generated by Enterprise Architect
//  Created on:      27-Jul-2020 8:42:43 AM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.model.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.ebs.model.MarkerSynonymModel;
import org.ebs.util.RepositoryExt;
import java.util.List;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 27-Jul-2020 8:42:43 AM
 */
public interface MarkerSynonymRepository extends JpaRepository<MarkerSynonymModel,Integer>, RepositoryExt<MarkerSynonymModel> {

	/**
	 * 
	 * @param markerId
	 */
	public List<MarkerSynonymModel> findByMarkerId(int markerId);

}