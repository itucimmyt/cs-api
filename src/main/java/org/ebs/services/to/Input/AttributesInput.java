///////////////////////////////////////////////////////////
//  AttributesInput.java
//  Macromedia ActionScript Implementation of the Class AttributesInput
//  Generated by Enterprise Architect
//  Created on:      09-Aug-2020 4:50:15 PM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.services.to.Input;

import java.io.Serializable;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 09-Aug-2020 4:50:15 PM
 */
public class AttributesInput implements Serializable {

	private static final long serialVersionUID = 202956123;
	private int id;
	private String name;
	private String description;
	private String help;
	private int sortno;
	private String attComponent;
	private boolean is_multiline;
	private boolean is_required;
	private String defaultValue;
	private int sm;
	private int md;
	EntityReferenceInput entityreference;
	HtmlTagInput htmltag;

	public String getattComponent(){
		return attComponent;
	}

	public String getdefaultValue(){
		return defaultValue;
	}

	public String getdescription(){
		return description;
	}

	public EntityReferenceInput getentityreference(){
		return entityreference;
	}

	public String gethelp(){
		return help;
	}

	public HtmlTagInput gethtmltag(){
		return htmltag;
	}

	public int getId(){
		return id;
	}

	public boolean getis_multiline(){
		return is_multiline;
	}

	public boolean getis_required(){
		return is_required;
	}

	public int getmd(){
		return md;
	}

	public String getname(){
		return name;
	}

	public int getsm(){
		return sm;
	}

	public int getsortno(){
		return sortno;
	}

	/**
	 * 
	 * @param attcomponent
	 */
	public void setattComponent(String attcomponent){
		this.attComponent = attcomponent;
	}

	/**
	 * 
	 * @param defaultvalue
	 */
	public void setdefaultValue(String defaultvalue){
		this.defaultValue = defaultvalue;
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
	 * @param entityreference
	 */
	public void setentityreference(EntityReferenceInput entityreference){
		this.entityreference =entityreference;
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
	 * @param is_multiline
	 */
	public void setis_multiline(boolean is_multiline){
		this.is_multiline = is_multiline;
	}

	/**
	 * 
	 * @param is_required
	 */
	public void setis_required(boolean is_required){
		this.is_required = is_required;
	}

	/**
	 * 
	 * @param md
	 */
	public void setmd(int md){
		this.md = md;
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
	 * @param sm
	 */
	public void setsm(int sm){
		this.sm = sm;
	}

	/**
	 * 
	 * @param sortno
	 */
	public void setsortno(int sortno){
		this.sortno = sortno;
	}

}