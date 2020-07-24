///////////////////////////////////////////////////////////
//  ProcessModel.java
//  Macromedia ActionScript Implementation of the Class ProcessModel
//  Generated by Enterprise Architect
//  Created on:      23-Jul-2020 10:46:53 PM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.model;

import org.ebs.util.Auditable;
import javax.persistence.ManyToMany;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 23-Jul-2020 10:46:53 PM
 */
@Entity @Table(name="Process",schema="tenant")
public class ProcessModel extends Auditable {

	private static final long serialVersionUID = -389699510;
	@Column(name="tenant_id")
	private int tenant;
	@Column(name="name")
	private String name;
	@Column(name="description")
	private String description;
	@Column(name="code")
	private String code;
	@Column(name="isBackground")
	private Boolean isBackground;
	@Column(name="dbFunction")
	private String dbFunction;
	@Column(name="callReport")
	private Boolean callReport;
	@Column(name="path")
	private String path;
	@GeneratedValue(strategy= GenerationType.IDENTITY) @Id @Column
	private int id;
	@ManyToMany(mappedBy="processs")
	Set<WorkflowNodeModel> workflownode;

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

	public Set<WorkflowNodeModel> getworkflownode(){
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
		this.id = id;
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
	public void setworkflownode(Set<WorkflowNodeModel> workflownode){
		this.workflownode =workflownode;
	}

	@Override
	public String toString(){
		return "ProcessModel [id=" + id + ",]";
	}

}