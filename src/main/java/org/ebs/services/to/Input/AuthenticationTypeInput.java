///////////////////////////////////////////////////////////
//  AuthenticationTypeInput.java
//  Macromedia ActionScript Implementation of the Class AuthenticationTypeInput
//  Generated by Enterprise Architect
//  Created on:      10-Sep-2020 10:43:25 PM
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
 * @created 10-Sep-2020 10:43:25 PM
 */
@Getter @Setter
public class AuthenticationTypeInput implements Serializable {

	private static final long serialVersionUID = 516948365;
	private int id;
	private int tenant;
	private String name;
	private String protocol;
	private String clientId;
	private String tenantId;
	private String keySecret;
	private String objectId;
	private Boolean isDefault;

}