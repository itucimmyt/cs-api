///////////////////////////////////////////////////////////
//  RoleActionTo.java
//  Macromedia ActionScript Implementation of the Class RoleActionTo
//  Generated by Enterprise Architect
//  Created on:      07-Sep-2020 8:12:00 AM
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
 * @created 07-Sep-2020 8:12:00 AM
 */
@Getter @Setter
public class RoleActionTo implements Serializable {

	private static final long serialVersionUID = -93327076;
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