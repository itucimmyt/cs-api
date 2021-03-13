///////////////////////////////////////////////////////////
//  AttributesInput.java
//  Macromedia ActionScript Implementation of the Class AttributesInput
//  Generated by Enterprise Architect
//  Created on:      13-Mar-2021 12:02:20 AM
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
 * @created 13-Mar-2021 12:02:20 AM
 */
@Getter @Setter
public class AttributesInput implements Serializable {

	private static final long serialVersionUID = 106940290;
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