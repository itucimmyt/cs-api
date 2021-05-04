///////////////////////////////////////////////////////////
//  AttributesInput.java
//  Macromedia ActionScript Implementation of the Class AttributesInput
//  Generated by Enterprise Architect
//  Created on:      02-May-2021 6:19:42 AM
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
 * @created 02-May-2021 6:19:42 AM
 */
@Getter @Setter
public class AttributesInput implements Serializable {

	private static final long serialVersionUID = 122798933;
	private int id;
	private String name;
	private String description;
	private String help;
	private int sortNo;
	private String attComponent;
	private boolean isMultiline;
	private boolean isRequired;
	private String defaultValue;
	private int sm;
	private int md;
	private int lg;
	private EntityReferenceInput entityreference;
	private HtmlTagInput htmltag;

}