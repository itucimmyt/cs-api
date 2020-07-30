///////////////////////////////////////////////////////////
//  LanguageRepository.java
//  Macromedia ActionScript Implementation of the Interface LanguageRepository
//  Generated by Enterprise Architect
//  Created on:      27-Jul-2020 8:42:39 AM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.model.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.ebs.model.LanguageModel;
import org.ebs.util.RepositoryExt;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 27-Jul-2020 8:42:39 AM
 */
public interface LanguageRepository extends JpaRepository<LanguageModel,Integer>, RepositoryExt<LanguageModel> {

}