///////////////////////////////////////////////////////////
//  SessionRepository.java
//  Macromedia ActionScript Implementation of the Interface SessionRepository
//  Generated by Enterprise Architect
//  Created on:      27-Apr-2020 9:47:52 AM
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
 * @created 27-Apr-2020 9:47:52 AM
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