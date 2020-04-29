///////////////////////////////////////////////////////////
//  MessageInput.java
//  Macromedia ActionScript Implementation of the Class MessageInput
//  Generated by Enterprise Architect
//  Created on:      28-Apr-2020 11:58:17 PM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.services.to.Input;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 28-Apr-2020 11:58:17 PM
 */
public class MessageInput implements Serializable {

	private static final long serialVersionUID = -267251490;
	private int id;
	private String Description;
	private String sql;
	private String filterClause;
	ComponentInput component;

	public ComponentInput getComponent(){
		return component;
	}

	public String getDescription(){
		return Description;
	}

	public String getfilterClause(){
		return filterClause;
	}

	public int getId(){
		return id;
	}

	public String getsql(){
		return sql;
	}

	/**
	 * 
	 * @param component
	 */
	public void setComponent(ComponentInput component){
		this.component =component;
	}

	/**
	 * 
	 * @param description
	 */
	public void setDescription(String description){
		this.Description = description;
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
	 * @param sql
	 */
	public void setsql(String sql){
		this.sql = sql;
	}

}