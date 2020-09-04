///////////////////////////////////////////////////////////
//  DonorTo.java
//  Macromedia ActionScript Implementation of the Class DonorTo
//  Generated by Enterprise Architect
//  Created on:      04-Sep-2020 10:05:03 AM
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
 * @created 04-Sep-2020 10:05:03 AM
 */
@Getter @Setter
public class DonorTo implements Serializable {

	private static final long serialVersionUID = 19253976;
	private int id;
	private int tenant;
	private String affiliation;
	private String contactpoint;
	private String indentifier;
	private PersonTo person;

	@Override
	public String toString(){
		return "DonorTo []";
	}

}