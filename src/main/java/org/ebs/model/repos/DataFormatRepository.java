///////////////////////////////////////////////////////////
//  DataFormatRepository.java
//  Macromedia ActionScript Implementation of the Interface DataFormatRepository
//  Generated by Enterprise Architect
//  Created on:      27-Jul-2020 8:42:24 AM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.model.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.ebs.model.DataFormatModel;
import org.ebs.util.RepositoryExt;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 27-Jul-2020 8:42:24 AM
 */
public interface DataFormatRepository extends JpaRepository<DataFormatModel,Integer>, RepositoryExt<DataFormatModel> {

}