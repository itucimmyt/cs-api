///////////////////////////////////////////////////////////
//  SeasonRepository.java
//  Macromedia ActionScript Implementation of the Interface SeasonRepository
//  Generated by Enterprise Architect
//  Created on:      17-May-2020 3:10:13 PM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.model.repos;

import org.ebs.model.SeasonModel;
import org.ebs.util.RepositoryExt;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 17-May-2020 3:10:13 PM
 */
public interface SeasonRepository extends JpaRepository<SeasonModel,Integer>, RepositoryExt<SeasonModel> {

}