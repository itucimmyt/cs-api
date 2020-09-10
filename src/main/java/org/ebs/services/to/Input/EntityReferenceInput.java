///////////////////////////////////////////////////////////
//  EntityReferenceInput.java
//  Macromedia ActionScript Implementation of the Class EntityReferenceInput
//  Generated by Enterprise Architect
//  Created on:      10-Sep-2020 12:19:15 AM
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
 * @created 10-Sep-2020 12:19:15 AM
 */
@Getter @Setter
public class EntityReferenceInput implements Serializable {

	private static final long serialVersionUID = -184402936;
	private int id;
	private int tenant;
	private String entity;
	private String textfield;
	private String valuefield;
	private String storefield;
	private String entityschema;
	private Set<EmailTemplateInput> emailtemplates;
	private Set<NumberSequenceRuleInput> numbersequencerules;

}