///////////////////////////////////////////////////////////
//  WorkflowNodeInput.java
//  Macromedia ActionScript Implementation of the Class WorkflowNodeInput
//  Generated by Enterprise Architect
//  Created on:      28-Apr-2020 11:58:33 PM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.services.to.Input;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 28-Apr-2020 11:58:33 PM
 */
public class WorkflowNodeInput implements Serializable {

	private static final long serialVersionUID = -424092626;
	private int id;
	private String name;
	private String description;
	private String help;
	WorkflowInput workflow;

	public String getdescription(){
		return description;
	}

	public String gethelp(){
		return help;
	}

	public int getId(){
		return id;
	}

	public String getname(){
		return name;
	}

	public WorkflowInput getWorkflow(){
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
	 * @param name
	 */
	public void setname(String name){
		this.name = name;
	}

	/**
	 * 
	 * @param workflow
	 */
	public void setWorkflow(WorkflowInput workflow){
		this.workflow =workflow;
	}

}