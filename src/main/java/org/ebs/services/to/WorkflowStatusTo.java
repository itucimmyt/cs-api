///////////////////////////////////////////////////////////
//  WorkflowStatusTo.java
//  Macromedia ActionScript Implementation of the Class WorkflowStatusTo
//  Generated by Enterprise Architect
//  Created on:      13-Jul-2020 5:07:55 PM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.services.to;

import java.io.Serializable;
import java.util.Date;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 13-Jul-2020 5:07:55 PM
 */
public class WorkflowStatusTo implements Serializable {

	private static final long serialVersionUID = -378619942;
	private int id;
	private int tenant;
	private Date initiate_date;
	private Date completation_date;
	WorkflowStatusTypeTo workflowstatustype;
	WorkflowInstanceTo workflowinstance;

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

	public WorkflowInstanceTo getworkflowinstance(){
		return workflowinstance;
	}

	public WorkflowStatusTypeTo getworkflowstatustype(){
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
	public void setworkflowinstance(WorkflowInstanceTo workflowinstance){
		this.workflowinstance =workflowinstance;
	}

	/**
	 * 
	 * @param workflowstatustype
	 */
	public void setworkflowstatustype(WorkflowStatusTypeTo workflowstatustype){
		this.workflowstatustype =workflowstatustype;
	}

	@Override
	public String toString(){
		return "WorkflowStatusTo []";
	}

}