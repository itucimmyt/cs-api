///////////////////////////////////////////////////////////
//  AuditLogsResolver.java
//  Macromedia ActionScript Implementation of the Class AuditLogsResolver
//  Generated by Enterprise Architect
//  Created on:      13-Jul-2020 5:06:14 PM
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
 * @created 13-Jul-2020 5:06:14 PM
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