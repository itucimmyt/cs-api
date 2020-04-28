///////////////////////////////////////////////////////////
//  ActionInput.java
//  Macromedia ActionScript Implementation of the Class ActionInput
//  Generated by Enterprise Architect
//  Created on:      28-Apr-2020 12:06:49 AM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.services.to.Input;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 28-Apr-2020 12:06:49 AM
 */
public class ActionInput implements Serializable {

	private static final long serialVersionUID = 524950634;
	private int id;
	private String description;
	private int actionType;
	ModuleInput module;
	Set<RoleInput> role;

	public int getactionType(){
		return actionType;
	}

	public String getdescription(){
		return description;
	}

	public int getId(){
		return id;
	}

	public ModuleInput getModule(){
		return module;
	}

	public Set<RoleInput> getRole(){
		return role;
	}

	/**
	 * 
	 * @param actiontype
	 */
	public void setactionType(int actiontype){
		this.actionType = actiontype;
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
	 * @param module
	 */
	public void setModule(ModuleInput module){
		this.module =module;
	}

	/**
	 * 
	 * @param role
	 */
	public void setRole(Set<RoleInput> role){
		this.role =role;
	}

}