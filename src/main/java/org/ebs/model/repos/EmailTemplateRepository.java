///////////////////////////////////////////////////////////
//  EmailTemplateRepository.java
//  Macromedia ActionScript Implementation of the Interface EmailTemplateRepository
//  Generated by Enterprise Architect
//  Created on:      10-Sep-2020 12:19:14 AM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.model.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.ebs.model.EmailTemplateModel;
import org.ebs.util.RepositoryExt;
import java.util.List;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 10-Sep-2020 12:19:14 AM
 */
public interface EmailTemplateRepository extends JpaRepository<EmailTemplateModel,Integer>, RepositoryExt<EmailTemplateModel> {

	/**
	 * 
	 * @param tenantId
	 */
	public List<EmailTemplateModel> findByTenantId(int tenantId);

}