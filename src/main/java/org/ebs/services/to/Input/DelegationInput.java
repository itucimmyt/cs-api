///////////////////////////////////////////////////////////
//  DelegationInput.java
//  Macromedia ActionScript Implementation of the Class DelegationInput
//  Generated by Enterprise Architect
//  Created on:      04-Sep-2020 10:05:00 AM
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
 * @created 04-Sep-2020 10:05:00 AM
 */
@Getter @Setter
public class DelegationInput implements Serializable {

	private static final long serialVersionUID = 358015280;
	private int id;
	private int tenant;
	private Date startdate;
	private Date enddate;
	private String delegateto;
	private UserInput user;

}