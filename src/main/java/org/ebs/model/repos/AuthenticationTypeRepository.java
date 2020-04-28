///////////////////////////////////////////////////////////
//  AuthenticationTypeRepository.java
//  Macromedia ActionScript Implementation of the Interface AuthenticationTypeRepository
//  Generated by Enterprise Architect
//  Created on:      28-Apr-2020 12:06:54 AM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.model.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.ebs.util.RepositoryExt;
import java.util.List;
import org.ebs.model.AuthenticationTypeModel;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 28-Apr-2020 12:06:54 AM
 */
public interface AuthenticationTypeRepository extends JpaRepository<AuthenticationTypeModel,Integer>, RepositoryExt<AuthenticationTypeModel> {

}