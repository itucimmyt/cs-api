///////////////////////////////////////////////////////////
//  LanguageTo.java
//  Macromedia ActionScript Implementation of the Class LanguageTo
//  Generated by Enterprise Architect
//  Created on:      07-Aug-2020 2:59:53 PM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.services.to;

import java.io.Serializable;
import java.util.Set;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 07-Aug-2020 2:59:53 PM
 */
public class LanguageTo implements Serializable {

	private static final long serialVersionUID = 271404666;
	private int id;
	private String name;
	private String codeISO;
	private String isbase;
	Set<TranslationTo> translations;

	public String getcodeISO(){
		return codeISO;
	}

	public int getId(){
		return id;
	}

	public String getisbase(){
		return isbase;
	}

	public String getname(){
		return name;
	}

	public Set<TranslationTo> gettranslations(){
		return translations;
	}

	/**
	 * 
	 * @param codeiso
	 */
	public void setcodeISO(String codeiso){
		this.codeISO = codeiso;
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
	 * @param isbase
	 */
	public void setisbase(String isbase){
		this.isbase = isbase;
	}

	/**
	 * 
	 * @param name
	 */
	public void setname(String name){
		this.name = name;
	}

	/**
	 * 
	 * @param translation
	 */
	public void settranslations(Set<TranslationTo> translation){
		this.translations =translation;
	}

	@Override
	public String toString(){
		return "LanguageTo []";
	}

}