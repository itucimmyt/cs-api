///////////////////////////////////////////////////////////
//  UserModel.java
//  Macromedia ActionScript Implementation of the Class UserModel
//  Generated by Enterprise Architect
//  Created on:      17-May-2020 3:10:32 PM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.model;

import org.ebs.util.Auditable;
import javax.persistence.ManyToMany;
import javax.persistence.JoinTable;
import javax.persistence.JoinColumn;
import javax.persistence.FetchType;
import java.util.Set;
import java.util.Date;
import java.util.UUID;
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
 * @created 17-May-2020 3:10:32 PM
 */
@Entity @Table(name="User",schema="tenant")
public class UserModel extends Auditable {

	@Column(name="userName")
	private String userName;
	@Column(name="userPassword")
	private String userPassword;
	@Column(name="lastAccess")
	private Date lastAccess;
	@Column(name="defaultRole")
	private int defaultRole;
	@Column(name="isIS")
	private int isIS;
	@GeneratedValue(strategy= GenerationType.IDENTITY) @Id @Column
	private int id;
	@OneToMany(mappedBy = "user",fetch=FetchType.EAGER, cascade = CascadeType.ALL)
	Set<SessionModel> sessions;
	@OneToMany(mappedBy = "user",fetch=FetchType.EAGER, cascade = CascadeType.ALL)
	Set<DelegationModel> delegations;
	@ManyToOne(fetch=FetchType.EAGER, optional =false) @JoinColumn(name="tenant_id")
	TenantModel tenant;
	@OneToMany(mappedBy = "user",fetch=FetchType.EAGER, cascade = CascadeType.ALL)
	Set<PreferenceModel> preferences;
	@ManyToMany(cascade =CascadeType.ALL) @JoinTable(name = "user_role", schema="tenant", joinColumns  = @JoinColumn(name="user_id",referencedColumnName = "id"),inverseJoinColumns = @JoinColumn(name="role_id",referencedColumnName = "id"))
	Set<RoleModel> roles;

	public int getdefaultRole(){
		return defaultRole;
	}

	public Set<DelegationModel> getDelegations(){
		return delegations;
	}

	public int getId(){
		return id;
	}

	public int getisIS(){
		return isIS;
	}

	public Date getlastAccess(){
		return lastAccess;
	}

	public Set<PreferenceModel> getPreferences(){
		return preferences;
	}

	public Set<RoleModel> getRoles(){
		return roles;
	}

	public Set<SessionModel> getSessions(){
		return sessions;
	}

	public TenantModel getTenant(){
		return tenant;
	}

	public String getuserName(){
		return userName;
	}

	public String getuserPassword(){
		return userPassword;
	}

	/**
	 * 
	 * @param defaultrole
	 */
	public void setdefaultRole(int defaultrole){
		this.defaultRole = defaultrole;
	}

	/**
	 * 
	 * @param delegation
	 */
	public void setDelegations(Set<DelegationModel> delegation){
		this.delegations =delegation;
	}

	/**
	 * 
	 * @param id
	 */
	public void setId(int id){
		this.id = id;
	}

	/**
	 * 
	 * @param isis
	 */
	public void setisIS(int isis){
		this.isIS = isis;
	}

	/**
	 * 
	 * @param lastaccess
	 */
	public void setlastAccess(Date lastaccess){
		this.lastAccess = lastaccess;
	}

	/**
	 * 
	 * @param preference
	 */
	public void setPreferences(Set<PreferenceModel> preference){
		this.preferences =preference;
	}

	/**
	 * 
	 * @param role
	 */
	public void setRoles(Set<RoleModel> role){
		this.roles =role;
	}

	/**
	 * 
	 * @param session
	 */
	public void setSessions(Set<SessionModel> session){
		this.sessions =session;
	}

	/**
	 * 
	 * @param tenant
	 */
	public void setTenant(TenantModel tenant){
		this.tenant =tenant;
	}

	/**
	 * 
	 * @param username
	 */
	public void setuserName(String username){
		this.userName = username;
	}

	/**
	 * 
	 * @param userpassword
	 */
	public void setuserPassword(String userpassword){
		this.userPassword = userpassword;
	}

}