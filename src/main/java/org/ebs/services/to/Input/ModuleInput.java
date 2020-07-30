///////////////////////////////////////////////////////////
//  ModuleInput.java
//  Macromedia ActionScript Implementation of the Class ModuleInput
//  Generated by Enterprise Architect
//  Created on:      27-Jul-2020 8:42:46 AM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.services.to.Input;

import java.io.Serializable;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 27-Jul-2020 8:42:46 AM
 */
public class ModuleInput implements Serializable {

	private static final long serialVersionUID = 257533677;
	private int id;
	private String name;
	private String description;
	private String help;
	private String route;
	private String MainEntity;
	private String icon;
	ComponentInput component;
	HtmlTagInput htmltag;

	public ComponentInput getcomponent(){
		return component;
	}

	public String getdescription(){
		return description;
	}

	public String gethelp(){
		return help;
	}

	public HtmlTagInput gethtmltag(){
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

	/**
	 * 
	 * @param component
	 */
	public void setcomponent(ComponentInput component){
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
	public void sethtmltag(HtmlTagInput htmltag){
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

}