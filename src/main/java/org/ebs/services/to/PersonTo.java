///////////////////////////////////////////////////////////
//  PersonTo.java
//  Macromedia ActionScript Implementation of the Class PersonTo
//  Generated by Enterprise Architect
//  Created on:      10-Sep-2020 10:44:12 PM
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
 * @created 10-Sep-2020 10:44:12 PM
 */
@Getter @Setter
public class PersonTo implements Serializable {

	private static final long serialVersionUID = 442989297;
	private int id;
	private String giveName;
	private String familyName;
	private String additionalName;
	private String email;
	private String officialEmail;
	private String gender;
	private boolean hasCredential;
	private String jobTitle;
	private String knowsAbout;
	private String phone;
	private String status;
	private Set<RequestTo> requests;
	private Set<AddressTo> addresss;
	private TenantTo tenant;
	private Set<CollaboratorTo> collaborators;
	private LanguageTo language;
	private Set<DonorTo> donors;
	private Set<PartnerTo> partners;
	private Set<VendorTo> vendors;
	private Set<ProjectTo> projects;
	private Set<UserTo> users;
	private Set<TeamTo> teams;

	@Override
	public String toString(){
		return "PersonTo [hasCredential=" + hasCredential + ",]";
	}

}