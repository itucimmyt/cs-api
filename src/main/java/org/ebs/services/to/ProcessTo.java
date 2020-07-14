///////////////////////////////////////////////////////////
//  ProcessTo.java
//  Macromedia ActionScript Implementation of the Class ProcessTo
//  Generated by Enterprise Architect
//  Created on:      13-Jul-2020 5:07:03 PM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.services.to;

import java.io.Serializable;
import java.util.Set;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 13-Jul-2020 5:07:03 PM
 */
public class ProcessTo implements Serializable {

	private static final long serialVersionUID = -46112197;
	private int id;
	private int tenant;
	private String name;
	private String description;
	private String code;
	private Boolean isBackground;
	private String dbFunction;
	private Boolean callReport;
	private String path;
	Set<WorkflowNodeTo> workflownode;

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

	public int getTenant(){
		return tenant;
	}

	public Set<WorkflowNodeTo> getworkflownode(){
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
	 * @param tenantid
	 */
	public void setTenant(int tenantid){
		this.tenant=tenantid;
	}

	/**
	 * 
	 * @param workflownode
	 */
	public void setworkflownode(Set<WorkflowNodeTo> workflownode){
		this.workflownode =workflownode;
	}

	@Override
	public String toString(){
		return "ProcessTo []";
	}

}