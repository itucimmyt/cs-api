///////////////////////////////////////////////////////////
//  VendorTo.java
//  Macromedia ActionScript Implementation of the Class VendorTo
//  Generated by Enterprise Architect
//  Created on:      10-Sep-2020 10:44:59 PM
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
 * @created 10-Sep-2020 10:44:59 PM
 */
@Getter @Setter
public class VendorTo implements Serializable {

	private static final long serialVersionUID = -166321377;
	private int id;
	private int tenant;
	private String code;
	private String reference;
	private String status;
	private DataFormatTo dataformat;
	private Set<ServiceTo> services;
	private TechnologyPlatformTo technologyplatform;
	private Set<MarkerTo> markers;
	private PersonTo person;

	@Override
	public String toString(){
		return "VendorTo []";
	}

}