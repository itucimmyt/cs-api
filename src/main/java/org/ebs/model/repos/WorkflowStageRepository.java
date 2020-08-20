///////////////////////////////////////////////////////////
//  WorkflowStageRepository.java
//  Macromedia ActionScript Implementation of the Interface WorkflowStageRepository
//  Generated by Enterprise Architect
//  Created on:      20-Aug-2020 1:07:07 PM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.model.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.ebs.model.WorkflowStageModel;
import org.ebs.util.RepositoryExt;
import java.util.List;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 20-Aug-2020 1:07:07 PM
 */
public interface WorkflowStageRepository extends JpaRepository<WorkflowStageModel,Integer>, RepositoryExt<WorkflowStageModel> {

	/**
	 * 
	 * @param htmltagId
	 */
	public List<WorkflowStageModel> findByHtmltagId(int htmltagId);

	/**
	 * 
	 * @param workflowphaseId
	 */
	public List<WorkflowStageModel> findByWorkflowphaseId(int workflowphaseId);

}