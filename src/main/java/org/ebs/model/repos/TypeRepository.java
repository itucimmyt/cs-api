///////////////////////////////////////////////////////////
//  TypeRepository.java
//  Macromedia ActionScript Implementation of the Interface TypeRepository
//  Generated by Enterprise Architect
//  Created on:      02-May-2021 6:20:04 AM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.model.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.ebs.model.TypeModel;
import org.ebs.util.RepositoryExt;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 02-May-2021 6:20:04 AM
 */
public interface TypeRepository extends JpaRepository<TypeModel,Integer>, RepositoryExt<TypeModel> {

}