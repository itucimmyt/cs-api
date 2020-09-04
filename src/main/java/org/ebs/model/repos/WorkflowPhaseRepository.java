///////////////////////////////////////////////////////////
//  WorkflowPhaseRepository.java
//  Macromedia ActionScript Implementation of the Interface WorkflowPhaseRepository
//  Generated by Enterprise Architect
//  Created on:      04-Sep-2020 10:06:44 AM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.model.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.ebs.model.WorkflowPhaseModel;
import org.ebs.util.RepositoryExt;
import java.util.List;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 04-Sep-2020 10:06:44 AM
 */
public interface WorkflowPhaseRepository extends JpaRepository<WorkflowPhaseModel,Integer>, RepositoryExt<WorkflowPhaseModel> {

	/**
	 * 
	 * @param htmltagId
	 */
	public List<WorkflowPhaseModel> findByHtmltagId(int htmltagId);

	/**
	 * 
	 * @param workflowId
	 */
	public List<WorkflowPhaseModel> findByWorkflowId(int workflowId);

}