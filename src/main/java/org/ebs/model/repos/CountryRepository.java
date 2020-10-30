///////////////////////////////////////////////////////////
//  CountryRepository.java
//  Macromedia ActionScript Implementation of the Interface CountryRepository
//  Generated by Enterprise Architect
//  Created on:      10-Sep-2020 10:43:31 PM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.model.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.ebs.model.CountryModel;
import org.ebs.util.RepositoryExt;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 10-Sep-2020 10:43:31 PM
 */
public interface CountryRepository extends JpaRepository<CountryModel,Integer>, RepositoryExt<CountryModel> {

}