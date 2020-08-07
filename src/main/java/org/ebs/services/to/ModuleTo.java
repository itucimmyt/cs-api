///////////////////////////////////////////////////////////
//  ModuleTo.java
//  Macromedia ActionScript Implementation of the Class ModuleTo
//  Generated by Enterprise Architect
//  Created on:      07-Aug-2020 3:00:07 PM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.services.to;

import java.io.Serializable;
import java.util.Set;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 07-Aug-2020 3:00:07 PM
 */
public class ModuleTo implements Serializable {

	private static final long serialVersionUID = -349121112;
	private int id;
	private String name;
	private String description;
	private String help;
	private String route;
	private String MainEntity;
	private String icon;
	Set<ActionTo> actions;
	ComponentTo component;
	HtmlTagTo htmltag;
	Set<WorkflowNodeTo> workflownodes;

	public Set<ActionTo> getactions(){
		return actions;
	}

	public ComponentTo getcomponent(){
		return component;
	}

	public String getdescription(){
		return description;
	}

	public String gethelp(){
		return help;
	}

	public HtmlTagTo gethtmltag(){
		return htmltag;
	}

	public String geticon(){
		return icon;
	}

	public int getId(){
		return id;
	}

	public String getMainEntity(){
		return MainEntity;
	}

	public String getname(){
		return name;
	}

	public String getroute(){
		return route;
	}

	public Set<WorkflowNodeTo> getworkflownodes(){
		return workflownodes;
	}

	/**
	 * 
	 * @param action
	 */
	public void setactions(Set<ActionTo> action){
		this.actions =action;
	}

	/**
	 * 
	 * @param component
	 */
	public void setcomponent(ComponentTo component){
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
	 * @param htmltag
	 */
	public void sethtmltag(HtmlTagTo htmltag){
		this.htmltag =htmltag;
	}

	/**
	 * 
	 * @param icon
	 */
	public void seticon(String icon){
		this.icon = icon;
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
	 * @param mainentity
	 */
	public void setMainEntity(String mainentity){
		this.MainEntity = mainentity;
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
	public void setworkflownodes(Set<WorkflowNodeTo> workflownode){
		this.workflownodes =workflownode;
	}

	@Override
	public String toString(){
		return "ModuleTo []";
	}

}