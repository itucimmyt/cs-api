///////////////////////////////////////////////////////////
//  AuditLogsService.java
//  Macromedia ActionScript Implementation of the Interface AuditLogsService
//  Generated by Enterprise Architect
//  Created on:      04-Sep-2020 10:04:45 AM
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
 * @created 04-Sep-2020 10:04:45 AM
 */
public interface AuditLogsService {

	/**
	 * 
	 * @param AuditLogs
	 */
	public AuditLogsTo createauditlogs(AuditLogsInput AuditLogs);

	/**
	 * 
	 * @param auditlogsId
	 */
	public int deleteauditlogs(int auditlogsId);

	/**
	 * 
	 * @param auditlogsId
	 */
	public Optional<AuditLogsTo> findauditlogs(int auditlogsId);

	/**
	 * 
	 * @param page
	 * @param sort
	 * @param filters
	 */
	public Page<AuditLogsTo> findauditlogss(PageInput page, SortInput sort, List<FilterInput> filters);

	/**
	 * 
	 * @param auditlogsId
	 */
	public Optional<InstanceTo> findinstance(int auditlogsId);

	/**
	 * 
	 * @param auditlogs
	 */
	public AuditLogsTo modifyauditlogs(AuditLogsInput auditlogs);

}