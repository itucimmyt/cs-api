///////////////////////////////////////////////////////////
//  AttributesInput.java
//  Macromedia ActionScript Implementation of the Class AttributesInput
//  Generated by Enterprise Architect
//  Created on:      17-May-2020 3:09:18 PM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.services.to.Input;

import java.io.Serializable;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 17-May-2020 3:09:18 PM
 */
public class AttributesInput implements Serializable {

	private static final long serialVersionUID = -514981944;
	private int id;
	private String name;
	private String description;
	private String help;
	private int sortno;

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

}