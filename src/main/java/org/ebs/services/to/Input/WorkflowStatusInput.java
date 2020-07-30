///////////////////////////////////////////////////////////
//  WorkflowStatusInput.java
//  Macromedia ActionScript Implementation of the Class WorkflowStatusInput
//  Generated by Enterprise Architect
//  Created on:      27-Jul-2020 8:44:09 AM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.services.to.Input;

import java.io.Serializable;
import java.util.Date;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 27-Jul-2020 8:44:09 AM
 */
public class WorkflowStatusInput implements Serializable {

	private static final long serialVersionUID = -122217147;
	private int id;
	private int tenant;
	private Date initiate_date;
	private Date completation_date;
	WorkflowStatusTypeInput workflowstatustype;
	WorkflowInstanceInput workflowinstance;

	public Date getcompletation_date(){
		return completation_date;
	}

	public int getId(){
		return id;
	}

	public Date getinitiate_date(){
		return initiate_date;
	}

	public int getTenant(){
		return tenant;
	}

	public WorkflowInstanceInput getworkflowinstance(){
		return workflowinstance;
	}

	public WorkflowStatusTypeInput getworkflowstatustype(){
		return workflowstatustype;
	}

	/**
	 * 
	 * @param completation_date
	 */
	public void setcompletation_date(Date completation_date){
		this.completation_date = completation_date;
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
	 * @param initiate_date
	 */
	public void setinitiate_date(Date initiate_date){
		this.initiate_date = initiate_date;
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
	 * @param workflowinstance
	 */
	public void setworkflowinstance(WorkflowInstanceInput workflowinstance){
		this.workflowinstance =workflowinstance;
	}

	/**
	 * 
	 * @param workflowstatustype
	 */
	public void setworkflowstatustype(WorkflowStatusTypeInput workflowstatustype){
		this.workflowstatustype =workflowstatustype;
	}

}