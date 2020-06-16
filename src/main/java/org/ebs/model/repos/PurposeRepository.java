///////////////////////////////////////////////////////////
//  PurposeRepository.java
//  Macromedia ActionScript Implementation of the Interface PurposeRepository
//  Generated by Enterprise Architect
//  Created on:      15-Jun-2020 5:14:08 PM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.model.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.ebs.model.PurposeModel;
import org.ebs.util.RepositoryExt;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 15-Jun-2020 5:14:08 PM
 */
public interface PurposeRepository extends JpaRepository<PurposeModel,Integer>, RepositoryExt<PurposeModel> {

}