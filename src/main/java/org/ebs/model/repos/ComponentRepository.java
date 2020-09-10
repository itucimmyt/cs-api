///////////////////////////////////////////////////////////
//  ComponentRepository.java
//  Macromedia ActionScript Implementation of the Interface ComponentRepository
//  Generated by Enterprise Architect
//  Created on:      10-Sep-2020 12:19:00 AM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.model.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.ebs.model.ComponentModel;
import org.ebs.util.RepositoryExt;
import java.util.List;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 10-Sep-2020 12:19:00 AM
 */
public interface ComponentRepository extends JpaRepository<ComponentModel,Integer>, RepositoryExt<ComponentModel> {

	/**
	 * 
	 * @param htmltagId
	 */
	public List<ComponentModel> findByHtmltagId(int htmltagId);

}