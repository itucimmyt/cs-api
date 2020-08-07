///////////////////////////////////////////////////////////
//  AlertRuleModel.java
//  Macromedia ActionScript Implementation of the Class AlertRuleModel
//  Generated by Enterprise Architect
//  Created on:      07-Aug-2020 2:59:00 PM
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
 * @created 07-Aug-2020 2:59:00 PM
 */
@Entity @Table(name="AlertRule",schema="tenant")
public class AlertRuleModel extends Auditable {

	private static final long serialVersionUID = 64489524;
	@Column(name="tenant_id")
	private int tenant;
	@Column(name="name")
	private String name;
	@Column(name="sql")
	private String sql;
	@Column(name="filterClause")
	private String filterClause;
	@GeneratedValue(strategy= GenerationType.IDENTITY) @Id @Column
	private int id;
	@ManyToOne(fetch=FetchType.LAZY, optional =false) @JoinColumn(name="alert_id")
	AlertModel alert;

	public AlertModel getalert(){
		return alert;
	}

	public String getfilterClause(){
		return filterClause;
	}

	public int getId(){
		return id;
	}

	public String getname(){
		return name;
	}

	public String getsql(){
		return sql;
	}

	public int getTenant(){
		return tenant;
	}

	/**
	 * 
	 * @param alert
	 */
	public void setalert(AlertModel alert){
		this.alert =alert;
	}

	/**
	 * 
	 * @param filterclause
	 */
	public void setfilterClause(String filterclause){
		this.filterClause = filterclause;
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
	 * @param name
	 */
	public void setname(String name){
		this.name = name;
	}

	/**
	 * 
	 * @param sql
	 */
	public void setsql(String sql){
		this.sql = sql;
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
		return "AlertRuleModel [id=" + id + ",]";
	}

}