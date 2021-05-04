///////////////////////////////////////////////////////////
//  PersonStatusInput.java
//  Macromedia ActionScript Implementation of the Class PersonStatusInput
//  Generated by Enterprise Architect
//  Created on:      02-May-2021 6:19:55 AM
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
 * @created 02-May-2021 6:19:55 AM
 */
@Getter @Setter
public class PersonStatusInput implements Serializable {

	private static final long serialVersionUID = 113843661;
	private int id;
	private int tenant;
	private String name;
	private String description;

}