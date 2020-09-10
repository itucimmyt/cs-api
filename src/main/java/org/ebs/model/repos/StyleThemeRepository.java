///////////////////////////////////////////////////////////
//  StyleThemeRepository.java
//  Macromedia ActionScript Implementation of the Interface StyleThemeRepository
//  Generated by Enterprise Architect
//  Created on:      10-Sep-2020 12:20:19 AM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.model.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.ebs.model.StyleThemeModel;
import org.ebs.util.RepositoryExt;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 10-Sep-2020 12:20:19 AM
 */
public interface StyleThemeRepository extends JpaRepository<StyleThemeModel,Integer>, RepositoryExt<StyleThemeModel> {

}