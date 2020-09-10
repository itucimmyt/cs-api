///////////////////////////////////////////////////////////
//  NotificationRepository.java
//  Macromedia ActionScript Implementation of the Interface NotificationRepository
//  Generated by Enterprise Architect
//  Created on:      10-Sep-2020 12:19:33 AM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.model.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.ebs.model.NotificationModel;
import org.ebs.util.RepositoryExt;
import java.util.List;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 10-Sep-2020 12:19:33 AM
 */
public interface NotificationRepository extends JpaRepository<NotificationModel,Integer>, RepositoryExt<NotificationModel> {

	/**
	 * 
	 * @param htmltagId
	 */
	public List<NotificationModel> findByHtmltagId(int htmltagId);

}