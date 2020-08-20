///////////////////////////////////////////////////////////
//  WorkflowStatusTypeTo.java
//  Macromedia ActionScript Implementation of the Class WorkflowStatusTypeTo
//  Generated by Enterprise Architect
//  Created on:      20-Aug-2020 1:07:13 PM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.services.to;

import java.io.Serializable;
import java.util.Set;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 20-Aug-2020 1:07:13 PM
 */
public class WorkflowStatusTypeTo implements Serializable {

	private static final long serialVersionUID = -151682985;
	private int id;
	private int tenant;
	private String name;
	private String description;
	private String help;
	Set<WorkflowStatusTo> workflowstatuss;

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

	public int getTenant(){
		return tenant;
	}

	public Set<WorkflowStatusTo> getworkflowstatuss(){
		return workflowstatuss;
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
	 * @param tenantid
	 */
	public void setTenant(int tenantid){
		this.tenant=tenantid;
	}

	/**
	 * 
	 * @param workflowstatus
	 */
	public void setworkflowstatuss(Set<WorkflowStatusTo> workflowstatus){
		this.workflowstatuss =workflowstatus;
	}

	@Override
	public String toString(){
		return "WorkflowStatusTypeTo []";
	}

}