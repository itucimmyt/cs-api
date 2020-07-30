///////////////////////////////////////////////////////////
//  AuditLogsModel.java
//  Macromedia ActionScript Implementation of the Class AuditLogsModel
//  Generated by Enterprise Architect
//  Created on:      27-Jul-2020 8:42:10 AM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.model;

import org.ebs.util.Auditable;
import javax.persistence.JoinColumn;
import javax.persistence.FetchType;
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
 * @created 27-Jul-2020 8:42:10 AM
 */
@Entity @Table(name="AuditLogs",schema="tenant")
public class AuditLogsModel extends Auditable {

	private static final long serialVersionUID = 410056764;
	@Column(name="tenant_id")
	private int tenant;
	@Column(name="correlationId")
	private String correlationId;
	@Column(name="message")
	private String message;
	@GeneratedValue(strategy= GenerationType.IDENTITY) @Id @Column
	private int id;
	@ManyToOne(fetch=FetchType.LAZY, optional =false) @JoinColumn(name="instance_id")
	InstanceModel instance;

	public String getcorrelationId(){
		return correlationId;
	}

	public int getId(){
		return id;
	}

	public InstanceModel getinstance(){
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
		this.id = id;
	}

	/**
	 * 
	 * @param instance
	 */
	public void setinstance(InstanceModel instance){
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
		return "AuditLogsModel [id=" + id + ",]";
	}

}