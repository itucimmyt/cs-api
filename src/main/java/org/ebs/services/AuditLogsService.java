///////////////////////////////////////////////////////////
//  AuditLogsService.java
//  Macromedia ActionScript Implementation of the Interface AuditLogsService
//  Generated by Enterprise Architect
//  Created on:      15-Jun-2020 5:13:16 PM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.services;

import java.util.List;
import java.util.Optional;
import org.ebs.util.FilterInput;
import org.ebs.util.PageInput;
import org.ebs.util.SortInput;
import org.springframework.data.domain.Page;
import org.ebs.services.to.AuditLogsTo;
import org.ebs.services.to.Input.AuditLogsInput;
import org.ebs.services.to.InstanceTo;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 15-Jun-2020 5:13:16 PM
 */
public interface AuditLogsService {

	/**
	 * 
	 * @param AuditLogs
	 */
	public AuditLogsTo createAuditLogs(AuditLogsInput AuditLogs);

	/**
	 * 
	 * @param auditlogsId
	 */
	public int deleteAuditLogs(int auditlogsId);

	/**
	 * 
	 * @param auditlogsId
	 */
	public Optional<AuditLogsTo> findAuditLogs(int auditlogsId);

	/**
	 * 
	 * @param page
	 * @param sort
	 * @param filters
	 */
	public Page<AuditLogsTo> findAuditLogss(PageInput page, SortInput sort, List<FilterInput> filters);

	/**
	 * 
	 * @param auditlogsId
	 */
	public Optional<InstanceTo> findInstance(int auditlogsId);

	/**
	 * 
	 * @param auditlogs
	 */
	public AuditLogsTo modifyAuditLogs(AuditLogsInput auditlogs);

}