///////////////////////////////////////////////////////////
//  ModuleInput.java
//  Macromedia ActionScript Implementation of the Class ModuleInput
//  Generated by Enterprise Architect
//  Created on:      28-Apr-2020 12:07:04 AM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.services.to.Input;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;
import org.ebs.model.ActionModel;
import org.ebs.model.TranslationModel;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 28-Apr-2020 12:07:04 AM
 */
public class ModuleInput implements Serializable {

	private static final long serialVersionUID = 494435905;
	private int id;
	private String name;
	private String description;
	private String help;
	private String route;
	WorkflowNodeInput workflownode;
	ComponentInput component;

	public ComponentInput getComponent(){
		return component;
	}

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

	public String getroute(){
		return route;
	}

	public WorkflowNodeInput getWorkflowNode(){
		return workflownode;
	}

	/**
	 * 
	 * @param component
	 */
	public void setComponent(ComponentInput component){
		this.component =component;
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
	 * @param route
	 */
	public void setroute(String route){
		this.route = route;
	}

	/**
	 * 
	 * @param workflownode
	 */
	public void setWorkflowNode(WorkflowNodeInput workflownode){
		this.workflownode =workflownode;
	}

}