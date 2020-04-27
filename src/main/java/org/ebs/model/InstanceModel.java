///////////////////////////////////////////////////////////
//  InstanceModel.java
//  Macromedia ActionScript Implementation of the Class InstanceModel
//  Generated by Enterprise Architect
//  Created on:      27-Apr-2020 9:47:41 AM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.model;

import org.ebs.util.Auditable;
import javax.persistence.JoinColumn;
import javax.persistence.FetchType;
import java.util.Set;
import java.util.Date;
import java.util.UUID;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 27-Apr-2020 9:47:41 AM
 */
@Entity @Table(name="Instance",schema="tnt")
public class InstanceModel extends Auditable {

	@OneToMany(mappedBy = "instance",fetch=FetchType.EAGER, cascade = CascadeType.ALL)
	Set<AuditLogsModel> AuditLogss;
	@ManyToOne(fetch=FetchType.EAGER, optional =false) @JoinColumn(name="component_id")
	ComponentModel component;
	@Column(name="health")
	private String health;
	@GeneratedValue(strategy= GenerationType.IDENTITY) @Id @Column
	private int id;
	@Column(name="port")
	private String port;
	@Column(name="server")
	private String server;
	@OneToMany(mappedBy = "instance",fetch=FetchType.EAGER, cascade = CascadeType.ALL)
	Set<SessionModel> Sessions;
	@ManyToOne(fetch=FetchType.EAGER, optional =false) @JoinColumn(name="tenant_id")
	TenantModel tenant;

	public Set<AuditLogsModel> getAuditLogss(){
		return AuditLogss;
	}

	public ComponentModel getComponent(){
		 return component;
	}

	public String gethealth(){
		return health;
	}

	public int getId(){
		return id;
	}

	public String getport(){
		return port;
	}

	public String getserver(){
		return server;
	}

	public Set<SessionModel> getSessions(){
		return Sessions;
	}

	public TenantModel getTenant(){
		 return tenant;
	}

	/**
	 * 
	 * @param auditlogs
	 */
	public void setAuditLogss(Set<AuditLogsModel> auditlogs){
		this.AuditLogss =auditlogs;
	}

	/**
	 * 
	 * @param component
	 */
	public void setComponent(ComponentModel component){
		this.component = component;
	}

	/**
	 * 
	 * @param health
	 */
	public void sethealth(String health){
		this.health = health;
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
	 * @param port
	 */
	public void setport(String port){
		this.port = port;
	}

	/**
	 * 
	 * @param server
	 */
	public void setserver(String server){
		this.server = server;
	}

	/**
	 * 
	 * @param session
	 */
	public void setSessions(Set<SessionModel> session){
		this.Sessions =session;
	}

	/**
	 * 
	 * @param tenant
	 */
	public void setTenant(TenantModel tenant){
		this.tenant = tenant;
	}

}