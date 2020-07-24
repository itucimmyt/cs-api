///////////////////////////////////////////////////////////
//  AlertRuleInput.java
//  Macromedia ActionScript Implementation of the Class AlertRuleInput
//  Generated by Enterprise Architect
//  Created on:      23-Jul-2020 10:46:02 PM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.services.to.Input;

import java.io.Serializable;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 23-Jul-2020 10:46:02 PM
 */
public class AlertRuleInput implements Serializable {

	private static final long serialVersionUID = -523584626;
	private int id;
	private int tenant;
	private String name;
	private String sql;
	private String filterClause;
	AlertInput alert;

	public AlertInput getalert(){
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
	public void setalert(AlertInput alert){
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
		this.id=id;
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

}