///////////////////////////////////////////////////////////
//  TranslationTo.java
//  Macromedia ActionScript Implementation of the Class TranslationTo
//  Generated by Enterprise Architect
//  Created on:      13-Jul-2020 5:07:30 PM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.services.to;

import java.io.Serializable;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 13-Jul-2020 5:07:30 PM
 */
public class TranslationTo implements Serializable {

	private static final long serialVersionUID = -501049562;
	private int id;
	private String translation;
	private int languageTo;
	AlertTo alert;
	AttributesTo attributes;
	LanguageTo language;
	MessageTo message;
	HtmlTagTo htmltag;
	ModuleTo module;

	public AlertTo getalert(){
		return alert;
	}

	public AttributesTo getattributes(){
		return attributes;
	}

	public HtmlTagTo gethtmltag(){
		return htmltag;
	}

	public int getId(){
		return id;
	}

	public LanguageTo getlanguage(){
		return language;
	}

	public int getlanguageTo(){
		return languageTo;
	}

	public MessageTo getmessage(){
		return message;
	}

	public ModuleTo getmodule(){
		return module;
	}

	public String gettranslation(){
		return translation;
	}

	/**
	 * 
	 * @param alert
	 */
	public void setalert(AlertTo alert){
		this.alert =alert;
	}

	/**
	 * 
	 * @param attributes
	 */
	public void setattributes(AttributesTo attributes){
		this.attributes =attributes;
	}

	/**
	 * 
	 * @param htmltag
	 */
	public void sethtmltag(HtmlTagTo htmltag){
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
	 * @param language
	 */
	public void setlanguage(LanguageTo language){
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
	public void setmessage(MessageTo message){
		this.message =message;
	}

	/**
	 * 
	 * @param module
	 */
	public void setmodule(ModuleTo module){
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
		return "TranslationTo [languageTo=" + languageTo + ",]";
	}

}