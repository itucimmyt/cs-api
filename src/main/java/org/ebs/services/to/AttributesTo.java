///////////////////////////////////////////////////////////
//  AttributesTo.java
//  Macromedia ActionScript Implementation of the Class AttributesTo
//  Generated by Enterprise Architect
//  Created on:      07-Sep-2020 8:10:56 AM
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
 * @created 07-Sep-2020 8:10:56 AM
 */
@Getter @Setter
public class AttributesTo implements Serializable {

	private static final long serialVersionUID = -61902819;
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
	private EntityReferenceTo entityReference;
	private HtmlTagTo htmlTag;

	@Override
	public String toString(){
		return "AttributesTo [sortno=" + sortno + ",is_multiline=" + ismultiline + ",is_required=" + isrequired + ",sm=" + sm + ",md=" + md + ",]";
	}

}