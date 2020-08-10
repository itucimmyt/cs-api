///////////////////////////////////////////////////////////
//  teamRepository.java
//  Macromedia ActionScript Implementation of the Interface teamRepository
//  Generated by Enterprise Architect
//  Created on:      09-Aug-2020 4:51:36 PM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.model.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.ebs.model.teamModel;
import org.ebs.util.RepositoryExt;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 09-Aug-2020 4:51:36 PM
 */
public interface teamRepository extends JpaRepository<teamModel,Integer>, RepositoryExt<teamModel> {

}