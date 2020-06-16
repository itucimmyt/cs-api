///////////////////////////////////////////////////////////
//  AttributesTo.java
//  Macromedia ActionScript Implementation of the Class AttributesTo
//  Generated by Enterprise Architect
//  Created on:      15-Jun-2020 5:13:15 PM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.services.to;

import java.io.Serializable;
import java.util.Set;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 15-Jun-2020 5:13:15 PM
 */
public class AttributesTo implements Serializable {

	private static final long serialVersionUID = -112935872;
	private int id;
	private String name;
	private String description;
	private String help;
	private int sortno;
	Set<TranslationTo> translations;

	public String getdescription(){
		return description;
	}

	public String gethelp(){
		return help;
	}

	public int getId(){
		return id;
	}

	public String getname(){
		return name;
	}

	public int getsortno(){
		return sortno;
	}

	public Set<TranslationTo> getTranslations(){
		return translations;
	}

	/**
	 * 
	 * @param description
	 */
	public void setdescription(String description){
		this.description = description;
	}

	/**
	 * 
	 * @param help
	 */
	public void sethelp(String help){
		this.help = help;
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
	 * @param name
	 */
	public void setname(String name){
		this.name = name;
	}

	/**
	 * 
	 * @param sortno
	 */
	public void setsortno(int sortno){
		this.sortno = sortno;
	}

	/**
	 * 
	 * @param translation
	 */
	public void setTranslations(Set<TranslationTo> translation){
		this.translations =translation;
	}

	@Override
	public String toString(){
		return "AttributesTo [sortno=" + sortno + ",]";
	}

}