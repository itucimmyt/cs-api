///////////////////////////////////////////////////////////
//  RoleActionTo.java
//  Macromedia ActionScript Implementation of the Class RoleActionTo
//  Generated by Enterprise Architect
//  Created on:      17-May-2020 3:10:08 PM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.services.to;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;
import org.ebs.model.ActionModel;
import org.ebs.model.PermissionModel;
import org.ebs.model.RoleModel;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 17-May-2020 3:10:08 PM
 */
public class RoleActionTo implements Serializable {

	private static final long serialVersionUID = 65891732;
	private int id;
	private int tenant_id;
	private int allow;
	ActionTo action;
	Set<PermissionTo> permissions;
	RoleTo role;

	public ActionTo getAction(){
		return action;
	}

	public int getallow(){
		return allow;
	}

	public int getId(){
		return id;
	}

	public Set<PermissionTo> getPermissions(){
		return permissions;
	}

	public RoleTo getRole(){
		return role;
	}

	public int getTenantId(){
		return tenant_id;
	}

	/**
	 * 
	 * @param action
	 */
	public void setAction(ActionTo action){
		this.action =action;
	}

	/**
	 * 
	 * @param allow
	 */
	public void setallow(int allow){
		this.allow = allow;
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
	 * @param permission
	 */
	public void setPermissions(Set<PermissionTo> permission){
		this.permissions =permission;
	}

	/**
	 * 
	 * @param role
	 */
	public void setRole(RoleTo role){
		this.role =role;
	}

	/**
	 * 
	 * @param id
	 */
	public void setTenantId(int id){
		this.tenant_id=id;
	}

}