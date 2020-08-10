///////////////////////////////////////////////////////////
//  UserTo.java
//  Macromedia ActionScript Implementation of the Class UserTo
//  Generated by Enterprise Architect
//  Created on:      09-Aug-2020 4:51:49 PM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.services.to;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 09-Aug-2020 4:51:49 PM
 */
public class UserTo implements Serializable {

	private static final long serialVersionUID = -253013601;
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
	PersonTo person;

	public int getdefaultRole(){
		return defaultRole;
	}

	public Set<DelegationTo> getdelegations(){
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

	public PersonTo getperson(){
		return person;
	}

	public Set<PreferenceTo> getpreferences(){
		return preferences;
	}

	public Set<RoleTo> getroles(){
		return roles;
	}

	public Set<SessionTo> getsessions(){
		return sessions;
	}

	public TenantTo gettenant(){
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
	public void setdelegations(Set<DelegationTo> delegation){
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
	 * @param person
	 */
	public void setperson(PersonTo person){
		this.person =person;
	}

	/**
	 * 
	 * @param preference
	 */
	public void setpreferences(Set<PreferenceTo> preference){
		this.preferences =preference;
	}

	/**
	 * 
	 * @param role
	 */
	public void setroles(Set<RoleTo> role){
		this.roles =role;
	}

	/**
	 * 
	 * @param session
	 */
	public void setsessions(Set<SessionTo> session){
		this.sessions =session;
	}

	/**
	 * 
	 * @param tenant
	 */
	public void settenant(TenantTo tenant){
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

	@Override
	public String toString(){
		return "UserTo [defaultRole=" + defaultRole + ",isIS=" + isIS + ",]";
	}

}