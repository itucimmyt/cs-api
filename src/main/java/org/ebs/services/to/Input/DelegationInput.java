///////////////////////////////////////////////////////////
//  DelegationInput.java
//  Macromedia ActionScript Implementation of the Class DelegationInput
//  Generated by Enterprise Architect
//  Created on:      02-May-2021 6:19:45 AM
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
 * @created 02-May-2021 6:19:45 AM
 */
@Getter @Setter
public class DelegationInput implements Serializable {

	private static final long serialVersionUID = 348877983;
	private int id;
	private int tenant;
	private Date startDate;
	private Date endDate;
	private String delegateTo;
	private UserInput user;

}