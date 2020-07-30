///////////////////////////////////////////////////////////
//  EntityReferenceRepository.java
//  Macromedia ActionScript Implementation of the Interface EntityReferenceRepository
//  Generated by Enterprise Architect
//  Created on:      27-Jul-2020 8:42:32 AM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.model.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.ebs.model.EntityReferenceModel;
import org.ebs.util.RepositoryExt;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 27-Jul-2020 8:42:32 AM
 */
public interface EntityReferenceRepository extends JpaRepository<EntityReferenceModel,Integer>, RepositoryExt<EntityReferenceModel> {

}