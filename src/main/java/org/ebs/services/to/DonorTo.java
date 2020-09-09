///////////////////////////////////////////////////////////
//  DonorTo.java
//  Macromedia ActionScript Implementation of the Class DonorTo
//  Generated by Enterprise Architect
//  Created on:      07-Sep-2020 8:11:13 AM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.services.to;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 07-Sep-2020 8:11:13 AM
 */
@Getter @Setter
public class DonorTo implements Serializable {

	private static final long serialVersionUID = -400605958;
	private int id;
	private int tenant;
	private String affiliation;
	private String contactPoint;
	private String indentifier;
	private PersonTo person;

	@Override
	public String toString(){
		return "DonorTo []";
	}

}