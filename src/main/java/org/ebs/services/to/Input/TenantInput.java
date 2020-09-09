///////////////////////////////////////////////////////////
//  TenantInput.java
//  Macromedia ActionScript Implementation of the Class TenantInput
//  Generated by Enterprise Architect
//  Created on:      07-Sep-2020 8:12:18 AM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.services.to.Input;

import java.io.Serializable;
import java.util.Date;

import lombok.Getter;
import lombok.Setter;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 07-Sep-2020 8:12:18 AM
 */
@Getter @Setter
public class TenantInput implements Serializable {

	private static final long serialVersionUID = 110049102;
	private int id;
	private String name;
	private Date expiration;
	private boolean expire;
	private OrganizationInput organization;
	private AuthenticationTypeInput authenticationType;
	private CustomerInput customer;

}