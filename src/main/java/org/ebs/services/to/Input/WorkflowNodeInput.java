///////////////////////////////////////////////////////////
//  WorkflowNodeInput.java
//  Macromedia ActionScript Implementation of the Class WorkflowNodeInput
//  Generated by Enterprise Architect
//  Created on:      07-Sep-2020 8:12:42 AM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.services.to.Input;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 07-Sep-2020 8:12:42 AM
 */
@Getter @Setter
public class WorkflowNodeInput implements Serializable {

	private static final long serialVersionUID = -451128349;
	private int id;
	private int tenant;
	private String name;
	private String description;
	private String help;
	private int sequence;
	private boolean requireapproval;
	private WorkflowInput workflow;
	private EntityReferenceInput entityReference;
	private HtmlTagInput htmlTag;
	private ProcessInput process;
	private ModuleInput module;

}