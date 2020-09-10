///////////////////////////////////////////////////////////
//  AuthenticationTypeRepository.java
//  Macromedia ActionScript Implementation of the Interface AuthenticationTypeRepository
//  Generated by Enterprise Architect
//  Created on:      10-Sep-2020 12:18:57 AM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.model.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.ebs.model.AuthenticationTypeModel;
import org.ebs.util.RepositoryExt;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 10-Sep-2020 12:18:57 AM
 */
public interface AuthenticationTypeRepository extends JpaRepository<AuthenticationTypeModel,Integer>, RepositoryExt<AuthenticationTypeModel> {

}