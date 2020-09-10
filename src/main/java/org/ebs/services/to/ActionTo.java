///////////////////////////////////////////////////////////
//  ActionTo.java
//  Macromedia ActionScript Implementation of the Class ActionTo
//  Generated by Enterprise Architect
//  Created on:      10-Sep-2020 12:18:44 AM
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
 * @created 10-Sep-2020 12:18:44 AM
 */
@Getter @Setter
public class ActionTo implements Serializable {

	private static final long serialVersionUID = 386437827;
	private int id;
	private String description;
	private boolean actionType;
	private String action;
	private WorkflowStageTo workflowstage;
	private Set<RoleActionTo> roleactions;
	private WorkflowNodeTo workflownode;
	private Set<RoleTo> roles;
	private ModuleTo module;

	@Override
	public String toString(){
		return "ActionTo [actionType=" + actionType + ",]";
	}

}