///////////////////////////////////////////////////////////
//  AttributesTo.java
//  Macromedia ActionScript Implementation of the Class AttributesTo
//  Generated by Enterprise Architect
//  Created on:      10-Sep-2020 12:18:55 AM
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
 * @created 10-Sep-2020 12:18:55 AM
 */
@Getter @Setter
public class AttributesTo implements Serializable {

	private static final long serialVersionUID = 51339424;
	private int id;
	private String name;
	private String description;
	private String help;
	private int sortno;
	private String attComponent;
	private boolean ismultiline;
	private boolean isrequired;
	private String defaultValue;
	private int sm;
	private int md;
	private EntityReferenceTo entityreference;
	private HtmlTagTo htmltag;

	@Override
	public String toString(){
		return "AttributesTo [sortno=" + sortno + ",is_multiline=" + ismultiline + ",is_required=" + isrequired + ",sm=" + sm + ",md=" + md + ",]";
	}

}