///////////////////////////////////////////////////////////
//  AuditLogsResolver.java
//  Macromedia ActionScript Implementation of the Class AuditLogsResolver
//  Generated by Enterprise Architect
//  Created on:      27-Jul-2020 8:42:11 AM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.graphql.resolvers;

import com.coxautodev.graphql.tools.GraphQLResolver;
import org.ebs.services.to.AuditLogsTo;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.ebs.services.AuditLogsService;
import org.ebs.services.to.InstanceTo;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 27-Jul-2020 8:42:11 AM
 */
@Component @Validated
public class AuditLogsResolver implements GraphQLResolver<AuditLogsTo> {

	private AuditLogsService auditlogsService;

	/**
	 * 
	 * @param auditlogsService
	 */
	@Autowired
	public AuditLogsResolver(AuditLogsService auditlogsService){
		this.auditlogsService = auditlogsService; 
	
	}

	/**
	 * 
	 * @param auditlogsTo
	 */
	public InstanceTo getInstance(AuditLogsTo auditlogsTo){
		return auditlogsService.findInstance(auditlogsTo.getId()).get();
	}

}