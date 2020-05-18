///////////////////////////////////////////////////////////
//  ActionInput.java
//  Macromedia ActionScript Implementation of the Class ActionInput
//  Generated by Enterprise Architect
//  Created on:      17-May-2020 3:09:09 PM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.services.to.Input;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 17-May-2020 3:09:09 PM
 */
public class ActionInput implements Serializable {

	private static final long serialVersionUID = 298704998;
	private int id;
	private int description;
	private int actionType;
	ModuleInput module;

	public int getactionType(){
		return actionType;
	}

	public int getdescription(){
		return description;
	}

	public int getId(){
		return id;
	}

	public ModuleInput getModule(){
		return module;
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
	public void setdescription(int description){
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

}