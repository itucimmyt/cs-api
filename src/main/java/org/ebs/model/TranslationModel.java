///////////////////////////////////////////////////////////
//  TranslationModel.java
//  Macromedia ActionScript Implementation of the Class TranslationModel
//  Generated by Enterprise Architect
//  Created on:      27-Jul-2020 8:43:44 AM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.model;

import javax.persistence.JoinColumn;
import javax.persistence.FetchType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import org.ebs.util.Auditable;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 27-Jul-2020 8:43:44 AM
 */
@Entity @Table(name="Translation",schema="tenant")
public class TranslationModel extends Auditable {

	private static final long serialVersionUID = 274171595;
	@Column(name="translation")
	private String translation;
	@Column(name="languageTo")
	private int languageTo;
	@GeneratedValue(strategy= GenerationType.IDENTITY) @Id @Column
	private int id;
	@ManyToOne(fetch=FetchType.LAZY, optional =true) @JoinColumn(name="language_id")
	LanguageModel language;
	@ManyToOne(fetch=FetchType.LAZY, optional =true) @JoinColumn(name="htmltag_id")
	HtmlTagModel htmltag;

	public HtmlTagModel gethtmltag(){
		return htmltag;
	}

	public int getId(){
		return id;
	}

	public LanguageModel getlanguage(){
		return language;
	}

	public int getlanguageTo(){
		return languageTo;
	}

	public String gettranslation(){
		return translation;
	}

	/**
	 * 
	 * @param htmltag
	 */
	public void sethtmltag(HtmlTagModel htmltag){
		this.htmltag =htmltag;
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
	 * @param language
	 */
	public void setlanguage(LanguageModel language){
		this.language =language;
	}

	/**
	 * 
	 * @param languageto
	 */
	public void setlanguageTo(int languageto){
		this.languageTo = languageto;
	}

	/**
	 * 
	 * @param translation
	 */
	public void settranslation(String translation){
		this.translation = translation;
	}

	@Override
	public String toString(){
		return "TranslationModel [languageTo=" + languageTo + ",id=" + id + ",]";
	}

}