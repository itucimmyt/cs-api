///////////////////////////////////////////////////////////
//  WorkflowStatusTypeRepository.java
//  Macromedia ActionScript Implementation of the Interface WorkflowStatusTypeRepository
//  Generated by Enterprise Architect
//  Created on:      07-Sep-2020 8:12:52 AM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.model.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.ebs.model.WorkflowStatusTypeModel;
import org.ebs.util.RepositoryExt;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 07-Sep-2020 8:12:52 AM
 */
public interface WorkflowStatusTypeRepository extends JpaRepository<WorkflowStatusTypeModel,Integer>, RepositoryExt<WorkflowStatusTypeModel> {

}