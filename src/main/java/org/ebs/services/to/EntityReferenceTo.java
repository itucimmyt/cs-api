///////////////////////////////////////////////////////////
//  EntityReferenceTo.java
//  Macromedia ActionScript Implementation of the Class EntityReferenceTo
//  Generated by Enterprise Architect
//  Created on:      04-Sep-2020 10:05:07 AM
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
 * @created 04-Sep-2020 10:05:07 AM
 */
@Getter @Setter
public class EntityReferenceTo implements Serializable {

	private static final long serialVersionUID = 133910516;
	private int id;
	private int tenant;
	private String entity;
	private String textfield;
	private String valuefield;
	private String storefield;
	private String entityschema;
	private Set<AttributesTo> attributess;
	private Set<EmailTemplateTo> emailtemplates;
	private Set<WorkflowTo> workflows;
	private Set<SegmentTo> segments;
	private Set<WorkflowNodeTo> workflownodes;
	private Set<NumberSequenceRuleTo> numbersequencerules;
	private Set<WorkflowNodeCFTo> workflownodecfs;

	@Override
	public String toString(){
		return "EntityReferenceTo []";
	}

}