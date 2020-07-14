///////////////////////////////////////////////////////////
//  SessionRepository.java
//  Macromedia ActionScript Implementation of the Interface SessionRepository
//  Generated by Enterprise Architect
//  Created on:      13-Jul-2020 5:07:21 PM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.model.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.ebs.model.SessionModel;
import org.ebs.util.RepositoryExt;
import java.util.List;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 13-Jul-2020 5:07:21 PM
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