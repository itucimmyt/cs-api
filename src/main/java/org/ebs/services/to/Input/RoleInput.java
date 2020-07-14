///////////////////////////////////////////////////////////
//  RoleInput.java
//  Macromedia ActionScript Implementation of the Class RoleInput
//  Generated by Enterprise Architect
//  Created on:      13-Jul-2020 5:07:13 PM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.services.to.Input;

import java.io.Serializable;
import java.util.Set;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 13-Jul-2020 5:07:13 PM
 */
public class RoleInput implements Serializable {

	private static final long serialVersionUID = -6584033;
	private int id;
	private int tenant;
	private String description;
	private String securityGroup;
	Set<UserInput> user;

	public String getdescription(){
		return description;
	}

	public int getId(){
		return id;
	}

	public String getsecurityGroup(){
		return securityGroup;
	}

	public int getTenant(){
		return tenant;
	}

	public Set<UserInput> getuser(){
		return user;
	}

	/**
	 * 
	 * @param description
	 */
	public void setdescription(String description){
		this.description = description;
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
	 * @param securitygroup
	 */
	public void setsecurityGroup(String securitygroup){
		this.securityGroup = securitygroup;
	}

	/**
	 * 
	 * @param tenantid
	 */
	public void setTenant(int tenantid){
		this.tenant=tenantid;
	}

	/**
	 * 
	 * @param user
	 */
	public void setuser(Set<UserInput> user){
		this.user =user;
	}

}