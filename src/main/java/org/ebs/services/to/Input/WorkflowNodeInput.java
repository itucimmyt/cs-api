///////////////////////////////////////////////////////////
//  WorkflowNodeInput.java
//  Macromedia ActionScript Implementation of the Class WorkflowNodeInput
//  Generated by Enterprise Architect
//  Created on:      23-Jul-2020 10:47:38 PM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.services.to.Input;

import java.io.Serializable;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 23-Jul-2020 10:47:38 PM
 */
public class WorkflowNodeInput implements Serializable {

	private static final long serialVersionUID = 437468747;
	private int id;
	private int tenant;
	private String name;
	private String description;
	private String help;
	private int sequence;
	private boolean require_approval;
	WorkflowInput workflow;
	ModuleInput module;

	public String getdescription(){
		return description;
	}

	public String gethelp(){
		return help;
	}

	public int getId(){
		return id;
	}

	public ModuleInput getmodule(){
		return module;
	}

	public String getname(){
		return name;
	}

	public boolean getrequire_approval(){
		return require_approval;
	}

	public int getsequence(){
		return sequence;
	}

	public int getTenant(){
		return tenant;
	}

	public WorkflowInput getworkflow(){
		return workflow;
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
	 * @param help
	 */
	public void sethelp(String help){
		this.help = help;
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
	public void setmodule(ModuleInput module){
		this.module =module;
	}

	/**
	 * 
	 * @param name
	 */
	public void setname(String name){
		this.name = name;
	}

	/**
	 * 
	 * @param require_approval
	 */
	public void setrequire_approval(boolean require_approval){
		this.require_approval = require_approval;
	}

	/**
	 * 
	 * @param sequence
	 */
	public void setsequence(int sequence){
		this.sequence = sequence;
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
	 * @param workflow
	 */
	public void setworkflow(WorkflowInput workflow){
		this.workflow =workflow;
	}

}