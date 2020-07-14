///////////////////////////////////////////////////////////
//  WorkflowStageModel.java
//  Macromedia ActionScript Implementation of the Class WorkflowStageModel
//  Generated by Enterprise Architect
//  Created on:      13-Jul-2020 5:07:52 PM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.model;

import org.ebs.util.Auditable;
import javax.persistence.ManyToMany;
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
 * @created 13-Jul-2020 5:07:52 PM
 */
@Entity @Table(name="WorkflowStage",schema="tenant")
public class WorkflowStageModel extends Auditable {

	private static final long serialVersionUID = -131299253;
	@Column(name="tenant_id")
	private int tenant;
	@Column(name="name")
	private String name;
	@Column(name="description")
	private String description;
	@Column(name="help")
	private String help;
	@GeneratedValue(strategy= GenerationType.IDENTITY) @Id @Column
	private int id;
	@ManyToOne(fetch=FetchType.LAZY, optional =true) @JoinColumn(name="workflowphase_id")
	WorkflowPhaseModel workflowphase;
	@ManyToMany(mappedBy="workflowstages")
	Set<WorkflowNodeModel> workflownode;
	@OneToMany(mappedBy = "workflowstage",fetch=FetchType.LAZY, cascade = CascadeType.ALL)
	Set<WorkflowEventModel> workflowevents;

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

	public Set<WorkflowEventModel> getworkflowevents(){
		return workflowevents;
	}

	public Set<WorkflowNodeModel> getworkflownode(){
		return workflownode;
	}

	public WorkflowPhaseModel getworkflowphase(){
		return workflowphase;
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
	 * @param workflowevent
	 */
	public void setworkflowevents(Set<WorkflowEventModel> workflowevent){
		this.workflowevents =workflowevent;
	}

	/**
	 * 
	 * @param workflownode
	 */
	public void setworkflownode(Set<WorkflowNodeModel> workflownode){
		this.workflownode =workflownode;
	}

	/**
	 * 
	 * @param workflowphase
	 */
	public void setworkflowphase(WorkflowPhaseModel workflowphase){
		this.workflowphase =workflowphase;
	}

	@Override
	public String toString(){
		return "WorkflowStageModel [id=" + id + ",]";
	}

}