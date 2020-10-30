///////////////////////////////////////////////////////////
//  WorkflowNodeCFInput.java
//  Macromedia ActionScript Implementation of the Class WorkflowNodeCFInput
//  Generated by Enterprise Architect
//  Created on:      10-Sep-2020 10:45:07 PM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.services.to.Input;

import java.io.Serializable;
import java.util.Set;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 10-Sep-2020 10:45:07 PM
 */
@Getter @Setter
public class WorkflowNodeCFInput implements Serializable {

	private static final long serialVersionUID = 214916573;
	private int id;
	private int tenant;
	private String name;
	private String description;
	private String help;
	private boolean required;
	private WorkflowCFTypeInput workflowcftype;
	private HtmlTagInput htmltag;
	private EntityReferenceInput entityreference;
	private WorkflowNodeInput workflownode;

}