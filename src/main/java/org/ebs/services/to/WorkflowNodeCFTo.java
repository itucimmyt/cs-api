///////////////////////////////////////////////////////////
//  WorkflowNodeCFTo.java
//  Macromedia ActionScript Implementation of the Class WorkflowNodeCFTo
//  Generated by Enterprise Architect
//  Created on:      20-Aug-2020 1:07:01 PM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.services.to;

import java.io.Serializable;
import java.util.Set;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 20-Aug-2020 1:07:01 PM
 */
public class WorkflowNodeCFTo implements Serializable {

	private static final long serialVersionUID = -439701020;
	private int id;
	private int tenant;
	private String name;
	private String description;
	private String help;
	private boolean required;
	Set<WorkflowCFValueTo> workflowcfvalues;
	WorkflowCFTypeTo workflowcftype;
	HtmlTagTo htmltag;
	EntityReferenceTo entityreference;
	WorkflowNodeTo workflownode;

	public String getdescription(){
		return description;
	}

	public EntityReferenceTo getentityreference(){
		return entityreference;
	}

	public String gethelp(){
		return help;
	}

	public HtmlTagTo gethtmltag(){
		return htmltag;
	}

	public int getId(){
		return id;
	}

	public String getname(){
		return name;
	}

	public boolean getrequired(){
		return required;
	}

	public int getTenant(){
		return tenant;
	}

	public WorkflowCFTypeTo getworkflowcftype(){
		return workflowcftype;
	}

	public Set<WorkflowCFValueTo> getworkflowcfvalues(){
		return workflowcfvalues;
	}

	public WorkflowNodeTo getworkflownode(){
		return workflownode;
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
	 * @param entityreference
	 */
	public void setentityreference(EntityReferenceTo entityreference){
		this.entityreference =entityreference;
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
	 * @param required
	 */
	public void setrequired(boolean required){
		this.required = required;
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
	 * @param workflowcftype
	 */
	public void setworkflowcftype(WorkflowCFTypeTo workflowcftype){
		this.workflowcftype =workflowcftype;
	}

	/**
	 * 
	 * @param workflowcfvalue
	 */
	public void setworkflowcfvalues(Set<WorkflowCFValueTo> workflowcfvalue){
		this.workflowcfvalues =workflowcfvalue;
	}

	/**
	 * 
	 * @param workflownode
	 */
	public void setworkflownode(WorkflowNodeTo workflownode){
		this.workflownode =workflownode;
	}

	@Override
	public String toString(){
		return "WorkflowNodeCFTo [required=" + required + ",]";
	}

}