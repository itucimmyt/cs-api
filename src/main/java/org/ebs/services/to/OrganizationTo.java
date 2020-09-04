///////////////////////////////////////////////////////////
//  OrganizationTo.java
//  Macromedia ActionScript Implementation of the Class OrganizationTo
//  Generated by Enterprise Architect
//  Created on:      04-Sep-2020 10:05:32 AM
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
 * @created 04-Sep-2020 10:05:32 AM
 */
@Getter @Setter
public class OrganizationTo implements Serializable {

	private static final long serialVersionUID = -218806380;
	private int id;
	private String legalname;
	private String phone;
	private String webpage;
	private String slogan;
	private String name;
	private String taxid;
	private String logo;
	private String isactive;
	private int defaultauthentication;
	private int defaulttheme;
	private String organizationcode;
	private Set<TenantTo> tenants;
	private CustomerTo customer;
	private Set<CustomerTo> customers;

	@Override
	public String toString(){
		return "OrganizationTo [defaultauthentication=" + defaultauthentication + ",defaulttheme=" + defaulttheme + ",]";
	}

}