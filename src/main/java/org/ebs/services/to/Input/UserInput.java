///////////////////////////////////////////////////////////
//  UserInput.java
//  Macromedia ActionScript Implementation of the Class UserInput
//  Generated by Enterprise Architect
//  Created on:      15-Jun-2020 5:14:45 PM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.services.to.Input;

import java.io.Serializable;
import java.util.Date;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 15-Jun-2020 5:14:45 PM
 */
public class UserInput implements Serializable {

	private static final long serialVersionUID = 524305375;
	private int id;
	private String userName;
	private String userPassword;
	private Date lastAccess;
	private int defaultRole;
	private int isIS;
	TenantInput tenant;

	public int getdefaultRole(){
		return defaultRole;
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

	public TenantInput getTenant(){
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
	 * @param tenant
	 */
	public void setTenant(TenantInput tenant){
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