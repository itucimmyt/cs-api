///////////////////////////////////////////////////////////
//  TenantTo.java
//  Macromedia ActionScript Implementation of the Class TenantTo
//  Generated by Enterprise Architect
//  Created on:      04-Sep-2020 10:06:17 AM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.services.to;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 04-Sep-2020 10:06:17 AM
 */
@Getter @Setter
public class TenantTo implements Serializable {

	private static final long serialVersionUID = -437131736;
	private int id;
	private String name;
	private Date expiration;
	private boolean expire;
	private Set<EmailTemplateTo> emailtemplates;
	private Set<ProgramTo> programs;
	private Set<UserTo> users;
	private Set<InstanceTo> instances;
	private Set<WorkflowTo> workflows;
	private OrganizationTo organization;
	private AuthenticationTypeTo authenticationtype;
	private Set<NumberSequenceRuleTo> numbersequencerules;
	private CustomerTo customer;
	private Set<PersonTo> persons;

	@Override
	public String toString(){
		return "TenantTo [expire=" + expire + ",]";
	}

}