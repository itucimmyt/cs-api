///////////////////////////////////////////////////////////
//  AddressRepository.java
//  Macromedia ActionScript Implementation of the Interface AddressRepository
//  Generated by Enterprise Architect
//  Created on:      13-Jul-2020 5:06:07 PM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.model.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.ebs.model.AddressModel;
import org.ebs.util.RepositoryExt;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 13-Jul-2020 5:06:07 PM
 */
public interface AddressRepository extends JpaRepository<AddressModel,Integer>, RepositoryExt<AddressModel> {

}