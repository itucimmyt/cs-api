///////////////////////////////////////////////////////////
//  RoleRepository.java
//  Macromedia ActionScript Implementation of the Interface RoleRepository
//  Generated by Enterprise Architect
//  Created on:      15-Jun-2020 5:14:19 PM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.model.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.ebs.model.RoleModel;
import org.ebs.util.RepositoryExt;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 15-Jun-2020 5:14:19 PM
 */
public interface RoleRepository extends JpaRepository<RoleModel,Integer>, RepositoryExt<RoleModel> {

}