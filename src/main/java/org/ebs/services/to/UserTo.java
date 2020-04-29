///////////////////////////////////////////////////////////
//  UserTo.java
//  Macromedia ActionScript Implementation of the Class UserTo
//  Generated by Enterprise Architect
//  Created on:      28-Apr-2020 11:58:32 PM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.services.to;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;
import org.ebs.model.SessionModel;
import org.ebs.model.DelegationModel;
import org.ebs.model.TenantModel;
import org.ebs.model.PreferenceModel;
import org.ebs.model.RoleModel;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 28-Apr-2020 11:58:32 PM
 */
public class UserTo implements Serializable {

	private static final long serialVersionUID = -249484271;
	private int id;
	private String userName;
	private String userPassword;
	private Date lastAccess;
	private int defaultRole;
	private int isIS;
	Set<SessionTo> sessions;
	Set<DelegationTo> delegations;
	TenantTo tenant;
	Set<PreferenceTo> preferences;
	Set<RoleTo> roles;

	public int getdefaultRole(){
		return defaultRole;
	}

	public Set<DelegationTo> getDelegations(){
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

	public Set<PreferenceTo> getPreferences(){
		return preferences;
	}

	public Set<RoleTo> getRoles(){
		return roles;
	}

	public Set<SessionTo> getSessions(){
		return sessions;
	}

	public TenantTo getTenant(){
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
	public void setDelegations(Set<DelegationTo> delegation){
		this.delegations =delegation;
	}

	/**
	 * 
	 * @param id
	 */
	public void setId(int id){
		this.id=id;
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
	public void setPreferences(Set<PreferenceTo> preference){
		this.preferences =preference;
	}

	/**
	 * 
	 * @param role
	 */
	public void setRoles(Set<RoleTo> role){
		this.roles =role;
	}

	/**
	 * 
	 * @param session
	 */
	public void setSessions(Set<SessionTo> session){
		this.sessions =session;
	}

	/**
	 * 
	 * @param tenant
	 */
	public void setTenant(TenantTo tenant){
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