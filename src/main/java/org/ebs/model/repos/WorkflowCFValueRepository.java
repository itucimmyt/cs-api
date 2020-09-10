///////////////////////////////////////////////////////////
//  WorkflowCFValueRepository.java
//  Macromedia ActionScript Implementation of the Interface WorkflowCFValueRepository
//  Generated by Enterprise Architect
//  Created on:      10-Sep-2020 12:20:42 AM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.model.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.ebs.model.WorkflowCFValueModel;
import org.ebs.util.RepositoryExt;
import java.util.List;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 10-Sep-2020 12:20:42 AM
 */
public interface WorkflowCFValueRepository extends JpaRepository<WorkflowCFValueModel,Integer>, RepositoryExt<WorkflowCFValueModel> {

	/**
	 * 
	 * @param requestId
	 */
	public List<WorkflowCFValueModel> findByRequestId(int requestId);

	/**
	 * 
	 * @param workflownodecfId
	 */
	public List<WorkflowCFValueModel> findByWorkflownodecfId(int workflownodecfId);

}