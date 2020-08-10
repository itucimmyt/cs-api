///////////////////////////////////////////////////////////
//  WorkflowInstanceRepository.java
//  Macromedia ActionScript Implementation of the Interface WorkflowInstanceRepository
//  Generated by Enterprise Architect
//  Created on:      09-Aug-2020 4:51:57 PM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.model.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.ebs.model.WorkflowInstanceModel;
import org.ebs.util.RepositoryExt;
import java.util.List;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 09-Aug-2020 4:51:57 PM
 */
public interface WorkflowInstanceRepository extends JpaRepository<WorkflowInstanceModel,Integer>, RepositoryExt<WorkflowInstanceModel> {

	/**
	 * 
	 * @param workflowId
	 */
	public List<WorkflowInstanceModel> findByWorkflowId(int workflowId);

}