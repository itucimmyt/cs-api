///////////////////////////////////////////////////////////
//  WorkflowStatusModel.java
//  Macromedia ActionScript Implementation of the Class WorkflowStatusModel
//  Generated by Enterprise Architect
//  Created on:      23-Jul-2020 10:47:44 PM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.model;

import org.ebs.util.Auditable;
import javax.persistence.JoinColumn;
import javax.persistence.FetchType;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 23-Jul-2020 10:47:44 PM
 */
@Entity @Table(name="WorkflowStatus",schema="tenant")
public class WorkflowStatusModel extends Auditable {

	private static final long serialVersionUID = -442644446;
	@Column(name="tenant_id")
	private int tenant;
	@Column(name="initiate_date")
	private Date initiate_date;
	@Column(name="completation_date")
	private Date completation_date;
	@GeneratedValue(strategy= GenerationType.IDENTITY) @Id @Column
	private int id;
	@ManyToOne(fetch=FetchType.LAZY, optional =false) @JoinColumn(name="workflowstatustype_id")
	WorkflowStatusTypeModel workflowstatustype;
	@ManyToOne(fetch=FetchType.LAZY, optional =true) @JoinColumn(name="workflowinstance_id")
	WorkflowInstanceModel workflowinstance;

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

	public WorkflowInstanceModel getworkflowinstance(){
		return workflowinstance;
	}

	public WorkflowStatusTypeModel getworkflowstatustype(){
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
		this.id = id;
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
	public void setworkflowinstance(WorkflowInstanceModel workflowinstance){
		this.workflowinstance =workflowinstance;
	}

	/**
	 * 
	 * @param workflowstatustype
	 */
	public void setworkflowstatustype(WorkflowStatusTypeModel workflowstatustype){
		this.workflowstatustype =workflowstatustype;
	}

	@Override
	public String toString(){
		return "WorkflowStatusModel [id=" + id + ",]";
	}

}