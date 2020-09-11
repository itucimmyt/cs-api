///////////////////////////////////////////////////////////
//  PartnerTo.java
//  Macromedia ActionScript Implementation of the Class PartnerTo
//  Generated by Enterprise Architect
//  Created on:      10-Sep-2020 10:44:09 PM
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
 * @created 10-Sep-2020 10:44:09 PM
 */
@Getter @Setter
public class PartnerTo implements Serializable {

	private static final long serialVersionUID = 122216090;
	private int id;
	private int tenant;
	private String affiliation;
	private String contactPoint;
	private String indentifier;
	private PersonTo person;

	@Override
	public String toString(){
		return "PartnerTo []";
	}

}