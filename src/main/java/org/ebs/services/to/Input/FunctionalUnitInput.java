///////////////////////////////////////////////////////////
//  FunctionalUnitInput.java
//  Macromedia ActionScript Implementation of the Class FunctionalUnitInput
//  Generated by Enterprise Architect
//  Created on:      02-May-2021 6:19:49 AM
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
 * @created 02-May-2021 6:19:49 AM
 */
@Getter @Setter
public class FunctionalUnitInput implements Serializable {

	private static final long serialVersionUID = -130768809;
	private int id;
	private int tenant;
	private String code;
	private String name;
	private String description;
	private String notes;
	private String type;
	private ProgramInput program;

}