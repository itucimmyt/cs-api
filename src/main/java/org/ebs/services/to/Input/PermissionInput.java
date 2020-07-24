///////////////////////////////////////////////////////////
//  PermissionInput.java
//  Macromedia ActionScript Implementation of the Class PermissionInput
//  Generated by Enterprise Architect
//  Created on:      23-Jul-2020 10:46:48 PM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.services.to.Input;

import java.io.Serializable;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 23-Jul-2020 10:46:48 PM
 */
public class PermissionInput implements Serializable {

	private static final long serialVersionUID = 241365605;
	private int id;
	private int tenant;
	RoleActionInput roleaction;

	public int getId(){
		return id;
	}

	public RoleActionInput getroleaction(){
		return roleaction;
	}

	public int getTenant(){
		return tenant;
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
	 * @param roleaction
	 */
	public void setroleaction(RoleActionInput roleaction){
		this.roleaction =roleaction;
	}

	/**
	 * 
	 * @param tenantid
	 */
	public void setTenant(int tenantid){
		this.tenant=tenantid;
	}

}