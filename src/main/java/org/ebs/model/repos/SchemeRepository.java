///////////////////////////////////////////////////////////
//  SchemeRepository.java
//  Macromedia ActionScript Implementation of the Interface SchemeRepository
//  Generated by Enterprise Architect
//  Created on:      13-Jul-2020 5:07:15 PM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.model.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.ebs.model.SchemeModel;
import org.ebs.util.RepositoryExt;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 13-Jul-2020 5:07:15 PM
 */
public interface SchemeRepository extends JpaRepository<SchemeModel,Integer>, RepositoryExt<SchemeModel> {

}