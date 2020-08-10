///////////////////////////////////////////////////////////
//  SeasonRepository.java
//  Macromedia ActionScript Implementation of the Interface SeasonRepository
//  Generated by Enterprise Architect
//  Created on:      09-Aug-2020 4:51:24 PM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.model.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.ebs.model.SeasonModel;
import org.ebs.util.RepositoryExt;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 09-Aug-2020 4:51:24 PM
 */
public interface SeasonRepository extends JpaRepository<SeasonModel,Integer>, RepositoryExt<SeasonModel> {

}