///////////////////////////////////////////////////////////
//  AlertRuleRepository.java
//  Macromedia ActionScript Implementation of the Interface AlertRuleRepository
//  Generated by Enterprise Architect
//  Created on:      15-Jun-2020 5:13:07 PM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.model.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.ebs.model.AlertRuleModel;
import org.ebs.util.RepositoryExt;
import java.util.List;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 15-Jun-2020 5:13:07 PM
 */
public interface AlertRuleRepository extends JpaRepository<AlertRuleModel,Integer>, RepositoryExt<AlertRuleModel> {

	/**
	 * 
	 * @param alertId
	 */
	public List<AlertRuleModel> findByAlertId(int alertId);

}