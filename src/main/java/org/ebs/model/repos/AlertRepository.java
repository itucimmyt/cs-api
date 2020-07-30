///////////////////////////////////////////////////////////
//  AlertRepository.java
//  Macromedia ActionScript Implementation of the Interface AlertRepository
//  Generated by Enterprise Architect
//  Created on:      27-Jul-2020 8:42:02 AM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.model.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.ebs.model.AlertModel;
import org.ebs.util.RepositoryExt;
import java.util.List;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 27-Jul-2020 8:42:02 AM
 */
public interface AlertRepository extends JpaRepository<AlertModel,Integer>, RepositoryExt<AlertModel> {

	/**
	 * 
	 * @param htmltagId
	 */
	public List<AlertModel> findByHtmltagId(int htmltagId);

}