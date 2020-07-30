///////////////////////////////////////////////////////////
//  ModuleModel.java
//  Macromedia ActionScript Implementation of the Class ModuleModel
//  Generated by Enterprise Architect
//  Created on:      27-Jul-2020 8:42:46 AM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.model;

import org.ebs.util.Auditable;
import javax.persistence.JoinColumn;
import javax.persistence.FetchType;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 27-Jul-2020 8:42:46 AM
 */
@Entity @Table(name="Module",schema="tenant")
public class ModuleModel extends Auditable {

	private static final long serialVersionUID = -118781503;
	@Column(name="name")
	private String name;
	@Column(name="description")
	private String description;
	@Column(name="help")
	private String help;
	@Column(name="route")
	private String route;
	@Column(name="MainEntity")
	private String MainEntity;
	@Column(name="icon")
	private String icon;
	@GeneratedValue(strategy= GenerationType.IDENTITY) @Id @Column
	private int id;
	@OneToMany(mappedBy = "module",fetch=FetchType.LAZY, cascade = CascadeType.ALL)
	Set<ActionModel> actions;
	@ManyToOne(fetch=FetchType.LAZY, optional =true) @JoinColumn(name="component_id")
	ComponentModel component;
	@OneToMany(mappedBy = "module",fetch=FetchType.LAZY, cascade = CascadeType.ALL)
	Set<WorkflowNodeModel> workflownodes;
	@ManyToOne(fetch=FetchType.LAZY, optional =true) @JoinColumn(name="htmltag_id")
	HtmlTagModel htmltag;

	public Set<ActionModel> getactions(){
		return actions;
	}

	public ComponentModel getcomponent(){
		return component;
	}

	public String getdescription(){
		return description;
	}

	public String gethelp(){
		return help;
	}

	public HtmlTagModel gethtmltag(){
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

	public Set<WorkflowNodeModel> getworkflownodes(){
		return workflownodes;
	}

	/**
	 * 
	 * @param action
	 */
	public void setactions(Set<ActionModel> action){
		this.actions =action;
	}

	/**
	 * 
	 * @param component
	 */
	public void setcomponent(ComponentModel component){
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
	public void sethtmltag(HtmlTagModel htmltag){
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
		this.id = id;
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
	public void setworkflownodes(Set<WorkflowNodeModel> workflownode){
		this.workflownodes =workflownode;
	}

	@Override
	public String toString(){
		return "ModuleModel [id=" + id + ",]";
	}

}