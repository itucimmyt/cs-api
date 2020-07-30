///////////////////////////////////////////////////////////
//  InstanceRepository.java
//  Macromedia ActionScript Implementation of the Interface InstanceRepository
//  Generated by Enterprise Architect
//  Created on:      27-Jul-2020 8:42:37 AM
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
 * @created 27-Jul-2020 8:42:37 AM
 */
public interface InstanceRepository extends JpaRepository<InstanceModel,Integer>, RepositoryExt<InstanceModel> {

	/**
	 * 
	 * @param tenantId
	 */
	public List<InstanceModel> findByTenantId(int tenantId);

}