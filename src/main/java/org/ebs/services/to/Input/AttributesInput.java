///////////////////////////////////////////////////////////
//  AttributesInput.java
//  Macromedia ActionScript Implementation of the Class AttributesInput
//  Generated by Enterprise Architect
//  Created on:      04-Sep-2020 10:04:42 AM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.services.to.Input;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 04-Sep-2020 10:04:42 AM
 */
@Getter @Setter
public class AttributesInput implements Serializable {

	private static final long serialVersionUID = 410979604;
	private int id;
	private String name;
	private String description;
	private String help;
	private int sortno;
	private String attcomponent;
	private boolean ismultiline;
	private boolean isrequired;
	private String defaultvalue;
	private int sm;
	private int md;
	private EntityReferenceInput entityreference;
	private HtmlTagInput htmltag;

}