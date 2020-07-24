///////////////////////////////////////////////////////////
//  HtmlTagModel.java
//  Macromedia ActionScript Implementation of the Class HtmlTagModel
//  Generated by Enterprise Architect
//  Created on:      23-Jul-2020 10:46:27 PM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.model;

import org.ebs.util.Auditable;
import javax.persistence.FetchType;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 23-Jul-2020 10:46:27 PM
 */
@Entity @Table(name="HtmlTag",schema="tenant")
public class HtmlTagModel extends Auditable {

	private static final long serialVersionUID = -443949470;
	@Column(name="tagName")
	private String tagName;
	@GeneratedValue(strategy= GenerationType.IDENTITY) @Id @Column
	private int id;
	@OneToMany(mappedBy = "htmltag",fetch=FetchType.LAZY, cascade = CascadeType.ALL)
	Set<TranslationModel> translations;

	public int getId(){
		return id;
	}

	public String gettagName(){
		return tagName;
	}

	public Set<TranslationModel> gettranslations(){
		return translations;
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
	 * @param tagname
	 */
	public void settagName(String tagname){
		this.tagName = tagname;
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
		return "HtmlTagModel [id=" + id + ",]";
	}

}