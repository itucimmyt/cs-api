///////////////////////////////////////////////////////////
//  ThemeStyleRepository.java
//  Macromedia ActionScript Implementation of the Interface ThemeStyleRepository
//  Generated by Enterprise Architect
//  Created on:      28-Apr-2020 12:07:15 AM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.model.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.ebs.util.RepositoryExt;
import java.util.List;
import org.ebs.model.ThemeStyleModel;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 28-Apr-2020 12:07:15 AM
 */
public interface ThemeStyleRepository extends JpaRepository<ThemeStyleModel,Integer>, RepositoryExt<ThemeStyleModel> {

}