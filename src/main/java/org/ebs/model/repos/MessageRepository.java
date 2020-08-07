///////////////////////////////////////////////////////////
//  MessageRepository.java
//  Macromedia ActionScript Implementation of the Interface MessageRepository
//  Generated by Enterprise Architect
//  Created on:      07-Aug-2020 3:00:01 PM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.model.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.ebs.model.MessageModel;
import org.ebs.util.RepositoryExt;
import java.util.List;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 07-Aug-2020 3:00:01 PM
 */
public interface MessageRepository extends JpaRepository<MessageModel,Integer>, RepositoryExt<MessageModel> {

	/**
	 * 
	 * @param htmltagId
	 */
	public List<MessageModel> findByHtmltagId(int htmltagId);

}