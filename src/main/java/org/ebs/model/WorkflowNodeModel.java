///////////////////////////////////////////////////////////
//  WorkflowNodeModel.java
//  Macromedia ActionScript Implementation of the Class WorkflowNodeModel
//  Generated by Enterprise Architect
//  Created on:      17-May-2020 3:10:36 PM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.ebs.util.Auditable;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 17-May-2020 3:10:36 PM
 */
@SuppressWarnings("serial")
@Entity @Table(name="WorkflowNode",schema="tenant")
public class WorkflowNodeModel extends Auditable {

	private int tenant_id;
	@Column(name="name")
	private String name;
	@Column(name="description")
	private String description;
	@Column(name="help")
	private String help;
	@GeneratedValue(strategy= GenerationType.IDENTITY) @Id @Column
	private int id;
	@ManyToOne(fetch=FetchType.LAZY, optional =true) @JoinColumn(name="workflow_id")
	WorkflowModel workflow;
	@OneToMany(mappedBy = "workflownode",fetch=FetchType.LAZY, cascade = CascadeType.ALL)
	Set<WorkflowModel> workflows;
	@OneToMany(mappedBy = "workflownode",fetch=FetchType.LAZY, cascade = CascadeType.ALL)
	Set<ProcessModel> processs;
	@OneToMany(mappedBy = "workflownode",fetch=FetchType.LAZY, cascade = CascadeType.ALL)
	Set<ModuleModel> modules;

	public String getdescription(){
		return description;
	}

	public String gethelp(){
		return help;
	}

	public int getId(){
		return id;
	}

	public Set<ModuleModel> getModules(){
		return modules;
	}

	public String getname(){
		return name;
	}

	public Set<ProcessModel> getProcesss(){
		return processs;
	}

	public int getTenantId(){
		return tenant_id;
	}

	public WorkflowModel getWorkflow(){
		return workflow;
	}

	public Set<WorkflowModel> getWorkflows(){
		return workflows;
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
	 * @param module
	 */
	public void setModules(Set<ModuleModel> module){
		this.modules =module;
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
	 * @param process
	 */
	public void setProcesss(Set<ProcessModel> process){
		this.processs =process;
	}

	/**
	 * 
	 * @param id
	 */
	public void setTenantId(int id){
		this.tenant_id=id;
	}

	/**
	 * 
	 * @param workflow
	 */
	public void setWorkflow(WorkflowModel workflow){
		this.workflow =workflow;
	}

	/**
	 * 
	 * @param workflow
	 */
	public void setWorkflows(Set<WorkflowModel> workflow){
		this.workflows =workflow;
	}

}