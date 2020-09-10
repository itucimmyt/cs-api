///////////////////////////////////////////////////////////
//  UserInput.java
//  Macromedia ActionScript Implementation of the Class UserInput
//  Generated by Enterprise Architect
//  Created on:      10-Sep-2020 12:20:36 AM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.services.to.Input;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 10-Sep-2020 12:20:36 AM
 */
@Getter @Setter
public class UserInput implements Serializable {

	private static final long serialVersionUID = 101316490;
	private int id;
	private String userName;
	private String userPassword;
	private Date lastAccess;
	private int defaultRole;
	private int isIS;
	private TenantInput tenant;
	private PersonInput person;

}