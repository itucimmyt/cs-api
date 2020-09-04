///////////////////////////////////////////////////////////
//  WorkflowStatusTo.java
//  Macromedia ActionScript Implementation of the Class WorkflowStatusTo
//  Generated by Enterprise Architect
//  Created on:      04-Sep-2020 10:06:50 AM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.services.to;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 04-Sep-2020 10:06:50 AM
 */
@Getter @Setter
public class WorkflowStatusTo implements Serializable {

	private static final long serialVersionUID = -51204903;
	private int id;
	private int tenant;
	private Date initiatedate;
	private Date completiondate;
	private WorkflowStatusTypeTo workflowstatustype;
	private WorkflowInstanceTo workflowinstance;

	@Override
	public String toString(){
		return "WorkflowStatusTo []";
	}

}