///////////////////////////////////////////////////////////
//  PersonModel.java
//  Macromedia ActionScript Implementation of the Class PersonModel
//  Generated by Enterprise Architect
//  Created on:      07-Sep-2020 8:11:42 AM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.model;

import org.ebs.util.Auditable;
import javax.persistence.ManyToMany;
import lombok.Getter;
import lombok.Setter;
import javax.persistence.JoinColumn;
import javax.persistence.FetchType;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 07-Sep-2020 8:11:42 AM
 */
@Entity @Table(name="Person",schema="tenant") @Getter @Setter
public class PersonModel extends Auditable {

	private static final long serialVersionUID = 458870442;
	@Column(name="giveName")
	private String giveName;
	@Column(name="familyName")
	private String familyName;
	@Column(name="additionalName")
	private String additionalName;
	@Column(name="email")
	private String email;
	@Column(name="officialEmail")
	private String officialEmail;
	@Column(name="gender")
	private String gender;
	@Column(name="hasCredential")
	private boolean hasCredential;
	@Column(name="jobTitle")
	private String jobTitle;
	@Column(name="knowsAbout")
	private String knowsAbout;
	@Column(name="phone")
	private String phone;
	@Column(name="status")
	private String status;
	@GeneratedValue(strategy= GenerationType.IDENTITY) @Id @Column
	private int id;
	@OneToMany(mappedBy = "person",fetch=FetchType.LAZY, cascade = CascadeType.ALL)
	private Set<RequestModel> requests;
	@ManyToMany(mappedBy="persons")
	private Set<AddressModel> addresss;
	@ManyToOne(fetch=FetchType.LAZY, optional =true) @JoinColumn(name="tenant_id")
	private TenantModel tenant;
	@OneToMany(mappedBy = "person",fetch=FetchType.LAZY, cascade = CascadeType.ALL)
	private Set<CollaboratorModel> collaborators;
	@ManyToOne(fetch=FetchType.LAZY, optional =true) @JoinColumn(name="language_id")
	private LanguageModel language;
	@OneToMany(mappedBy = "person",fetch=FetchType.LAZY, cascade = CascadeType.ALL)
	private Set<DonorModel> donors;
	@OneToMany(mappedBy = "person",fetch=FetchType.LAZY, cascade = CascadeType.ALL)
	private Set<PartnerModel> partners;
	@OneToMany(mappedBy = "person",fetch=FetchType.LAZY, cascade = CascadeType.ALL)
	private Set<VendorModel> vendors;
	@OneToMany(mappedBy = "person",fetch=FetchType.LAZY, cascade = CascadeType.ALL)
	private Set<ProjectModel> projects;
	@OneToMany(mappedBy = "person",fetch=FetchType.LAZY, cascade = CascadeType.ALL)
	private Set<UserModel> users;
	@ManyToMany(mappedBy="persons")
	private Set<TeamModel> teams;

	@Override
	public String toString(){
		return "PersonModel [hasCredential=" + hasCredential + ",id=" + id + ",]";
	}

}