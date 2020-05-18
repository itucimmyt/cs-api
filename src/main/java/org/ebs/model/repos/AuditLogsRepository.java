///////////////////////////////////////////////////////////
//  AuditLogsRepository.java
//  Macromedia ActionScript Implementation of the Interface AuditLogsRepository
//  Generated by Enterprise Architect
//  Created on:      17-May-2020 3:09:20 PM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.model.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.ebs.util.RepositoryExt;
import java.util.List;
import org.ebs.model.AuditLogsModel;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 17-May-2020 3:09:20 PM
 */
public interface AuditLogsRepository extends JpaRepository<AuditLogsModel,Integer>, RepositoryExt<AuditLogsModel> {

	/**
	 * 
	 * @param instanceId
	 */
	public List<AuditLogsModel> findByInstanceId(int instanceId);

}