///////////////////////////////////////////////////////////
//  RequestRepository.java
//  Macromedia ActionScript Implementation of the Interface RequestRepository
//  Generated by Enterprise Architect
//  Created on:      04-Sep-2020 10:05:51 AM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.model.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.ebs.model.RequestModel;
import org.ebs.util.RepositoryExt;
import java.util.List;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 04-Sep-2020 10:05:51 AM
 */
public interface RequestRepository extends JpaRepository<RequestModel,Integer>, RepositoryExt<RequestModel> {

	/**
	 * 
	 * @param personId
	 */
	public List<RequestModel> findByPersonId(int personId);


	/**
	 * 
	 * @param workflowinstanceId
	 */
	public List<RequestModel> findByWorkflowinstanceId(int workflowinstanceId);

}