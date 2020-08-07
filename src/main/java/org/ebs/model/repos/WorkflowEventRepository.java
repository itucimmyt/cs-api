///////////////////////////////////////////////////////////
//  WorkflowEventRepository.java
//  Macromedia ActionScript Implementation of the Interface WorkflowEventRepository
//  Generated by Enterprise Architect
//  Created on:      07-Aug-2020 3:02:27 PM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.model.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.ebs.model.WorkflowEventModel;
import org.ebs.util.RepositoryExt;
import java.util.List;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 07-Aug-2020 3:02:27 PM
 */
public interface WorkflowEventRepository extends JpaRepository<WorkflowEventModel,Integer>, RepositoryExt<WorkflowEventModel> {

	/**
	 * 
	 * @param workflowinstanceId
	 */
	public List<WorkflowEventModel> findByWorkflowinstanceId(int workflowinstanceId);

	/**
	 * 
	 * @param workflownodeId
	 */
	public List<WorkflowEventModel> findByWorkflownodeId(int workflownodeId);

	/**
	 * 
	 * @param workflowstageId
	 */
	public List<WorkflowEventModel> findByWorkflowstageId(int workflowstageId);

}