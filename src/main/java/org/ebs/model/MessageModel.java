///////////////////////////////////////////////////////////
//  MessageModel.java
//  Macromedia ActionScript Implementation of the Class MessageModel
//  Generated by Enterprise Architect
//  Created on:      13-Jul-2020 5:06:41 PM
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
 * @created 13-Jul-2020 5:06:41 PM
 */
@Entity @Table(name="Message",schema="tenant")
public class MessageModel extends Auditable {

	private static final long serialVersionUID = -208329636;
	@Column(name="Description")
	private String Description;
	@Column(name="sql")
	private String sql;
	@Column(name="filterClause")
	private String filterClause;
	@GeneratedValue(strategy= GenerationType.IDENTITY) @Id @Column
	private int id;
	@OneToMany(mappedBy = "message",fetch=FetchType.LAZY, cascade = CascadeType.ALL)
	Set<TranslationModel> translations;
	@ManyToOne(fetch=FetchType.LAZY, optional =true) @JoinColumn(name="component_id")
	ComponentModel component;

	public ComponentModel getcomponent(){
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

	public Set<TranslationModel> gettranslations(){
		return translations;
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
		this.id = id;
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
	public void settranslations(Set<TranslationModel> translation){
		this.translations =translation;
	}

	@Override
	public String toString(){
		return "MessageModel [id=" + id + ",]";
	}

}