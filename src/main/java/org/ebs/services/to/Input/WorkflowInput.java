///////////////////////////////////////////////////////////
//  WorkflowInput.java
//  Macromedia ActionScript Implementation of the Class WorkflowInput
//  Generated by Enterprise Architect
//  Created on:      04-Sep-2020 10:06:34 AM
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
 * @created 04-Sep-2020 10:06:34 AM
 */
@Getter @Setter
public class WorkflowInput implements Serializable {

	private static final long serialVersionUID = 285608005;
	private int id;
	private String title;
	private String name;
	private String description;
	private String help;
	private Integer sortno;
	private String definition;
	private String icon;
	private EntityReferenceInput entityreference;
	private TenantInput tenant;
	private HtmlTagInput htmltag;
	private WorkflowNodeInput workflownode;

}