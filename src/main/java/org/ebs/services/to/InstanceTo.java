///////////////////////////////////////////////////////////
//  InstanceTo.java
//  Macromedia ActionScript Implementation of the Class InstanceTo
//  Generated by Enterprise Architect
//  Created on:      07-Sep-2020 8:11:22 AM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.services.to;

import java.io.Serializable;
import java.util.Set;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 07-Sep-2020 8:11:22 AM
 */
@Getter @Setter
public class InstanceTo implements Serializable {

	private static final long serialVersionUID = 191664923;
	private int id;
	private String server;
	private String port;
	private String health;
	private Set<SessionTo> sessions;
	private Set<AuditLogsTo> auditLogss;
	private Set<ComponentTo> components;
	private TenantTo tenant;

	@Override
	public String toString(){
		return "InstanceTo []";
	}

}