///////////////////////////////////////////////////////////
//  AuditLogsTo.java
//  Macromedia ActionScript Implementation of the Class AuditLogsTo
//  Generated by Enterprise Architect
//  Created on:      07-Sep-2020 8:10:58 AM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.services.to;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 07-Sep-2020 8:10:58 AM
 */
@Getter @Setter
public class AuditLogsTo implements Serializable {

	private static final long serialVersionUID = -320672373;
	private int id;
	private int tenant;
	private String correlationId;
	private String message;
	private InstanceTo instance;

	@Override
	public String toString(){
		return "AuditLogsTo []";
	}

}