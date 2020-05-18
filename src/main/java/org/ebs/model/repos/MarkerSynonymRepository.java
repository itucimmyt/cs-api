///////////////////////////////////////////////////////////
//  MarkerSynonymRepository.java
//  Macromedia ActionScript Implementation of the Interface MarkerSynonymRepository
//  Generated by Enterprise Architect
//  Created on:      17-May-2020 3:09:41 PM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.model.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.ebs.util.RepositoryExt;
import java.util.List;
import org.ebs.model.MarkerSynonymModel;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 17-May-2020 3:09:41 PM
 */
public interface MarkerSynonymRepository extends JpaRepository<MarkerSynonymModel,Integer>, RepositoryExt<MarkerSynonymModel> {

	/**
	 * 
	 * @param markerId
	 */
	public List<MarkerSynonymModel> findByMarkerId(int markerId);

}