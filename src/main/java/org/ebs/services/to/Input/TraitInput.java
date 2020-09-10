///////////////////////////////////////////////////////////
//  TraitInput.java
//  Macromedia ActionScript Implementation of the Class TraitInput
//  Generated by Enterprise Architect
//  Created on:      10-Sep-2020 12:20:32 AM
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
 * @created 10-Sep-2020 12:20:32 AM
 */
@Getter @Setter
public class TraitInput implements Serializable {

	private static final long serialVersionUID = 105608772;
	private int id;
	private int tenant;
	private String name;
	private String description;
	private TraitClassInput traitclass;

}