///////////////////////////////////////////////////////////
//  PipelineRepository.java
//  Macromedia ActionScript Implementation of the Interface PipelineRepository
//  Generated by Enterprise Architect
//  Created on:      17-May-2020 3:09:56 PM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.model.repos;

import org.ebs.model.PipelineModel;
import org.ebs.util.RepositoryExt;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 17-May-2020 3:09:56 PM
 */
public interface PipelineRepository extends JpaRepository<PipelineModel,Integer>, RepositoryExt<PipelineModel> {

}