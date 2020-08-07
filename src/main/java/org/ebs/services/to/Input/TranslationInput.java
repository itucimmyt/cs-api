///////////////////////////////////////////////////////////
//  TranslationInput.java
//  Macromedia ActionScript Implementation of the Class TranslationInput
//  Generated by Enterprise Architect
//  Created on:      07-Aug-2020 3:02:04 PM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.services.to.Input;

import java.io.Serializable;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 07-Aug-2020 3:02:04 PM
 */
public class TranslationInput implements Serializable {

	private static final long serialVersionUID = -469771557;
	private int id;
	private String translation;
	private int languageTo;
	LanguageInput language;
	HtmlTagInput htmltag;

	public HtmlTagInput gethtmltag(){
		return htmltag;
	}

	public int getId(){
		return id;
	}

	public LanguageInput getlanguage(){
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
	 * @param language
	 */
	public void setlanguage(LanguageInput language){
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

}