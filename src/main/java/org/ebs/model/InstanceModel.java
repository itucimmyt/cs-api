///////////////////////////////////////////////////////////
//  InstanceModel.java
//  Macromedia ActionScript Implementation of the Class InstanceModel
//  Generated by Enterprise Architect
//  Created on:      23-Jul-2020 10:46:28 PM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.model;

import org.ebs.util.Auditable;
import javax.persistence.JoinColumn;
import javax.persistence.FetchType;
import java.util.Set;
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
 * @created 23-Jul-2020 10:46:28 PM
 */
@Entity @Table(name="Instance",schema="tenant")
public class InstanceModel extends Auditable {

	private static final long serialVersionUID = 454190722;
	@Column(name="server")
	private String server;
	@Column(name="port")
	private String port;
	@Column(name="health")
	private String health;
	@GeneratedValue(strategy= GenerationType.IDENTITY) @Id @Column
	private int id;
	@OneToMany(mappedBy = "instance",fetch=FetchType.LAZY, cascade = CascadeType.ALL)
	Set<SessionModel> sessions;
	@OneToMany(mappedBy = "instance",fetch=FetchType.LAZY, cascade = CascadeType.ALL)
	Set<AuditLogsModel> auditlogss;
	@ManyToOne(fetch=FetchType.LAZY, optional =true) @JoinColumn(name="component_id")
	ComponentModel component;
	@ManyToOne(fetch=FetchType.LAZY, optional =false) @JoinColumn(name="tenant_id")
	TenantModel tenant;

	public Set<AuditLogsModel> getauditlogss(){
		return auditlogss;
	}

	public ComponentModel getcomponent(){
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

	public Set<SessionModel> getsessions(){
		return sessions;
	}

	public TenantModel gettenant(){
		return tenant;
	}

	/**
	 * 
	 * @param auditlogs
	 */
	public void setauditlogss(Set<AuditLogsModel> auditlogs){
		this.auditlogss =auditlogs;
	}

	/**
	 * 
	 * @param component
	 */
	public void setcomponent(ComponentModel component){
		this.component =component;
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
	public void setsessions(Set<SessionModel> session){
		this.sessions =session;
	}

	/**
	 * 
	 * @param tenant
	 */
	public void settenant(TenantModel tenant){
		this.tenant =tenant;
	}

	@Override
	public String toString(){
		return "InstanceModel [id=" + id + ",]";
	}

}