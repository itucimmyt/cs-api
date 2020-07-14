///////////////////////////////////////////////////////////
//  WorkflowEventRepository.java
//  Macromedia ActionScript Implementation of the Interface WorkflowEventRepository
//  Generated by Enterprise Architect
//  Created on:      13-Jul-2020 5:07:39 PM
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
 * @created 13-Jul-2020 5:07:39 PM
 */
public interface WorkflowEventRepository extends JpaRepository<WorkflowEventModel,Integer>, RepositoryExt<WorkflowEventModel> {

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