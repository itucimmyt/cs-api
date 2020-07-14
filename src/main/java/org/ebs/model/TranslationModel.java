///////////////////////////////////////////////////////////
//  TranslationModel.java
//  Macromedia ActionScript Implementation of the Class TranslationModel
//  Generated by Enterprise Architect
//  Created on:      13-Jul-2020 5:07:28 PM
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
 * @created 13-Jul-2020 5:07:28 PM
 */
@Entity @Table(name="Translation",schema="tenant")
public class TranslationModel extends Auditable {

	private static final long serialVersionUID = -319421320;
	@Column(name="translation")
	private String translation;
	@Column(name="languageTo")
	private int languageTo;
	@GeneratedValue(strategy= GenerationType.IDENTITY) @Id @Column
	private int id;
	@ManyToOne(fetch=FetchType.LAZY, optional =true) @JoinColumn(name="alert_id")
	AlertModel alert;
	@ManyToOne(fetch=FetchType.LAZY, optional =true) @JoinColumn(name="attributes_id")
	AttributesModel attributes;
	@ManyToOne(fetch=FetchType.LAZY, optional =true) @JoinColumn(name="language_id")
	LanguageModel language;
	@ManyToOne(fetch=FetchType.LAZY, optional =true) @JoinColumn(name="message_id")
	MessageModel message;
	@ManyToOne(fetch=FetchType.LAZY, optional =true) @JoinColumn(name="htmltag_id")
	HtmlTagModel htmltag;
	@ManyToOne(fetch=FetchType.LAZY, optional =true) @JoinColumn(name="module_id")
	ModuleModel module;

	public AlertModel getalert(){
		return alert;
	}

	public AttributesModel getattributes(){
		return attributes;
	}

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

	public MessageModel getmessage(){
		return message;
	}

	public ModuleModel getmodule(){
		return module;
	}

	public String gettranslation(){
		return translation;
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
	 * @param attributes
	 */
	public void setattributes(AttributesModel attributes){
		this.attributes =attributes;
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
	 * @param message
	 */
	public void setmessage(MessageModel message){
		this.message =message;
	}

	/**
	 * 
	 * @param module
	 */
	public void setmodule(ModuleModel module){
		this.module =module;
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