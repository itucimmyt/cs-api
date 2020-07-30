///////////////////////////////////////////////////////////
//  WorkflowCFValueTo.java
//  Macromedia ActionScript Implementation of the Class WorkflowCFValueTo
//  Generated by Enterprise Architect
//  Created on:      27-Jul-2020 8:43:53 AM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.services.to;

import java.io.Serializable;
import java.util.Date;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 27-Jul-2020 8:43:53 AM
 */
public class WorkflowCFValueTo implements Serializable {

	private static final long serialVersionUID = -21301702;
	private int id;
	private int tenant;
	private boolean FLAG_Value;
	private String TEXT_Value;
	private int NUM_Value;
	private Date DATE_Value;
	private int CODE_Value;
	RequestTo request;
	WorkflowNodeCFTo workflownodecf;

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

	public RequestTo getrequest(){
		return request;
	}

	public int getTenant(){
		return tenant;
	}

	public String getTEXT_Value(){
		return TEXT_Value;
	}

	public WorkflowNodeCFTo getworkflownodecf(){
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
		this.id=id;
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
	public void setrequest(RequestTo request){
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
	public void setworkflownodecf(WorkflowNodeCFTo workflownodecf){
		this.workflownodecf =workflownodecf;
	}

	@Override
	public String toString(){
		return "WorkflowCFValueTo [FLAG_Value=" + FLAG_Value + ",NUM_Value=" + NUM_Value + ",CODE_Value=" + CODE_Value + ",]";
	}

}