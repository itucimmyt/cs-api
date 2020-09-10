///////////////////////////////////////////////////////////
//  ServiceTo.java
//  Macromedia ActionScript Implementation of the Class ServiceTo
//  Generated by Enterprise Architect
//  Created on:      10-Sep-2020 12:20:14 AM
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
 * @created 10-Sep-2020 12:20:14 AM
 */
@Getter @Setter
public class ServiceTo implements Serializable {

	private static final long serialVersionUID = 408101833;
	private int id;
	private int tenant;
	private String name;
	private String description;
	private String code;
	private PurposeTo purpose;
	private Set<AssayclassTo> assayclasss;
	private Set<VendorTo> vendors;

	@Override
	public String toString(){
		return "ServiceTo []";
	}

}