///////////////////////////////////////////////////////////
//  WorkflowCFValueModel.java
//  Macromedia ActionScript Implementation of the Class WorkflowCFValueModel
//  Generated by Enterprise Architect
//  Created on:      23-Jul-2020 10:47:31 PM
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
 * @created 23-Jul-2020 10:47:31 PM
 */
@Entity @Table(name="WorkflowCFValue",schema="tenant")
public class WorkflowCFValueModel extends Auditable {

	private static final long serialVersionUID = -226370928;
	@Column(name="tenant_id")
	private int tenant;
	@Column(name="FLAG_Value")
	private boolean FLAG_Value;
	@Column(name="TEXT_Value")
	private String TEXT_Value;
	@Column(name="NUM_Value")
	private int NUM_Value;
	@Column(name="DATE_Value")
	private Date DATE_Value;
	@Column(name="CODE_Value")
	private int CODE_Value;
	@GeneratedValue(strategy= GenerationType.IDENTITY) @Id @Column
	private int id;
	@ManyToOne(fetch=FetchType.LAZY, optional =true) @JoinColumn(name="request_id")
	RequestModel request;
	@ManyToOne(fetch=FetchType.LAZY, optional =false) @JoinColumn(name="workflownodecf_id")
	WorkflowNodeCFModel workflownodecf;

	public int getCODE_Value(){
		return CODE_Value;
	}

	public Date getDATE_Value(){
		return DATE_Value;
	}

	public boolean getFLAG_Value(){
		return FLAG_Value;
	}

	public int getId(){
		return id;
	}

	public int getNUM_Value(){
		return NUM_Value;
	}

	public RequestModel getrequest(){
		return request;
	}

	public int getTenant(){
		return tenant;
	}

	public String getTEXT_Value(){
		return TEXT_Value;
	}

	public WorkflowNodeCFModel getworkflownodecf(){
		return workflownodecf;
	}

	/**
	 * 
	 * @param code_value
	 */
	public void setCODE_Value(int code_value){
		this.CODE_Value = code_value;
	}

	/**
	 * 
	 * @param date_value
	 */
	public void setDATE_Value(Date date_value){
		this.DATE_Value = date_value;
	}

	/**
	 * 
	 * @param flag_value
	 */
	public void setFLAG_Value(boolean flag_value){
		this.FLAG_Value = flag_value;
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
	 * @param num_value
	 */
	public void setNUM_Value(int num_value){
		this.NUM_Value = num_value;
	}

	/**
	 * 
	 * @param request
	 */
	public void setrequest(RequestModel request){
		this.request =request;
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
	 * @param text_value
	 */
	public void setTEXT_Value(String text_value){
		this.TEXT_Value = text_value;
	}

	/**
	 * 
	 * @param workflownodecf
	 */
	public void setworkflownodecf(WorkflowNodeCFModel workflownodecf){
		this.workflownodecf =workflownodecf;
	}

	@Override
	public String toString(){
		return "WorkflowCFValueModel [FLAG_Value=" + FLAG_Value + ",NUM_Value=" + NUM_Value + ",CODE_Value=" + CODE_Value + ",id=" + id + ",]";
	}

}