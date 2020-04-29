///////////////////////////////////////////////////////////
//  ProcessInput.java
//  Macromedia ActionScript Implementation of the Class ProcessInput
//  Generated by Enterprise Architect
//  Created on:      28-Apr-2020 11:58:24 PM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.services.to.Input;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 28-Apr-2020 11:58:24 PM
 */
public class ProcessInput implements Serializable {

	private static final long serialVersionUID = -508545875;
	private int id;
	private String name;
	private String description;
	private String code;
	private Boolean isBackground;
	private String dbFunction;
	private Boolean callReport;
	private String path;
	WorkflowNodeInput workflownode;

	public Boolean getcallReport(){
		return callReport;
	}

	public String getcode(){
		return code;
	}

	public String getdbFunction(){
		return dbFunction;
	}

	public String getdescription(){
		return description;
	}

	public int getId(){
		return id;
	}

	public Boolean getisBackground(){
		return isBackground;
	}

	public String getname(){
		return name;
	}

	public String getpath(){
		return path;
	}

	public WorkflowNodeInput getWorkflowNode(){
		return workflownode;
	}

	/**
	 * 
	 * @param callreport
	 */
	public void setcallReport(Boolean callreport){
		this.callReport = callreport;
	}

	/**
	 * 
	 * @param code
	 */
	public void setcode(String code){
		this.code = code;
	}

	/**
	 * 
	 * @param dbfunction
	 */
	public void setdbFunction(String dbfunction){
		this.dbFunction = dbfunction;
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
	 * @param id
	 */
	public void setId(int id){
		this.id=id;
	}

	/**
	 * 
	 * @param isbackground
	 */
	public void setisBackground(Boolean isbackground){
		this.isBackground = isbackground;
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
	 * @param path
	 */
	public void setpath(String path){
		this.path = path;
	}

	/**
	 * 
	 * @param workflownode
	 */
	public void setWorkflowNode(WorkflowNodeInput workflownode){
		this.workflownode =workflownode;
	}

}