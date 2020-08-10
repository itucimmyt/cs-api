///////////////////////////////////////////////////////////
//  NumberSequenceRuleRepository.java
//  Macromedia ActionScript Implementation of the Interface NumberSequenceRuleRepository
//  Generated by Enterprise Architect
//  Created on:      09-Aug-2020 4:50:58 PM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.model.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.ebs.model.NumberSequenceRuleModel;
import org.ebs.util.RepositoryExt;
import java.util.List;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 09-Aug-2020 4:50:58 PM
 */
public interface NumberSequenceRuleRepository extends JpaRepository<NumberSequenceRuleModel,Integer>, RepositoryExt<NumberSequenceRuleModel> {

	/**
	 * 
	 * @param tenantId
	 */
	public List<NumberSequenceRuleModel> findByTenantId(int tenantId);

}