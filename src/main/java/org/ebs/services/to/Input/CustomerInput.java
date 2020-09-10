///////////////////////////////////////////////////////////
//  CustomerInput.java
//  Macromedia ActionScript Implementation of the Class CustomerInput
//  Generated by Enterprise Architect
//  Created on:      10-Sep-2020 12:19:06 AM
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
 * @created 10-Sep-2020 12:19:06 AM
 */
@Getter @Setter
public class CustomerInput implements Serializable {

	private static final long serialVersionUID = -36828510;
	private int id;
	private String name;
	private String phone;
	private String officialEmail;
	private String alternateEmail;
	private String jobTitle;
	private String languagePreference;
	private String phoneExtension;
	private String isActive;
	private OrganizationInput organization;

}