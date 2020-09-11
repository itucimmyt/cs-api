///////////////////////////////////////////////////////////
//  AssayGeneTo.java
//  Macromedia ActionScript Implementation of the Class AssayGeneTo
//  Generated by Enterprise Architect
//  Created on:      10-Sep-2020 10:43:21 PM
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
 * @created 10-Sep-2020 10:43:21 PM
 */
@Getter @Setter
public class AssayGeneTo implements Serializable {

	private static final long serialVersionUID = 56959020;
	private int id;
	private int tenant;
	private String name;
	private String description;
	private TraitTo trait;
	private Set<MarkerTo> markers;

	@Override
	public String toString(){
		return "AssayGeneTo []";
	}

}