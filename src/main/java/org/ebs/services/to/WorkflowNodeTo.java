///////////////////////////////////////////////////////////
//  WorkflowNodeTo.java
//  Macromedia ActionScript Implementation of the Class WorkflowNodeTo
//  Generated by Enterprise Architect
//  Created on:      15-Jun-2020 5:15:01 PM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.services.to;

import java.util.Set;
import java.io.Serializable;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 15-Jun-2020 5:15:01 PM
 */
public class WorkflowNodeTo implements Serializable {

	private static final long serialVersionUID = -343345980;
	private int id;
	private int tenant;
	private String name;
	private String description;
	private String help;
	private int sequence;
	private boolean require_approval;
	WorkflowTo workflow;
	Set<WorkflowEventTo> workflowevents;
	Set<WorkflowStatusTo> workflowstatuss;
	Set<WorkflowStageTo> workflowstages;
	Set<WorkflowTo> workflows;
	Set<ProcessTo> processs;
	Set<ModuleTo> modules;
	Set<WorkflowNodeCFTo> workflownodecfs;

	public String getdescription(){
		return description;
	}

	public String gethelp(){
		return help;
	}

	public int getId(){
		return id;
	}

	public Set<ModuleTo> getModules(){
		return modules;
	}

	public String getname(){
		return name;
	}

	public Set<ProcessTo> getProcesss(){
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

	public WorkflowTo getWorkflow(){
		return workflow;
	}

	public Set<WorkflowEventTo> getWorkflowEvents(){
		return workflowevents;
	}

	public Set<WorkflowNodeCFTo> getWorkflowNodeCFs(){
		return workflownodecfs;
	}

	public Set<WorkflowTo> getWorkflows(){
		return workflows;
	}

	public Set<WorkflowStageTo> getWorkflowStages(){
		return workflowstages;
	}

	public Set<WorkflowStatusTo> getWorkflowStatuss(){
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
	 * @param module
	 */
	public void setModules(Set<ModuleTo> module){
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
	public void setProcesss(Set<ProcessTo> process){
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
	public void setWorkflow(WorkflowTo workflow){
		this.workflow =workflow;
	}

	/**
	 * 
	 * @param workflowevent
	 */
	public void setWorkflowEvents(Set<WorkflowEventTo> workflowevent){
		this.workflowevents =workflowevent;
	}

	/**
	 * 
	 * @param workflownodecf
	 */
	public void setWorkflowNodeCFs(Set<WorkflowNodeCFTo> workflownodecf){
		this.workflownodecfs =workflownodecf;
	}

	/**
	 * 
	 * @param workflow
	 */
	public void setWorkflows(Set<WorkflowTo> workflow){
		this.workflows =workflow;
	}

	/**
	 * 
	 * @param workflowstage
	 */
	public void setWorkflowStages(Set<WorkflowStageTo> workflowstage){
		this.workflowstages =workflowstage;
	}

	/**
	 * 
	 * @param workflowstatus
	 */
	public void setWorkflowStatuss(Set<WorkflowStatusTo> workflowstatus){
		this.workflowstatuss =workflowstatus;
	}

	@Override
	public String toString(){
		return "WorkflowNodeTo [sequence=" + sequence + ",require_approval=" + require_approval + ",]";
	}

}