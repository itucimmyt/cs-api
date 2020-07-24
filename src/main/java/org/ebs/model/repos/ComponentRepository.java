///////////////////////////////////////////////////////////
//  ComponentRepository.java
//  Macromedia ActionScript Implementation of the Interface ComponentRepository
//  Generated by Enterprise Architect
//  Created on:      23-Jul-2020 10:46:13 PM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.model.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.ebs.model.ComponentModel;
import org.ebs.util.RepositoryExt;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 23-Jul-2020 10:46:13 PM
 */
public interface ComponentRepository extends JpaRepository<ComponentModel,Integer>, RepositoryExt<ComponentModel> {

}