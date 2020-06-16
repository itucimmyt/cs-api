///////////////////////////////////////////////////////////
//  WorkflowCFTypeModel.java
//  Macromedia ActionScript Implementation of the Class WorkflowCFTypeModel
//  Generated by Enterprise Architect
//  Created on:      15-Jun-2020 5:14:50 PM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.model;

import org.ebs.util.Auditable;
import javax.persistence.ManyToMany;
import javax.persistence.JoinTable;
import javax.persistence.JoinColumn;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 15-Jun-2020 5:14:50 PM
 */
@Entity @Table(name="WorkflowCFType",schema="tenant")
public class WorkflowCFTypeModel extends Auditable {

	private static final long serialVersionUID = 74010382;
	@Column(name="tenant_id")
	private int tenant;
	@Column(name="name")
	private String name;
	@Column(name="description")
	private String description;
	@Column(name="help")
	private String help;
	@Column(name="type")
	private String type;
	@GeneratedValue(strategy= GenerationType.IDENTITY) @Id @Column
	private int id;
	@ManyToMany(cascade =CascadeType.ALL) @JoinTable(name = "workflowcftype_workflownodecf", schema="tenant", joinColumns  = @JoinColumn(name="workflowcftype_id",referencedColumnName = "id"),inverseJoinColumns = @JoinColumn(name="workflownodecf_id",referencedColumnName = "id"))
	Set<WorkflowNodeCFModel> workflownodecfs;

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

	public String gettype(){
		return type;
	}

	public Set<WorkflowNodeCFModel> getWorkflowNodeCFs(){
		return workflownodecfs;
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
		this.id = id;
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
	 * @param type
	 */
	public void settype(String type){
		this.type = type;
	}

	/**
	 * 
	 * @param workflownodecf
	 */
	public void setWorkflowNodeCFs(Set<WorkflowNodeCFModel> workflownodecf){
		this.workflownodecfs =workflownodecf;
	}

	@Override
	public String toString(){
		return "WorkflowCFTypeModel [id=" + id + ",]";
	}

}