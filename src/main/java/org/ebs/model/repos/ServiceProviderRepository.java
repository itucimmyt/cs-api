///////////////////////////////////////////////////////////
//  ServiceProviderRepository.java
//  Macromedia ActionScript Implementation of the Interface ServiceProviderRepository
//  Generated by Enterprise Architect
//  Created on:      17-May-2020 3:10:16 PM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.model.repos;

import org.ebs.model.ServiceProviderModel;
import org.ebs.util.RepositoryExt;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 17-May-2020 3:10:16 PM
 */
public interface ServiceProviderRepository extends JpaRepository<ServiceProviderModel,Integer>, RepositoryExt<ServiceProviderModel> {

}