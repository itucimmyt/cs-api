///////////////////////////////////////////////////////////
//  UserModel.java
//  Macromedia ActionScript Implementation of the Class UserModel
//  Generated by Enterprise Architect
//  Created on:      13-Mar-2021 12:03:01 AM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.model;

import org.ebs.util.Auditable;
import javax.persistence.ManyToMany;
import lombok.Getter;
import lombok.Setter;
import javax.persistence.JoinTable;
import javax.persistence.JoinColumn;
import javax.persistence.FetchType;
import java.util.Set;
import java.util.Date;
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
 * @created 13-Mar-2021 12:03:01 AM
 */
@Entity @Table(name="User",schema="security") @Getter @Setter
public class UserModel extends Auditable {

	private static final long serialVersionUID = -335944719;
	@Column(name="userName")
	private String userName;
	@Column(name="lastAccess")
	private Date lastAccess;
	@Column(name="userPassword")
	private String userPassword;
	@Column(name="defaultRole")
	private int defaultRole;
	@Column(name="isIS")
	private int isIS;
	@GeneratedValue(strategy= GenerationType.IDENTITY) @Id @Column
	private int id;
	@OneToMany(mappedBy = "user",fetch=FetchType.LAZY, cascade = CascadeType.ALL)
	private Set<DelegationModel> delegations;
	@ManyToOne(fetch=FetchType.LAZY, optional =false) @JoinColumn(name="tenant_id")
	private TenantModel tenant;
	@OneToMany(mappedBy = "user",fetch=FetchType.LAZY, cascade = CascadeType.ALL)
	private Set<PreferenceModel> preferences;
	@ManyToMany(cascade =CascadeType.ALL) @JoinTable(name = "user_role", schema="security", joinColumns  = @JoinColumn(name="user_id",referencedColumnName = "id"),inverseJoinColumns = @JoinColumn(name="role_id",referencedColumnName = "id"))
	private Set<RoleModel> roles;
	@ManyToOne(fetch=FetchType.LAZY, optional =true) @JoinColumn(name="person_id")
	private PersonModel person;

	@Override
	public String toString(){
		return "UserModel [defaultRole=" + defaultRole + ",isIS=" + isIS + ",id=" + id + ",]";
	}

}