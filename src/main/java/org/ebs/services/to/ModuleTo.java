///////////////////////////////////////////////////////////
//  ModuleTo.java
//  Macromedia ActionScript Implementation of the Class ModuleTo
//  Generated by Enterprise Architect
//  Created on:      28-Apr-2020 12:07:05 AM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.services.to;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;
import org.ebs.model.WorkflowNodeModel;
import org.ebs.model.ActionModel;
import org.ebs.model.ComponentModel;
import org.ebs.model.TranslationModel;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 28-Apr-2020 12:07:05 AM
 */
public class ModuleTo implements Serializable {

	private static final long serialVersionUID = -406126832;
	private int id;
	private String name;
	private String description;
	private String help;
	private String route;
	WorkflowNodeTo workflownode;
	Set<ActionTo> actions;
	ComponentTo component;
	Set<TranslationTo> translations;

	public Set<ActionTo> getActions(){
		return actions;
	}

	public ComponentTo getComponent(){
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

	public Set<TranslationTo> getTranslations(){
		return translations;
	}

	public WorkflowNodeTo getWorkflowNode(){
		return workflownode;
	}

	/**
	 * 
	 * @param action
	 */
	public void setActions(Set<ActionTo> action){
		this.actions =action;
	}

	/**
	 * 
	 * @param component
	 */
	public void setComponent(ComponentTo component){
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
	 * @param translation
	 */
	public void setTranslations(Set<TranslationTo> translation){
		this.translations =translation;
	}

	/**
	 * 
	 * @param workflownode
	 */
	public void setWorkflowNode(WorkflowNodeTo workflownode){
		this.workflownode =workflownode;
	}

}