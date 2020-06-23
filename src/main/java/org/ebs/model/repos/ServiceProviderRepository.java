///////////////////////////////////////////////////////////
//  ServiceProviderRepository.java
//  Macromedia ActionScript Implementation of the Interface ServiceProviderRepository
//  Generated by Enterprise Architect
//  Created on:      15-Jun-2020 5:14:25 PM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.model.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.ebs.model.ServiceProviderModel;
import org.ebs.util.RepositoryExt;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 15-Jun-2020 5:14:25 PM
 */
public interface ServiceProviderRepository extends JpaRepository<ServiceProviderModel,Integer>, RepositoryExt<ServiceProviderModel> {

}