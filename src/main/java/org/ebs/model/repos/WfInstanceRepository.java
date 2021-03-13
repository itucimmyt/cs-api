///////////////////////////////////////////////////////////
//  WfInstanceRepository.java
//  Macromedia ActionScript Implementation of the Interface WfInstanceRepository
//  Generated by Enterprise Architect
//  Created on:      13-Mar-2021 12:03:02 AM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.model.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.ebs.model.WfInstanceModel;
import org.ebs.util.RepositoryExt;
import java.util.List;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 13-Mar-2021 12:03:02 AM
 */
public interface WfInstanceRepository extends JpaRepository<WfInstanceModel,Integer>, RepositoryExt<WfInstanceModel> {

	/**
	 * 
	 * @param workflowId
	 */
	public List<WfInstanceModel> findByWorkflowId(int workflowId);

}