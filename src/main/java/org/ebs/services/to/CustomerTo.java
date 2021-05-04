///////////////////////////////////////////////////////////
//  CustomerTo.java
//  Macromedia ActionScript Implementation of the Class CustomerTo
//  Generated by Enterprise Architect
//  Created on:      02-May-2021 6:19:45 AM
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
 * @created 02-May-2021 6:19:45 AM
 */
@Getter @Setter
public class CustomerTo implements Serializable {

	private static final long serialVersionUID = -393557983;
	private int id;
	private String name;
	private String phone;
	private String officialEmail;
	private String alternateEmail;
	private String jobTitle;
	private String languagePreference;
	private String phoneExtension;
	private boolean isActive;
	private String logo;
	private Set<OrganizationTo> organizations;
	private OrganizationTo organization;
	private Set<TenantTo> tenants;

	@Override
	public String toString(){
		return "CustomerTo [isActive=" + isActive + ",]";
	}

}