///////////////////////////////////////////////////////////
//  SessionRepository.java
//  Macromedia ActionScript Implementation of the Interface SessionRepository
//  Generated by Enterprise Architect
//  Created on:      17-May-2020 3:10:19 PM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.model.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.ebs.util.RepositoryExt;
import java.util.List;
import org.ebs.model.SessionModel;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 17-May-2020 3:10:19 PM
 */
public interface SessionRepository extends JpaRepository<SessionModel,Integer>, RepositoryExt<SessionModel> {

	/**
	 * 
	 * @param instanceId
	 */
	public List<SessionModel> findByInstanceId(int instanceId);

	/**
	 * 
	 * @param userId
	 */
	public List<SessionModel> findByUserId(int userId);

}