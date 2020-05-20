///////////////////////////////////////////////////////////
//  AlertRepository.java
//  Macromedia ActionScript Implementation of the Interface AlertRepository
//  Generated by Enterprise Architect
//  Created on:      17-May-2020 3:09:13 PM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.model.repos;

import org.ebs.model.AlertModel;
import org.ebs.util.RepositoryExt;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 17-May-2020 3:09:13 PM
 */
public interface AlertRepository extends JpaRepository<AlertModel,Integer>, RepositoryExt<AlertModel> {

}