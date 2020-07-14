///////////////////////////////////////////////////////////
//  WorkflowNodeModel.java
//  Macromedia ActionScript Implementation of the Class WorkflowNodeModel
//  Generated by Enterprise Architect
//  Created on:      13-Jul-2020 5:07:46 PM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.model;

import org.ebs.util.Auditable;
import javax.persistence.ManyToMany;
import javax.persistence.JoinTable;
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
 * @created 13-Jul-2020 5:07:46 PM
 */
@Entity @Table(name="WorkflowNode",schema="tenant")
public class WorkflowNodeModel extends Auditable {

	private static final long serialVersionUID = 37068425;
	@Column(name="tenant_id")
	private int tenant;
	@Column(name="name")
	private String name;
	@Column(name="description")
	private String description;
	@Column(name="help")
	private String help;
	@Column(name="sequence")
	private int sequence;
	@Column(name="require_approval")
	private boolean require_approval;
	@GeneratedValue(strategy= GenerationType.IDENTITY) @Id @Column
	private int id;
	@ManyToOne(fetch=FetchType.LAZY, optional =true) @JoinColumn(name="workflow_id")
	WorkflowModel workflow;
	@OneToMany(mappedBy = "workflownode",fetch=FetchType.LAZY, cascade = CascadeType.ALL)
	Set<WorkflowEventModel> workflowevents;
	@ManyToMany(cascade =CascadeType.ALL) @JoinTable(name = "workflownode_workflowstage", schema="tenant", joinColumns  = @JoinColumn(name="workflownode_id",referencedColumnName = "id"),inverseJoinColumns = @JoinColumn(name="workflowstage_id",referencedColumnName = "id"))
	Set<WorkflowStageModel> workflowstages;
	@OneToMany(mappedBy = "workflownode",fetch=FetchType.LAZY, cascade = CascadeType.ALL)
	Set<WorkflowModel> workflows;
	@ManyToMany(cascade =CascadeType.ALL) @JoinTable(name = "workflownode_process", schema="tenant", joinColumns  = @JoinColumn(name="workflownode_id",referencedColumnName = "id"),inverseJoinColumns = @JoinColumn(name="process_id",referencedColumnName = "id"))
	Set<ProcessModel> processs;
	@ManyToMany(cascade =CascadeType.ALL) @JoinTable(name = "workflownode_workflownodecf", schema="tenant", joinColumns  = @JoinColumn(name="workflownode_id",referencedColumnName = "id"),inverseJoinColumns = @JoinColumn(name="workflownodecf_id",referencedColumnName = "id"))
	Set<WorkflowNodeCFModel> workflownodecfs;
	@ManyToOne(fetch=FetchType.LAZY, optional =true) @JoinColumn(name="module_id")
	ModuleModel module;

	public String getdescription(){
		return description;
	}

	public String gethelp(){
		return help;
	}

	public int getId(){
		return id;
	}

	public ModuleModel getmodule(){
		return module;
	}

	public String getname(){
		return name;
	}

	public Set<ProcessModel> getprocesss(){
		return processs;
	}

	public boolean getrequire_approval(){
		return require_approval;
	}

	public int getsequence(){
		return sequence;
	}

	public int getTenant(){
		return tenant;
	}

	public WorkflowModel getworkflow(){
		return workflow;
	}

	public Set<WorkflowEventModel> getworkflowevents(){
		return workflowevents;
	}

	public Set<WorkflowNodeCFModel> getworkflownodecfs(){
		return workflownodecfs;
	}

	public Set<WorkflowModel> getworkflows(){
		return workflows;
	}

	public Set<WorkflowStageModel> getworkflowstages(){
		return workflowstages;
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
	public void setmodule(ModuleModel module){
		this.module =module;
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
	public void setprocesss(Set<ProcessModel> process){
		this.processs =process;
	}

	/**
	 * 
	 * @param require_approval
	 */
	public void setrequire_approval(boolean require_approval){
		this.require_approval = require_approval;
	}

	/**
	 * 
	 * @param sequence
	 */
	public void setsequence(int sequence){
		this.sequence = sequence;
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
	 * @param workflow
	 */
	public void setworkflow(WorkflowModel workflow){
		this.workflow =workflow;
	}

	/**
	 * 
	 * @param workflowevent
	 */
	public void setworkflowevents(Set<WorkflowEventModel> workflowevent){
		this.workflowevents =workflowevent;
	}

	/**
	 * 
	 * @param workflownodecf
	 */
	public void setworkflownodecfs(Set<WorkflowNodeCFModel> workflownodecf){
		this.workflownodecfs =workflownodecf;
	}

	/**
	 * 
	 * @param workflow
	 */
	public void setworkflows(Set<WorkflowModel> workflow){
		this.workflows =workflow;
	}

	/**
	 * 
	 * @param workflowstage
	 */
	public void setworkflowstages(Set<WorkflowStageModel> workflowstage){
		this.workflowstages =workflowstage;
	}

	@Override
	public String toString(){
		return "WorkflowNodeModel [sequence=" + sequence + ",require_approval=" + require_approval + ",id=" + id + ",]";
	}

}