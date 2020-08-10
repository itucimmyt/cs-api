///////////////////////////////////////////////////////////
//  AuditLogsTo.java
//  Macromedia ActionScript Implementation of the Class AuditLogsTo
//  Generated by Enterprise Architect
//  Created on:      09-Aug-2020 4:50:19 PM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.services.to;

import java.io.Serializable;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 09-Aug-2020 4:50:19 PM
 */
public class AuditLogsTo implements Serializable {

	private static final long serialVersionUID = 95001528;
	private int id;
	private int tenant;
	private String correlationId;
	private String message;
	InstanceTo instance;

	public String getcorrelationId(){
		return correlationId;
	}

	public int getId(){
		return id;
	}

	public InstanceTo getinstance(){
		return instance;
	}

	public String getmessage(){
		return message;
	}

	public int getTenant(){
		return tenant;
	}

	/**
	 * 
	 * @param correlationid
	 */
	public void setcorrelationId(String correlationid){
		this.correlationId = correlationid;
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
	 * @param instance
	 */
	public void setinstance(InstanceTo instance){
		this.instance =instance;
	}

	/**
	 * 
	 * @param message
	 */
	public void setmessage(String message){
		this.message = message;
	}

	/**
	 * 
	 * @param tenantid
	 */
	public void setTenant(int tenantid){
		this.tenant=tenantid;
	}

	@Override
	public String toString(){
		return "AuditLogsTo []";
	}

}