///////////////////////////////////////////////////////////
//  AuthenticationTypeRepository.java
//  Macromedia ActionScript Implementation of the Interface AuthenticationTypeRepository
//  Generated by Enterprise Architect
//  Created on:      27-Apr-2020 9:47:34 AM
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
 * @created 27-Apr-2020 9:47:34 AM
 */
public interface AuthenticationTypeRepository extends JpaRepository<AuthenticationTypeModel,Integer>, RepositoryExt<AuthenticationTypeModel> {

}