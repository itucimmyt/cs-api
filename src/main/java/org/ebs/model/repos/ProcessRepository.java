///////////////////////////////////////////////////////////
//  ProcessRepository.java
//  Macromedia ActionScript Implementation of the Interface ProcessRepository
//  Generated by Enterprise Architect
//  Created on:      27-Jul-2020 8:43:08 AM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.model.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.ebs.model.ProcessModel;
import org.ebs.util.RepositoryExt;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 27-Jul-2020 8:43:08 AM
 */
public interface ProcessRepository extends JpaRepository<ProcessModel,Integer>, RepositoryExt<ProcessModel> {

}