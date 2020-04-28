///////////////////////////////////////////////////////////
//  TranslationInput.java
//  Macromedia ActionScript Implementation of the Class TranslationInput
//  Generated by Enterprise Architect
//  Created on:      28-Apr-2020 12:07:16 AM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.services.to.Input;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 28-Apr-2020 12:07:16 AM
 */
public class TranslationInput implements Serializable {

	private static final long serialVersionUID = 481999834;
	private int id;
	private String translation;
	private int languageTo;
	AlertInput alert;
	LanguageInput language;
	MessageInput message;
	HtmlTagInput htmltag;
	ModuleInput module;

	public AlertInput getAlert(){
		return alert;
	}

	public HtmlTagInput getHtmlTag(){
		return htmltag;
	}

	public int getId(){
		return id;
	}

	public LanguageInput getLanguage(){
		return language;
	}

	public int getlanguageTo(){
		return languageTo;
	}

	public MessageInput getMessage(){
		return message;
	}

	public ModuleInput getModule(){
		return module;
	}

	public String gettranslation(){
		return translation;
	}

	/**
	 * 
	 * @param alert
	 */
	public void setAlert(AlertInput alert){
		this.alert =alert;
	}

	/**
	 * 
	 * @param htmltag
	 */
	public void setHtmlTag(HtmlTagInput htmltag){
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
	public void setLanguage(LanguageInput language){
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
	public void setMessage(MessageInput message){
		this.message =message;
	}

	/**
	 * 
	 * @param module
	 */
	public void setModule(ModuleInput module){
		this.module =module;
	}

	/**
	 * 
	 * @param translation
	 */
	public void settranslation(String translation){
		this.translation = translation;
	}

}