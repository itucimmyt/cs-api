///////////////////////////////////////////////////////////
//  WorkflowNodeTo.java
//  Macromedia ActionScript Implementation of the Class WorkflowNodeTo
//  Generated by Enterprise Architect
//  Created on:      09-Aug-2020 4:52:03 PM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.services.to;

import java.io.Serializable;
import java.util.Set;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 09-Aug-2020 4:52:03 PM
 */
public class WorkflowNodeTo implements Serializable {

	private static final long serialVersionUID = 381779208;
	private int id;
	private int tenant;
	private String name;
	private String description;
	private String help;
	private int sequence;
	private boolean require_approval;
	Set<WorkflowStageTo> workflowstages;
	WorkflowTo workflow;
	Set<ActionTo> actions;
	EntityReferenceTo entityreference;
	Set<WorkflowEventTo> workflowevents;
	HtmlTagTo htmltag;
	Set<WorkflowTo> workflows;
	ModuleTo module;
	Set<WorkflowNodeCFTo> workflownodecfs;
	ProcessTo process;

	public Set<ActionTo> getactions(){
		return actions;
	}

	public String getdescription(){
		return description;
	}

	public EntityReferenceTo getentityreference(){
		return entityreference;
	}

	public String gethelp(){
		return help;
	}

	public HtmlTagTo gethtmltag(){
		return htmltag;
	}

	public int getId(){
		return id;
	}

	public ModuleTo getmodule(){
		return module;
	}

	public String getname(){
		return name;
	}

	public ProcessTo getprocess(){
		return process;
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

	public WorkflowTo getworkflow(){
		return workflow;
	}

	public Set<WorkflowEventTo> getworkflowevents(){
		return workflowevents;
	}

	public Set<WorkflowNodeCFTo> getworkflownodecfs(){
		return workflownodecfs;
	}

	public Set<WorkflowTo> getworkflows(){
		return workflows;
	}

	public Set<WorkflowStageTo> getworkflowstages(){
		return workflowstages;
	}

	/**
	 * 
	 * @param action
	 */
	public void setactions(Set<ActionTo> action){
		this.actions =action;
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
	 * @param entityreference
	 */
	public void setentityreference(EntityReferenceTo entityreference){
		this.entityreference =entityreference;
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
	 * @param htmltag
	 */
	public void sethtmltag(HtmlTagTo htmltag){
		this.htmltag =htmltag;
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
	public void setmodule(ModuleTo module){
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
	public void setprocess(ProcessTo process){
		this.process =process;
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
	public void setworkflow(WorkflowTo workflow){
		this.workflow =workflow;
	}

	/**
	 * 
	 * @param workflowevent
	 */
	public void setworkflowevents(Set<WorkflowEventTo> workflowevent){
		this.workflowevents =workflowevent;
	}

	/**
	 * 
	 * @param workflownodecf
	 */
	public void setworkflownodecfs(Set<WorkflowNodeCFTo> workflownodecf){
		this.workflownodecfs =workflownodecf;
	}

	/**
	 * 
	 * @param workflow
	 */
	public void setworkflows(Set<WorkflowTo> workflow){
		this.workflows =workflow;
	}

	/**
	 * 
	 * @param workflowstage
	 */
	public void setworkflowstages(Set<WorkflowStageTo> workflowstage){
		this.workflowstages =workflowstage;
	}

	@Override
	public String toString(){
		return "WorkflowNodeTo [sequence=" + sequence + ",require_approval=" + require_approval + ",]";
	}

}