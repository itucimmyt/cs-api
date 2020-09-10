///////////////////////////////////////////////////////////
//  WorkflowPhaseTo.java
//  Macromedia ActionScript Implementation of the Class WorkflowPhaseTo
//  Generated by Enterprise Architect
//  Created on:      10-Sep-2020 12:20:55 AM
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
 * @created 10-Sep-2020 12:20:55 AM
 */
@Getter @Setter
public class WorkflowPhaseTo implements Serializable {

	private static final long serialVersionUID = -15573988;
	private int id;
	private int tenant;
	private String name;
	private String description;
	private String help;
	private int sequence;
	private Set<WorkflowStageTo> workflowstages;
	private WorkflowTo workflow;
	private HtmlTagTo htmltag;

	@Override
	public String toString(){
		return "WorkflowPhaseTo [sequence=" + sequence + ",]";
	}

}