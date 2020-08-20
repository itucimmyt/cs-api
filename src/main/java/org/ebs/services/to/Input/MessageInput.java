///////////////////////////////////////////////////////////
//  MessageInput.java
//  Macromedia ActionScript Implementation of the Class MessageInput
//  Generated by Enterprise Architect
//  Created on:      20-Aug-2020 1:05:53 PM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.services.to.Input;

import java.io.Serializable;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 20-Aug-2020 1:05:53 PM
 */
public class MessageInput implements Serializable {

	private static final long serialVersionUID = 155095852;
	private int id;
	private String Description;
	private String sql;
	private String filterClause;
	HtmlTagInput htmltag;

	public String getDescription(){
		return Description;
	}

	public String getfilterClause(){
		return filterClause;
	}

	public HtmlTagInput gethtmltag(){
		return htmltag;
	}

	public int getId(){
		return id;
	}

	public String getsql(){
		return sql;
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
	 * @param htmltag
	 */
	public void sethtmltag(HtmlTagInput htmltag){
		this.htmltag =htmltag;
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