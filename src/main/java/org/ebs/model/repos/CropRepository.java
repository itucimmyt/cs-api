///////////////////////////////////////////////////////////
//  CropRepository.java
//  Macromedia ActionScript Implementation of the Interface CropRepository
//  Generated by Enterprise Architect
//  Created on:      27-Jul-2020 8:42:19 AM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.model.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.ebs.model.CropModel;
import org.ebs.util.RepositoryExt;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 27-Jul-2020 8:42:19 AM
 */
public interface CropRepository extends JpaRepository<CropModel,Integer>, RepositoryExt<CropModel> {

}