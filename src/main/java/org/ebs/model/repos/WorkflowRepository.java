///////////////////////////////////////////////////////////
//  WorkflowRepository.java
//  Macromedia ActionScript Implementation of the Interface WorkflowRepository
//  Generated by Enterprise Architect
//  Created on:      17-May-2020 3:10:37 PM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.model.repos;

import java.util.List;

import org.ebs.model.WorkflowModel;
import org.ebs.util.RepositoryExt;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 17-May-2020 3:10:37 PM
 */
public interface WorkflowRepository extends JpaRepository<WorkflowModel,Integer>, RepositoryExt<WorkflowModel> {

	/**
	 * 
	 * @param tenantId
	 */
	public List<WorkflowModel> findByTenantId(int tenantId);

	/**
	 * 
	 * @param workflownodeId
	 */
	public List<WorkflowModel> findByWorkflownodeId(int workflownodeId);

}