///////////////////////////////////////////////////////////
//  RoleRepository.java
//  Macromedia ActionScript Implementation of the Interface RoleRepository
//  Generated by Enterprise Architect
//  Created on:      10-Sep-2020 12:20:04 AM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.model.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.ebs.model.RoleModel;
import org.ebs.util.RepositoryExt;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 10-Sep-2020 12:20:04 AM
 */
public interface RoleRepository extends JpaRepository<RoleModel,Integer>, RepositoryExt<RoleModel> {

}