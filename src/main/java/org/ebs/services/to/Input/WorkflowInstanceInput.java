///////////////////////////////////////////////////////////
//  WorkflowInstanceInput.java
//  Macromedia ActionScript Implementation of the Class WorkflowInstanceInput
//  Generated by Enterprise Architect
//  Created on:      09-Aug-2020 4:51:57 PM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.services.to.Input;

import java.io.Serializable;
import java.util.Date;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 09-Aug-2020 4:51:57 PM
 */
public class WorkflowInstanceInput implements Serializable {

	private static final long serialVersionUID = 107184325;
	private int id;
	private int tenant;
	private Date complete;
	private Date initiated;
	WorkflowInput workflow;

	public Date getcomplete(){
		return complete;
	}

	public int getId(){
		return id;
	}

	public Date getinitiated(){
		return initiated;
	}

	public int getTenant(){
		return tenant;
	}

	public WorkflowInput getworkflow(){
		return workflow;
	}

	/**
	 * 
	 * @param complete
	 */
	public void setcomplete(Date complete){
		this.complete = complete;
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
	 * @param initiated
	 */
	public void setinitiated(Date initiated){
		this.initiated = initiated;
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
	public void setworkflow(WorkflowInput workflow){
		this.workflow =workflow;
	}

}