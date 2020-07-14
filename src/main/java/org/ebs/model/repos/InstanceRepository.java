///////////////////////////////////////////////////////////
//  InstanceRepository.java
//  Macromedia ActionScript Implementation of the Interface InstanceRepository
//  Generated by Enterprise Architect
//  Created on:      13-Jul-2020 5:06:38 PM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.model.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.ebs.model.InstanceModel;
import org.ebs.util.RepositoryExt;
import java.util.List;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 13-Jul-2020 5:06:38 PM
 */
public interface InstanceRepository extends JpaRepository<InstanceModel,Integer>, RepositoryExt<InstanceModel> {

	/**
	 * 
	 * @param componentId
	 */
	public List<InstanceModel> findByComponentId(int componentId);

	/**
	 * 
	 * @param tenantId
	 */
	public List<InstanceModel> findByTenantId(int tenantId);

}