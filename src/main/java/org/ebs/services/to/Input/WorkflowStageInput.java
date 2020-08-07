///////////////////////////////////////////////////////////
//  WorkflowStageInput.java
//  Macromedia ActionScript Implementation of the Class WorkflowStageInput
//  Generated by Enterprise Architect
//  Created on:      07-Aug-2020 3:02:52 PM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.services.to.Input;

import java.io.Serializable;
import java.util.Set;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 07-Aug-2020 3:02:52 PM
 */
public class WorkflowStageInput implements Serializable {

	private static final long serialVersionUID = -136062234;
	private int id;
	private int tenant;
	private String name;
	private String description;
	private String help;
	private int sequence;
	WorkflowPhaseInput workflowphase;
	HtmlTagInput htmltag;
	Set<WorkflowNodeInput> workflownode;

	public String getdescription(){
		return description;
	}

	public String gethelp(){
		return help;
	}

	public HtmlTagInput gethtmltag(){
		return htmltag;
	}

	public int getId(){
		return id;
	}

	public String getname(){
		return name;
	}

	public int getsequence(){
		return sequence;
	}

	public int getTenant(){
		return tenant;
	}

	public Set<WorkflowNodeInput> getworkflownode(){
		return workflownode;
	}

	public WorkflowPhaseInput getworkflowphase(){
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
	 * @param htmltag
	 */
	public void sethtmltag(HtmlTagInput htmltag){
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
	 * @param name
	 */
	public void setname(String name){
		this.name = name;
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
	 * @param workflownode
	 */
	public void setworkflownode(Set<WorkflowNodeInput> workflownode){
		this.workflownode =workflownode;
	}

	/**
	 * 
	 * @param workflowphase
	 */
	public void setworkflowphase(WorkflowPhaseInput workflowphase){
		this.workflowphase =workflowphase;
	}

}