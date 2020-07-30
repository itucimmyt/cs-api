///////////////////////////////////////////////////////////
//  WorkflowEventTo.java
//  Macromedia ActionScript Implementation of the Class WorkflowEventTo
//  Generated by Enterprise Architect
//  Created on:      27-Jul-2020 8:43:55 AM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.services.to;

import java.io.Serializable;
import java.util.Date;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 27-Jul-2020 8:43:55 AM
 */
public class WorkflowEventTo implements Serializable {

	private static final long serialVersionUID = -391266385;
	private int id;
	private int tenant;
	private Date completed;
	private String error;
	private String description;
	WorkflowStageTo workflowstage;
	WorkflowInstanceTo workflowinstance;
	WorkflowNodeTo workflownode;

	public Date getcompleted(){
		return completed;
	}

	public String getdescription(){
		return description;
	}

	public String geterror(){
		return error;
	}

	public int getId(){
		return id;
	}

	public int getTenant(){
		return tenant;
	}

	public WorkflowInstanceTo getworkflowinstance(){
		return workflowinstance;
	}

	public WorkflowNodeTo getworkflownode(){
		return workflownode;
	}

	public WorkflowStageTo getworkflowstage(){
		return workflowstage;
	}

	/**
	 * 
	 * @param completed
	 */
	public void setcompleted(Date completed){
		this.completed = completed;
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
	 * @param error
	 */
	public void seterror(String error){
		this.error = error;
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
	 * @param tenantid
	 */
	public void setTenant(int tenantid){
		this.tenant=tenantid;
	}

	/**
	 * 
	 * @param workflowinstance
	 */
	public void setworkflowinstance(WorkflowInstanceTo workflowinstance){
		this.workflowinstance =workflowinstance;
	}

	/**
	 * 
	 * @param workflownode
	 */
	public void setworkflownode(WorkflowNodeTo workflownode){
		this.workflownode =workflownode;
	}

	/**
	 * 
	 * @param workflowstage
	 */
	public void setworkflowstage(WorkflowStageTo workflowstage){
		this.workflowstage =workflowstage;
	}

	@Override
	public String toString(){
		return "WorkflowEventTo []";
	}

}