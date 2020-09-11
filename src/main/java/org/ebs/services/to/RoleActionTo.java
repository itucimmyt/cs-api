///////////////////////////////////////////////////////////
//  RoleActionTo.java
//  Macromedia ActionScript Implementation of the Class RoleActionTo
//  Generated by Enterprise Architect
//  Created on:      10-Sep-2020 10:44:27 PM
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
 * @created 10-Sep-2020 10:44:27 PM
 */
@Getter @Setter
public class RoleActionTo implements Serializable {

	private static final long serialVersionUID = -203531545;
	private int id;
	private int tenant;
	private int allow;
	private ActionTo action;
	private RoleTo role;

	@Override
	public String toString(){
		return "RoleActionTo [allow=" + allow + ",]";
	}

}