///////////////////////////////////////////////////////////
//  RoleActionInput.java
//  Macromedia ActionScript Implementation of the Class RoleActionInput
//  Generated by Enterprise Architect
//  Created on:      07-Sep-2020 8:11:59 AM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.services.to.Input;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 07-Sep-2020 8:11:59 AM
 */
@Getter @Setter
public class RoleActionInput implements Serializable {

	private static final long serialVersionUID = -172000918;
	private int id;
	private int tenant;
	private int allow;
	private ActionInput action;
	private RoleInput role;

}