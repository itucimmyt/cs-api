///////////////////////////////////////////////////////////
//  MessageTo.java
//  Macromedia ActionScript Implementation of the Class MessageTo
//  Generated by Enterprise Architect
//  Created on:      28-Apr-2020 11:58:17 PM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.services.to;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;
import org.ebs.model.TranslationModel;
import org.ebs.model.ComponentModel;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 28-Apr-2020 11:58:17 PM
 */
public class MessageTo implements Serializable {

	private static final long serialVersionUID = 115505982;
	private int id;
	private String Description;
	private String sql;
	private String filterClause;
	Set<TranslationTo> translations;
	ComponentTo component;

	public ComponentTo getComponent(){
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

	public Set<TranslationTo> getTranslations(){
		return translations;
	}

	/**
	 * 
	 * @param component
	 */
	public void setComponent(ComponentTo component){
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

	/**
	 * 
	 * @param translation
	 */
	public void setTranslations(Set<TranslationTo> translation){
		this.translations =translation;
	}

}