///////////////////////////////////////////////////////////
//  ProcessRepository.java
//  Macromedia ActionScript Implementation of the Interface ProcessRepository
//  Generated by Enterprise Architect
//  Created on:      20-Aug-2020 1:06:11 PM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.model.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.ebs.model.ProcessModel;
import org.ebs.util.RepositoryExt;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 20-Aug-2020 1:06:11 PM
 */
public interface ProcessRepository extends JpaRepository<ProcessModel,Integer>, RepositoryExt<ProcessModel> {

}